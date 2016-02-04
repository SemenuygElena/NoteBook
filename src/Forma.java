import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Forma {

	static String Title = "Телефонная книжка";
	static JFrame frame = new JFrame();
	static JTextArea textArea = new JTextArea();

	private static void frame() throws Exception {
		Contacts.Read();
		Contacts.Updates();
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, textArea, 53, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textArea, 182, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textArea, -53, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textArea, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().setLayout(springLayout);

		JButton b = new JButton("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C");
		springLayout.putConstraint(SpringLayout.NORTH, b, 21, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, b, 10, SpringLayout.WEST, frame.getContentPane());
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FormaAdd.Forma_Add();
}
		});

		b.setForeground(new Color(204, 0, 102));
		b.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(b);

		JButton b_1 = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
		springLayout.putConstraint(SpringLayout.WEST, b_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, b_1, -6, SpringLayout.WEST, textArea);
		springLayout.putConstraint(SpringLayout.SOUTH, b, -19, SpringLayout.NORTH, b_1);
		springLayout.putConstraint(SpringLayout.EAST, b, 0, SpringLayout.EAST, b_1);
		springLayout.putConstraint(SpringLayout.NORTH, b_1, 77, SpringLayout.NORTH, frame.getContentPane());
		b_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					FormaDel.Form_Del();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		b_1.setForeground(new Color(204, 0, 102));
		b_1.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(b_1);

		JButton b_3 = new JButton("\u041F\u043E\u0438\u0441\u043A");
		springLayout.putConstraint(SpringLayout.WEST, b_3, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, b_3, -6, SpringLayout.WEST, textArea);
		springLayout.putConstraint(SpringLayout.SOUTH, b_1, -19, SpringLayout.NORTH, b_3);
		springLayout.putConstraint(SpringLayout.NORTH, b_3, 129, SpringLayout.NORTH, frame.getContentPane());
		b_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FormaFind.Forma_Find();
			}
		});
		b_3.setForeground(new Color(204, 0, 102));
		b_3.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(b_3);

		JButton b_4 = new JButton("\u0421\u043E\u0440\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
		springLayout.putConstraint(SpringLayout.WEST, b_4, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, b_4, -6, SpringLayout.WEST, textArea);
		springLayout.putConstraint(SpringLayout.SOUTH, b_3, -19, SpringLayout.NORTH, b_4);
		springLayout.putConstraint(SpringLayout.NORTH, b_4, 181, SpringLayout.NORTH, frame.getContentPane());
		b_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		b_4.setForeground(new Color(204, 0, 102));
		b_4.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(b_4);

		JButton b_5 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		springLayout.putConstraint(SpringLayout.NORTH, b_5, 231, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, b_5, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, b_5, -31, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, b_5, -6, SpringLayout.WEST, textArea);
		springLayout.putConstraint(SpringLayout.SOUTH, b_4, -17, SpringLayout.NORTH, b_5);
		b_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contacts.Write();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b_5.setForeground(new Color(204, 0, 102));
		b_5.setBackground(new Color(255, 255, 204));
		frame.getContentPane().add(b_5);

		JLabel lblNewLabel = new JLabel(
				"   \u0421\u043F\u0438\u0441\u043E\u043A \u043A\u043E\u043D\u0442\u0430\u043A\u0442\u043E\u0432");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 182, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 8, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -9, SpringLayout.NORTH, textArea);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.EAST, frame.getContentPane());
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel);
		textArea.setEnabled(false);
		frame.getContentPane().add(textArea);
		frame.setBackground(new Color(0, 51, 255));
		frame.setTitle(Title);
		frame.setSize(566, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		frame();
	}
}