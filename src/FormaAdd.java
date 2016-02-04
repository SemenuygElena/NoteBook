import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormaAdd {

	static JFrame frame = new JFrame();

	public static void Forma_Add() {
		frame.setTitle("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u043A\u043E\u043D\u0442\u0430\u043A\u0442");
		frame.getContentPane().setBackground(new Color(255, 204, 153));

		final JTextPane t_3 = new JTextPane();
		t_3.setBounds(153, 132, 135, 28);

		final JTextPane t_2 = new JTextPane();
		t_2.setBounds(153, 93, 135, 28);

		final JTextPane t_1 = new JTextPane();
		t_1.setBounds(153, 54, 135, 28);

		final JTextPane t = new JTextPane();
		t.setBounds(153, 11, 135, 30);

		JButton button = new JButton("\u041E\u043A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contacts.list.add(new Book(t.getText(),t_1.getText(),t_2.getText(),t_3.getText()));		
				t.setText(" ");
				t_1.setText(" ");
				t_2.setText(" ");
				t_3.setText(" ");
				Contacts.Updates();
			}
		});
		button.setForeground(new Color(204, 0, 102));
		button.setBackground(new Color(255, 255, 204));
		button.setBounds(163, 175, 115, 23);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\u041E\u0442\u043C\u0435\u043D\u0430");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			t.setText(" ");
			t_1.setText(" ");
			t_2.setText(" ");
			t_3.setText(" ");
			frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(204, 255, 204));
		btnNewButton.setForeground(new Color(153, 0, 102));
		btnNewButton.setBounds(10, 175, 115, 23);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(t);
		frame.getContentPane().add(t_1);
		frame.getContentPane().add(t_2);
		frame.getContentPane().add(t_3);
		frame.getContentPane().add(button);

		JLabel lblNewLabel = new JLabel("           \u0418\u043C\u044F");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 133, 30);
		frame.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("    \u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label.setBounds(7, 52, 118, 30);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0442\u0435\u043B\u0435\u0444\u043E\u043D\u0430");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_1.setBounds(10, 93, 133, 30);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\u0414\u0430\u0442\u0430 \u0440\u043E\u0436\u0434\u0435\u043D\u0438\u044F");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_2.setBounds(10, 134, 126, 30);
		frame.getContentPane().add(label_2);
		frame.setSize(313, 251);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		Forma_Add();
	}
}
