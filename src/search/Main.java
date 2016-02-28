package search;

public class Main {
	
	public static void main(String[] args) {
		String wanted = "er";
		Search search1 = new Search("Signatures_Agile_Manifesto", wanted);
		Search search2 = new Search("Signatures_Agile_Manifesto_2", wanted);
		Search search3 = new Search("Signatures_Agile_Manifesto_3", wanted);
		
		Thread t1 = new Thread(search1);
		t1.start();
		Thread t2 = new Thread(search2);
		t2.start();
		Thread t3 = new Thread(search3);
		t3.start();
	}

}
