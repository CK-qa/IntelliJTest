package vcsStuff;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\Users\\viktoria.bozhko\\IdeaProjects\\IntelliJTest\\code_features\\src\\main\\java\\vcsStuff\\generated\\";

		File file;
		for (int i = 0; i < 3; i++) {
			file = new File(filepath + "filetest" + i + ".txt");
			file.createNewFile();
		}
	}


	//some minor change to commit

}

