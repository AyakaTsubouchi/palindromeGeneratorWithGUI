package checkPalindromeWithGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField tfCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel title = new JLabel("Palindrome Generator");
		panel.add(title);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		
		JLabel l2 = new JLabel("size");
		panel_2.add(l2);
		
		t1 = new JTextField();
		panel_2.add(t1);
		t1.setColumns(10);
		
		JLabel result1 = new JLabel("result");
		
		JPanel panel_3 = new JPanel();
		
		JLabel l4 = new JLabel("result");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(result1, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
				.addComponent(l4, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
				.addComponent(panel_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(result1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(l4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JButton btCreate = new JButton("create");
		btCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int size = Integer.parseInt(t1.getText());
				//String size = t1.getText();
				PalindromeGenerator myobj = new PalindromeGenerator();
				String newp = myobj.PalindromeGenerator(size);				
				result1.setText(newp);
				
			}
		});
		panel_2.add(btCreate);
		
		JLabel l3 = new JLabel("word");
		panel_3.add(l3);
		
		tfCheck = new JTextField();
		panel_3.add(tfCheck);
		tfCheck.setColumns(10);
		
		JButton btCheck = new JButton("check");
		btCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String s1=tfCheck.getText();  
				 PalindromeChecker.isPalindrome(s1, l4);
				 
			}
		});
		panel_3.add(btCheck);
		panel_1.setLayout(gl_panel_1);
	}
}
