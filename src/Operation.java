import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JOptionPane;


public class Operation {
	
	String name, lastname, nomberphone, birthday;
	static String a, b, c, d;
	int n, i, j;
	
	public static Scanner scan = new Scanner(System.in);
	
	static Vector<Book> v = new Vector<Book>();
	
	public static void addPerson(Book person){
		/*
		System.out.println("Vvedite name");
		String name = scan.next();
		System.out.println("Vvedite lastname");
		String lastname = scan.next();
		System.out.println("Vvedite nomber phone");
		String nomberphone = scan.next();
		System.out.println("Vvedite birthday");
		String birthday = scan.next();
		int year = scan.nextInt();
		
	   */
		
		//Book n = new Book(name, lastname, nomberphone, birthday );
		v.add(person);
	}
		
	
	public void deletePerson(String name) { 			// ydalenie iz pos
		int no;
		System.out.println("Vvedites nomer");
		no = scan.nextInt();
		v.remove(no);
	}

	
	
	public void printPeople() { 						// raspecht vse diski kotor est
		
		for (int i=0; i < v.size(); i++)
		{
		Book n = (Book) v.get(i);
		System.out.println(n.name + "  " + n.lastname + "  " + n.birthday + "  " + n.nomberphone);
		}
	}
	
	public void findPerson(){
		System.out.println("Vvedite name");
		String name1 = scan.next(); 			// scan-vivod na ekran, obyavl perem year4
		for (int i=0; i < v.size(); i++){
			Book n = (Book) v.get(i);
			if (n.name.equals(name1)) {
				System.out.println(n.name + "  " + n.lastname + "  " + n.birthday + "  " + n.nomberphone);
			}	
		}
	}
	
	public void sortName(){
		Menu obj = new Menu();
		for(int i=0; i < v.size()-1; i++){
			 for(int j=i+1; j < v.size(); j++){
				// obj.receiveWords();
				// obj.sortWords();
				 Book i1 = (Book) v.get(i);
				 Book j1 = (Book) v.get(j);
				 if(i1.name.compareTo(j1.name) < 0){
				 		
				   		Book tmp = i1; 	
				 		v.set(i,j1);
				 		v.set(j, tmp);
				 }
			}
			 
			 
			// CAlphabet_lab5 obj = new CAlphabet_lab5();
		        
		        
		        
		      //  for (int i=0; i<obj.reallength; i++)
		        //{
		          //  System.out.println(obj.wordsArr[i]);
		        //}
			 
			 
			 
			 
		
		
		}
	

}


	public static void writeFile() {
		try {
			FileOutputStream t = new FileOutputStream("D:\\Универ\\Java\\Book.txt");
			PrintStream printStream = new PrintStream(t);{
			//printStream.println ("Имя:  Фамилия:  Телефон:  День рождения: ");
			for (int i = 0; i < v.size(); i++){
				Book x = (Book) v.get(i);	
				printStream.println (x.name + "  ");		
				printStream.println (x.lastname);
				printStream.println (x.birthday + "  ");
				printStream.println (x.nomberphone + "  ");
					}
		}
			
		} catch (Exception e) {
			
		}
		
	}
	
	
	public static void readFile(){
		try (FileInputStream d = new FileInputStream ("D:\\Универ\\Java\\data.txt")){
			 System.out.println("Размер файла: " + d.available() + "байт(а)");
			 
			 byte [] buffer = new byte [d.available()];
			 d.read(buffer, 0, d.available());
			
	} catch (IOException e) {
		System.out.println(e.getMessage());
		}
	
	}
	
	
	public static void readData(){
		v.clear();
		try {
			Scanner scan1 = new Scanner(new File ("D:\\Универ\\Java\\data.txt"));
				for (int i = 0; i < v.size(); i++){
					a = scan1.nextLine();
					b = scan1.nextLine();
					c = scan1.nextLine();
					d = scan1.nextLine();
					
					//System.out.println(a, b, c, d);
					
					Book z = new Book(a, b, c, d);
					v.add(z);
					
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	
	}
}
