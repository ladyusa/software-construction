package lec1io;

import java.io.*;

/**
 * This class teaches about printWriter.
 * @author Usa Sammapun
 *
 */
public class WriteExample04 {

	// write to file (append at the end of file)
	public static void main(String[] args) {

		FileWriter fileWriter = null;
		try {
			// read from user
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);

			// write to file (append at the end of file)
			fileWriter = new FileWriter("data/from-user.txt", true);
			PrintWriter out = new PrintWriter(new BufferedWriter(fileWriter));

			System.out.println("Input text to file:");
			String line = buffer.readLine();

			while (!line.equals("bye")) {
				out.println("-----> " + line);
				line = buffer.readLine();
			}
			out.flush();
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}	
		finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {
				System.err.println("Error closing files");
			}
		}		

	}
}
