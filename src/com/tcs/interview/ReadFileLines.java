/**
 * 
 */
package com.tcs.interview;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Shrisuren
 *
 */
public class ReadFileLines {

	/**
	 * Read Lines from File and Store it in List using Java 8
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> getLinesFromFile(String fileName) throws IOException {
		List<String> linesList = null;
		try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
			linesList = lines.collect(Collectors.toList());
		}
		return linesList;
	}

}
