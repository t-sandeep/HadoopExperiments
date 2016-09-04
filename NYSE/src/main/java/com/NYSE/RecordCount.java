package com.NYSE;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

public class RecordCount extends Configured implements Tool{

	public int run(String[] arg0) throws Exception {
		Job job = Job.getInstance(getConf());
		
		FileInputFormat.setInputPaths(job, new Path("C:\\Users\\Sandy\\Downloads\\WebPageProvider.java"));
		FileOutputFormat.setOutputPath(job, new Path("C:\\Users\\Sandy\\Downloads\\OutputHadoop"));
		return job.waitForCompletion(true)? 0:1;
	}
	
	public static void main(String args[]) throws Exception
	{
		System.exit(ToolRunner.run(new RecordCount(), args));
	}

}
