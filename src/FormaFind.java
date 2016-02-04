import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;


public class FormaFind {

	
	static String Title = "Поиск"; 
	static JFrame frame = new JFrame(); 
	static JTextField textField;
	static JTextArea textArea = new JTextArea();
	
	public static void Forma_Find(){
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0438\u043C\u044F");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 104, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(124, 9, 143, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u041D\u0430\u0439\u0442\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Contacts.Search(textField.getText());	
					
			}
		});
		button.setForeground(new Color(153, 0, 102));
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(163, 45, 104, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u041E\u0442\u043C\u0435\u043D\u0430");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(" ");
			frame.dispose();
			}
		});
		button_1.setForeground(new Color(153, 0, 102));
		button_1.setBackground(new Color(204, 255, 204));
		button_1.setBounds(10, 45, 104, 23);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("    \u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442\u044B \u043F\u043E\u0438\u0441\u043A\u0430");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 79, 257, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		textArea.setBackground(new Color(255, 255, 204));
		textArea.setBounds(10, 132, 257, 143);
		frame.getContentPane().add(textArea);
		frame.setTitle("\u041F\u043E\u0438\u0441\u043A \u043F\u043E \u043A\u043E\u043D\u0442\u0430\u043A\u0442\u0430\u043C");
		frame.setSize(295, 335);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Forma_Find();
	}
}
