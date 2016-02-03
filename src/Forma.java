import javax.swing.JFrame; 
import javax.swing.JTextArea; 

import java.awt.Color; 
import java.awt.Font; 
import java.io.File; 
import java.io.IOException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.EventObject;

import javax.swing.SpringLayout; 
import javax.swing.JButton; 

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent; 

	public class Forma { 

		private static final int DEFAULT_WIDTH = 500; 
		private static final int DEFAULT_HEIGHT = 300; 
		static Date d = new Date(); 
		static String Title = "Телефонная книжка"; 
		static File file = new File("C:/Users/Дима/Desktop/m.docx"); 
		static JFrame frame = new JFrame(); 
		private static final JList list = new JList();

		private static void frame() throws Exception { 

			frame.getContentPane().setBackground(new Color(255, 204, 153)); 
			frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
			SpringLayout springLayout = new SpringLayout();
			springLayout.putConstraint(SpringLayout.SOUTH, list, -10, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, list, -10, SpringLayout.EAST, frame.getContentPane());
			frame.getContentPane().setLayout(springLayout); 

			JButton b = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C"); 
			b.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent event) {
					//Object object = new Object();
					//object.start();
					
					Book person = new Book();
					
					
					Operation.addPerson(person);
					System.out.println(event);
					System.out.println(event.toString());
				}
			});
			springLayout.putConstraint(SpringLayout.WEST, b, 10, SpringLayout.WEST, frame.getContentPane());
			b.setForeground(new Color(204, 0, 102));
			b.setBackground(new Color(0, 102, 204));
			frame.getContentPane().add(b); 
			
			JButton b_1 = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
			springLayout.putConstraint(SpringLayout.WEST, list, 225, SpringLayout.EAST, b_1);
			springLayout.putConstraint(SpringLayout.NORTH, b_1, 53, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, b_1, -209, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.NORTH, b, -43, SpringLayout.NORTH, b_1);
			springLayout.putConstraint(SpringLayout.SOUTH, b, -6, SpringLayout.NORTH, b_1);
			springLayout.putConstraint(SpringLayout.WEST, b_1, 10, SpringLayout.WEST, frame.getContentPane());
			b_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			b_1.setForeground(new Color(204, 0, 102));
			b_1.setBackground(new Color(0, 0, 204));
			frame.getContentPane().add(b_1);
			
			JButton b_3 = new JButton("\u041F\u043E\u0438\u0441\u043A");
			springLayout.putConstraint(SpringLayout.NORTH, b_3, 6, SpringLayout.SOUTH, b_1);
			springLayout.putConstraint(SpringLayout.WEST, b_3, 0, SpringLayout.WEST, b);
			springLayout.putConstraint(SpringLayout.SOUTH, b_3, -170, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, b_3, 0, SpringLayout.EAST, b);
			b_3.setForeground(new Color(204, 0, 102));
			b_3.setBackground(new Color(0, 0, 204));
			frame.getContentPane().add(b_3); 
			
			JButton b_4 = new JButton("\u0421\u043E\u0440\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
			springLayout.putConstraint(SpringLayout.NORTH, b_4, 6, SpringLayout.SOUTH, b_3);
			springLayout.putConstraint(SpringLayout.WEST, b_4, 10, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, b_4, -131, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, b_4, 0, SpringLayout.EAST, b);
			b_4.setForeground(new Color(204, 0, 102));
			b_4.setBackground(new Color(0, 0, 204));
			frame.getContentPane().add(b_4); 

			JButton b_5 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
			springLayout.putConstraint(SpringLayout.NORTH, b_5, 6, SpringLayout.SOUTH, b_4);
			springLayout.putConstraint(SpringLayout.WEST, b_5, 0, SpringLayout.WEST, b);
			springLayout.putConstraint(SpringLayout.SOUTH, b_5, -92, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, b_5, 0, SpringLayout.EAST, b);
			b_5.setForeground(new Color(204, 0, 102));
			b_5.setBackground(new Color(0, 0, 204));
			frame.getContentPane().add(b_5); 

			JButton b_6 = new JButton("\u041E\u0442\u043A\u0440\u044B\u0442\u044C");
			springLayout.putConstraint(SpringLayout.NORTH, b_6, 6, SpringLayout.SOUTH, b_5);
			springLayout.putConstraint(SpringLayout.WEST, b_6, 0, SpringLayout.WEST, b);
			springLayout.putConstraint(SpringLayout.SOUTH, b_6, -53, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, b_6, -326, SpringLayout.EAST, frame.getContentPane());
			b_6.setForeground(new Color(204, 0, 102));
			b_6.setBackground(new Color(0, 0, 204));
			frame.getContentPane().add(b_6); 

			JTextArea textArea = new JTextArea();
			springLayout.putConstraint(SpringLayout.NORTH, list, 7, SpringLayout.SOUTH, textArea);
			springLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.SOUTH, textArea, -233, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, b, -6, SpringLayout.WEST, textArea);
			springLayout.putConstraint(SpringLayout.EAST, b_1, -6, SpringLayout.WEST, textArea);
			springLayout.putConstraint(SpringLayout.WEST, textArea, 202, SpringLayout.WEST, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, textArea, -10, SpringLayout.EAST, frame.getContentPane()); 
			frame.getContentPane().add(textArea); 

			JTextArea textArea_1 = new JTextArea();
			springLayout.putConstraint(SpringLayout.NORTH, textArea_1, 6, SpringLayout.SOUTH, textArea);
			springLayout.putConstraint(SpringLayout.WEST, textArea_1, 6, SpringLayout.EAST, b_1);
			springLayout.putConstraint(SpringLayout.SOUTH, textArea_1, -10, SpringLayout.SOUTH, frame.getContentPane());
			springLayout.putConstraint(SpringLayout.EAST, textArea_1, -6, SpringLayout.WEST, list);
			textArea_1.setLineWrap(true);
			frame.getContentPane().add(textArea_1);
			frame.setBackground(new Color(0, 51, 255));
			frame.setTitle(Title); 
			frame.setSize(538, 334); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			frame.setVisible(true); 
		} 

		public static void main(String[] args) throws Exception {
			frame.getContentPane().add(list);
			list.setValueIsAdjusting(true); 
			frame(); 
		} 
}