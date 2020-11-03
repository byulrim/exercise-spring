package net.da.spring.onetotwo.sample1;

import java.io.*;

public class FileOutputter implements Outputter {

	private String filePath;

	public void output(String message) throws IOException {

		FileWriter out = new FileWriter(filePath);
		out.write(message + "\n");
		out.close();

	}

	public void setFilePath(String filePath) {

		this.filePath = filePath;

	}

}
