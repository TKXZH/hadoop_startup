package top.xvzonghui.hadoop.fs;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author zonghuixu
 */

@Slf4j
public class FileOperations {
	private static final String HDFS_URI_STR = "hdfs://localhost:9000";

	public void cat(String hdfsPath) throws IOException, URISyntaxException{
		log.info("now start to print content of file: {}", hdfsPath);
		Configuration config = new Configuration();
		FileSystem fs = FileSystem.get(new URI(HDFS_URI_STR), config);

		String fileContent = IOUtils.toString(fs.open(new Path(hdfsPath)));
		System.out.println(fileContent);
		log.info("now finish printing content of file: {}", hdfsPath);
	}

	public static void main(String[] args) throws Exception {
		FileOperations operations = new FileOperations();
		if(args.length != 1) {
			System.out.println("wrong args num!");
			System.exit(1);
		} else {
			String path = args[0];
			operations.cat(path);
		}
	}
}
