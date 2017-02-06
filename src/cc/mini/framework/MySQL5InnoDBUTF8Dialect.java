package cc.mini.framework;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * Created by wxc on 2017/2/5.
 */
public class MySQL5InnoDBUTF8Dialect extends MySQL5InnoDBDialect {
	@Override
	public String getTableTypeString() {
		return super.getTableTypeString() + " charset=utf8";
	}
}
