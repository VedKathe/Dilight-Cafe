import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Window.Type;
import java.util.List;
import java.util.Vector;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
public class Menu implements ActionListener
{	
	JLabel l12;
	JButton nesCoffee_b,coldCoffee_b,hotCoffee_b,espressco_b,latte_b,cappuccino_b,mocha,flatWhite_b,affogato;
	JTextField qt_TF ;
	JFrame fm;
	Vector mDATA[],curr_mDATA;
	JFrame f;
	Menu()
	{
		
		
		 f= new JFrame("Menu");
		
		f.setBackground(Color.WHITE);
		f.getContentPane().setBackground(Color.WHITE);
		ImageIcon img = new ImageIcon("img\\DilightCafe Icon.png");
		f.setIconImage(img.getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // Already there
	    
	    f.setUndecorated(true);
	
		Font m = new Font("Monospaced",Font.BOLD,30);
		
		mDATA= new Vector[9];
		for(int i =0;i<9;i++)
		{
			mDATA[i] = new Vector();
		}
	  
		mDATA[0].add("NesCoffee");
		mDATA[0].add(0);
		mDATA[0].add(15);
		mDATA[0].add(0);
		
		mDATA[1].add("Cold Coffee");
		mDATA[1].add(0);
		mDATA[1].add(30);
		mDATA[1].add(1);
		
		mDATA[2].add("Hot Coffee");
		mDATA[2].add(0);
		mDATA[2].add(50);
		mDATA[2].add(2);
		
		mDATA[3].add("Epresso");
		mDATA[3].add(0);
		mDATA[3].add(90);
		mDATA[3].add(3);
		
		mDATA[4].add("Latte");
		mDATA[4].add(0);
		mDATA[4].add(80);
		mDATA[4].add(4);
		
		mDATA[5].add("Cappuccino");
		mDATA[5].add(0);
		mDATA[5].add(70);
		mDATA[5].add(5);
		
		mDATA[6].add("Mocha");
		mDATA[6].add(0);
		mDATA[6].add(100);
		mDATA[6].add(6);
		
		mDATA[7].add("Flat White");
		mDATA[7].add(0);
		mDATA[7].add(65);
		mDATA[7].add(7);
		
		mDATA[8].add("Affogato");
		mDATA[8].add(0);
		mDATA[8].add(150);
		mDATA[8].add(8);
		
		f.setSize(1132, 710);
		f.getContentPane().setLayout(null);
			      
			      JPanel panel_1 = new JPanel();
			      panel_1.setBounds(0, 0, 1132, 710);
			      f.getContentPane().add(panel_1);
			      panel_1.setLayout(null);
			      
			      JLabel lblNewLabel = new JLabel("Dilight Cafe");
			      lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
			      lblNewLabel.setBounds(431, 28, 270, 50);
			      panel_1.add(lblNewLabel);
			      lblNewLabel.setForeground(new Color(61, 34, 22));
			      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			      lblNewLabel.setFont(new Font("Papyrus", Font.BOLD, 44));
			      
			      JLabel lblMenus = new JLabel("Menu's");
			      lblMenus.setBounds(471, 113, 190, 44);
			      panel_1.add(lblMenus);
			      lblMenus.setBackground(new Color(215, 201, 170));
			      lblMenus.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      lblMenus.setAlignmentY(Component.TOP_ALIGNMENT);
			      lblMenus.setOpaque(true);
			      lblMenus.setHorizontalAlignment(SwingConstants.CENTER);
			      lblMenus.setForeground(new Color(61, 34, 22));
			      lblMenus.setFont(new Font("Century Gothic", Font.BOLD, 26));
			      
			      JPanel panel = new JPanel();
			      panel.setBounds(23, 135, 1086, 502);
			      panel_1.add(panel);
			      panel.setBorder(new LineBorder(new Color(61, 34, 22), 4));
			      panel.setBackground(new Color(215, 201, 170));
			      panel.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			      panel.setLayout(null);
			      
			      nesCoffee_b = new JButton("NesCoffee");
			      nesCoffee_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      nesCoffee_b.addActionListener(this);
			      nesCoffee_b.setOpaque(false);
			      nesCoffee_b.setForeground(SystemColor.menu);
			      
			      nesCoffee_b.setIcon(new ImageIcon(new ImageIcon("img\\NesCoffee.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      nesCoffee_b.setBounds(57, 57, 150, 150);
			      panel.add(nesCoffee_b);
			      
			      
			      coldCoffee_b = new JButton("Cold Coffee");
			      coldCoffee_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      
			      	coldCoffee_b.addActionListener(this);
			      	coldCoffee_b.setIcon(new ImageIcon(new ImageIcon("img\\ColdCoffee.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	coldCoffee_b.setBounds(270, 57, 150, 150);
			      	panel.add(coldCoffee_b);
			      	
			      	hotCoffee_b = new JButton("Hot Coffee");
			      	hotCoffee_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	hotCoffee_b.addActionListener(this);
			      	hotCoffee_b.setIcon(new ImageIcon(new ImageIcon("img\\Hot Coffee.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	hotCoffee_b.setBounds(471, 57, 150, 150);
			      	panel.add(hotCoffee_b);
			      	
			      	 espressco_b = new JButton("Espressco");
			      	 espressco_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	 espressco_b.addActionListener(this);
			      	 espressco_b.setIcon(new ImageIcon(new ImageIcon("img\\Espresso.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	 espressco_b.setBounds(682, 57, 150, 150);
			      	 panel.add(espressco_b);
			      	 
			      	  latte_b = new JButton("Latte");
			      	  latte_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	  latte_b.addActionListener(this);
			      	  latte_b.setIcon(new ImageIcon(new ImageIcon("img\\Latte.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	  latte_b.setBounds(890, 57, 150, 150);
			      	  panel.add(latte_b);
			      	  
			      	   cappuccino_b = new JButton("Cappuccino");
			      	   cappuccino_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	   cappuccino_b.addActionListener(this);
			      	   cappuccino_b.setIcon(new ImageIcon(new ImageIcon("img\\Cappuccino.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	   cappuccino_b.setBounds(164, 289, 150, 150);
			      	   panel.add(cappuccino_b);
			      	   
			      	    mocha = new JButton("Mocha");
			      	    mocha.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	    mocha.addActionListener(this);
			      	    mocha.setIcon(new ImageIcon(new ImageIcon("img\\Mocha.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	    mocha.setBounds(379, 289, 150, 150);
			      	    panel.add(mocha);
			      	    
			      	     flatWhite_b = new JButton("Flat White");
			      	     flatWhite_b.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	     flatWhite_b.addActionListener(this);
			      	     flatWhite_b.setIcon(new ImageIcon(new ImageIcon("img\\Flat White.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	     flatWhite_b.setBounds(586, 289, 150, 150);
			      	     panel.add(flatWhite_b);
			      	     
			      	      affogato = new JButton("Affogato");
			      	      affogato.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	      affogato.addActionListener(this);
			      	      affogato.setIcon(new ImageIcon(new ImageIcon("img\\Affogato.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
			      	      affogato.setBounds(801, 289, 150, 150);
			      	      panel.add(affogato);
			      	      
			      	      JLabel lblNewLabel_1 = new JLabel("NesCoffee");
			      	      lblNewLabel_1.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1.setBounds(57, 220, 150, 27);
			      	      panel.add(lblNewLabel_1);
			      	      
			      	      JLabel lblNewLabel_1_1 = new JLabel("Cold Coffee");
			      	      lblNewLabel_1_1.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_1.setBounds(270, 220, 150, 27);
			      	      panel.add(lblNewLabel_1_1);
			      	      
			      	      JLabel lblNewLabel_1_2 = new JLabel("Hot Coffee");
			      	      lblNewLabel_1_2.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_2.setBounds(471, 220, 150, 27);
			      	      panel.add(lblNewLabel_1_2);
			      	      
			      	      JLabel lblNewLabel_1_3 = new JLabel("Espressco");
			      	      lblNewLabel_1_3.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_3.setBounds(682, 220, 150, 27);
			      	      panel.add(lblNewLabel_1_3);
			      	      
			      	      JLabel lblNewLabel_1_4 = new JLabel("Latte");
			      	      lblNewLabel_1_4.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_4.setBounds(890, 220, 150, 27);
			      	      panel.add(lblNewLabel_1_4);
			      	      
			      	      JLabel lblNewLabel_1_5 = new JLabel("Cappuccino");
			      	      lblNewLabel_1_5.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_5.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_5.setBounds(164, 452, 150, 27);
			      	      panel.add(lblNewLabel_1_5);
			      	      
			      	      JLabel lblNewLabel_1_6 = new JLabel("Mocha");
			      	      lblNewLabel_1_6.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_6.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_6.setBounds(379, 452, 150, 27);
			      	      panel.add(lblNewLabel_1_6);
			      	      
			      	      JLabel lblNewLabel_1_7 = new JLabel("Flat White");
			      	      lblNewLabel_1_7.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_7.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_7.setBounds(586, 452, 150, 27);
			      	      panel.add(lblNewLabel_1_7);
			      	      
			      	      JLabel lblNewLabel_1_8 = new JLabel("Affogato");
			      	      lblNewLabel_1_8.setForeground(new Color(61, 34, 22));
			      	      lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
			      	      lblNewLabel_1_8.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      lblNewLabel_1_8.setBounds(801, 447, 150, 27);
			      	      panel.add(lblNewLabel_1_8);
			      	      
			      	      JButton btnNewButton = new JButton("Place Order");
			      	      btnNewButton.addActionListener(new ActionListener() {
			      	      	public void actionPerformed(ActionEvent arg0) {
			      	      		new name(f,mDATA);
			      	      	}
			      	      });
			      	      btnNewButton.setForeground(new Color(61, 34, 22));
			      	      btnNewButton.setBounds(391, 653, 150, 44);
			      	      panel_1.add(btnNewButton);
			      	      btnNewButton.setBackground(new Color(215, 201, 170));
			      	      btnNewButton.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	      btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      
			      	      JButton btnLogout = new JButton("Logout");
			      	      btnLogout.addActionListener(new ActionListener() {
			      	      	public void actionPerformed(ActionEvent arg0) {
			      	      		f.dispose();
			      	      		new LogIn();			      	      		
			      	      	}
			      	      });
			      	      btnLogout.setForeground(new Color(61, 34, 22));
			      	      btnLogout.setBounds(598, 653, 150, 43);
			      	      panel_1.add(btnLogout);
			      	      btnLogout.setBackground(new Color(215, 201, 170));
			      	      btnLogout.setBorder(new LineBorder(new Color(61, 34, 22), 3));
			      	      btnLogout.setFont(new Font("Century Gothic", Font.BOLD, 20));
			      	      
			      	      JLabel lblNewLabel_4 = new JLabel("");
			      	      lblNewLabel_4.setBorder(new LineBorder(new Color(61, 34, 22), 5));
			      	      lblNewLabel_4.setBounds(0, 0, 1132, 710);
			      	    lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("img\\coffpl_nov-7.jpg").getImage().getScaledInstance(1150,757, Image.SCALE_SMOOTH)));
			      	      panel_1.add(lblNewLabel_4);
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	    int x = (int) ((dimension.getWidth() - f.getWidth()) / 2);
	    int y = (int) ((dimension.getHeight() - f.getHeight()) / 2);
	    f.setLocation(x, y);
		f.setVisible(true);
		//f.setIconImages(new ImageIcon(new ImageIcon("img\\Affogato.jpg").getImage().getScaledInstance(170, 150, Image.SCALE_SMOOTH)));
	}
	void selection_menu(String name,Vector mData,ActionEvent ae)
	   {
		 fm=new JFrame();
		 fm.setUndecorated(true);
			fm.setSize(432, 323);
			fm.setVisible(true);
			fm.getContentPane().setLayout(null);
			
			Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - fm.getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - fm.getHeight()) / 2);
		    fm.setLocation(x, y);
			
			curr_mDATA=mData;
			
			JLabel lblNewLabel = new JLabel(mData.get(0).toString());
			lblNewLabel.setForeground(new Color(61, 34, 22));
			lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(141, 176, 150, 20);
			fm.getContentPane().add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Price : Rs.");
			lblNewLabel_1.setForeground(new Color(61, 34, 22));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
			lblNewLabel_1.setBounds(141, 209, 85, 16);
			fm.getContentPane().add(lblNewLabel_1);
			
			 qt_TF = new JTextField(mData.get(1).toString());
			qt_TF.setHorizontalAlignment(SwingConstants.CENTER);
			qt_TF.setBorder(new LineBorder(new Color(61, 34, 22), 2, true));
			qt_TF.setForeground(new Color(61, 34, 22));
			qt_TF.setBackground(new Color(215, 201, 170));
			qt_TF.setBounds(202, 240, 89, 22);
			qt_TF.setFont(new Font("Century Gothic", Font.BOLD, 14));
			fm.getContentPane().add(qt_TF);
			qt_TF.setColumns(10);
			
			JLabel lblNewLabel_2 = new JLabel("Qt. :");
			lblNewLabel_2.setForeground(new Color(61, 34, 22));
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 18));
			lblNewLabel_2.setBounds(141, 241, 56, 16);
			fm.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_1_1 = new JLabel(mData.get(2).toString());
			lblNewLabel_1_1.setForeground(new Color(61, 34, 22));
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
			lblNewLabel_1_1.setBounds(216, 209, 75, 16);
			fm.getContentPane().add(lblNewLabel_1_1);
			
			JButton btnNewButton_1 = new JButton("Add Item");
			btnNewButton_1.setForeground(new Color(61, 34, 22));
			btnNewButton_1.setBorder(new LineBorder(new Color(61, 34, 22), 2, true));
			btnNewButton_1.setBackground(new Color(215, 201, 170));
			btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addItem();
				}
			});
			btnNewButton_1.setBounds(100, 275, 105, 35);
			fm.getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_1_1 = new JButton("Cancel");
			btnNewButton_1_1.setForeground(new Color(61, 34, 22));
			btnNewButton_1_1.setBorder(new LineBorder(new Color(61, 34, 22), 2, true));
			btnNewButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 18));
			btnNewButton_1_1.setBackground(new Color(215, 201, 170));
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cancalItem();
				}
			});
			btnNewButton_1_1.setBounds(230, 275, 105, 35);
			fm.getContentPane().add(btnNewButton_1_1);
			
			JLabel lblNewLabel_3 = new JLabel("hello");
			lblNewLabel_3.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));
			lblNewLabel_3.setIcon(new ImageIcon(new ImageIcon(name).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
			lblNewLabel_3.setBounds(141, 13, 150, 150);
			fm.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBorder(new LineBorder(new Color(61, 34, 22), 6, false));
			lblNewLabel_4.setOpaque(true);
			lblNewLabel_4.setBackground(new Color(254, 255, 245));
			lblNewLabel_4.setBounds(0, 0, 432, 323);
			fm.getContentPane().add(lblNewLabel_4);		
	   }
	public static void main(String args[])
	{
				
		new Menu();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getActionCommand()=="NesCoffee")
		{		
			selection_menu("img\\NesCoffee.jpg",mDATA[0],ae);				
		}
		if(ae.getActionCommand()=="Cold Coffee")
		{		
			selection_menu("img\\ColdCoffee.jpg",mDATA[1],ae);				
		}
		if(ae.getActionCommand()=="Hot Coffee")
		{		
			selection_menu("img\\Hot Coffee.jpg",mDATA[2],ae);				
		}
		if(ae.getActionCommand()=="Espressco")
		{		
			selection_menu("img\\Espresso.jpg",mDATA[3],ae);				
		}
		if(ae.getActionCommand()=="Latte")
		{		
			selection_menu("img\\Latte.jpg",mDATA[4],ae);				
		}
		if(ae.getActionCommand()=="Cappuccino")
		{		
			selection_menu("img\\Cappuccino.jpg",mDATA[5],ae);				
		}
		if(ae.getActionCommand()=="Mocha")
		{		
			selection_menu("img\\Mocha.jpg",mDATA[6],ae);				
		}
		if(ae.getActionCommand()=="Flat White")
		{		
			selection_menu("img\\Flat White.jpg",mDATA[7],ae);				
		}
		if(ae.getActionCommand()=="Affogato")
		{		
			selection_menu("img\\Affogato.jpg",mDATA[8],ae);				
		}
		
	}
	
	void addItem()
	{
		if(!this.qt_TF.getText().equals("0"))
		{
			
			if(0==(int)curr_mDATA.get(3))
			{		
				nesCoffee_b.setBorder(new LineBorder(new Color(255, 255, 255),5, true));
			}
			if(1==(int)curr_mDATA.get(3))
			{		
				coldCoffee_b.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
			}
			if(2==(int)curr_mDATA.get(3))
			{		
				hotCoffee_b.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));				
			}
			if(3==(int)curr_mDATA.get(3))
			{		
				espressco_b.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));			
			}
			if(4==(int)curr_mDATA.get(3))
			{		
				latte_b.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));			
			}
			if(5==(int)curr_mDATA.get(3))
			{		
				cappuccino_b.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));			
			}
			if(6==(int)curr_mDATA.get(3))
			{		
				mocha.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));			
			}
			if(7==(int)curr_mDATA.get(3))
			{		
				flatWhite_b.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));	
			}
			if(8==(int)curr_mDATA.get(3))
			{		
				affogato.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
			}
			int a = Integer.parseInt(qt_TF.getText());
			mDATA[(int) curr_mDATA.get(3)].setElementAt(a, 1);
			//System.out.println(mDATA[(int) curr_mDATA.get(3)]);
			curr_mDATA=null;
		
			fm.dispose();
		}
	}
	
	void cancalItem()
	{
		if(0==(int)curr_mDATA.get(3))
		{		
			nesCoffee_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));
		}
		if(1==(int)curr_mDATA.get(3))
		{		
			coldCoffee_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));
		}
		if(2==(int)curr_mDATA.get(3))
		{		
			hotCoffee_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));				
		}
		if(3==(int)curr_mDATA.get(3))
		{		
			espressco_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));			
		}
		if(4==(int)curr_mDATA.get(3))
		{		
			latte_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));			
		}
		if(5==(int)curr_mDATA.get(3))
		{		
			cappuccino_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));			
		}
		if(6==(int)curr_mDATA.get(3))
		{		
			mocha.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));			
		}
		if(7==(int)curr_mDATA.get(3))
		{		
			flatWhite_b.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));	
		}
		if(8==(int)curr_mDATA.get(3))
		{		
			affogato.setBorder(new LineBorder(new Color(61, 34, 22), 3, true));
		}
		
		mDATA[(int) curr_mDATA.get(3)].setElementAt(0, 1);
		//System.out.println(mDATA[(int) curr_mDATA.get(3)]);
		curr_mDATA=null;
	
		fm.dispose();
	}
}
	
