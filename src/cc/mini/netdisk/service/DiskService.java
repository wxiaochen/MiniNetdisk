package cc.mini.netdisk.service;

import java.util.List;
import java.util.Set;

import cc.mini.entity.Filestatus;

public interface DiskService {

	/**
	 * 查找该用户的文件
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Set<Filestatus> findFilesByUserId(Integer id) throws Exception;
	
	
	/**
	 * 发现该用户根目录文件和文件夹
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Filestatus> findRootFilesByUserId(Integer id) throws Exception;
	
}
