import javax.swing.JFrame;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Robot;
import java.awt.Toolkit;
import java.util.Vector;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JToggleButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Receipt {
	Vector mData[];
	JFrame fm;

	JLabel lblNewLabel_3;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public Receipt(Vector mD[],JTextField tx) {
		mData=mD;
		fm=new JFrame();
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		  DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		  LocalDateTime now = LocalDateTime.now();
		fm.setUndecorated(true);
		fm.setTitle("Receipt");
		fm.setResizable(false);
		fm.setSize(497,770);
		fm.getContentPane().setBackground(new Color(210, 180, 140));
		fm.getContentPane().setLayout(null);
		Image icon = Toolkit.getDefaultToolkit().getImage("img\\DilightCafe Icon.png").getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		fm.setIconImage(icon);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - fm.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - fm.getHeight()) / 2);
	    fm.setLocation(x, y);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(163, 36, 170, 170);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("img\\DilightCafe Icon.png").getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
		fm.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Date :");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(16, 211, 100, 30);
		fm.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(dtf1.format(now));
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(132, 211, 117, 30);
		fm.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(59, 254, 100, 30);
		fm.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Item");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setBackground(new Color(215, 201, 170));
		lblNewLabel_1_2.setBorder(new MatteBorder(2, 2, 2, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(19, 291, 192, 30);
		fm.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Quautity");
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setBackground(new Color(215, 201, 170));
		lblNewLabel_1_3.setBorder(new MatteBorder(2, 1, 2, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(211, 291, 133, 30);
		fm.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Price");
		lblNewLabel_1_4.setOpaque(true);
		lblNewLabel_1_4.setBackground(new Color(215, 201, 170));
		lblNewLabel_1_4.setBorder(new MatteBorder(2, 1, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(344, 291, 132, 30);
		fm.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_1 = new JLabel(tx.getText());
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(218, 254, 219, 30);
		fm.getContentPane().add(lblNewLabel_2_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(234, 226, 208));
		panel.setBounds(19, 321, 192, 266);
		fm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel nescoffee_1 = new JLabel("Nes Coffee");
		nescoffee_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		nescoffee_1.setBounds(0, 0, 192, 25);
		panel.add(nescoffee_1);
		nescoffee_1.setHorizontalAlignment(SwingConstants.CENTER);
		nescoffee_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		
		JLabel coldcoffee_1 = new JLabel("Cold Coffee");
		coldcoffee_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		coldcoffee_1.setHorizontalAlignment(SwingConstants.CENTER);
		coldcoffee_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		coldcoffee_1.setBounds(0, 30, 192, 25);
		panel.add(coldcoffee_1);
		
		JLabel hotcoffee_1 = new JLabel("Hot Coffee");
		hotcoffee_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		hotcoffee_1.setHorizontalAlignment(SwingConstants.CENTER);
		hotcoffee_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		hotcoffee_1.setBounds(0, 60, 192, 25);
		panel.add(hotcoffee_1);
		
		JLabel latte_1 = new JLabel("Latte");
		latte_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		latte_1.setHorizontalAlignment(SwingConstants.CENTER);
		latte_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		latte_1.setBounds(0, 120, 192, 25);
		panel.add(latte_1);
		
		JLabel espressco_1 = new JLabel("Espressco");
		espressco_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		espressco_1.setHorizontalAlignment(SwingConstants.CENTER);
		espressco_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		espressco_1.setBounds(0, 90, 192, 25);
		panel.add(espressco_1);
		
		JLabel mocha_1 = new JLabel("Mocha");
		mocha_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		mocha_1.setHorizontalAlignment(SwingConstants.CENTER);
		mocha_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		mocha_1.setBounds(0, 180, 192, 25);
		panel.add(mocha_1);
		
		JLabel cappuccino_1 = new JLabel("Cappuccino");
		cappuccino_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		cappuccino_1.setHorizontalAlignment(SwingConstants.CENTER);
		cappuccino_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		cappuccino_1.setBounds(0, 150, 192, 25);
		panel.add(cappuccino_1);
		
		JLabel affogato_1 = new JLabel("Affogato");
		affogato_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		affogato_1.setHorizontalAlignment(SwingConstants.CENTER);
		affogato_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		affogato_1.setBounds(0, 240, 192, 25);
		panel.add(affogato_1);
		
		JLabel flatwhite_1 = new JLabel("Flat White");
		flatwhite_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		flatwhite_1.setHorizontalAlignment(SwingConstants.CENTER);
		flatwhite_1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		flatwhite_1.setBounds(0, 210, 192, 25);
		panel.add(flatwhite_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(234, 226, 208));
		panel_1.setBounds(211, 321, 133, 266);
		fm.getContentPane().add(panel_1);
		
		JLabel nescoffee_2 = new JLabel(mData[0].get(1).toString());
		nescoffee_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		nescoffee_2.setHorizontalAlignment(SwingConstants.CENTER);
		nescoffee_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[0].get(1)>0) {
			nescoffee_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		nescoffee_2.setBounds(0, 0, 133, 25);
		panel_1.add(nescoffee_2);
		
		JLabel coldcoffee_2 = new JLabel(mData[1].get(1).toString());
		coldcoffee_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		coldcoffee_2.setHorizontalAlignment(SwingConstants.CENTER);
		coldcoffee_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[1].get(1)>0) {
			coldcoffee_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		coldcoffee_2.setBounds(0, 30, 133, 25);
		panel_1.add(coldcoffee_2);
		
		JLabel hotcoffee_2 = new JLabel(mData[2].get(1).toString());
		hotcoffee_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		hotcoffee_2.setHorizontalAlignment(SwingConstants.CENTER);
		hotcoffee_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[2].get(1)>0) {
			hotcoffee_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		hotcoffee_2.setBounds(0, 60, 133, 25);
		panel_1.add(hotcoffee_2);
		
		JLabel latte_2 = new JLabel(mData[4].get(1).toString());
		latte_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		latte_2.setHorizontalAlignment(SwingConstants.CENTER);
		latte_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[4].get(1)>0) {
			latte_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		latte_2.setBounds(0, 120, 133, 25);
		panel_1.add(latte_2);
		
		JLabel espressco_2 = new JLabel(mData[3].get(1).toString());
		espressco_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		espressco_2.setHorizontalAlignment(SwingConstants.CENTER);
		espressco_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[3].get(1)>0) {
			espressco_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		espressco_2.setBounds(0, 90, 133, 25);
		panel_1.add(espressco_2);
		
		JLabel mocha_2 = new JLabel(mData[6].get(1).toString());
		mocha_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		mocha_2.setHorizontalAlignment(SwingConstants.CENTER);
		mocha_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[6].get(1)>0) {
			mocha_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		mocha_2.setBounds(0, 180, 133, 25);
		panel_1.add(mocha_2);
		
		JLabel cappuccino_2 = new JLabel(mData[5].get(1).toString());
		cappuccino_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		cappuccino_2.setHorizontalAlignment(SwingConstants.CENTER);
		cappuccino_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[5].get(1)>0) {
			cappuccino_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		cappuccino_2.setBounds(0, 150, 133, 25);
		panel_1.add(cappuccino_2);
		
		JLabel affogato_2 = new JLabel(mData[8].get(1).toString());
		affogato_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		affogato_2.setHorizontalAlignment(SwingConstants.CENTER);
		affogato_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[8].get(1)>0) {
			affogato_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		affogato_2.setBounds(0, 240, 133, 25);
		panel_1.add(affogato_2);
		
		JLabel flatwhite_2 = new JLabel(mData[7].get(1).toString());
		flatwhite_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		flatwhite_2.setHorizontalAlignment(SwingConstants.CENTER);
		flatwhite_2.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		if ((int)mData[7].get(1)>0) {
			flatwhite_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
		}
		flatwhite_2.setBounds(0, 210, 133, 25);
		panel_1.add(flatwhite_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(234, 226, 208));
		panel_2.setBounds(344, 321, 132, 266);
		fm.getContentPane().add(panel_2);
		
		JLabel nescoffee_3 = new JLabel("15");
		nescoffee_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		nescoffee_3.setHorizontalAlignment(SwingConstants.CENTER);
		nescoffee_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		nescoffee_3.setBounds(0, 0, 132, 25);
		panel_2.add(nescoffee_3);
		
		JLabel coldcoffee_3 = new JLabel("30");
		coldcoffee_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		coldcoffee_3.setHorizontalAlignment(SwingConstants.CENTER);
		coldcoffee_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		coldcoffee_3.setBounds(0, 30, 132, 25);
		panel_2.add(coldcoffee_3);
		
		JLabel hotcoffee_3 = new JLabel("50");
		hotcoffee_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		hotcoffee_3.setHorizontalAlignment(SwingConstants.CENTER);
		hotcoffee_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		hotcoffee_3.setBounds(0, 60, 132, 25);
		panel_2.add(hotcoffee_3);
		
		JLabel espressco_3 = new JLabel("90");
		espressco_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		espressco_3.setHorizontalAlignment(SwingConstants.CENTER);
		espressco_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		espressco_3.setBounds(0, 90, 132, 25);
		panel_2.add(espressco_3);
		
		JLabel latte_3 = new JLabel("80");
		latte_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		latte_3.setHorizontalAlignment(SwingConstants.CENTER);
		latte_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		latte_3.setBounds(0, 120, 132, 25);
		panel_2.add(latte_3);
		
		JLabel cappuccino_3 = new JLabel("70");
		cappuccino_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		cappuccino_3.setHorizontalAlignment(SwingConstants.CENTER);
		cappuccino_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		cappuccino_3.setBounds(0, 150, 132, 25);
		panel_2.add(cappuccino_3);
		
		JLabel mocha_3 = new JLabel("100");
		mocha_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		mocha_3.setHorizontalAlignment(SwingConstants.CENTER);
		mocha_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		mocha_3.setBounds(0, 180, 132, 25);
		panel_2.add(mocha_3);
		
		JLabel flatwhite_3 = new JLabel("65");
		flatwhite_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		flatwhite_3.setHorizontalAlignment(SwingConstants.CENTER);
		flatwhite_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		flatwhite_3.setBounds(0, 210, 132, 25);
		panel_2.add(flatwhite_3);
		
		JLabel affogato_3 = new JLabel("150");
		affogato_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		affogato_3.setHorizontalAlignment(SwingConstants.CENTER);
		affogato_3.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		affogato_3.setBounds(0, 240, 132, 25);
		panel_2.add(affogato_3);
		
		JLabel lblNewLabel_1_5 = new JLabel("Time :");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(265, 211, 100, 30);
		fm.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_2 = new JLabel(dtf.format(now));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(381, 211, 100, 30);
		fm.getContentPane().add(lblNewLabel_2_2);
		
		lblNewLabel_3 = new JLabel("Total :");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(215, 201, 170));
		lblNewLabel_3.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(19, 587, 457, 30);
		fm.getContentPane().add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setOpaque(false);
		panel_3.setBounds(0, 0, 497, 770);
		fm.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fm.dispose();
				new Menu();
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(290, 707, 120, 30);
		panel_3.add(btnNewButton);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setBackground(new Color(234, 226, 208));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		
		JLabel lblNewLabel_4 = new JLabel("Thank you for visiting");
		lblNewLabel_4.setBounds(20, 641, 457, 49);
		panel_3.add(lblNewLabel_4);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Pristina", Font.PLAIN, 34));
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
		            Robot robot = new Robot();
		            String format = "jpg";
		            String fileName = "FullScreenshot." + format;	            	            
		            JFileChooser fc=new JFileChooser();    
		            int i=fc.showOpenDialog(fm);    
		            Thread.sleep((long)500);
		            if(i==JFileChooser.APPROVE_OPTION){    
		                File f=fc.getSelectedFile();    
		                String filepath=f.getPath(); 
		                btnNewButton.setVisible(false);
		                btnPrint.setVisible(false);
			            BufferedImage img = new BufferedImage(fm.getWidth(),fm.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
			            fm.paint(img.getGraphics());
			            File outputfile = new File(filepath+".jpg");
			            ImageIO.write(img, "jpg", outputfile);
			            btnNewButton.setVisible(true);
		                btnPrint.setVisible(true);
			            JOptionPane.showMessageDialog(fm,"YOUR RECEIPT IS SAVED","Alert",JOptionPane.WARNING_MESSAGE);
		            }    
		            
		        } catch (AWTException | IOException | InterruptedException ex) {
		            System.err.println(ex);
		        }
			}
		});
		btnPrint.setForeground(Color.DARK_GRAY);
		btnPrint.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnPrint.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnPrint.setBackground(new Color(234, 226, 208));
		btnPrint.setBounds(85, 707, 120, 30);
		panel_3.add(btnPrint);
		fm.setVisible(true);
		total();
		
		
	}
	
	void total()
	{
		int totel=0;
		for (int i = 0; i < mData.length; i++) {
			int j = (int)mData[i].get(2);
			j=j*(int)mData[i].get(1);
			totel=totel+j;
		}
		lblNewLabel_3.setText(lblNewLabel_3.getText()+"Rs."+totel);
	}
	
	
	public static void main(String ag[])
	{
		//new Receipt();
	}
}
