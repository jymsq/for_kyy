package sjy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class manage {
	public static void main(String[] args) throws Exception {
		Database data=new Database();
		Statement sta=data.Get_Statement();
		SwingUtilities.invokeLater(new Runnable() {
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			GUI g=new GUI(sta);
			g.run();
		}
		
		});
	}
}

class Database
{	private static String url = "jdbc:postgresql://127.0.0.1:5432/pra";
	private static String name = "postgres";
	private static String password = "wsy17320056192";

	public Statement Get_Statement() throws Exception
	{
		Connection conn=null;
		Statement stat=null;
		
		Class.forName("org.postgresql.Driver");
		conn= DriverManager.getConnection(url, name, password);
		stat=conn.createStatement();
		return stat;
	}
}

class GUI
{	 private  String password="123";
	 private Statement sta=null;
	 private Set<String> ts=new HashSet<String>();
	public GUI()
	{
		
	}
	public GUI(Statement sta)
	{
		this.sta=sta;
	}
	public Set<String> get_time()
	{
		return this.ts;
	}
	public synchronized void run()
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
	frame.add(panel);
	
	JMenuBar jmb=new JMenuBar();
	jmb.setLayout(null);
	jmb.setLocation(0, 0);
	jmb.setBackground(Color.LIGHT_GRAY);
	jmb.setSize(1000,80 );
	
	JLabel l1=new JLabel("password");
	l1.setFont(new Font("仿宋", Font.BOLD, 20));
	JPasswordField jps=new  JPasswordField();
	
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
	
	
	
	
	
	//管理员界面设计
	JButton b1=new JButton("管理员登陆");
	b1.setSize(120, 80);
	b1.setBackground(Color.green);
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.remove(l2);
			panel.remove(l3);
			panel.remove(jps1);
			panel.remove(ja1);
			panel.remove(ja2);
			panel.remove(jps2);
			panel.remove(ja3);
			panel.remove(l4);
			panel.remove(l5);
			panel.remove(l6);
			panel.remove(zc);
			
			
			l1.setLocation(330, 200);
			l1.setFont(new Font("仿宋", Font.BOLD, 20));
			l1.setSize(120, 50);
			
			jps.setLocation(480, 200);
			jps.setSize(150, 50);
			
			jps.addActionListener(new ActionListener() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (jps.getText().equals(password))
						{JFrame frame1=new JFrame();
						frame.setLayout(null);
						frame.setLocation(100, 100);
						
						frame1.setSize(1200, 700);
						frame.setVisible(false);
						frame1.setVisible(true);
						
						JPanel panel1=new JPanel();
						panel1.setLayout(null);
						panel1.setLocation(0, 0);
						panel1.setBackground(Color.orange);
						panel1.setSize(1200, 700);
						
						JButton p_b1=new JButton("教师信息管理");
						JButton p_b2=new JButton("课程信息管理");
						JButton p_b3=new JButton("班级信息管理");
						JButton p_b4=new JButton("预约实验管理");
						JButton p_b5=new JButton("实验时间管理");
						
						p_b1.setLocation(0,0);
						p_b1.setBackground(Color.green);
						p_b1.setSize(150, 80);
						
						p_b2.setLocation(240,0);
						p_b2.setBackground(Color.green);
						p_b2.setSize(150, 80);
						
						p_b3.setLocation(480,0);
						p_b3.setBackground(Color.green);
						p_b3.setSize(150, 80);
						
						p_b4.setLocation(720,0);
						p_b4.setBackground(Color.green);
						p_b4.setSize(150, 80);
						
						p_b5.setLocation(960,0);
						p_b5.setBackground(Color.green);
						p_b5.setSize(150, 80);
						
						panel1.add(p_b1);
						panel1.add(p_b2);
						panel1.add(p_b3);
						panel1.add(p_b4);
						panel1.add(p_b5);
						
						
						JPanel panel1_1=new JPanel();
						panel1_1.setLocation(0, 100);
						panel1_1.setBackground(Color.orange);
						panel1_1.setSize(1200,600);
						
						JPanel panel1_2=new JPanel();
						panel1_2.setLocation(0, 100);
						panel1_2.setBackground(Color.orange);
						panel1_2.setSize(1200,600);
						
						JPanel panel1_3=new JPanel();
						panel1_3.setLocation(0, 100);
						panel1_3.setBackground(Color.orange);
						panel1_3.setSize(1200,600);
						
						JPanel panel1_4=new JPanel();
						panel1_4.setLocation(0, 100);
						panel1_4.setBackground(Color.orange);
						panel1_4.setSize(1200,600);
						
						JPanel panel1_5=new JPanel();
						panel1_5.setLocation(0, 100);
						panel1_5.setBackground(Color.orange);
						panel1_5.setSize(1200,600);
						//教师信息管理
						p_b1.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								panel1.remove(panel1_2);
								panel1.remove(panel1_3);
								panel1.remove(panel1_4);
								panel1.remove(panel1_5);
								panel1.add(panel1_1);
								
								panel1_1.setLayout(null);
								JButton search_=new JButton("查询");
								JButton insert_=new JButton("添加");
								JButton delete_=new JButton("删除");
								JButton update_=new JButton("修改");
								
								JLabel labelbig=new JLabel("教师信息管理");
								
								labelbig.setLocation(500,0);
								labelbig.setSize(300, 100);
								Font f=new Font("宋体",Font.BOLD,25);
								labelbig.setFont(f);
								panel1_1.add(labelbig);
								
								search_.setLocation(100, 120);
								search_.setBackground(Color.green);
								search_.setSize(100, 40);
								
								insert_.setLocation(400, 120);
								insert_.setBackground(Color.green);
								insert_.setSize(100, 40);
								
								delete_.setLocation(700, 120);
								delete_.setBackground(Color.green);
								delete_.setSize(100, 40);
								
								update_.setLocation(1000, 120);
								update_.setBackground(Color.green);
								update_.setSize(100,40);
								
								panel1_1.add(delete_);
								panel1_1.add(insert_);
								panel1_1.add(update_);
								panel1_1.add(search_);
								
								JPanel panel1_1_1=new JPanel();
								JPanel panel1_1_2=new JPanel();
								JPanel panel1_1_3=new JPanel();
								JPanel panel1_1_4=new JPanel();
								
								panel1_1_1.setSize(1200, 400);
								panel1_1_2.setSize(1200, 400);
								panel1_1_3.setSize(1200, 400);
								panel1_1_4.setSize(1200, 400);
								
								panel1_1_1.setBackground(Color.orange);
								panel1_1_2.setBackground(Color.orange);
								panel1_1_3.setBackground(Color.orange);
								panel1_1_4.setBackground(Color.orange);
								
								panel1_1_1.setLocation(0, 200);
								panel1_1_2.setLocation(0, 200);
								panel1_1_3.setLocation(0, 200);
								panel1_1_4.setLocation(0, 200);
								//更新操作
								update_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_1.remove(panel1_1_1);
										panel1_1.remove(panel1_1_2);
										panel1_1.remove(panel1_1_3);
										panel1_1.add(panel1_1_4);
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(300, 40);
										delete_box.setLocation(500, 0);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 50);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 100);
										name_text.setSize(200, 40);
										
										JTextField password_text=new JTextField();
										password_text.setLocation(500, 150);
										password_text.setSize(200, 40);
										
										JLabel number=new JLabel("教工号：");
										JLabel name=new JLabel("名字：");
										JLabel password=new JLabel("密码：");
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										password.setSize(200, 30);
										password.setFont(new Font("仿宋", Font.BOLD, 20));
										password.setLocation(250, 150);
										
										JButton up_b=new JButton("修改"); 
										up_b.setSize(100, 40);
										up_b.setBackground(Color.green);
										up_b.setLocation(530, 250);
										
