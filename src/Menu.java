import java.util.Scanner;
import java.util.Vector;


public class Menu {
		
		String name, lastname;
		String nomberphone, birthday;
		int n = -1;
		
		Scanner scan = new Scanner(System.in);
		
		Operation p = new Operation();
			
		public void body() {
			while (n != 0) {

				System.out.println("1. Add person");
				System.out.println("2. Delete person");
				System.out.println("3. Print people");
				System.out.println("4. Find person");
				System.out.println("5. Sort people");
				System.out.println("6. Write in file");
				System.out.println("7. Read of file");
				System.out.println("8. Exit");
				
				n = scan.nextInt();
				
				switch (n) {
				
				case 1: {									// sozdaet nov person
					p.addPerson();	
				break;
				}
				
								
				case 2:{								 			// ydalyaet disk iz kataloga
					p.deletePerson(name);
				break;
				}
				
				
				case 3: {
					p.printPeople();
				break;
				}
				
				
				case 4:{
					p.findPerson();
				break;
				}
					
				case 5:{
					p.sortName();
					p.printPeople();
				break;
				}
				
				case 6:{
					p.writeFile();
				break;
				}
				
				
				case 7: {
					p.readData();
					p.printPeople();
				break;
				}
				
				case 8:{
					n = 0;
				break;
				}
				

				}
			}
		}

		public static void main (String[] args){
			Menu m = new Menu();
			m.body();
		}
		
		}

