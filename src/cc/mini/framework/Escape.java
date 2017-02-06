package cc.mini.framework;

/**
 * Created by wxc on 2017/2/5.
 */
public class Escape {
	public static String encode(String str) {
		if (str == null) return null;
		return str.replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;");
	}

	public static String decode(String str) {
		if (str == null) return null;
		return str.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&quot;", "\"");
	}
}
