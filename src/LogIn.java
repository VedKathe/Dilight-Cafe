import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.border.LineBorder;
public class LogIn extends JFrame implements ActionListener
{
	JPasswordField pass;
	JTextField user;
	JLabel lpass,luser,ltitle,icon;
	JPanel panel;
	JButton login,quit;
	Connection conn;
	Statement st;
	ResultSet rs;
	Font f;
	Boolean isConnected = false;
	
	LogIn()
	{
		getContentPane().setBackground(new Color(201, 157, 102));
		 f= new Font("Monospaced", Font.BOLD, 16);
		
		
		icon= new JLabel("");
		icon.setHorizontalAlignment(SwingConstants.CENTER);
		icon.setIcon(new ImageIcon (new ImageIcon("img/DilightCafe Icon.png").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
	 	icon.setBounds(207, 20, 200, 200);
		
		ltitle= new JLabel("LogIn");
		ltitle.setForeground(new Color(61, 31, 20));
		ltitle.setHorizontalAlignment(SwingConstants.CENTER);
		ltitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
	 	ltitle.setBounds(175, 245, 263, 40);
	 	
		panel = new JPanel();
		panel.setBackground(new Color(234, 226, 208));
		panel.setBounds(122, 309, 370, 97);
		panel.setBorder(new LineBorder(new Color(61, 31, 20), 4));
			
		
		luser=new JLabel(" Email ");
		luser.setForeground(new Color(61, 31, 20));
		luser.setHorizontalAlignment(SwingConstants.CENTER);
		luser.setBounds(21,7,110,30);
		user=new JTextField(15);		
		user.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		user.setBounds(162,13,171,25);
		user.setToolTipText("Enter Name");
		
		luser.setFont(new Font("Century Gothic", Font.BOLD, 22));
		
		lpass=new JLabel(" Password ");
		lpass.setForeground(new Color(61, 31, 20));
		lpass.setHorizontalAlignment(SwingConstants.CENTER);
		lpass.setBounds(27,54,132,22);
		pass=new JPasswordField(15);		
		pass.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		pass.setBounds(162,56,171,25);
		pass.setToolTipText("Enter Password");
		lpass.setFont(new Font("Century Gothic", Font.BOLD, 22));
		
		login= new JButton("LOGIN");
		login.setForeground(new Color(61, 31, 20));
		login.setBounds(122, 455, 145, 40);
		login.setBorder(new LineBorder(new Color(61, 31, 20), 3));
		login.setFont(new Font("Century Gothic", Font.BOLD, 20));
		login.setBackground(new Color(234, 226, 208));
		login.addActionListener(this);

		
		quit= new JButton("QUIT");
		quit.setForeground(new Color(61, 31, 20));
		quit.setBounds(347, 455, 145, 40);
		quit.setBorder(new LineBorder(new Color(61, 31, 20), 3));
		quit.setFont(new Font("Century Gothic", Font.BOLD, 20));
		quit.setBackground(new Color(234, 226, 208));
		quit.addActionListener(this);
		
		getContentPane().add(ltitle);
		getContentPane().add(icon);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.add(luser);
		panel.add(user);
		panel.add(lpass);
		panel.add(pass);
		getContentPane().add(login);
		getContentPane().add(quit);
		
		setconnection();
		this.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("img/DilightCafe Icon.png").getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		this.setIconImage(icon);
		this.setTitle("Dilight Cafe");
		getContentPane().setLayout(null);
		setSize(620,560);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		    int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
		    int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
		    this.setLocation(x, y);
	}
	
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub
		if(a.getSource()==login)
		{	
			int n=cheakUser();
			if(n==1) {
						new Menu();
						this.setVisible(false);
					}
			else if(n==2){
					JOptionPane.showMessageDialog(this,"Invalid Username or Password","Alert",JOptionPane.WARNING_MESSAGE);

			}
		}
		if(a.getSource()==quit)
		{
			if (JOptionPane.showConfirmDialog( this,"Are you sure you want to exit?","Quit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
			System.exit(0);
		}
	}
	
	
	int cheakUser() 
	{	
		int n=0;		
		if(!isConnected) {	
			if(user.getText().equals("system") && String.valueOf(pass.getPassword()).equals("system"))
			{
				 n= 1;									
			}else
			{
				 n =2;				
			}
		}
		else
		{
			try {
				rs = st.executeQuery("Select * from userdata");
				while(rs.next()) {
				
					if(user.getText().equals(rs.getString("name")) && String.valueOf(pass.getPassword()).equals(rs.getString("pass")))
					{
						 n= 1;
						 rs.beforeFirst();
						break;						
					}else
					{
						 n =2;
						 //rs.beforeFirst();
					
					}
				} 				
			} catch (SQLException e) {			
				JOptionPane.showMessageDialog(this,e.getMessage()+"\n\tTry reconnecting","Alert",JOptionPane.WARNING_MESSAGE);
			}
		}
		return n;
		
	}
	
	void setconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
    		
            st = conn.createStatement();           
             rs = st.executeQuery("Select * from userdata");
             isConnected=true;
        } 
		catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(this,e.getMessage()+"\n\tTry reconnecting","Alert",JOptionPane.WARNING_MESSAGE);
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(this,e.getMessage()+"\n\tTry reconnecting","Alert",JOptionPane.WARNING_MESSAGE);
        }
		catch(Exception e) {
			JOptionPane.showMessageDialog(this,e.getMessage()+"\n\t reconnecting","Alert",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	
	boolean cheakuser(JTextField usernew)
	{
		
		try {
			rs = st.executeQuery("Select * from userdata");
				
			while(rs.next()) {
				
				if(usernew.getText().equals(rs.getString("name")))
				{
					
					 rs.beforeFirst();
					 return true;
				}
					else
				{
					 
					 rs.beforeFirst();
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;		
	}
	
	boolean cheakpass()
	{
		
		return isConnected;
		
	}
	public static void main(String args[])
	{
		new LogIn();
	}

	
}