										JLabel pre=new JLabel("选择修改信息:");
										pre.setLocation(250, 0);
										pre.setFont(new Font("仿宋", Font.BOLD, 20));
										pre.setSize(200, 30);
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from teacher");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_box.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from teacher");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password")).equals(s))
														{
															
															name_text.setText(set.getString("name"));
															password_text.setText(set.getString("password"));
															number_text.setText(set.getString("id"));
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										up_b.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from teacher");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password")).equals(s))
														{
															sta.execute("delete from teacher where name='"+set.getString("name")+"'");
															sta.execute("insert into teacher values('"+number_text.getText()+"',"
																	+"'"+name_text.getText()+"','"+password_text.getText()+"')");
															
															JOptionPane.showMessageDialog(null,"修改成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										
										
										
										panel1_1_4.add(pre);
										panel1_1_4.add(name);
										panel1_1_4.add(password);
										panel1_1_4.add(number);
										panel1_1_4.add(number_text);
										panel1_1_4.add(name_text);
										panel1_1_4.add(password_text);
										panel1_1_4.add(delete_box);
										panel1_1_4.add(up_b);
										panel1_1_4.setLayout(null);
										
										panel1_1_4.updateUI();
										
									}
								});
								//删除操作
								delete_.addActionListener(new ActionListener() {
									
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_1.remove(panel1_1_1);
										panel1_1.remove(panel1_1_2);
										panel1_1.remove(panel1_1_4);
										panel1_1.add(panel1_1_3);
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(400, 40);
										delete_box.setLocation(400, 100);
										 
										
										
										JButton delete_button=new JButton("删除");
									
										delete_button.setSize(100, 40);
										delete_button.setBackground(Color.green);
										delete_button.setLocation(530, 250);
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from teacher");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_button.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from teacher");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password")).equals(s))
														{
															sta.execute("delete from teacher where name='"+set.getString("name")+"'");
															JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											delete_box.removeItem(delete_box.getSelectedItem());
											}
										});
										
										panel1_1_3.add(delete_box);
										panel1_1_3.add(delete_button);
										panel1_1_3.setLayout(null);	
										panel1_1.updateUI();
									}
								});
								
								
								//插入操作
								insert_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										panel1_1.remove(panel1_1_1);
										panel1_1.remove(panel1_1_3);
										panel1_1.remove(panel1_1_4);
										panel1_1.add(panel1_1_2);
										
										panel1_1.updateUI();
										
										JButton tj=new JButton("添加");
										tj.setLocation(530, 250);
										tj.setBackground(Color.green);
										tj.setSize(100, 40);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 0);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 50);
										name_text.setSize(200, 40);
										
										JTextField password_text=new JTextField();
										password_text.setLocation(500, 100);
										password_text.setSize(200, 40);
										
										JLabel number=new JLabel("教工号：");
										JLabel name=new JLabel("名字：");
										JLabel password=new JLabel("密码：");
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 0);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 50);
										
										password.setSize(200, 30);
										password.setFont(new Font("仿宋", Font.BOLD, 20));
										password.setLocation(250, 100);
										
										panel1_1_2.add(name);
										panel1_1_2.add(number);
										panel1_1_2.add(password);
										panel1_1_2.add(tj);
										
										panel1_1_2.add(number_text);
										panel1_1_2.add(name_text);
										panel1_1_2.add(password_text);
										panel1_1_2.setLayout(null);
										tj.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												try {
													if (number_text.getText().length()!=8)
													{
														JOptionPane.showMessageDialog(null,"教工号输入错误","失败",JOptionPane.ERROR_MESSAGE);
													}
													else {
													sta.execute("insert into teacher values('"+number_text.getText()+"',"
													+"'"+name_text.getText()+"','"+password_text.getText()+"')");
													JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
													}
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										
										
										
										panel1_1_2.updateUI();
										
									}
								});
								//查询操作
								search_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_1.remove(panel1_1_2);
										panel1_1.remove(panel1_1_3);
										panel1_1.remove(panel1_1_4);
										panel1_1.add(panel1_1_1);
										
										panel1_1.updateUI();
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 50);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 100);
										name_text.setSize(200, 40);
										
										JTextField password_text=new JTextField();
										password_text.setLocation(500, 150);
										password_text.setSize(200, 40);
										
										JLabel number=new JLabel("教工号：");
										JLabel name=new JLabel("名字：");
										JLabel password=new JLabel("密码：");
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										password.setSize(200, 30);
										password.setFont(new Font("仿宋", Font.BOLD, 20));
										password.setLocation(250, 150);
										
										
										JLabel search_label=new JLabel("教师姓名:");
										search_label.setLocation(250, 0);
										search_label.setFont(new Font("仿宋", Font.BOLD, 20));
										search_label.setSize(200, 30);
										
										JTextField search_text=new JTextField();
										search_text.setLocation(500, 0);
										search_text.setSize(200, 40);
										
										search_text.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String name=search_text.getText();
												ResultSet set=null;
												try {
													set=sta.executeQuery("select * from teacher where name='"+name+"'");
													while (set.next())
													{	
														number_text.setText(set.getString("id"));
														name_text.setText(set.getString("name"));
														password_text.setText(set.getString("password"));
													}
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										
										
										panel1_1_1.add(name);
										panel1_1_1.add(number);
										panel1_1_1.add(password);
										panel1_1_1.add(search_label);
										panel1_1_1.add(search_text);
										panel1_1_1.add(number_text);
										panel1_1_1.add(password_text);
										panel1_1_1.add(name_text);
										panel1_1_1.setLayout(null);
										
										
										
										panel1_1_1.updateUI();
										
										
									}
								});
								panel1_1.updateUI();
								
								
								
								
								panel1.updateUI();
							}
						});
						//课程信息管理
						p_b2.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								panel1.remove(panel1_1);
								panel1.remove(panel1_3);
								panel1.remove(panel1_4);
								panel1.remove(panel1_5);
								panel1.add(panel1_2);
								
								panel1_2.setLayout(null);
								JButton search_=new JButton("查询");
								JButton insert_=new JButton("添加");
								JButton delete_=new JButton("删除");
								JButton update_=new JButton("修改");
								
								JLabel labelbig=new JLabel("课程信息管理");
								
								labelbig.setLocation(500,0);
								labelbig.setSize(300, 100);
								Font f=new Font("宋体",Font.BOLD,25);
								labelbig.setFont(f);
								panel1_2.add(labelbig);
								
								search_.setLocation(100, 120);
								search_.setBackground(Color.green);
								search_.setSize(100, 40);
								
								insert_.setLocation(400, 120);
								insert_.setBackground(Color.green);
								insert_.setSize(100, 40);
								
								delete_.setLocation(700, 120);
								delete_.setBackground(Color.green);
								delete_.setSize(100, 40);
								
								update_.setLocation(1000, 120);
								update_.setBackground(Color.green);
								update_.setSize(100,40);
								
								panel1_2.add(delete_);
								panel1_2.add(insert_);
								panel1_2.add(update_);
								panel1_2.add(search_);
								
								JPanel panel1_1_1=new JPanel();
								JPanel panel1_1_2=new JPanel();
								JPanel panel1_1_3=new JPanel();
								JPanel panel1_1_4=new JPanel();
								
								panel1_1_1.setSize(1200, 400);
								panel1_1_2.setSize(1200, 400);
								panel1_1_3.setSize(1200, 400);
								panel1_1_4.setSize(1200, 400);
								
								panel1_1_1.setBackground(Color.orange);
								panel1_1_2.setBackground(Color.orange);
								panel1_1_3.setBackground(Color.orange);
								panel1_1_4.setBackground(Color.orange);
								
								panel1_1_1.setLocation(0, 200);
								panel1_1_2.setLocation(0, 200);
								panel1_1_3.setLocation(0, 200);
								panel1_1_4.setLocation(0, 200);
								
								panel1_2.updateUI();
								//查询操作
								search_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_2.remove(panel1_1_4);
										panel1_2.remove(panel1_1_3);
										panel1_2.remove(panel1_1_2);
										panel1_2.add(panel1_1_1);
										
										
										JLabel search_label=new JLabel("课程名:");
										search_label.setLocation(250, 0);
										search_label.setFont(new Font("仿宋", Font.BOLD, 20));
										search_label.setSize(200, 30);
										JTextField search_text=new JTextField();
										search_text.setLocation(500, 0);
										search_text.setSize(200, 40);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 50);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 100);
										name_text.setSize(200, 40);
										
										JLabel number=new JLabel("课程号：");
										JLabel name=new JLabel("课程名：");
										
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										search_text.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String name_=search_text.getText();
												ResultSet set=null;
												try {
													set=sta.executeQuery("select * from course where name='"+name_+"'");
													while (set.next())
													{	
														number_text.setText(set.getString("id"));
														name_text.setText(set.getString("name"));
														
													}
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										
										
										panel1_1_1.add(name);
										panel1_1_1.add(number);
										panel1_1_1.add(search_label);
										panel1_1_1.add(search_text);
										panel1_1_1.add(number_text);
										panel1_1_1.add(name_text);
										panel1_1_1.setLayout(null);
										
										
										
										panel1_1_1.updateUI();
										
										
										
										
									}
								});
								//删除操作
								delete_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_2.remove(panel1_1_4);
										panel1_2.remove(panel1_1_3);
										panel1_2.remove(panel1_1_1);
										panel1_2.add(panel1_1_2);
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(400, 40);
										delete_box.setLocation(400, 100);
										
										JButton delete_button=new JButton("删除");
										delete_button.setSize(100, 40);
										delete_button.setBackground(Color.green);
										delete_button.setLocation(530, 250);
										
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from course");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("id")+"  "+ set.getString("name"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_button.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from course");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
														{
															sta.execute("delete from course where name='"+set.getString("name")+"'");
															JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											delete_box.removeItem(delete_box.getSelectedItem());
											}
										});
										
										
										panel1_1_2.add(delete_box);
										panel1_1_2.add(delete_button);
										panel1_1_2.setLayout(null);	
										panel1_2.updateUI();
										
										
										
										
									}
								});
								//插入操作
								insert_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_2.remove(panel1_1_4);
										panel1_2.remove(panel1_1_1);
										panel1_2.remove(panel1_1_2);
										panel1_2.add(panel1_1_3);
										panel1_2.updateUI();
										JButton tj=new JButton("添加");
										tj.setLocation(530, 250);
										tj.setBackground(Color.green);
										tj.setSize(100, 40);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 0);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 50);
										name_text.setSize(200, 40);
										
										
										
										JLabel number=new JLabel("课程号：");
										JLabel name=new JLabel("课程名称：");
										
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 0);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 50);
										
										tj.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												try {
													
													sta.execute("insert into course values('"+name_text.getText()+"',"
													+"'"+number_text.getText()+"')");
													JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										
										
										panel1_1_3.add(name);
										panel1_1_3.add(number);
										
										panel1_1_3.add(tj);
										
										panel1_1_3.add(number_text);
										panel1_1_3.add(name_text);
										
										panel1_1_3.setLayout(null);
										
										
										
										panel1_1_3.updateUI();
										
										
									}
								});
								//修改操作
								update_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_2.remove(panel1_1_1);
										panel1_2.remove(panel1_1_3);
										panel1_2.remove(panel1_1_2);
										panel1_2.add(panel1_1_4);
										panel1_2.updateUI();
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(200, 40);
										delete_box.setLocation(500, 0);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 50);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 100);
										name_text.setSize(200, 40);
										
										
										
										JLabel number=new JLabel("课程号：");
										JLabel name=new JLabel("课程名：");
										
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										
										
										JButton up_b=new JButton("修改"); 
										up_b.setSize(100, 40);
										up_b.setBackground(Color.green);
										up_b.setLocation(530, 250);
										
										JLabel pre=new JLabel("修改课程:");
										pre.setLocation(250, 0);
										pre.setFont(new Font("仿宋", Font.BOLD, 20));
										pre.setSize(200, 30);
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from course");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("id")+"  "+ set.getString("name"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_box.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												
												try {
													ResultSet set=sta.executeQuery("select * from course");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
														{
															
															name_text.setText(set.getString("name"));
					
															number_text.setText(set.getString("id"));
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										up_b.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from course");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
														{
															sta.execute("delete from course where name='"+set.getString("name")+"'");
															sta.execute("insert into course values('"+name_text.getText()+"',"
																	+"'"+number_text.getText()+"')");
															JOptionPane.showMessageDialog(null,"修改成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										panel1_1_4.add(pre);
										panel1_1_4.add(name);
										
										panel1_1_4.add(number);
										panel1_1_4.add(number_text);
										panel1_1_4.add(name_text);
										
										panel1_1_4.add(delete_box);
										panel1_1_4.add(up_b);
										panel1_1_4.setLayout(null);
										
										panel1_1_4.updateUI();
										
									}
								});
								
								
								
								
								panel1.updateUI();
							}
						});
						//班级信息管理
						p_b3.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								panel1.remove(panel1_2);
								panel1.remove(panel1_1);
								panel1.remove(panel1_4);
								panel1.remove(panel1_5);
								panel1.add(panel1_3);
								
								panel1_3.updateUI();
								panel1_3.repaint();
								
								
								panel1_3.setLayout(null);
								JButton search_=new JButton("查询");
								JButton insert_=new JButton("添加");
								JButton delete_=new JButton("删除");
								JButton update_=new JButton("修改");
								
								JLabel labelbig=new JLabel("班级信息管理");
								
								labelbig.setLocation(500,0);
								labelbig.setSize(300, 100);
								Font f=new Font("宋体",Font.BOLD,25);
								labelbig.setFont(f);
								panel1_3.add(labelbig);
								
								search_.setLocation(100, 120);
								search_.setBackground(Color.green);
								search_.setSize(100, 40);
								
								insert_.setLocation(400, 120);
								insert_.setBackground(Color.green);
								insert_.setSize(100, 40);
								
								delete_.setLocation(700, 120);
								delete_.setBackground(Color.green);
								delete_.setSize(100, 40);
								
								update_.setLocation(1000, 120);
								update_.setBackground(Color.green);
								update_.setSize(100,40);
								
								
								panel1_3.add(delete_);
								panel1_3.add(insert_);
								panel1_3.add(update_);
								panel1_3.add(search_);
								
								JPanel panel1_1_1=new JPanel();
								JPanel panel1_1_2=new JPanel();
								JPanel panel1_1_3=new JPanel();
								JPanel panel1_1_4=new JPanel();
								
								panel1_1_1.setSize(1200, 400);
								panel1_1_2.setSize(1200, 400);
								panel1_1_3.setSize(1200, 400);
								panel1_1_4.setSize(1200, 400);
								
								panel1_1_1.setBackground(Color.orange);
								panel1_1_2.setBackground(Color.orange);
								panel1_1_3.setBackground(Color.orange);
								panel1_1_4.setBackground(Color.orange);
								
								panel1_1_1.setLocation(0, 200);
								panel1_1_2.setLocation(0, 200);
								panel1_1_3.setLocation(0, 200);
								panel1_1_4.setLocation(0, 200);
								//修改操作
								update_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_3.remove(panel1_1_1);
										panel1_3.remove(panel1_1_2);
										panel1_3.remove(panel1_1_3);
										panel1_3.add(panel1_1_4);
										
										panel1_3.repaint();
										panel1_1_4.updateUI();
										panel1_1_4.validate();
										panel1_1_4.repaint();
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(200, 40);
										delete_box.setLocation(500, 0);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 50);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 100);
										name_text.setSize(200, 40);
										
										
										
										JLabel number=new JLabel("人数：");
										JLabel name=new JLabel("班级名称：");
										
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										
										
										JButton up_b=new JButton("修改"); 
										up_b.setSize(100, 40);
										up_b.setBackground(Color.green);
										up_b.setLocation(530, 250);
										
										JLabel pre=new JLabel("修改班级:");
										pre.setLocation(250, 0);
										pre.setFont(new Font("仿宋", Font.BOLD, 20));
										pre.setSize(200, 30);
										
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from class");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("id")+"  "+ set.getString("name"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_box.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from class");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
														{
															
															name_text.setText(set.getString("name"));
					
															number_text.setText(set.getString("id"));
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										up_b.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from class");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
														{
															sta.execute("delete from class where name='"+set.getString("name")+"'");
															sta.execute("insert into class values('"+number_text.getText()+"',"
																	+"'"+name_text.getText()+"')");
															JOptionPane.showMessageDialog(null,"修改成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										panel1_1_4.add(pre);
										panel1_1_4.add(name);
										panel1_1_4.add(number);
										panel1_1_4.add(number_text);
										panel1_1_4.add(name_text);
										
										panel1_1_4.add(delete_box);
										panel1_1_4.add(up_b);
										panel1_1_4.setLayout(null);
										
										panel1_1_4.updateUI();
										
									}
								});
								//删除操作
								delete_.addActionListener(new ActionListener() {
									
									
									
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_3.remove(panel1_1_1);
										panel1_3.remove(panel1_1_2);
										panel1_3.remove(panel1_1_4);
										panel1_3.add(panel1_1_3);
										panel1_3.repaint();
										
										panel1_1_3.updateUI();
										panel1_1_3.validate();
										panel1_1_3.repaint();
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(400, 40);
										delete_box.setLocation(400, 100);
										
										
										
										JButton delete_button=new JButton("删除");
										delete_button.setSize(100, 40);
										delete_button.setBackground(Color.green);
										delete_button.setLocation(530, 250);
										
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from class");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("id")+"  "+ set.getString("name"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										delete_box.updateUI();
										delete_box.validate();
										delete_box.repaint();
										
										
										delete_button.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from class");
													while (set.next())
													{
														if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
														{
															sta.execute("delete from class where name='"+set.getString("name")+"'");
															JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											delete_box.removeItem(delete_box.getSelectedItem());
											}
										});
										
										panel1_1_3.add(delete_box);
										panel1_1_3.add(delete_button);
										panel1_1_3.setLayout(null);	
										panel1_3.updateUI();
									}
								});
								
								
								//添加操作
								insert_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										panel1_3.remove(panel1_1_1);
										panel1_3.remove(panel1_1_3);
										panel1_3.remove(panel1_1_4);
										panel1_3.add(panel1_1_2);
										
										
										panel1_3.updateUI();
									
										panel1_3.repaint();
										panel1_1_2.updateUI();
										panel1_1_2.validate();
										panel1_1_2.repaint();
										
										JButton tj=new JButton("添加");
										tj.setLocation(530, 250);
										tj.setBackground(Color.green);
										tj.setSize(100, 40);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 0);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 50);
										name_text.setSize(200, 40);
										
										
										
										JLabel number=new JLabel("班级人数：");
										JLabel name=new JLabel("班级名称：");
										
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 0);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 50);
										
										tj.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												try {
													sta.execute("insert into class values('"+number_text.getText()+"',"
													+"'"+name_text.getText()+"');");
													JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										
										panel1_1_2.add(name);
										panel1_1_2.add(number);
										
										panel1_1_2.add(tj);
										
										panel1_1_2.add(number_text);
										panel1_1_2.add(name_text);
										
										panel1_1_2.setLayout(null);
										
										
										
										panel1_1_2.updateUI();
										
									}
								});
								//查询操作
								search_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_3.remove(panel1_1_2);
										panel1_3.remove(panel1_1_3);
										panel1_3.remove(panel1_1_4);
										panel1_3.add(panel1_1_1);
										
										panel1_3.updateUI();
										panel1_3.repaint();
										panel1_1_1.updateUI();
										panel1_1_1.validate();
										panel1_1_1.repaint();
										
										
										
										JLabel search_label=new JLabel("班级名称:");
										search_label.setLocation(250, 0);
										search_label.setFont(new Font("仿宋", Font.BOLD, 20));
										search_label.setSize(200, 30);
										JTextField search_text=new JTextField();
										search_text.setLocation(500, 0);
										search_text.setSize(200, 40);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(500, 50);
										number_text.setSize(200, 40);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(500, 100);
										name_text.setSize(200, 40);
										
										JLabel number=new JLabel("班级人数：");
										JLabel name=new JLabel("班级名称：");
										
										
										number.setSize(200, 30);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 30);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										
										
										panel1_1_1.add(name);
										panel1_1_1.add(number);
										
										panel1_1_1.add(search_label);
										panel1_1_1.add(search_text);
										panel1_1_1.add(number_text);
										panel1_1_1.add(name_text);
										panel1_1_1.setLayout(null);
										
										search_text.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String name_=search_text.getText();
												ResultSet set=null;
												try {
													set=sta.executeQuery("select * from class where name='"+name_+"'");
													while (set.next())
													{	
														number_text.setText(set.getString("id"));
														name_text.setText(set.getString("name"));
														
													}
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										
										
										panel1_1_1.updateUI();
										
										
									}
								});
								
								panel1_3.updateUI();
								panel1.updateUI();
							}
						});
						//预约实验管理
						p_b4.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								panel1.remove(panel1_2);
								panel1.remove(panel1_3);
								panel1.remove(panel1_1);
								panel1.remove(panel1_5);
								panel1.add(panel1_4);
								
								panel1_4.setLayout(null);
								JButton search_=new JButton("查询");
								JButton insert_=new JButton("添加");
								JButton delete_=new JButton("删除");
								JButton update_=new JButton("修改");
								
								JLabel labelbig=new JLabel("实验信息管理");
								
								labelbig.setLocation(500,0);
								labelbig.setSize(300, 100);
								Font f=new Font("宋体",Font.BOLD,25);
								labelbig.setFont(f);
								panel1_4.add(labelbig);
								
								search_.setLocation(100, 120);
								search_.setBackground(Color.green);
								search_.setSize(100, 40);
								
								insert_.setLocation(400, 120);
								insert_.setBackground(Color.green);
								insert_.setSize(100, 40);
								
								delete_.setLocation(700, 120);
								delete_.setBackground(Color.green);
								delete_.setSize(100, 40);
								
								update_.setLocation(1000, 120);
								update_.setBackground(Color.green);
								update_.setSize(100,40);
								
								panel1_4.add(delete_);
								panel1_4.add(insert_);
								panel1_4.add(update_);
								panel1_4.add(search_);
								
								JPanel panel1_1_1=new JPanel();
								JPanel panel1_1_2=new JPanel();
								JPanel panel1_1_3=new JPanel();
								JPanel panel1_1_4=new JPanel();
								
								panel1_1_1.setSize(1200, 400);
								panel1_1_2.setSize(1200, 400);
								panel1_1_3.setSize(1200, 400);
								panel1_1_4.setSize(1200, 400);
								
								panel1_1_1.setBackground(Color.orange);
								panel1_1_2.setBackground(Color.orange);
								panel1_1_3.setBackground(Color.orange);
								panel1_1_4.setBackground(Color.orange);
								
								panel1_1_1.setLocation(0, 200);
								panel1_1_2.setLocation(0, 200);
								panel1_1_3.setLocation(0, 200);
								panel1_1_4.setLocation(0, 200);
								
								panel1_1_1.updateUI();
								panel1_1_2.updateUI();
								panel1_1_3.updateUI();
								panel1_1_4.updateUI();
								
								
								//修改操作
								update_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_4.remove(panel1_1_1);
										panel1_4.remove(panel1_1_2);
										panel1_4.remove(panel1_1_3);
										panel1_4.add(panel1_1_4);
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(400, 20);
										delete_box.setLocation(425, 0);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(475, 50);
										number_text.setSize(200, 20);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(475, 100);
										name_text.setSize(200, 20);
										
										JTextField pra_text=new JTextField();
										pra_text.setLocation(475, 150);
										pra_text.setSize(200, 20);
										
										JTextField teacher_text=new JTextField();
										teacher_text.setLocation(475, 200);
										teacher_text.setSize(200, 20);
										
										JComboBox<String> time_text=new JComboBox<>();
										time_text.setLocation(475, 250);
										time_text.setSize(200, 20);
										
										JTextField course_text=new JTextField();
										course_text.setLocation(475, 300);
										course_text.setSize(200, 20);
										
										JLabel number=new JLabel("人数：");
										JLabel name=new JLabel("班级名称：");
										JLabel teacher=new JLabel("教师姓名：");
										JLabel course=new JLabel("课程名称：");
										JLabel pra=new JLabel("实验名称");
										JLabel time=new JLabel("时间：");
										
										course.setSize(200, 20);
										course.setFont(new Font("仿宋", Font.BOLD, 20));
										course.setLocation(250,300);
										
										number.setSize(200, 20);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 20);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										pra.setSize(200, 20);
										pra.setFont(new Font("仿宋", Font.BOLD, 20));
										pra.setLocation(250, 150);
										
										time.setSize(200, 20);
										time.setFont(new Font("仿宋", Font.BOLD, 20));
										time.setLocation(250, 250);
										
										teacher.setSize(200, 20);
										teacher.setFont(new Font("仿宋", Font.BOLD, 20));
										teacher.setLocation(250, 200);
										
										
										
										
										JButton up_b=new JButton("修改"); 
										up_b.setSize(100, 40);
										up_b.setBackground(Color.green);
										up_b.setLocation(900, 200);
										
										JLabel pre=new JLabel("修改实验:");
										pre.setLocation(250, 0);
										pre.setFont(new Font("仿宋", Font.BOLD, 20));
										pre.setSize(200, 20);
										
										panel1_1_4.add(course_text);
										panel1_1_4.add(course);
										
										time_text.addItem("周一 08:20-10:00");
										time_text.addItem("周一 10:20-12:00");
										time_text.addItem("周一 14:00-15:40");
										time_text.addItem("周一 16:00-17:40");
										
										time_text.addItem("周二 08:20-10:00");
										time_text.addItem("周二 10:20-12:00");
										time_text.addItem("周二 14:00-15:40");
										time_text.addItem("周二 16:00-17:40");
										
										time_text.addItem("周三 08:20-10:00");
										time_text.addItem("周三 10:20-12:00");
										time_text.addItem("周三 14:00-15:40");
										time_text.addItem("周三 16:00-17:40");
										
										time_text.addItem("周四 08:20-10:00");
										time_text.addItem("周四 10:20-12:00");
										time_text.addItem("周四 14:00-15:40");
										time_text.addItem("周四 16:00-17:40");
										
										time_text.addItem("周五 08:20-10:00");
										time_text.addItem("周五 10:20-12:00");
										time_text.addItem("周五 14:00-15:40");
										time_text.addItem("周五 16:00-17:40");
										
										for (String string :ts ) {
											time_text.addItem(string);
										}
										
										
										
										
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from lab");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
												+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_box.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from lab");
													while (set.next())
													{
														if ((set.getString("course_name")+"  "+ set.getString("lab_name")
														+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
														{
															course_text.setText(set.getString("course_name"));
															name_text.setText(set.getString("class_name"));
															teacher_text.setText(set.getString("teacher_name"));
															pra_text.setText(set.getString("lab_name"));
															time_text.setSelectedItem(set.getString("lab_time"));
															
															number_text.setText(set.getString("number"));
															
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												
											}
										});
										
										up_b.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from lab");
													while (set.next())
													{
														if ((set.getString("course_name")+"  "+ set.getString("lab_name")
														+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
														{
															sta.execute("delete from lab where teacher_name='"+set.getString("teacher_name")+"' and lab_name='"+
														set.getString("lab_name")+"';");
															sta.execute("insert into lab values('"+course_text.getText()+"',"
																	+"'"+pra_text.getText()+"','"+teacher_text.getText()+"','"
																			+name_text.getText()+"','"+number_text.getText()+"','"
																	+(String)time_text.getSelectedItem()+"')");
															JOptionPane.showMessageDialog(null,"修改成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										panel1_1_4.add(pre);
										panel1_1_4.add(name);
										panel1_1_4.add(pra);
										panel1_1_4.add(time);
										panel1_1_4.add(teacher);
										panel1_1_4.add(course);
										panel1_1_4.add(number);
										panel1_1_4.add(number_text);
										panel1_1_4.add(name_text);
										panel1_1_4.add(pra_text);
										panel1_1_4.add(time_text);
										panel1_1_4.add(teacher_text);
										panel1_1_4.add(delete_box);
										panel1_1_4.add(up_b);
										panel1_1_4.setLayout(null);
										
										
										panel1_1_4.updateUI();
										panel1_1_4.validate();
										
									}
								});
								//删除操作
								delete_.addActionListener(new ActionListener() {
									
									
									
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_4.remove(panel1_1_1);
										panel1_4.remove(panel1_1_2);
										panel1_4.remove(panel1_1_4);
										panel1_4.add(panel1_1_3);
										
										JComboBox<String>delete_box=new JComboBox<>();
										delete_box.setSize(400, 40);
										delete_box.setLocation(400, 100);
										
										JButton delete_button=new JButton("删除");
										delete_button.setSize(100, 40);
										delete_button.setBackground(Color.green);
										
										ResultSet set=null;
										try {
											set=sta.executeQuery("select * from lab");
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										try {
											while (set.next())
											{	
												
												delete_box.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
												+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
											}
										} catch (SQLException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										delete_button.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												
												String s=(String)delete_box.getSelectedItem();
												try {
													ResultSet set=sta.executeQuery("select * from lab");
													while (set.next())
													{
														if ((set.getString("course_name")+"  "+ set.getString("lab_name")
														+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
														{
															sta.execute("delete from lab where teacher_name='"+set.getString("teacher_name")+"' and lab_name='"+
																	set.getString("lab_name")+"'");
															JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
															break;
														}
													}
													
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											delete_box.removeItem(delete_box.getSelectedItem());
											}
										});
										
										
										
										delete_button.setLocation(530, 250);
										panel1_1_3.add(delete_box);
										panel1_1_3.add(delete_button);
										panel1_1_3.setLayout(null);	
										panel1_1_3.updateUI();
										panel1_1_3.validate();
										panel1_4.updateUI();
									}
								});
								
								
								//添加操作
								insert_.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										panel1_4.remove(panel1_1_1);
										panel1_4.remove(panel1_1_3);
										panel1_4.remove(panel1_1_4);
										panel1_4.add(panel1_1_2);
										
										panel1_4.updateUI();
										
										JButton tj=new JButton("添加");
										tj.setLocation(800, 200);
										tj.setBackground(Color.green);
										tj.setSize(100, 40);
										
										JTextField number_text=new JTextField();
										number_text.setLocation(475, 0);
										number_text.setSize(200, 20);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(475, 50);
										name_text.setSize(200, 20);
										
										JTextField course_text=new JTextField();
										course_text.setLocation(475, 150);
										course_text.setSize(200, 20);
										
										JTextField pra_text=new JTextField();
										pra_text.setLocation(475, 200);
										pra_text.setSize(200, 20);
										
										JTextField teacher_text=new JTextField();
										teacher_text.setLocation(475, 100);
										teacher_text.setSize(200, 20);
										
										JComboBox<String> time_text=new JComboBox<>();
										time_text.setLocation(475, 250);
										time_text.setSize(200, 20);
										
										JLabel number=new JLabel("人数：");
										JLabel name=new JLabel("班级名称：");
										JLabel teacher=new JLabel("教师姓名：");
										JLabel course=new JLabel("课程名称：");
										JLabel pra=new JLabel("实验名称：");
										JLabel time=new JLabel("时间：");
										
										course.setSize(200, 20);
										course.setFont(new Font("仿宋", Font.BOLD, 20));
										course.setLocation(250, 150);
										
										pra.setSize(200,20);
										pra.setFont(new Font("仿宋", Font.BOLD, 20));
										pra.setLocation(250, 200);
										
										time.setSize(200, 20);
										time.setFont(new Font("仿宋", Font.BOLD, 20));
										time.setLocation(250, 250);
										
										number.setSize(200, 20);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 0);
										
										name.setSize(200, 20);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 50);
										
										teacher.setSize(200, 20);
										teacher.setFont(new Font("仿宋", Font.BOLD, 20));
										teacher.setLocation(250, 100);
										
										time_text.addItem("周一 08:20-10:00");
										time_text.addItem("周一 10:20-12:00");
										time_text.addItem("周一 14:00-15:40");
										time_text.addItem("周一 16:00-17:40");
										
										time_text.addItem("周二 08:20-10:00");
										time_text.addItem("周二 10:20-12:00");
										time_text.addItem("周二 14:00-15:40");
										time_text.addItem("周二 16:00-17:40");
										
										time_text.addItem("周三 08:20-10:00");
										time_text.addItem("周三 10:20-12:00");
										time_text.addItem("周三 14:00-15:40");
										time_text.addItem("周三 16:00-17:40");
										
										time_text.addItem("周四 08:20-10:00");
										time_text.addItem("周四 10:20-12:00");
										time_text.addItem("周四 14:00-15:40");
										time_text.addItem("周四 16:00-17:40");
										
										time_text.addItem("周五 08:20-10:00");
										time_text.addItem("周五 10:20-12:00");
										time_text.addItem("周五 14:00-15:40");
										time_text.addItem("周五 16:00-17:40");
										
										for (String string :ts ) {
											time_text.addItem(string);
										}
										
										
										
										tj.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												try {
													sta.execute("insert into lab values("+"'"+course_text.getText()+"',"+"'"+pra_text.getText()+"',"
														+"'"+teacher_text.getText()+"',"+"'"+name_text.getText()+"',"+"'"+number_text.getText()+"',"+"'"
															+(String)time_text.getSelectedItem()+"')"	
															);
													JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
											}
										});
										
										
										panel1_1_2.add(name);
										panel1_1_2.add(number);
										panel1_1_2.add(teacher);
										panel1_1_2.add(tj);
										panel1_1_2.add(time);
										panel1_1_2.add(pra);
										panel1_1_2.add(course);
										
										panel1_1_2.add(course_text);
										panel1_1_2.add(pra_text);
										panel1_1_2.add(time_text);
										panel1_1_2.add(teacher_text);
										panel1_1_2.add(number_text);
										panel1_1_2.add(name_text);
										
										panel1_1_2.setLayout(null);
										panel1_4.updateUI();
										panel1_1_2.updateUI();
										panel1_1_2.invalidate();
										
										
										
									}
								});
								//查询操作
								search_.addActionListener(new ActionListener() {
									ArrayList<String> a1=new ArrayList<>();
									ArrayList<String> a2=new ArrayList<>();
									ArrayList<String> a3=new ArrayList<>();
									ArrayList<String> a4=new ArrayList<>();
									ArrayList<String> a5=new ArrayList<>();
									ArrayList<String> a6=new ArrayList<>();
									
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										panel1_4.remove(panel1_1_2);
										panel1_4.remove(panel1_1_3);
										panel1_4.remove(panel1_1_4);
										panel1_4.add(panel1_1_1);
										
										panel1_4.updateUI();
										
										panel1_1_1.setLayout(null);
										
										
										JTextField number_text=new JTextField();
										number_text.setLocation(475, 50);
										number_text.setSize(200, 20);
										
										JTextField name_text=new JTextField();
										name_text.setLocation(475, 100);
										name_text.setSize(200, 20);
										
										JTextField pra_text=new JTextField();
										pra_text.setLocation(475, 150);
										pra_text.setSize(200, 20);
										
										JTextField teacher_text=new JTextField();
										teacher_text.setLocation(475, 200);
										teacher_text.setSize(200, 20);
										
										JTextField time_text=new JTextField();
										time_text.setLocation(475, 250);
										time_text.setSize(200, 20);
										
										JTextField course_text=new JTextField();
										course_text.setLocation(475, 300);
										course_text.setSize(200, 20);
										
										JLabel number=new JLabel("人数：");
										JLabel name=new JLabel("班级名称：");
										JLabel teacher=new JLabel("教师姓名：");
										JLabel course=new JLabel("课程名称：");
										JLabel pra=new JLabel("实验名称");
										JLabel time=new JLabel("时间：");
										
										course.setSize(200, 20);
										course.setFont(new Font("仿宋", Font.BOLD, 20));
										course.setLocation(250,300);
										
										number.setSize(200, 20);
										number.setFont(new Font("仿宋", Font.BOLD, 20));
										number.setLocation(250, 50);
										
										name.setSize(200, 20);
										name.setFont(new Font("仿宋", Font.BOLD, 20));
										name.setLocation(250, 100);
										
										pra.setSize(200, 20);
										pra.setFont(new Font("仿宋", Font.BOLD, 20));
										pra.setLocation(250, 150);
										
										time.setSize(200, 20);
										time.setFont(new Font("仿宋", Font.BOLD, 20));
										time.setLocation(250, 250);
										
										teacher.setSize(200, 20);
										teacher.setFont(new Font("仿宋", Font.BOLD, 20));
										teacher.setLocation(250, 200);
										
										
										
										JButton up_b=new JButton("下一个结果"); 
										up_b.setSize(100, 40);
										up_b.setBackground(Color.green);
										up_b.setLocation(800, 200);
										
										JLabel pre=new JLabel("教师姓名或实验名称：");
										pre.setLocation(250, 0);
										pre.setFont(new Font("仿宋", Font.BOLD, 20));
										pre.setSize(225, 20);
										
										JTextField search_text=new JTextField();
										search_text.setSize(250, 20);
										search_text.setLocation(475, 0);
										
										search_text.addActionListener(new ActionListener() {
											
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												String name=search_text.getText();
												ResultSet set=null;
												try {
													set=sta.executeQuery("select * from lab where teacher_name='"+name+"'");
													while (set.next())
													{	
														a1.add(set.getString("course_name"));
														a2.add(set.getString("lab_name"));
														a3.add(set.getString("teacher_name"));
														a4.add(set.getString("class_name"));
														a5.add(set.getString("number"));
														a6.add(set.getString("lab_time"));
														
													}
												} catch (SQLException e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}
												if (a1.size()>0)
												{
													course_text.setText(a1.get(0));
													pra_text.setText(a2.get(0));
													teacher_text.setText(a3.get(0));
													name_text.setText(a4.get(0));
													number_text.setText(a5.get(0));
													time_text.setText(a6.get(0));
													
													
												}
											}
													
										});
										
										up_b.addActionListener(new ActionListener() {
											int count=0;
											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												if (course_text.getText().equals(""))
													;
												else {
												if (count>=a1.size())
													count=0;
												else
													count++;
												course_text.setText(a1.get(count));
												pra_text.setText(a2.get(count));
												teacher_text.setText(a3.get(count));
												name_text.setText(a4.get(count));
												number_text.setText(a5.get(count));
												time_text.setText(a6.get(count));
												
												
												}
											}
										});
										
										
										panel1_1_1.add(course_text);
										panel1_1_1.add(course);
										
										panel1_1_1.add(pre);
										panel1_1_1.add(search_text);
										panel1_1_1.add(name);
										panel1_1_1.add(pra);
										panel1_1_1.add(time);
										panel1_1_1.add(teacher);
										panel1_1_1.add(course);
										panel1_1_1.add(number);
										panel1_1_1.add(number_text);
										panel1_1_1.add(name_text);
										panel1_1_1.add(pra_text);
										panel1_1_1.add(time_text);
										panel1_1_1.add(teacher_text);
										
										panel1_1_1.add(up_b);
										
										
										
										panel1_1_1.updateUI();
										panel1_1_1.validate();
										
										
									}
								});
								
								panel1_4.updateUI();
								
								panel1.updateUI();
							}
						});
						//实验时间管理
						p_b5.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								panel1.remove(panel1_2);
								panel1.remove(panel1_3);
								panel1.remove(panel1_4);
								panel1.remove(panel1_1);
								panel1.add(panel1_5);
								
								JLabel ava_time=new JLabel("可用时间:");
								ava_time.setLocation(200, 20);
								ava_time.setFont(new Font("仿宋", Font.BOLD, 20));
								ava_time.setSize(100, 20);
								
								JLabel ava_time_des=new JLabel("周一到周五：8：20-10：00\n 10：20-12：00 14：00-15：40 16：00-17：40");
								ava_time_des.setSize(500, 50);
								ava_time_des.setFont(new Font("仿宋", Font.BOLD, 10));
								ava_time_des.setLocation(320, 20);
								
								JLabel add_time=new JLabel();
								add_time.setSize(500, 200);
								add_time.setFont(new Font("仿宋", Font.BOLD, 10));
								add_time.setLocation(320, 80);
								
								JComboBox<String> time_box=new JComboBox<String>();
								time_box.setSize(200, 30);
								time_box.setLocation(200, 450);
								
								time_box.addItem("周六 08：20-10：00");
								time_box.addItem("周六 10：20-12：00");
								time_box.addItem("周六 14：00-15：40");
								time_box.addItem("周六 16：00-17：40");
								
								time_box.addItem("周日 08：20-10：00");
								time_box.addItem("周日 10：20-12：00");
								time_box.addItem("周日 14：00-15：40");
								time_box.addItem("周日 16：00-17：40");
								
								
								
								
								JButton addb=new JButton("添加");
								addb.setSize(100, 40);
								addb.setBackground(Color.green);
								addb.setLocation(500,450);
								
								JButton delb=new JButton("删除");
								delb.setSize(100,40);
								delb.setBackground(Color.green);
								delb.setLocation(700, 450);
								
								addb.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										String s=(String) time_box.getSelectedItem();
										ts.add(s);
										
										String ava="";
										for (String string : ts) {
											ava+="  "+string;
										}
										add_time.setText(ava);
										panel1_5.updateUI();
				
									}
								});
								delb.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										
										ts.remove((String)time_box.getSelectedItem());
										
										String ava="";
										for (String string : ts) {
											ava+="  "+string;
										}
										add_time.setText(ava);
										panel1_5.updateUI();
									}
								});
								
								panel1_5.add(add_time);
								panel1_5.add(delb);
								panel1_5.add(addb);
								panel1_5.add(time_box);
								panel1_5.add(ava_time_des);
								panel1_5.add(ava_time);
								panel1_5.updateUI();
								panel1_5.setLayout(null);
								panel1.updateUI();
							}
						});
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						frame1.add(panel1);
						
						
						
						
						}
					
					else
					{
						JOptionPane.showMessageDialog(null, "密码错误", "失败", JOptionPane.ERROR_MESSAGE);  
					}
				}
			});
			
			panel.add(l1);
			panel.add(jps);
			
			
			panel.updateUI();
			
		}
	});
	
	JButton b2=new JButton ("教师登录");
	b2.setLocation(450, 0);
	b2.setBackground(Color.green);
	b2.setSize(120, 80);
	
	
	
	l2.setLocation(250, 150);
	l2.setSize(200, 50);
	ja1.setLocation(400, 150);
	ja1.setSize(200, 50);
	
	l3.setLocation(250, 250);
	l3.setSize(200, 50);
	jps1.setLocation(400, 250);
	jps1.setSize(200, 50);
	//教师登陆
	b2.addActionListener(new ActionListener() { 
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.remove(l1);
			panel.remove(jps);
			panel.remove(l6);
			panel.remove(ja2);
			panel.remove(ja3);
			panel.remove(jps2);
			panel.remove(zc);
			panel.remove(l4);
			panel.remove(l5);
			panel.add(jps1);
			panel.add(ja1);
			
			panel.add(l2);
			panel.add(l3);
			panel.updateUI();
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
				TUI t=new TUI(set.getString("name"),sta,ts);
				t.run();
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
	
	
	JButton b3=new JButton("教师注册");
	b3.setLocation(860, 0);
	b3.setBackground(Color.green);
	b3.setSize(140,80);
	
	
	
	l4.setLocation(150, 100);
	l4.setSize(200, 50);
	ja2.setLocation(400, 100);
	ja2.setSize(200,50);
	
	l5.setLocation(150, 200);
	l5.setSize(200, 50);
	jps2.setLocation(400,200);
	jps2.setSize(200, 50);
	
	l6.setLocation(150,300);
	l6.setSize(200, 50);
	ja3.setLocation(400, 300);
	ja3.setSize(200, 50);
	zc.setSize(100, 40);
	zc.setBackground(Color.green);
	zc.setLocation(450, 380);
	
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
	
	
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			panel.remove(l1);
			panel.remove(jps);
			panel.remove(l2);
			panel.remove(l3);
			panel.remove(jps1);
			panel.remove(ja1);
			
			panel.add(l4);
			panel.add(zc);
			panel.add(l5);
			panel.add(l6);
			panel.add(ja3);
			panel.add(ja2);
			panel.add(jps2);
			panel.updateUI();
			
		}
	});
	
	jmb.add(b1);
	jmb.add(b2);
	jmb.add(b3);
	
	panel.add(jmb);
	panel.updateUI();
	frame.setVisible(true);
	
	}

}


