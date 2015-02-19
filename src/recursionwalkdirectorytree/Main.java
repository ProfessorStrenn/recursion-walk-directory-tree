package recursionwalkdirectorytree;

import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

import java.io.*;
import java.nio.file.*;

public class Main {

	public static void main(String[] args) {
		String cwd = Paths.get("").toAbsolutePath().toString();
		printDirectoryTree(new File(cwd), 0);

	}


	public static void printDirectoryTree(File dir, int indentation) {
		for (File f : dir.listFiles()) {
			out.println(repeat('\t', indentation) + f.getName());
			if (f.isDirectory())
				printDirectoryTree(f, indentation + 1);
		}

	}

}
