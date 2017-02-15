package cc.mini.framework;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

/**
 * 分布式文件系统 hdfs操作工具类
 * @author Jupiter
 *
 */
public class HdfsUtils {
	
	private static FileSystem fs = null;
	
	static{
		Configuration conf = new Configuration();
		conf.set("fs.defaultFS", "hdfs://118.89.235.207:9000/");
		try {
			fs = FileSystem.get(new URI("hdfs://118.89.235.207:9000/"),conf,"root");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	

	public static void upload(Path src,Path dst) throws IllegalArgumentException, IOException{
		fs.copyFromLocalFile(src, dst);
	}

	public static void download(Path src,Path dst) throws IOException {
		fs.copyToLocalFile(src,dst);
	}


	
	
}
