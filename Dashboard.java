import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 418);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNew = new JMenu("New");
		menuBar.add(mnNew);
		
		JMenuItem mntmRetailer = new JMenuItem("Retailer");
		mntmRetailer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			New_Retailer nw = null;
			try {
				nw = new New_Retailer();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			nw.setVisible(true);
			setVisible(false);
			
			}
		});
		mnNew.add(mntmRetailer);
		
		JMenuItem mntmProduct = new JMenuItem("Product");
		mntmProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			New_Product np = null;
			try {
				np = new New_Product();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			setVisible(false);
			np.setVisible(true);
			}
		});
		mnNew.add(mntmProduct);
		
		JMenuItem mntmOrder_1 = new JMenuItem("Order");
		mntmOrder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			New_Order no =null;
		try {
			
			
	no = new New_Order();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			setVisible(false);
			no.setVisible(true);
			
			}
		});
		mnNew.add(mntmOrder_1);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmRetailer_1 = new JMenuItem("Retailer");
		mntmRetailer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Retailer vr = null;
				try {
					vr = new View_Retailer();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				vr.setVisible(true);
				setVisible(false);
			}
		});
		mnView.add(mntmRetailer_1);
		
		JMenuItem mntmProduct_1 = new JMenuItem("Product");
		mntmProduct_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Product vp = null;
				try {
					vp = new View_Product();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				vp.setVisible(true);
				setVisible(false);
			}
		});
		mnView.add(mntmProduct_1);
		
		JMenuItem mntmOrder = new JMenuItem("Order");
		mntmOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Order vo = null;
				try {
					vo = new View_Order();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				vo.setVisible(true);
				setVisible(false);
			}
		});
		mnView.add(mntmOrder);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnExit.add(mntmQuit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 592, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 361, Short.MAX_VALUE)
		);
		panel.setLayout(gl_panel);
	}

}
