import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ALogin extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALogin frame = new ALogin();
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
	public ALogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblInventoryManagementSystem = new JLabel("INVENTORY MANAGEMENT SYSTEM");
		lblInventoryManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblInventoryManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblUserId = new JLabel("User ID");
		
		userid = new JTextField();
		userid.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		
		pass = new JPasswordField();
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			
	public void actionPerformed(ActionEvent arg0) {
	
	if(userid.getText().equals("Admin") && pass.getText().equals("Asdf1234"))
	{
		JOptionPane.showMessageDialog(null, "Welcome");
		
		Dashboard db = new Dashboard();
		db.setVisible(true);
		setVisible(false);
		
	
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Incorrect username or password");
	}
	
	}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			userid.setText("");
			pass.setText("");
			
			}
		});
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(lblInventoryManagementSystem, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(94)
							.addComponent(lblUserId, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(102)
							.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(130)
							.addComponent(btnLogin)))
					.addGap(23)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnClear)
							.addGap(40)
							.addComponent(btnExit))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(pass)
							.addComponent(userid, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInventoryManagementSystem, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserId)
						.addComponent(userid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(pass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnClear)
						.addComponent(btnExit))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

}
