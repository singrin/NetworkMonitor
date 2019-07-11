package first;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Checkip extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIP;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkip frame = new Checkip();
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
	public Checkip() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNetworkMonitoring = new JLabel("Network Monitoring");
		lblNetworkMonitoring.setBounds(5, 5, 424, 25);
		lblNetworkMonitoring.setHorizontalAlignment(SwingConstants.CENTER);
		lblNetworkMonitoring.setFont(new Font("Times New Roman", Font.BOLD, 21));
		contentPane.add(lblNetworkMonitoring);
		
		JLabel lblEnterIp = new JLabel("Enter IP");
		lblEnterIp.setBounds(93, 70, 62, 33);
		contentPane.add(lblEnterIp);
		
		textFieldIP = new JTextField();
		textFieldIP.setBounds(224, 69, 100, 34);
		textFieldIP.setMaximumSize(new Dimension(100, 100));
		textFieldIP.setDisabledTextColor(new Color(109, 109, 109));
		textFieldIP.setToolTipText("Enter a valid IP Address");
		contentPane.add(textFieldIP);
		textFieldIP.setColumns(5);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent arg0) {
				String ip_address = textFieldIP.getText();
				
				PingWebsite pingwebsite = new PingWebsite();
				
			
					try {
						ArrayList<String> commandList = new ArrayList<String>(); 

						commandList.add("ping"); 
						commandList.add(ip_address); 
						ArrayList<String> results = pingwebsite.commands(commandList);
						ShowResults show_results = new ShowResults();
						int y = 50;
						show_results.setVisible(true);
						for(int i=0;i <results.size(); i++) {
							JLabel label = new JLabel();
							String r = results.get(i);
							label.setText(r);
							show_results.getContentPane().add(label);
							label.setBounds(13, y, 250, 24);
							show_results.contentPane.revalidate();
							show_results.contentPane.repaint();
							y+= 20;
						}

						Checkip.this.dispose();
					    Checkip.this.setVisible(false);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
//				JOptionPane.showMessageDialog(null, "IP address "+ip_address,"Some title", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnSubmit.setBounds(166, 139, 94, 25);
		contentPane.add(btnSubmit);
		
		JButton btnNetworkMap = new JButton("Network Map");
		btnNetworkMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				setBounds(100, 100, 450, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);
				
				NetworkMap open =new NetworkMap();
				open.setVisible(true);
				Checkip.this.dispose();
				Checkip.this.setVisible(false);
				
				
			}
		});
		btnNetworkMap.setBounds(39, 179, 116, 23);
		contentPane.add(btnNetworkMap);
	}
	

}
