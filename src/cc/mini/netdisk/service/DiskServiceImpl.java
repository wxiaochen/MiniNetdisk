package cc.mini.netdisk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cc.mini.entity.Filestatus;
import cc.mini.netdisk.dao.UserDao;

@Service("diskService")
@Transactional()
public class DiskServiceImpl implements DiskService{
	
	@Resource
	private UserDao userDao;

	@Override
	public List<Filestatus> findRootFilesByUserId(Integer id) throws Exception {
		Set<Filestatus> fsList = findFilesByUserId(id);
		List<Filestatus> fsResult = null;
		if(fsList != null){
			fsResult = new ArrayList<Filestatus>(0);
			for (Filestatus filestatus : fsList) {
				if(filestatus.getPath().split("/")[0]==id.toString()){
					fsResult.add(filestatus);
				}
			}
		}
		return fsResult;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<Filestatus> findFilesByUserId(Integer id) throws Exception {
		return (Set<Filestatus>) userDao.get(id).getFilestatus();
	}
	
	

	
}
