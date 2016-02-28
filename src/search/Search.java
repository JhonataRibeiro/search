package search;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Search implements Runnable {

	private String archive_name;
	private String word_search;
	
	public Search(String name, String word) {
		this.archive_name = name;
		this.word_search = word;
	}
	
	@Override
	public void run() {
		try {
			Scanner scan = new Scanner(new FileReader(archive_name));
			while(scan.hasNext()){
				String line = scan.nextLine();
				if(line.contains(word_search)){
					System.out.println("Resultado no arquivo: " + archive_name + " : " + line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
