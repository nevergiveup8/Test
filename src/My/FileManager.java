package My;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; // или просто import java.io.*;

public class FileManager {
	
	
	public void copyDataLine() throws IOException {
		try (BufferedReader in = new BufferedReader(new FileReader("res//first.txt"));
			PrintWriter out = new PrintWriter(new FileWriter("res//second.txt"))) {
				String str;
				while ((str = in.readLine()) != null) {
					out.println(str);
				}
			
			}
	}
	
	public void copyDataFileStream () throws IOException {
		try (FileReader in = new FileReader("res//first.txt");
			FileWriter out = new FileWriter("res//second.txt")) {
			int c;
			while ((c = in.read()) != -1 ) {
				out.write(c);
			}
			
		}	
	}
	public void copyData () throws IOException  {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("res//first.txt");
			out = new FileOutputStream("res//second.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			} 
		
			
			} finally {
				if (in!=null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			}
		}
	
	public static void main (String[] args) {
		FileManager fm = new FileManager();
		try {
			fm.copyDataLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
