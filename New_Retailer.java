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
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class New_Retailer extends JFrame {

	private JPanel contentPane;
	private JTextField retailerID;
	private JTextField name;
	private JTextField address;
	private JTextField Date;
	private JTextField mobile;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Retailer frame = new New_Retailer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public New_Retailer() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblRetailerInformation = new JLabel("RETAILER INFORMATION");
		lblRetailerInformation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRetailerInformation.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblRetailerId = new JLabel("Retailer ID");
		
		JLabel lblRetailerName = new JLabel("Name");
		
		JLabel lblAddres = new JLabel("Address");
		
		retailerID = new JTextField();
		retailerID.setEditable(false);
		retailerID.setColumns(10);
		
		name = new JTextField();
		name.setColumns(10);
		
		address = new JTextField();
		address.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		
		Date = new JTextField();
		Date.setEditable(false);
		Date.setText(dtf.format(localDate));
		Date.setColumns(10);
		
		JLabel lblMoblineNo = new JLabel("Mobine No.");
		
		mobile = new JTextField();
		mobile.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		
		email = new JTextField();
		email.setColumns(10);
		
		File file = new File("RetailerID.txt");
		Scanner inputFile = new Scanner(file);
		String str = "";
		while (inputFile.hasNext())
		{
			str = inputFile.nextLine();
		}
		int orderCount = Integer.parseInt(str);
		
		orderCount += 1;
		inputFile.close();
		retailerID.setText(str);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			FileWriter fw = null;
			try {
				fw = new FileWriter("RetailerList.txt",true);
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			PrintWriter pw = null;
			pw = new PrintWriter(fw);
			
			
			pw.println("RetailerID :"+retailerID.getText());
			pw.println("Name :"+name.getText());
			pw.println("Address :"+address.getText());
			pw.println("MObile No. :"+mobile.getText());
			pw.println("Email ID :"+email.getText());
			pw.println("Date :"+Date.getText());
			pw.println();
			pw.println("------------------------------------------------");
			pw.println();
			
			pw.close();
			 FileWriter fw1 = null;
	          try {
				fw1 = new FileWriter("retailerID.txt",true);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	          PrintWriter orderno = new PrintWriter(fw1);
	          int orderno1 = Integer.parseInt(retailerID.getText());
	          
	          orderno.println(orderno1+1);
	          orderno.close();
	          JOptionPane.showMessageDialog(null,"Retailer Added");
	          New_Retailer nr = null;
			try {
				nr = new New_Retailer();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	          nr.setVisible(true);
	         
			}
		});
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				address.setText("");
				mobile.setText("");
				email.setText("");
				name.setText("");
			//	retailerID.setText("");
			}
		});
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard db = new Dashboard();
				db.setVisible(true);
				setVisible(false);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(103)
							.addComponent(lblRetailerInformation, GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblRetailerId, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
								.addComponent(lblRetailerName, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAddres, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblEmail)
								.addComponent(lblMoblineNo, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
											.addComponent(retailerID, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
											.addGap(138)
											.addComponent(lblDate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(name, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addComponent(Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(mobile, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(email, Alignment.LEADING)
									.addComponent(address, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
									.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
										.addComponent(btnSave)
										.addGap(80)
										.addComponent(btnClear)
										.addGap(65)
										.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(32)
					.addComponent(lblRetailerInformation, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRetailerId)
						.addComponent(retailerID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDate)
						.addComponent(Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRetailerName)
						.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAddres)
						.addComponent(address, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMoblineNo)
						.addComponent(mobile, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnExit)
						.addComponent(btnClear))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

}
