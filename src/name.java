
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 
public class name {
	private JTextField textField;
	private JTextField textField_1;
	Vector mDATA[];
	private JLabel lblNewLabel_1;
	private JTextPane textPane;
	JFrame fm,f;
	/**
	 * @wbp.parser.entryPoint
	 */
	public name(JFrame m,Vector mD[]) {
		
		mDATA=mD;
		f=m;
		fm=new JFrame();
		fm.setUndecorated(true);
		fm.setResizable(false);
		fm.setSize(424, 329);
		fm.setVisible(true);
		Image icon = Toolkit.getDefaultToolkit().getImage("img/DilightCafe Icon.png").getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		fm.setIconImage(icon);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - fm.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - fm.getHeight()) / 2);
	    fm.setLocation(x, y);
	    fm.getContentPane().setLayout(null);
	    
	    textField_1 = new JTextField();
	    textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
	    textField_1.setBorder(new LineBorder(new Color(61, 34, 22), 2));
	    textField_1.setBounds(221, 44, 185, 35);
	    fm.getContentPane().add(textField_1);
	    textField_1.setColumns(10);
	    
	    lblNewLabel_1 = new JLabel("Customer Name :");
	    lblNewLabel_1.setForeground(new Color(61, 34, 22));
	    lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1.setBounds(18, 43, 185, 35);
	    fm.getContentPane().add(lblNewLabel_1);
	    
	    JButton btnNewButton = new JButton("CONFIRM");
	    btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		f.dispose();
	    		fm.dispose();
	    		new Receipt(mDATA,textField_1);
	    	}
	    });
	    btnNewButton.setBackground(new Color(215, 201, 170));
	    btnNewButton.setForeground(new Color(61, 34, 22));
	    btnNewButton.setBorder(new LineBorder(new Color(61, 34, 22), 2));
	    btnNewButton.setBounds(61, 281, 120, 35);
	    fm.getContentPane().add(btnNewButton);
	    
	    JButton btnNewButton_1 = new JButton("BACK");
	    btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
	    btnNewButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		fm.dispose();
	    	}
	    });
	    btnNewButton_1.setBackground(new Color(215, 201, 170));
	    btnNewButton_1.setForeground(new Color(61, 34, 22));
	    btnNewButton_1.setBorder(new LineBorder(new Color(61, 34, 22), 2));
	    btnNewButton_1.setBounds(242, 281, 120, 35);
	    fm.getContentPane().add(btnNewButton_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("Confirm Order :");
	    lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_2.setForeground(new Color(61, 34, 22));
	    lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
	    lblNewLabel_2.setBounds(18, 110, 185, 16);
	    fm.getContentPane().add(lblNewLabel_2);
	    
	    textPane = new JTextPane();
	    textPane.setForeground(new Color(61, 34, 22));
	    textPane.setOpaque(false);
	    textPane.setBackground(SystemColor.menu);
	    textPane.setFont(new Font("Century Gothic", Font.BOLD, 16));
	    textPane.setBounds(19, 139, 386, 129);
	    fm.getContentPane().add(textPane);
	    
	    JLabel lblNewLabel = new JLabel("");
	    lblNewLabel.setBorder(new LineBorder(new Color(61, 34, 22), 4));
	    lblNewLabel.setOpaque(true);
	    lblNewLabel.setBackground(new Color(215, 201, 170));
	    lblNewLabel.setBounds(0, 0, 424, 329);
	    fm.getContentPane().add(lblNewLabel);
		displayBuy();
		
	}  
	
	
	void  displayBuy()
	{
		for (int i = 0; i < mDATA.length; i++) {			
			if((int)mDATA[i].get(1)!=0)
			{				
				textPane.setText(textPane.getText()+"  "+mDATA[i].get(0)+" Qt:"+mDATA[i].get(1)+"  ");
			 if(i==1||i==3||i==5||i==7||i==9)
			 {
				 textPane.setText(textPane.getText()+"\n");
			 }
			
			}
		}
	}
public static void main(String[] args){  
try{  
	 //new Login1();
}catch(Exception e){System.out.println(e);}  
}  
}  
