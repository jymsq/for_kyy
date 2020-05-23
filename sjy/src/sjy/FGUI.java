package sjy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FGUI {
	//加载初始界面
	Statement sta=null;
	public FGUI(Statement sta)
	{
		this.sta=sta;
		
	}
	
	public void run()
	{
		
		JFrame frame=new JFrame();
		
		frame.setLayout(null);
		frame.setLocation(200,100);
		frame.setSize(1000, 500);
		
		JPanel panel=new JPanel();
		panel.setLocation(0, 0);
		panel.setSize(1000, 500);
		panel.setBackground(Color.orange);
		panel.setLayout(null);
		
		
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		
		
		
		panel1.setLocation(0,100);
		panel2.setLocation(0,100);
		panel3.setLocation(0,100);
		
		panel1.setSize(1000,400);
		panel2.setSize(1000,400);
		panel3.setSize(1000,400);
		
		
		JMenuBar jmb=new JMenuBar();
		jmb.setLayout(null);
		jmb.setLocation(0, 0);
		jmb.setBackground(Color.LIGHT_GRAY);
		jmb.setSize(1000,80 );
		
		JLabel l1=new JLabel("password");
		l1.setFont(new Font("仿宋", Font.BOLD, 20));
		JPasswordField jps=new  JPasswordField();
		
		l1.setLocation(330, 100);
		l1.setFont(new Font("仿宋", Font.BOLD, 20));
		l1.setSize(120, 50);
		
		jps.setLocation(480, 100);
		jps.setSize(150, 50);
		 
		
		panel1.setBackground(Color.orange);
		panel2.setBackground(Color.orange);
		panel3.setBackground(Color.orange);
		
		JLabel l2=new JLabel("教师工号");
		l2.setFont(new Font("仿宋", Font.BOLD, 20));
		JLabel l3=new JLabel("密码");
		l3.setFont(new Font("仿宋", Font.BOLD, 20));
		JPasswordField jps1=new JPasswordField();
		JTextField ja1=new JTextField();
		
		
		
		
		JLabel l4=new JLabel("教师工号");
		l4.setFont(new Font("仿宋", Font.BOLD, 20));
		JLabel l5=new JLabel("密码");
		l5.setFont(new Font("仿宋", Font.BOLD, 20));
		JLabel l6=new JLabel("姓名");
		l6.setFont(new Font("仿宋", Font.BOLD, 20));
		JTextField ja2=new JTextField();
		JPasswordField jps2=new JPasswordField();
		JTextField ja3=new JTextField();
		
		
		
		JButton zc=new JButton("注册");
		
		JButton b1=new JButton("管理员登陆");
		b1.setSize(120, 80);
		b1.setBackground(Color.green);
		JButton b2=new JButton ("教师登录");
		b2.setLocation(450, 0);
		b2.setBackground(Color.green);
		b2.setSize(120, 80);
		
		
		
		l2.setLocation(250, 50);
		l2.setSize(200, 50);
		ja1.setLocation(400, 50);
		ja1.setSize(200, 50);
		
		l3.setLocation(250, 150);
		l3.setSize(200, 50);
		jps1.setLocation(400, 150);
		jps1.setSize(200, 50);
		JButton b3=new JButton("教师注册");
		b3.setLocation(860, 0);
		b3.setBackground(Color.green);
		b3.setSize(140,80);
		
		
		
		l4.setLocation(150, 0);
		l4.setSize(200, 50);
		ja2.setLocation(400, 0);
		ja2.setSize(200,50);
		
		l5.setLocation(150, 100);
		l5.setSize(200, 50);
		jps2.setLocation(400,100);
		jps2.setSize(200, 50);
		
		l6.setLocation(150,200);
		l6.setSize(200, 50);
		ja3.setLocation(400, 200);
		ja3.setSize(200, 50);
		zc.setSize(100, 40);
		zc.setBackground(Color.green);
		zc.setLocation(450, 280);
		
		jmb.add(b1);
		jmb.add(b2);
		jmb.add(b3);
		
		panel.add(jmb);
		
		panel1.add(jps);
		panel1.add(l1);
		
		panel2.add(l2);
		panel2.add(l3);
		panel2.add(jps1);
		panel2.add(ja1);
		
		panel3.add(l4);
		panel3.add(l5);
		panel3.add(l6);
		panel3.add(ja2);
		panel3.add(jps2);
		panel3.add(ja3);
		panel3.add(zc);
		
		zc.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if (ja2.getText().length()!=8)
					{
						JOptionPane.showMessageDialog(null, "教师工号位数不正确", "失败", JOptionPane.ERROR_MESSAGE); 
					}
					else
					{
					sta.execute("insert into teacher values('"+ja2.getText()+"','"+ja3.getText()+"','"+jps2.getText()+"');");
					JOptionPane.showMessageDialog(null, "添加成功", "成功", JOptionPane.PLAIN_MESSAGE); 
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel1.updateUI();
		panel2.updateUI();
		panel3.updateUI();
		panel.updateUI();
		
		frame.add(panel);
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		frame.setVisible(true);
		AUI a=new AUI(sta);
		
		jps.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (jps.getText().equals("123"))
				{
					try {
						a.run();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "密码错误", "失败", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		jps1.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from teacher where id='"+ja1.getText()+"';");
					Boolean hasornot=false;
					while (set.next())
					{
						if (jps1.getText().equals(set.getString("password")) && ja1.getText().equals(set.getString("id")))
						frame.setVisible(false);
						hasornot=true;
					tui t=new tui(set.getString("name"));
					try {
						t.run();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
						
					}
					if (!hasornot)
					{
						JOptionPane.showMessageDialog(null, "密码或账号错误", "失败", JOptionPane.ERROR_MESSAGE); 
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel1.setVisible(true);
				
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel3.setVisible(false);
				panel1.setVisible(false);
				panel2.setVisible(true);
				
				
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				panel1.setVisible(false);
				panel3.setVisible(true);
				
				
				
			}
		});
		
		
		
		
		
		
		
	}

}