class TUI{
	//教师功能类
	
	String name=null;
	Statement sta=null;
	Set<String> ts=null;
	public TUI()
	{
		
	}
	
	public TUI(String name,Statement sta,Set<String> ts)
	{
		this.name=name;
		this.sta=sta;
		this.ts=ts;
	}
	
	public void run()
	{	String name_=this.name;
		
		JFrame frame=new JFrame();
		frame.setSize(1200, 700);
		frame.setLocation(100, 0);
		JPanel panel=new JPanel();
		
		JMenuBar jmb=new JMenuBar();
		jmb.setLayout(null);
		jmb.setLocation(0, 0);
		jmb.setBackground(Color.lightGray);
		jmb.setSize(1200,80 );
		
		panel.setSize(1200, 700);
		panel.setBackground(Color.orange);
		panel.setLocation(0, 0);
		
		panel.setLayout(null);
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		JPanel panel3=new JPanel();
		JPanel panel4=new JPanel();
		
	
		JButton search=new JButton("查询");
		JButton appoint=new JButton("预约实验");
		JButton cancel=new JButton("取消实验");
		JButton move=new JButton("修改实验内容");
		
		search.setSize(150, 80);
		appoint.setSize(150, 80);
		cancel.setSize(150, 80);
		move.setSize(150, 80);
		
		search.setBackground(Color.green);
		appoint.setBackground(Color.green);
		cancel.setBackground(Color.green);
		move.setBackground(Color.green);
		
		search.setLocation(30, 0);
		appoint.setLocation(340, 0);
		cancel.setLocation(640, 0);
		move.setLocation(930, 0);
		
		jmb.add(search);
		jmb.add(appoint);
		jmb.add(cancel);
		jmb.add(move);
		panel.add(jmb);
		
		
		panel1.setSize(1200, 600);
		panel2.setSize(1200, 600);
		panel3.setSize(1200, 600);
		panel4.setSize(1200, 600);
		
		panel1.setBackground(Color.orange);
		panel2.setBackground(Color.orange);
		panel3.setBackground(Color.orange);
		panel4.setBackground(Color.orange);
		
		panel1.setLocation(0, 100);
		panel2.setLocation(0, 100);
		panel3.setLocation(0, 100);
		panel4.setLocation(0, 100);
		
		
		//教师查询操作
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.remove(panel2);
				panel.remove(panel3);
				panel.remove(panel4);
				panel.add(panel1);
				panel.updateUI();
				
				Set<String> ss=new HashSet<String>();
				ss.add("周一 08:20-10:00");
				ss.add("周一 10:20-12:00");
				ss.add("周一 14:00-15:40");
				ss.add("周一 16:00-17:40");
				
				ss.add("周二 08:20-10:00");
				ss.add("周二 10:20-12:00");
				ss.add("周二 14:00-15:40");
				ss.add("周二 16:00-17:40");
				
				ss.add("周三 08:20-10:00");
				ss.add("周三 10:20-12:00");
				ss.add("周三 14:00-15:40");
				ss.add("周三 16:00-17:40");
				
				ss.add("周四 08:20-10:00");
				ss.add("周四 10:20-12:00");
				ss.add("周四 14:00-15:40");
				ss.add("周四 16:00-17:40");
				
				ss.add("周五 08:20-10:00");
				ss.add("周五 10:20-12:00");
				ss.add("周五 14:00-15:40");
				ss.add("周五 16:00-17:40");
				
				for (String string :ts ) {
					ss.add(string);
				}
				
				
				JLabel label1=new JLabel("空余时间");
				JLabel label2=new JLabel("已占课程");
				
				label1.setSize(300, 100);
				label2.setSize(300, 100);
				
				label1.setFont(new Font("仿宋", Font.BOLD, 20));
				label2.setFont(new Font("仿宋", Font.BOLD, 20));
				
				label1.setLocation(240, 20);
				label2.setLocation(790, 20);
				
				JTextArea text_course=new JTextArea();
				text_course.setEditable(false);
				
				JTextArea text_course_not=new JTextArea();
				text_course_not.setEditable(false);
				
				text_course.setSize(300, 300);
				text_course_not.setSize(300, 300);
				
				text_course.setLocation(150, 150);
				text_course_not.setLocation(700, 150);
				
				ResultSet set=null;
				try {
					set=sta.executeQuery("select course_name,lab_name,lab_time from lab where teacher_name='"+name_+"'");
					String s="";
					while (set.next())
					{
						
						s+=set.getString("course_name")+"  ";
						s+=set.getString("lab_name")+" ";
						s+=set.getString("lab_time")+"\n";
						ss.remove(set.getString("lab_time"));
					}
					text_course.setText(s);
					s="";
					for (String string : ss) {
						s+=string+"\n";
						
					}
					text_course_not.setText(s);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				panel1.setLayout(null);
				panel1.add(label2);
				panel1.add(label1);
				panel1.add(text_course_not);
				panel1.add(text_course);
				panel1.updateUI();
				
				
			}
		});
		//教师预约操作
		appoint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				panel.remove(panel1);
				panel.remove(panel3);
				panel.remove(panel4);
				panel.add(panel2);
				panel.updateUI();
				
				JButton tj=new JButton("预约");
				tj.setLocation(500, 450);
				tj.setBackground(Color.green);
				tj.setSize(100, 40);
				
				JTextField number_text=new JTextField();
				number_text.setLocation(475, 100);
				number_text.setSize(200, 30);
				
				JTextField name_text=new JTextField();
				name_text.setLocation(475, 150);
				name_text.setSize(200, 30);
				
				JTextField course_text=new JTextField();
				course_text.setLocation(475, 200);
				course_text.setSize(200, 30);
				
				JTextField pra_text=new JTextField();
				pra_text.setLocation(475, 250);
				pra_text.setSize(200, 30);
				
				
				JComboBox<String> time_text=new JComboBox<>();
				time_text.setLocation(475, 300);
				time_text.setSize(200, 30);
				
				time_text.addItem("周一 08:20-10:00");
				time_text.addItem("周一 10:20-12:00");
				time_text.addItem("周一 14:00-15:40");
				time_text.addItem("周一 16:00-17:40");
				
				time_text.addItem("周二 08:20-10:00");
				time_text.addItem("周二 10:20-12:00");
				time_text.addItem("周二 14:00-15:40");
				time_text.addItem("周二 16:00-17:40");
				
				time_text.addItem("周三 08:20-10:00");
				time_text.addItem("周三 10:20-12:00");
				time_text.addItem("周三 14:00-15:40");
				time_text.addItem("周三 16:00-17:40");
				
				time_text.addItem("周四 08:20-10:00");
				time_text.addItem("周四 10:20-12:00");
				time_text.addItem("周四 14:00-15:40");
				time_text.addItem("周四 16:00-17:40");
				
				time_text.addItem("周五 08:20-10:00");
				time_text.addItem("周五 10:20-12:00");
				time_text.addItem("周五 14:00-15:40");
				time_text.addItem("周五 16:00-17:40");
				
				for (String string :ts ) {
					time_text.addItem(string);
				}
				
				JLabel number=new JLabel("人数：");
				JLabel name=new JLabel("班级名称：");
				JLabel course=new JLabel("课程名称：");
				JLabel pra=new JLabel("实验名称：");
				JLabel time=new JLabel("时间：");
				
				course.setSize(200, 20);
				course.setFont(new Font("仿宋", Font.BOLD, 20));
				course.setLocation(250, 200);
				
				pra.setSize(200,20);
				pra.setFont(new Font("仿宋", Font.BOLD, 20));
				pra.setLocation(250, 250);
				
				time.setSize(200, 20);
				time.setFont(new Font("仿宋", Font.BOLD, 20));
				time.setLocation(250, 300);
				
				number.setSize(200, 20);
				number.setFont(new Font("仿宋", Font.BOLD, 20));
				number.setLocation(250, 100);
				
				name.setSize(200, 20);
				name.setFont(new Font("仿宋", Font.BOLD, 20));
				name.setLocation(250, 150);
				
				
				
				
				tj.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						try {
							ResultSet set=sta.executeQuery("select * from lab where lab_time='"+(String)time_text.getSelectedItem()+"';");
							Boolean hasornot=false;
							while (set.next())
							{
								hasornot=true;
							}
							if (hasornot)
							{
								JOptionPane.showMessageDialog(null,"改时间已经有人占了","失败",JOptionPane.ERROR_MESSAGE);
							}
							else {
							sta.execute("insert into lab values("+"'"+course_text.getText()+"',"+"'"+pra_text.getText()+"',"
								+"'"+name_+"',"+"'"+name_text.getText()+"',"+"'"+number_text.getText()+"',"+"'"
									+(String)time_text.getSelectedItem()+"')"	
									);
							JOptionPane.showMessageDialog(null,"预约成功","成功",JOptionPane.PLAIN_MESSAGE);}
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				
				panel2.add(name);
				panel2.add(number);
				panel2.add(tj);
				panel2.add(time);
				panel2.add(pra);
				panel2.add(course);
				
				panel2.add(course_text);
				panel2.add(pra_text);
				panel2.add(time_text);
				panel2.add(number_text);
				panel2.add(name_text);
				
				panel2.setLayout(null);
				
			}
		});
		//取消实验操作
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.remove(panel2);
				panel.remove(panel1);
				panel.remove(panel4);
				panel.add(panel3);
				panel.updateUI();
				
				JComboBox<String>delete_box=new JComboBox<>();
				delete_box.setSize(400, 40);
				delete_box.setLocation(400, 100);
				
				JButton delete_button=new JButton("删除");
				delete_button.setSize(100, 40);
				delete_button.setBackground(Color.green);
				delete_button.setLocation(530, 250);
				
				
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from lab where teacher_name='"+name_+"';");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					while (set.next())
					{	
						
						delete_box.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				delete_button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						String s=(String)delete_box.getSelectedItem();
						try {
							ResultSet set=sta.executeQuery("select * from lab where name='"+name_+"';");
							while (set.next())
							{
								if ((set.getString("course_name")+"  "+ set.getString("lab_name")
								+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
								{
									sta.execute("delete from lab where teacher_name='"+set.getString("teacher_name")+"' and lab_name='"+
											set.getString("lab_name")+"'"+"and lab_time='"+set.getString("lab_time"+"';"));
									JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
									break;
								}
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					delete_box.removeItem(delete_box.getSelectedItem());
					panel3.updateUI();
					}
				});
				
				panel3.add(delete_box);
				panel3.add(delete_button);
				panel3.setLayout(null);	
				
			}
		});
		//修改实验操作
		move.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.remove(panel2);
				panel.remove(panel3);
				panel.remove(panel1);
				panel.add(panel4);
				panel.updateUI();
				
				JComboBox<String>delete_box=new JComboBox<>();
				delete_box.setSize(200, 30);
				delete_box.setLocation(475, 50);
				
				JTextField number_text=new JTextField();
				number_text.setLocation(475, 90);
				number_text.setSize(200, 30);
				
				JTextField name_text=new JTextField();
				name_text.setLocation(475, 130);
				name_text.setSize(200, 30);
				
				JTextField pra_text=new JTextField();
				pra_text.setLocation(475, 170);
				pra_text.setSize(200, 30);
			
				
				JComboBox<String> time_text=new JComboBox<>();
				time_text.setLocation(475, 210);
				time_text.setSize(200, 30);
				
				JTextField course_text=new JTextField();
				course_text.setLocation(475, 250);
				course_text.setSize(200, 30);
				
				JLabel number=new JLabel("人数：");
				JLabel name=new JLabel("班级名称：");
				
				JLabel course=new JLabel("课程名称：");
				JLabel pra=new JLabel("实验名称:");
				JLabel time=new JLabel("时间：");
				
				course.setSize(200, 30);
				course.setFont(new Font("仿宋", Font.BOLD, 20));
				course.setLocation(250,250);
				
				number.setSize(200, 30);
				number.setFont(new Font("仿宋", Font.BOLD, 20));
				number.setLocation(250, 90);
				
				name.setSize(200, 30);
				name.setFont(new Font("仿宋", Font.BOLD, 20));
				name.setLocation(250, 130);
				
				pra.setSize(200, 30);
				pra.setFont(new Font("仿宋", Font.BOLD, 20));
				pra.setLocation(250, 170);
				
				time.setSize(200, 30);
				time.setFont(new Font("仿宋", Font.BOLD, 20));
				time.setLocation(250, 210);
				
				
				
				time_text.addItem("周一 08:20-10:00");
				time_text.addItem("周一 10:20-12:00");
				time_text.addItem("周一 14:00-15:40");
				time_text.addItem("周一 16:00-17:40");
				
				time_text.addItem("周二 08:20-10:00");
				time_text.addItem("周二 10:20-12:00");
				time_text.addItem("周二 14:00-15:40");
				time_text.addItem("周二 16:00-17:40");
				
				time_text.addItem("周三 08:20-10:00");
				time_text.addItem("周三 10:20-12:00");
				time_text.addItem("周三 14:00-15:40");
				time_text.addItem("周三 16:00-17:40");
				
				time_text.addItem("周四 08:20-10:00");
				time_text.addItem("周四 10:20-12:00");
				time_text.addItem("周四 14:00-15:40");
				time_text.addItem("周四 16:00-17:40");
				
				time_text.addItem("周五 08:20-10:00");
				time_text.addItem("周五 10:20-12:00");
				time_text.addItem("周五 14:00-15:40");
				time_text.addItem("周五 16:00-17:40");
				
				for (String string :ts ) {
					time_text.addItem(string);
				}
				
				JButton up_b=new JButton("修改"); 
				up_b.setSize(100, 45);
				up_b.setBackground(Color.green);
				up_b.setLocation(500, 400);
				
				JLabel pre=new JLabel("修改实验:");
				pre.setLocation(250, 50);
				pre.setFont(new Font("仿宋", Font.BOLD, 20));
				pre.setSize(125, 20);
				
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from lab where teacher_name='"+name_+"';");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					while (set.next())
					{	
						
						delete_box.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				delete_box.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String s=(String)delete_box.getSelectedItem();
						try {
							ResultSet set=sta.executeQuery("select * from lab where teacher_name='"+name_+"';");
							while (set.next())
							{
								if ((set.getString("course_name")+"  "+ set.getString("lab_name")
								+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
								{
									course_text.setText(set.getString("course_name"));
									name_text.setText(set.getString("class_name"));
									
									pra_text.setText(set.getString("lab_name"));
									time_text.setSelectedItem(set.getString("lab_time"));
									
									number_text.setText(set.getString("number"));
									break;
								}
							}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					}
				});
				
				up_b.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						String s=(String)delete_box.getSelectedItem();
						try {
							ResultSet set1=sta.executeQuery("select * from lab where lab_time='"+(String)time_text.getSelectedItem()+"';");
							Boolean hasornot=false;
							while (set1.next())
							{
								hasornot=true;
							}
							if (hasornot)
							{
								JOptionPane.showMessageDialog(null,"该时间有人占了","失败",JOptionPane.ERROR_MESSAGE);
							}
							else {
							ResultSet set=sta.executeQuery("select * from lab where teacher_name='"+name_+"';");
							while (set.next())
							{
								if ((set.getString("course_name")+"  "+ set.getString("lab_name")
								+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
								{
									sta.execute("delete from lab where teacher_name='"+set.getString("teacher_name")+"' and lab_name='"+
								set.getString("lab_name")+"' and lab_time='"+set.getString("lab_time")+"';");
									sta.execute("insert into lab values('"+course_text.getText()+"',"
											+"'"+pra_text.getText()+"','"+name_+"','"
													+name_text.getText()+"','"+number_text.getText()+"','"
											+(String)time_text.getSelectedItem()+"')");
									JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
									break;
								}
							}}
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				
				
				panel4.add(course_text);
				panel4.add(course);
				
				panel4.add(pre);
				panel4.add(name);
				panel4.add(pra);
				panel4.add(time);
				
				panel4.add(course);
				panel4.add(number);
				panel4.add(number_text);
				panel4.add(name_text);
				panel4.add(pra_text);
				panel4.add(time_text);
				
				panel4.add(delete_box);
				panel4.add(up_b);
				panel4.setLayout(null);
				
			}
		});

		
		
		
		

		frame.setLayout(null);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
	
}





