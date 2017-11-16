import java.io.*;
import java.util.*;

public class FileInputOutput {

	public static void main(String[] args) throws IOException {

		String story = readFile("test.txt");
		System.out.println(story);
		System.out.println(averageCharsPerLine("test.txt"));
	}

	public static String readFile(String filename) throws IOException {
		Scanner scan = new Scanner(new File(filename));
		String result = "";

		while(scan.hasNextLine()) {
			result += scan.nextLine() + "\n";
		}
		return result;
	}

	public static int numLines(String filename) throws IOException {
		Scanner scan = new Scanner(new File(filename));
		int result = 0;

		while(scan.hasNextLine()) {
			result ++;
			scan.nextLine();
		}
		return result;
	}	

	public static double averageCharsPerLine(String filename) throws IOException {
		Scanner scan = new Scanner(new File(filename));
		double result = 0;
		int lines = 0;

		while(scan.hasNextLine()) {
			result += scan.nextLine().length();
			lines++;
		}
		return result/lines;
	}

	public static void saveFile(String text, String filename) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(filename));
		out.write(text);
		out.close();
	}
}