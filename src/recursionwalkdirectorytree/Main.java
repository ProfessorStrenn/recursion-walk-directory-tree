package recursionwalkdirectorytree;

import static java.lang.System.*;
import static org.apache.commons.lang3.StringUtils.*;

import java.io.*;
import java.nio.file.*;

public class Main {

	/**
	 * Prints the directory tree of the current working directory.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String cwd = Paths.get("").toAbsolutePath().toString();
		printDirectoryTree(new File(cwd), 0);
	}


	/**
	 * Prints the directory tree starting at dir to the standard output. Files are indented according to their depth in
	 * the subtree.
	 * 
	 * @param dir
	 * @param indentationLevel
	 */
	public static void printDirectoryTree(File dir, int indentationLevel) {
		for (File f : dir.listFiles()) {
			out.println(repeat('\t', indentationLevel) + f.getName());
			if (f.isDirectory())
				printDirectoryTree(f, indentationLevel + 1);
		}

	}

}
