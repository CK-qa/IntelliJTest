package vcsStuff;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\Users\\viktoria.bozhko\\IdeaProjects\\IntelliJTest\\code_features\\src\\main\\java\\vcsStuff\\generated2\\";

		File file;
		for (int i = 0; i < 5; i++) {
			file = new File(filepath + "filetest" + i + ".txt");
			file.createNewFile();
		}
	}

	//test
	//test18


	//test2

}

