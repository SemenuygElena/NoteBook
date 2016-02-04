import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {

	static List<Book> list = new ArrayList<Book>();
	private static PrintWriter printWriter;
	private static Scanner s;

	/**
	 * Обновлян Список контактов на формочке
	 */
	public static void Updates() {
		for (int i = 0; i < list.size(); i++) {
			Forma.textArea.append(Contacts.list.get(i).name + " " + Contacts.list.get(i).lastname + " "
					+ Contacts.list.get(i).nomberphone + " " + Contacts.list.get(i).birthday + "\n");

		}

	}

	/**
	 * Метод удаляет контакт
	 */
	public static void Delete(int index) {
		list.remove(index - 1);

	}

	/**
	 * Поиск контакта по имени и вывод его на формочку
	 */
	public static void Search(String Name) {
		for (int i=0; i < list.size(); i++){
			Book n = (Book) list.get(i);
			if (n.name.equals(Name)) {
				FormaFind.textArea.setText(Contacts.list.get(i).name + " " + Contacts.list.get(i).lastname + " "
						+ Contacts.list.get(i).nomberphone + " " + Contacts.list.get(i).birthday);
			}
		}
	}

	/**
	 * Метод записевает контакты в файл
	 * 
	 * @throws IOException
	 */
	public static void Write() throws IOException {
		File f = new File("text.txt");
		printWriter = new PrintWriter(f);
		for (int i = 0; i < list.size(); i++) {
			printWriter.println(list.get(i).name);
			printWriter.println(list.get(i).lastname);
			printWriter.println(list.get(i).nomberphone);
			printWriter.println(list.get(i).birthday);
			printWriter.flush();
		}
	}

	/**
	 * Метод читает из файла а Vector
	 * 
	 * @throws IOException
	 */
	public static void Read() throws IOException {
		File f = new File("text.txt");
		s = new Scanner(f);
		while (s.hasNext()) {
			Book book = new Book(null, null, null, null);
			book.name = s.next();
			book.lastname = s.next();
			book.nomberphone = s.next();
			book.birthday = s.next();
			list.add(book);
		}
	}
	/**
	 * Сортировка 
	 */
	public static void Sort() {
			  
	}

	/*public static void main(String[] args) {
		list.add(new Book("1","2","3","4"));
		Search("1");
		System.out.println("Hello World!");
	}*/
}
