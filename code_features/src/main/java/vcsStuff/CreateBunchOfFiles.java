package vcsStuff;

import java.io.*;

public class CreateBunchOfFiles {

	public static void main(String[] args) throws IOException {

		// windows:
		 String filepath = "C:\\Users\\viktoria.bozhko\\IdeaProjects\\IntelliJTest\\code_features\\src\\main\\java\\vcsStuff\\generated2\\";

		// mac:
		//String filepath = "/Users/victoriabozhko/IdeaProjects/IntelliJTest/code_features/src/main/java/vcsStuff/generated2/";

		File file;
		for (int i = 0; i < 10000; i++) {
			file = new File(filepath + "filetest_" + i + ".txt");
			file.createNewFile();
		}
	}

	//test
	//test18
}