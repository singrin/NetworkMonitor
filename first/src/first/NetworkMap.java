package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class NetworkMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkMap frame = new NetworkMap();
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
	public NetworkMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Checkip goback= new Checkip();
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				goback.setVisible(true);
				NetworkMap.this.dispose();
			    NetworkMap.this.setVisible(false);

			}
		});
		btnHome.setBounds(685, 513, 89, 23);
		contentPane.add(btnHome);
		JButton btnNewButton = new JButton("Mobile");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setVisible(false);
		btnNewButton.setIcon(new ImageIcon(NetworkMap.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextPane txtpnMobileTejaswis = new JTextPane();
				txtpnMobileTejaswis.setVisible(true);
				txtpnMobileTejaswis.setBackground(SystemColor.control);
				txtpnMobileTejaswis.setText("172.20.10.3\r\nMobile\r\nTejaswi's Mobile");
				txtpnMobileTejaswis.setBounds(543, 203, 100, 57);
				contentPane.add(txtpnMobileTejaswis);
				
			}
		});
		btnNewButton.setBounds(543, 155, 105, 49);
		contentPane.add(btnNewButton);
		
		JButton btnHome_1 = new JButton("Home Server");
		btnHome_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnHome_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setVisible(true);
			}
		});
		btnHome_1.setIcon(new ImageIcon(NetworkMap.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		btnHome_1.setForeground(Color.BLACK);
		btnHome_1.setBackground(Color.GREEN);
		btnHome_1.setBounds(311, 269, 162, 49);
		contentPane.add(btnHome_1);
		
		JLabel lblNetworkMap = new JLabel("Network Map");
		lblNetworkMap.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNetworkMap.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetworkMap.setBounds(319, 11, 153, 40);
		contentPane.add(lblNetworkMap);
		
		JTextPane txtpnMobileRohits = new JTextPane();
		txtpnMobileRohits.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnMobileRohits.setBackground(SystemColor.control);
		txtpnMobileRohits.setText("172.20.10.1\r\nMobile\r\nRohit's Mobile\r\n");
		txtpnMobileRohits.setBounds(347, 318, 89, 49);
		contentPane.add(txtpnMobileRohits);
		
		JButton btnLaptop = new JButton("Laptop");
		btnLaptop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextPane txtpnLaptopTejaswis = new JTextPane();
				txtpnLaptopTejaswis.setBackground(SystemColor.control);
				txtpnLaptopTejaswis.setText("172.20.10.13\r\nLaptop\r\nTejaswi's Laptop");
				txtpnLaptopTejaswis.setBounds(138, 204, 89, 49);
				contentPane.add(txtpnLaptopTejaswis);
			}
		});
		btnLaptop.setBackground(Color.GREEN);
		btnLaptop.setIcon(new ImageIcon(NetworkMap.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		btnLaptop.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLaptop.setBounds(128, 155, 111, 49);
		contentPane.add(btnLaptop);
		
		
		
		JButton btnLaptop_1 = new JButton("Laptop");
		btnLaptop_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextPane txtpnLaptopRohits = new JTextPane();
				txtpnLaptopRohits.setBackground(SystemColor.control);
				txtpnLaptopRohits.setText("172.20.10.5\r\nLaptop\r\nRohit's Laptop");
				txtpnLaptopRohits.setBounds(138, 471, 89, 54);
				contentPane.add(txtpnLaptopRohits);
			}
		});
		btnLaptop_1.setBackground(Color.GREEN);
		btnLaptop_1.setIcon(new ImageIcon(NetworkMap.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		btnLaptop_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLaptop_1.setBounds(128, 417, 111, 49);
		contentPane.add(btnLaptop_1);
		
		
		
		JButton btnWebsite = new JButton("Website");
		btnWebsite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			JTextPane txtpnWwwrajyasabhanicin = new JTextPane();
			txtpnWwwrajyasabhanicin.setBackground(SystemColor.control);
			txtpnWwwrajyasabhanicin.setText("192.168.43.1\r\nWebsite\r\nwww.rajyasabha.nic.in\r\n");
			txtpnWwwrajyasabhanicin.setBounds(543, 471, 117, 65);
			contentPane.add(txtpnWwwrajyasabhanicin);
			
			}
		});
		btnWebsite.setBackground(Color.GREEN);
		btnWebsite.setIcon(new ImageIcon(NetworkMap.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Outdent-Black-rtl.png")));
		btnWebsite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnWebsite.setBounds(543, 417, 105, 49);
		contentPane.add(btnWebsite);
		
		
		
		
		

		
	}
}
