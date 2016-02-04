import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormaDel  {

	static String Title = "Удалить контакт";
	static JFrame frame = new JFrame();
	static JTextField textField;
	
	
	public static void Form_Del()throws Exception {
		frame.setTitle("\u0423\u0434\u0430\u043B\u0438\u0442\u044C \u043A\u043E\u043D\u0442\u0430\u043A\u0442");
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(162, 18, 163, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel(
				"\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u043D\u043E\u043C\u0435\u0440 \u0432 \u0441\u043F\u0438\u0441\u043A\u0435");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 163, 38);
		frame.getContentPane().add(lblNewLabel);

		JButton button = new JButton("\u0423\u0434\u0430\u043B\u0438\u0442\u044C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Integer i= Integer.valueOf(textField.getText());
					Contacts.Delete(i);
					Contacts.Updates();
				  textField.setText(" ");
				  frame.dispose();
			}
		});
		button.setForeground(new Color(153, 0, 102));
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(172, 48, 153, 23);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\u041E\u0442\u043C\u0435\u043D\u0430");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(" ");
			}
		});
		button_1.setForeground(new Color(153, 0, 102));
		button_1.setBackground(new Color(204, 255, 204));
		button_1.setBounds(10, 48, 152, 23);
		frame.getContentPane().add(button_1);
		frame.setSize(351, 124);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		Form_Del();
	}

	
}
