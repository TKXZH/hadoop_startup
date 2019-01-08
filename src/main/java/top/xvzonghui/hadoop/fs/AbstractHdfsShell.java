package top.xvzonghui.hadoop.fs;

import org.apache.hadoop.conf.Configuration;

/**
 * @author zonghuixu
 */
public abstract class AbstractHdfsShell {
	public String[] args;
	public static void main(String[] args) {
		Configuration conf = new Configuration();
	}
}
