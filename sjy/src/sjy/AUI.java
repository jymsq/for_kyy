package sjy;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AUI {
	Statement sta=null;
	ResultSet set=null;
	public AUI(Statement sta)
	{
		this.sta=sta;
	}
	public void initial() {
		
		
	}
	public void run() throws Exception
	{//初始化加载
		
		
		JFrame frame1=new JFrame();
		
		
		frame1.setSize(1200, 700);
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
		
		panel1_1.setLayout(null);
		JButton search_t=new JButton("查询");
		JButton insert_t=new JButton("添加");
		JButton delete_t=new JButton("删除");
		JButton update_t=new JButton("修改");
		
		panel1.add(panel1_1);
		panel1.add(panel1_2);
		panel1.add(panel1_3);
		panel1.add(panel1_4);
		panel1.add(panel1_5);
		
		//教师的UI
		
		JLabel labelbig_t=new JLabel("教师信息管理");
		
		labelbig_t.setLocation(500,0);
		labelbig_t.setSize(300, 100);
		Font f=new Font("宋体",Font.BOLD,25);
		labelbig_t.setFont(f);
		panel1_1.add(labelbig_t);
		
		search_t.setLocation(100, 120);
		search_t.setBackground(Color.green);
		search_t.setSize(100, 40);
		
		insert_t.setLocation(400, 120);
		insert_t.setBackground(Color.green);
		insert_t.setSize(100, 40);
		
		delete_t.setLocation(700, 120);
		delete_t.setBackground(Color.green);
		delete_t.setSize(100, 40);
		
		update_t.setLocation(1000, 120);
		update_t.setBackground(Color.green);
		update_t.setSize(100,40);
		
		panel1_1.add(delete_t);
		panel1_1.add(insert_t);
		panel1_1.add(update_t);
		panel1_1.add(search_t);
		
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
		
		panel1_1.add(panel1_1_1);
		panel1_1.add(panel1_1_2);
		panel1_1.add(panel1_1_3);
		panel1_1.add(panel1_1_4);
		
		//教师整体的UI
		
		database d_all=new database();
		Statement sta_all=d_all.Get_Statement();
		//修改的UI
		
		
		JComboBox<String>delete_box_tu=new JComboBox<>();
		delete_box_tu.setSize(300, 40);
		delete_box_tu.setLocation(500, 0);
		
		JTextField number_text_tu=new JTextField();
		number_text_tu.setLocation(500, 50);
		number_text_tu.setSize(200, 40);
		
		JTextField name_text_tu=new JTextField();
		name_text_tu.setLocation(500, 100);
		name_text_tu.setSize(200, 40);
		
		JTextField password_text_tu=new JTextField();
		password_text_tu.setLocation(500, 150);
		password_text_tu.setSize(200, 40);
		
		JLabel number_tu=new JLabel("教工号：");
		JLabel name_tu=new JLabel("名字：");
		JLabel password_tu=new JLabel("密码：");
		
		number_tu.setSize(200, 30);
		number_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		number_tu.setLocation(250, 50);
		
		name_tu.setSize(200, 30);
		name_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		name_tu.setLocation(250, 100);
		
		password_tu.setSize(200, 30);
		password_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		password_tu.setLocation(250, 150);
		
		JButton up_b_tu=new JButton("修改"); 
		up_b_tu.setSize(100, 40);
		up_b_tu.setBackground(Color.green);
		up_b_tu.setLocation(530, 250);
		
		JLabel pre_tu=new JLabel("选择修改信息:");
		pre_tu.setLocation(250, 0);
		pre_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		pre_tu.setSize(200, 30);
		
		panel1_1_4.add(pre_tu);
		panel1_1_4.add(name_tu);
		panel1_1_4.add(password_tu);
		panel1_1_4.add(number_tu);
		panel1_1_4.add(number_text_tu);
		panel1_1_4.add(name_text_tu);
		panel1_1_4.add(password_text_tu);
		panel1_1_4.add(delete_box_tu);
		panel1_1_4.add(up_b_tu);
		panel1_1_4.setLayout(null);
		
		panel1_1_4.updateUI();
		
		
		
		delete_box_tu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_tu.getSelectedItem();
				ResultSet set=null;
				try {
					 set=sta.executeQuery("select * from teacher");
					while (set.next())
					{
						if ((set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password")).equals(s))
						{
							
							name_text_tu.setText(set.getString("name"));
							password_text_tu.setText(set.getString("password"));
							number_text_tu.setText(set.getString("id"));
							break;
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		up_b_tu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_tu.getSelectedItem();
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from teacher");
					while (set.next())
					{
						if ((set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password")).equals(s))
						{
							sta.execute("delete from teacher where name='"+set.getString("name")+"'");
							sta.execute("insert into teacher values('"+number_text_tu.getText()+"',"
									+"'"+name_text_tu.getText()+"','"+password_text_tu.getText()+"')");
							
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
		
		
		update_t.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_1_1.setVisible(false);
				panel1_1_2.setVisible(false);
				panel1_1_3.setVisible(false);
				panel1_1_4.setVisible(true);
				
				delete_box_tu.removeAllItems();
				try {
					set=sta_all.executeQuery("select * from teacher;");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					while (set.next())
					{	
						delete_box_tu.addItem(set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password"));
					}
					panel1_1_4.updateUI();
					delete_box_tu.validate();
					delete_box_tu.repaint();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		//修改的UI以及功能
		JComboBox<String>delete_box_td=new JComboBox<>();
		delete_box_td.setSize(400, 40);
		delete_box_td.setLocation(400, 100);
		
		JButton delete_button_td=new JButton("删除");
	
		delete_button_td.setSize(100, 40);
		delete_button_td.setBackground(Color.green);
		delete_button_td.setLocation(530, 250);
		panel1_1_3.add(delete_box_td);
		panel1_1_3.add(delete_button_td);
		panel1_1_3.setLayout(null);	
		
		delete_button_td.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				set=null;
				String s=(String)delete_box_td.getSelectedItem();
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
			delete_box_td.removeItem(delete_box_td.getSelectedItem());
			}
		});
		
		
		delete_t.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_1_1.setVisible(false);
				panel1_1_2.setVisible(false);
				panel1_1_4.setVisible(false);
				panel1_1_3.setVisible(true);
				ResultSet set=null;
				delete_box_td.removeAllItems();
				try {
					set=sta.executeQuery("select * from teacher");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					while (set.next())
					{	
						
						delete_box_td.addItem(set.getString("id")+"  "+ set.getString("name")+"  "+set.getString("password"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				panel1_1.updateUI();
			}
		});
		
		//删除功能结束
		
		//添加功能
		
		
		JButton tj_ti=new JButton("添加55");
		tj_ti.setLocation(530, 250);
		tj_ti.setBackground(Color.green);
		tj_ti.setSize(100, 40);
		
		JTextField number_text_ti=new JTextField();
		number_text_ti.setLocation(500, 0);
		number_text_ti.setSize(200, 40);
		
		JTextField name_text_ti=new JTextField();
		name_text_ti.setLocation(500, 50);
		name_text_ti.setSize(200, 40);
		
		JTextField password_text_ti=new JTextField();
		password_text_ti.setLocation(500, 100);
		password_text_ti.setSize(200, 40);
		
		JLabel number_ti=new JLabel("教工号：");
		JLabel name_ti=new JLabel("名字：");
		JLabel password_ti=new JLabel("密码：");
		
		number_ti.setSize(200, 30);
		number_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		number_ti.setLocation(250, 0);
		
		name_ti.setSize(200, 30);
		name_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		name_ti.setLocation(250, 50);
		
		password_ti.setSize(200, 30);
		password_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		password_ti.setLocation(250, 100);
		
		panel1_1_2.add(name_ti);
		panel1_1_2.add(number_ti);
		panel1_1_2.add(password_ti);
		panel1_1_2.add(tj_ti);
		
		panel1_1_2.add(number_text_ti);
		panel1_1_2.add(name_text_ti);
		panel1_1_2.add(password_text_ti);
		panel1_1_2.setLayout(null);
		tj_ti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				set=null;
				try {
					if (number_text_ti.getText().length()!=8)
					{
						JOptionPane.showMessageDialog(null,"教工号输入错误","失败",JOptionPane.ERROR_MESSAGE);
					}
					else {
					sta.execute("insert into teacher values('"+number_text_ti.getText()+"',"
					+"'"+name_text_ti.getText()+"','"+password_text_ti.getText()+"')");
					JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		insert_t.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_1_1.setVisible(false);
				panel1_1_3.setVisible(false);
				panel1_1_4.setVisible(false);
				panel1_1_2.setVisible(true);
			}
		});
		
		
		//添加结束
		
		//查询
		JTextField number_text_ts=new JTextField();
		number_text_ts.setLocation(500, 50);
		number_text_ts.setSize(200, 40);
		
		JTextField name_text_ts=new JTextField();
		name_text_ts.setLocation(500, 100);
		name_text_ts.setSize(200, 40);
		
		JTextField password_text_ts=new JTextField();
		password_text_ts.setLocation(500, 150);
		password_text_ts.setSize(200, 40);
		
		JLabel number_ts=new JLabel("教工号：");
		JLabel name_ts=new JLabel("名字：");
		JLabel password_ts=new JLabel("密码：");
		
		number_ts.setSize(200, 30);
		number_ts.setFont(new Font("仿宋", Font.BOLD, 20));
		number_ts.setLocation(250, 50);
		
		name_ts.setSize(200, 30);
		name_ts.setFont(new Font("仿宋", Font.BOLD, 20));
		name_ts.setLocation(250, 100);
		
		password_ts.setSize(200, 30);
		password_ts.setFont(new Font("仿宋", Font.BOLD, 20));
		password_ts.setLocation(250, 150);
		
		
		JLabel search_label_ts=new JLabel("教师姓名:");
		search_label_ts.setLocation(250, 0);
		search_label_ts.setFont(new Font("仿宋", Font.BOLD, 20));
		search_label_ts.setSize(200, 30);
		
		JTextField search_text_ts=new JTextField();
		search_text_ts.setLocation(500, 0);
		search_text_ts.setSize(200, 40);
		
		search_text_ts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=search_text_ts.getText();
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from teacher where name='"+name+"'");
					while (set.next())
					{	
						number_text_ts.setText(set.getString("id"));
						name_text_ts.setText(set.getString("name"));
						password_text_ts.setText(set.getString("password"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		search_t.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_1_4.setVisible(false);
				panel1_1_2.setVisible(false);
				panel1_1_3.setVisible(false);
				panel1_1_1.setVisible(true);
			}
		});
		
		
		
		panel1_1_1.add(name_ts);
		panel1_1_1.add(number_ts);
		panel1_1_1.add(password_ts);
		panel1_1_1.add(search_label_ts);
		panel1_1_1.add(search_text_ts);
		panel1_1_1.add(number_text_ts);
		panel1_1_1.add(password_text_ts);
		panel1_1_1.add(name_text_ts);
		panel1_1_1.setLayout(null);
		
		frame1.add(panel1);
		// 教师功能完毕
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 课程信息管理
		JButton search_c=new JButton("查询");
		JButton insert_c=new JButton("添加");
		JButton delete_c=new JButton("删除");
		JButton update_c=new JButton("修改");
		
		JLabel labelbig_c=new JLabel("课程信息管理");
		
		labelbig_c.setLocation(500,0);
		labelbig_c.setSize(300, 100);
		labelbig_c.setFont(f);
		panel1_2.add(labelbig_c);
		
		search_c.setLocation(100, 120);
		search_c.setBackground(Color.green);
		search_c.setSize(100, 40);
		
		insert_c.setLocation(400, 120);
		insert_c.setBackground(Color.green);
		insert_c.setSize(100, 40);
		
		delete_c.setLocation(700, 120);
		delete_c.setBackground(Color.green);
		delete_c.setSize(100, 40);
		
		update_c.setLocation(1000, 120);
		update_c.setBackground(Color.green);
		update_c.setSize(100,40);
		
		panel1_2.add(delete_c);
		panel1_2.add(insert_c);
		panel1_2.add(update_c);
		panel1_2.add(search_c);
		
		JPanel panel1_2_1=new JPanel();
		JPanel panel1_2_2=new JPanel();
		JPanel panel1_2_3=new JPanel();
		JPanel panel1_2_4=new JPanel();
		
		panel1_2_1.setSize(1200, 400);
		panel1_2_2.setSize(1200, 400);
		panel1_2_3.setSize(1200, 400);
		panel1_2_4.setSize(1200, 400);
		
		panel1_2_1.setBackground(Color.orange);
		panel1_2_2.setBackground(Color.orange);
		panel1_2_3.setBackground(Color.orange);
		panel1_2_4.setBackground(Color.orange);
		
		panel1_2_1.setLocation(0, 200);
		panel1_2_2.setLocation(0, 200);
		panel1_2_3.setLocation(0, 200);
		panel1_2_4.setLocation(0, 200);
		
		panel1_2.add(panel1_2_1);
		panel1_2.add(panel1_2_2);
		panel1_2.add(panel1_2_3);
		panel1_2.add(panel1_2_4);
		
		panel1_2.updateUI();
		panel1_2.setLayout(null);
		
		//查询操作需要的UI
		JLabel search_label_ci=new JLabel("课程名:");
		search_label_ci.setLocation(250, 0);
		search_label_ci.setFont(new Font("仿宋", Font.BOLD, 20));
		search_label_ci.setSize(200, 30);
		JTextField search_text_ci=new JTextField();
		search_text_ci.setLocation(500, 0);
		search_text_ci.setSize(200, 40);
		
		JTextField number_text_ci=new JTextField();
		number_text_ci.setLocation(500, 50);
		number_text_ci.setSize(200, 40);
		
		JTextField name_text_ci=new JTextField();
		name_text_ci.setLocation(500, 100);
		name_text_ci.setSize(200, 40);
		
		JLabel number_ci=new JLabel("课程号：");
		JLabel name_ci=new JLabel("课程名：");
		
		
		number_ci.setSize(200, 30);
		number_ci.setFont(new Font("仿宋", Font.BOLD, 20));
		number_ci.setLocation(250, 50);
		
		name_ci.setSize(200, 30);
		name_ci.setFont(new Font("仿宋", Font.BOLD, 20));
		name_ci.setLocation(250, 100);
		
		panel1_2_1.add(name_ci);
		panel1_2_1.add(number_ci);
		panel1_2_1.add(search_label_ci);
		panel1_2_1.add(search_text_ci);
		panel1_2_1.add(number_text_ci);
		panel1_2_1.add(name_text_ci);
		panel1_2_1.setLayout(null);
		
		panel1_2_1.updateUI();
		
		search_text_ci.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name_=search_text_ci.getText();
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from course where name='"+name_+"'");
					while (set.next())
					{	
						number_text_ci.setText(set.getString("id"));
						name_text_ci.setText(set.getString("name"));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		search_c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_2_4.setVisible(false);
				panel1_2_3.setVisible(false);
				panel1_2_2.setVisible(false);
				panel1_2_1.setVisible(true);
			
				
				
			}
		});
		//查询操作需要的ui
		
		//class删除
		JComboBox<String>delete_box_cd=new JComboBox<>();
		delete_box_cd.setSize(400, 40);
		delete_box_cd.setLocation(400, 100);
		
		JButton delete_button_cd=new JButton("删除");
		delete_button_cd.setSize(100, 40);
		delete_button_cd.setBackground(Color.green);
		delete_button_cd.setLocation(530, 250);
		panel1_2_2.add(delete_box_cd);
		panel1_2_2.add(delete_button_cd);
		panel1_2_2.setLayout(null);	
		panel1_2.updateUI();
		
		
		
		delete_button_cd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s=(String)delete_box_cd.getSelectedItem();
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
			delete_box_cd.removeItem(delete_box_cd.getSelectedItem());
			}
		});
		delete_c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_2_4.setVisible(false);
				panel1_2_1.setVisible(false);
				panel1_2_3.setVisible(false);
				panel1_2_2.setVisible(true);
				
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from course");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_cd.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_cd.addItem(set.getString("id")+"  "+ set.getString("name"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
			}
		});
		
		//class删除 end
		
		//class 添加
		JButton tj_cs=new JButton("添加");
		tj_cs.setLocation(530, 250);
		tj_cs.setBackground(Color.green);
		tj_cs.setSize(100, 40);
		
		JTextField number_text_cs=new JTextField();
		number_text_cs.setLocation(500, 0);
		number_text_cs.setSize(200, 40);
		
		JTextField name_text_cs=new JTextField();
		name_text_cs.setLocation(500, 50);
		name_text_cs.setSize(200, 40);
		
		JLabel number_cs=new JLabel("课程号：");
		JLabel name_cs=new JLabel("课程名称：");
		
		number_cs.setSize(200, 30);
		number_cs.setFont(new Font("仿宋", Font.BOLD, 20));
		number_cs.setLocation(250, 0);
		
		name_cs.setSize(200, 30);
		name_cs.setFont(new Font("仿宋", Font.BOLD, 20));
		name_cs.setLocation(250, 50);
		panel1_2_3.add(name_cs);
		panel1_2_3.add(number_cs);
		
		panel1_2_3.add(tj_cs);
		
		panel1_2_3.add(number_text_cs);
		panel1_2_3.add(name_text_cs);
		
		panel1_2_3.setLayout(null);
		
		panel1_2_3.updateUI();
		
		tj_cs.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					
					sta.execute("insert into course values('"+name_text_cs.getText()+"',"
					+"'"+number_text_cs.getText()+"')");
					JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		insert_c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_2_4.setVisible(false);
				panel1_2_2.setVisible(false);
				panel1_2_1.setVisible(false);
				panel1_2_3.setVisible(true);
				panel1_2.updateUI();
				
			}
		});
		//class 添加end
		
		
		//class update 
		JComboBox<String>delete_box_cu=new JComboBox<>();
		delete_box_cu.setSize(200, 40);
		delete_box_cu.setLocation(500, 0);
		
		JTextField number_text_cu=new JTextField();
		number_text_cu.setLocation(500, 50);
		number_text_cu.setSize(200, 40);
		
		JTextField name_text_cu=new JTextField();
		name_text_cu.setLocation(500, 100);
		name_text_cu.setSize(200, 40);
		
		
		
		JLabel number_cu=new JLabel("课程号：");
		JLabel name_cu=new JLabel("课程名：");
		
		
		number_cu.setSize(200, 30);
		number_cu.setFont(new Font("仿宋", Font.BOLD, 20));
		number_cu.setLocation(250, 50);
		
		name_cu.setSize(200, 30);
		name_cu.setFont(new Font("仿宋", Font.BOLD, 20));
		name_cu.setLocation(250, 100);
		
		
		
		JButton up_b_cu=new JButton("修改"); 
		up_b_cu.setSize(100, 40);
		up_b_cu.setBackground(Color.green);
		up_b_cu.setLocation(530, 250);
		
		JLabel pre_cu=new JLabel("修改课程:");
		pre_cu.setLocation(250, 0);
		pre_cu.setFont(new Font("仿宋", Font.BOLD, 20));
		pre_cu.setSize(200, 30);
		
		panel1_2_4.add(pre_cu);
		panel1_2_4.add(name_cu);
		
		panel1_2_4.add(number_cu);
		panel1_2_4.add(number_text_cu);
		panel1_2_4.add(name_text_cu);
		
		panel1_2_4.add(delete_box_cu);
		panel1_2_4.add(up_b_cu);
		panel1_2_4.setLayout(null);
		
		panel1_2_4.updateUI();
		
		delete_box_cu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_cu.getSelectedItem();
				
				try {
					ResultSet set=sta.executeQuery("select * from course");
					while (set.next())
					{
						if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
						{
							
							name_text_cu.setText(set.getString("name"));

							number_text_cu.setText(set.getString("id"));
							break;
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		up_b_cu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_cu.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from course");
					while (set.next())
					{
						if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
						{
							sta.execute("delete from course where name='"+set.getString("name")+"'");
							sta.execute("insert into course values('"+name_text_cu.getText()+"',"
									+"'"+number_text_cu.getText()+"')");
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
		update_c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_2_1.setVisible(false);
				panel1_2_2.setVisible(false);
				panel1_2_3.setVisible(false);
				panel1_2_4.setVisible(true);
				panel1_2.updateUI();
				
				
				
				ResultSet set=null;
				try {
					set=sta_all.executeQuery("select * from course");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_cu.removeAllItems();
				
				try {
					while (set.next())
					{	
						
						delete_box_cu.addItem(set.getString("id")+"  "+ set.getString("name"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		
		

//class update end
		
		p_b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_5.setVisible(false);
				panel1_4.setVisible(false);
				panel1_3.setVisible(false);
				panel1_1.setVisible(false);
				panel1_2.setVisible(true);
				
				
				
				panel1.updateUI();
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//班级管理 
		JButton search_o=new JButton("查询");
		JButton insert_o=new JButton("添加");
		JButton delete_o=new JButton("删除");
		JButton update_o=new JButton("修改");
		
		JLabel labelbig_o=new JLabel("班级信息管理");
		
		labelbig_o.setLocation(500,0);
		labelbig_o.setSize(300, 100);
		
		labelbig_o.setFont(f);
		panel1_3.add(labelbig_o);
		
		search_o.setLocation(100, 120);
		search_o.setBackground(Color.green);
		search_o.setSize(100, 40);
		
		insert_o.setLocation(400, 120);
		insert_o.setBackground(Color.green);
		insert_o.setSize(100, 40);
		
		delete_o.setLocation(700, 120);
		delete_o.setBackground(Color.green);
		delete_o.setSize(100, 40);
		
		update_o.setLocation(1000, 120);
		update_o.setBackground(Color.green);
		update_o.setSize(100,40);
		
		
		panel1_3.add(delete_o);
		panel1_3.add(insert_o);
		panel1_3.add(update_o);
		panel1_3.add(search_o);
		
		JPanel panel1_3_1=new JPanel();
		JPanel panel1_3_2=new JPanel();
		JPanel panel1_3_3=new JPanel();
		JPanel panel1_3_4=new JPanel();
		
		
		panel1_3.setLayout(null);
		panel1_3_1.setLayout(null);
		panel1_3_2.setLayout(null);
		panel1_3_3.setLayout(null);
		panel1_3_4.setLayout(null);
		
		
		panel1_3_1.setSize(1200, 400);
		panel1_3_2.setSize(1200, 400);
		panel1_3_3.setSize(1200, 400);
		panel1_3_4.setSize(1200, 400);
		
		panel1_3_1.setBackground(Color.orange);
		panel1_3_2.setBackground(Color.orange);
		panel1_3_3.setBackground(Color.orange);
		panel1_3_4.setBackground(Color.orange);
		
		panel1_3_1.setLocation(0, 200);
		panel1_3_2.setLocation(0, 200);
		panel1_3_3.setLocation(0, 200);
		panel1_3_4.setLocation(0, 200);
		
		panel1_3.add(panel1_3_4);
		panel1_3.add(panel1_3_3);
		panel1_3.add(panel1_3_2);
		panel1_3.add(panel1_3_1);
		
		
		//班级管理结束
		
		//修改操作
		JComboBox<String>delete_box_ou=new JComboBox<>();
		delete_box_ou.setSize(200, 40);
		delete_box_ou.setLocation(500, 0);
		
		JTextField number_text_ou=new JTextField();
		number_text_ou.setLocation(500, 50);
		number_text_ou.setSize(200, 40);
		
		JTextField name_text_ou=new JTextField();
		name_text_ou.setLocation(500, 100);
		name_text_ou.setSize(200, 40);
		
		
		
		JLabel number_ou=new JLabel("人数：");
		JLabel name_ou=new JLabel("班级名称：");
		
		
		number_ou.setSize(200, 30);
		number_ou.setFont(new Font("仿宋", Font.BOLD, 20));
		number_ou.setLocation(250, 50);
		
		name_ou.setSize(200, 30);
		name_ou.setFont(new Font("仿宋", Font.BOLD, 20));
		name_ou.setLocation(250, 100);
		
		
		
		JButton up_b_ou=new JButton("修改"); 
		up_b_ou.setSize(100, 40);
		up_b_ou.setBackground(Color.green);
		up_b_ou.setLocation(530, 250);
		
		JLabel pre_ou=new JLabel("修改班级:");
		pre_ou.setLocation(250, 0);
		pre_ou.setFont(new Font("仿宋", Font.BOLD, 20));
		pre_ou.setSize(200, 30);
		
		panel1_3_4.add(pre_ou);
		panel1_3_4.add(name_ou);
		panel1_3_4.add(number_ou);
		panel1_3_4.add(number_text_ou);
		panel1_3_4.add(name_text_ou);
		
		panel1_3_4.add(delete_box_ou);
		panel1_3_4.add(up_b_ou);
		panel1_3_4.setLayout(null);
		
		panel1_3_4.updateUI();
		
		delete_box_ou.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_ou.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from class");
					while (set.next())
					{
						if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
						{
							
							name_text_ou.setText(set.getString("name"));

							number_text_ou.setText(set.getString("id"));
							break;
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		up_b_ou.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_ou.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from class");
					while (set.next())
					{
						if ((set.getString("id")+"  "+ set.getString("name")).equals(s))
						{
							sta.execute("delete from class where name='"+set.getString("name")+"'");
							sta.execute("insert into class values('"+number_text_ou.getText()+"',"
									+"'"+name_text_ou.getText()+"')");
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
		update_o.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_3_1.setVisible(false);
				panel1_3_2.setVisible(false);
				panel1_3_3.setVisible(false);
				panel1_3_4.setVisible(true);
				
				
				
				
				
				
				ResultSet set=null;
				try {
					set=sta_all.executeQuery("select * from class");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_ou.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_ou.addItem(set.getString("id")+"  "+ set.getString("name"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
			}
		});
		
		//修改end
		//class删除
		
		JComboBox<String>delete_box_od=new JComboBox<>();
		delete_box_od.setSize(400, 40);
		delete_box_od.setLocation(400, 100);
		
		
		
		JButton delete_button_od=new JButton("删除");
		delete_button_od.setSize(100, 40);
		delete_button_od.setBackground(Color.green);
		delete_button_od.setLocation(530, 250);
		
		panel1_3_3.add(delete_box_od);
		panel1_3_3.add(delete_button_od);
		delete_button_od.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s=(String)delete_box_od.getSelectedItem();
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
			delete_box_od.removeItem(delete_box_od.getSelectedItem());
			}
		});
		delete_o.addActionListener(new ActionListener() {
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_3_1.setVisible(false);
				panel1_3_2.setVisible(false);
				panel1_3_4.setVisible(false);
				panel1_3_3.setVisible(true);
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from class;");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_od.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_od.addItem(set.getString("id")+"  "+ set.getString("name"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
												
			}
		});
		
		//class删除结束
		//class添加开始
		JButton tj_oi=new JButton("添加");
		tj_oi.setLocation(530, 250);
		tj_oi.setBackground(Color.green);
		tj_oi.setSize(100, 40);
		
		JTextField number_text_oi=new JTextField();
		number_text_oi.setLocation(500, 0);
		number_text_oi.setSize(200, 40);
		
		JTextField name_text_oi=new JTextField();
		name_text_oi.setLocation(500, 50);
		name_text_oi.setSize(200, 40);
		
		
		
		
		
		
		JLabel number_oi=new JLabel("班级人数：");
		JLabel name_oi=new JLabel("班级名称：");
		
		
		number_oi.setSize(200, 30);
		number_oi.setFont(new Font("仿宋", Font.BOLD, 20));
		number_oi.setLocation(250, 0);
		
		name_oi.setSize(200, 30);
		name_oi.setFont(new Font("仿宋", Font.BOLD, 20));
		name_oi.setLocation(250, 50);
		
		panel1_3_2.add(name_oi);
		panel1_3_2.add(number_oi);
		panel1_3_2.add(tj_oi);
		panel1_3_2.add(number_text_oi);
		panel1_3_2.add(name_text_oi);
		
		tj_oi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					sta.execute("insert into class values('"+number_text_oi.getText()+"',"
					+"'"+name_text_oi.getText()+"');");
					JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});		
		
		insert_o.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				panel1_3_1.setVisible(false);
				panel1_3_3.setVisible(false);
				panel1_3_4.setVisible(false);
				panel1_3_2.setVisible(true);
				

			}
		});
		
		
		//class添加结束
		//class查询start
		JLabel search_label_os=new JLabel("班级名称:");
		search_label_os.setLocation(250, 0);
		search_label_os.setFont(new Font("仿宋", Font.BOLD, 20));
		search_label_os.setSize(200, 30);
		JTextField search_text_os=new JTextField();
		search_text_os.setLocation(500, 0);
		search_text_os.setSize(200, 40);
		
		JTextField number_text_os=new JTextField();
		number_text_os.setLocation(500, 50);
		number_text_os.setSize(200, 40);
		
		JTextField name_text_os=new JTextField();
		name_text_os.setLocation(500, 100);
		name_text_os.setSize(200, 40);
		
		JLabel number_os=new JLabel("班级人数：");
		JLabel name_os=new JLabel("班级名称：");
		
		
		number_os.setSize(200, 30);
		number_os.setFont(new Font("仿宋", Font.BOLD, 20));
		number_os.setLocation(250, 50);
		
		name_os.setSize(200, 30);
		name_os.setFont(new Font("仿宋", Font.BOLD, 20));
		name_os.setLocation(250, 100);
		
		
		
		panel1_3_1.add(name_os);
		panel1_3_1.add(number_os);
		
		panel1_3_1.add(search_label_os);
		panel1_3_1.add(search_text_os);
		panel1_3_1.add(number_text_os);
		panel1_3_1.add(name_text_os);
		search_text_os.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name_=search_text_os.getText();
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from class where name='"+name_+"'");
					while (set.next())
					{	
						number_text_os.setText(set.getString("id"));
						name_text_os.setText(set.getString("name"));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		search_o.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_3_1.setVisible(true);
				panel1_3_3.setVisible(false);
				panel1_3_4.setVisible(false);
				panel1_3_2.setVisible(false);

				
				
			}
		});
		panel1.add(panel1_3);
		
		//class查询end
		p_b3.addActionListener(new ActionListener() {
			
			@Override
			public synchronized void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_2.setVisible(false);
				panel1_1.setVisible(false);
				panel1_4.setVisible(false);
				panel1_5.setVisible(false);
				panel1_3.setVisible(true);
	
				panel1_3.updateUI();
				panel1_3.repaint();

				
			}
		});
		//class查询结束
		
		//lab  
		JButton search_l=new JButton("查询");
		JButton insert_l=new JButton("添加");
		JButton delete_l=new JButton("删除");
		JButton update_l=new JButton("修改");
		
		JLabel labelbig_l=new JLabel("实验信息管理");
		
		labelbig_l.setLocation(500,0);
		labelbig_l.setSize(300, 100);
		
		labelbig_l.setFont(f);
		panel1_4.add(labelbig_l);
		
		search_l.setLocation(100, 120);
		search_l.setBackground(Color.green);
		search_l.setSize(100, 40);
		
		insert_l.setLocation(400, 120);
		insert_l.setBackground(Color.green);
		insert_l.setSize(100, 40);
		
		delete_l.setLocation(700, 120);
		delete_l.setBackground(Color.green);
		delete_l.setSize(100, 40);
		
		update_l.setLocation(1000, 120);
		update_l.setBackground(Color.green);
		update_l.setSize(100,40);
		
		panel1_4.add(delete_l);
		panel1_4.add(insert_l);
		panel1_4.add(update_l);
		panel1_4.add(search_l);
		
		panel1_4.setLayout(null);
		
		JPanel panel1_4_1=new JPanel();
		JPanel panel1_4_2=new JPanel();
		JPanel panel1_4_3=new JPanel();
		JPanel panel1_4_4=new JPanel();
		
		panel1_4_1.setLayout(null);
		panel1_4_2.setLayout(null);
		panel1_4_3.setLayout(null);
		panel1_4_4.setLayout(null);
		
		panel1_4.add(panel1_4_4);
		panel1_4.add(panel1_4_1);
		panel1_4.add(panel1_4_2);
		panel1_4.add(panel1_4_3);
		
		panel1_4_1.setSize(1200, 400);
		panel1_4_2.setSize(1200, 400);
		panel1_4_3.setSize(1200, 400);
		panel1_4_4.setSize(1200, 400);
		
		panel1_4_1.setBackground(Color.orange);
		panel1_4_2.setBackground(Color.orange);
		panel1_4_3.setBackground(Color.orange);
		panel1_4_4.setBackground(Color.orange);
		
		panel1_4_1.setLocation(0, 200);
		panel1_4_2.setLocation(0, 200);
		panel1_4_3.setLocation(0, 200);
		panel1_4_4.setLocation(0, 200);
		
		database data1=new database();
		Statement sta_lu= data1.Get_Statement();
		//lab
		
		//lab update
		JComboBox<String>delete_box_lu=new JComboBox<>();
		delete_box_lu.setSize(400, 20);
		delete_box_lu.setLocation(425, 0);
		
		JTextField number_text_lu=new JTextField();
		number_text_lu.setLocation(475, 50);
		number_text_lu.setSize(200, 20);
		
		JTextField name_text_lu=new JTextField();
		name_text_lu.setLocation(475, 100);
		name_text_lu.setSize(200, 20);
		
		JTextField pra_text_lu=new JTextField();
		pra_text_lu.setLocation(475, 150);
		pra_text_lu.setSize(200, 20);
		
		JTextField teacher_text_lu=new JTextField();
		teacher_text_lu.setLocation(475, 200);
		teacher_text_lu.setSize(200, 20);
		
		JComboBox<String> time_text_lu=new JComboBox<>();
		time_text_lu.setLocation(475, 250);
		time_text_lu.setSize(200, 20);
		
		JTextField course_text_lu=new JTextField();
		course_text_lu.setLocation(475, 300);
		course_text_lu.setSize(200, 20);
		
		JLabel number_lu=new JLabel("人数：");
		JLabel name_lu=new JLabel("班级名称：");
		JLabel teacher_lu=new JLabel("教师姓名：");
		JLabel course_lu=new JLabel("课程名称：");
		JLabel pra_lu=new JLabel("实验名称");
		JLabel time_lu=new JLabel("时间：");
		
		course_lu.setSize(200, 20);
		course_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		course_lu.setLocation(250,300);
		
		number_lu.setSize(200, 20);
		number_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		number_lu.setLocation(250, 50);
		
		name_lu.setSize(200, 20);
		name_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		name_lu.setLocation(250, 100);
		
		pra_lu.setSize(200, 20);
		pra_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		pra_lu.setLocation(250, 150);
		
		time_lu.setSize(200, 20);
		time_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		time_lu.setLocation(250, 250);
		
		teacher_lu.setSize(200, 20);
		teacher_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		teacher_lu.setLocation(250, 200);
		
		
		
		
		JButton up_b_lu=new JButton("修改"); 
		up_b_lu.setSize(100, 40);
		up_b_lu.setBackground(Color.green);
		up_b_lu.setLocation(900, 200);
		
		JLabel pre_lu=new JLabel("修改实验:");
		pre_lu.setLocation(250, 0);
		pre_lu.setFont(new Font("仿宋", Font.BOLD, 20));
		pre_lu.setSize(200, 20);
		
		panel1_4_4.add(course_text_lu);
		panel1_4_4.add(course_lu);
		panel1_4_4.add(pre_lu);
		panel1_4_4.add(name_lu);
		panel1_4_4.add(pra_lu);
		panel1_4_4.add(time_lu);
		panel1_4_4.add(teacher_lu);
		panel1_4_4.add(course_lu);
		panel1_4_4.add(number_lu);
		panel1_4_4.add(number_text_lu);
		panel1_4_4.add(name_text_lu);
		panel1_4_4.add(pra_text_lu);
		panel1_4_4.add(time_text_lu);
		panel1_4_4.add(teacher_text_lu);
		panel1_4_4.add(delete_box_lu);
		panel1_4_4.add(up_b_lu);
		
		
		
		delete_box_lu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_lu.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from lab");
					while (set.next())
					{
						if ((set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
						{
							course_text_lu.setText(set.getString("course_name"));
							name_text_lu.setText(set.getString("class_name"));
							teacher_text_lu.setText(set.getString("teacher_name"));
							pra_text_lu.setText(set.getString("lab_name"));
							time_text_lu.setSelectedItem(set.getString("lab_time"));
							number_text_lu.setText(set.getString("number"));
							
							break;
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		up_b_lu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_lu.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from lab");
					while (set.next())
					{
						if ((set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
						{
							sta.execute("delete from lab where teacher_name='"+set.getString("teacher_name")+"' and lab_name='"+
						set.getString("lab_name")+"';");
							sta.execute("insert into lab values('"+course_text_lu.getText()+"',"
									+"'"+pra_text_lu.getText()+"','"+teacher_text_lu.getText()+"','"
											+name_text_lu.getText()+"','"+number_text_lu.getText()+"','"
									+(String)time_text_lu.getSelectedItem()+"')");
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
		
	
		
		update_l.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_4_1.setVisible(false);
				panel1_4_2.setVisible(false);
				panel1_4_3.setVisible(false);
				panel1_4_4.setVisible(true);
				
				try {
					set=sta_lu.executeQuery("select * from lab");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_lu.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_lu.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				try {
					set=sta_lu.executeQuery("select * from time");
					time_text_lu.removeAllItems();
					while (set.next())
					{
						time_text_lu.addItem(set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		//lab update end
		
		//lab delete
		JComboBox<String>delete_box_ld=new JComboBox<>();
		delete_box_ld.setSize(400, 40);
		delete_box_ld.setLocation(400, 100);
		
		JButton delete_button_ld=new JButton("删除");
		delete_button_ld.setSize(100, 40);
		delete_button_ld.setBackground(Color.green);
		delete_button_ld.setLocation(530, 250);
		
		panel1_4_3.add(delete_box_ld);
		panel1_4_3.add(delete_button_ld);
		
		
		delete_button_ld.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s=(String)delete_box_ld.getSelectedItem();
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
			delete_box_ld.removeItem(delete_box_ld.getSelectedItem());
			}
		});
		
		delete_l.addActionListener(new ActionListener() {
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_4_1.setVisible(false);
				panel1_4_2.setVisible(false);
				panel1_4_4.setVisible(false);
				panel1_4_3.setVisible(true);
				
				
				
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from lab");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_ld.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_ld.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		//lab delete end
		
		//lab insert
		JButton tj_li=new JButton("添加");
		tj_li.setLocation(800, 200);
		tj_li.setBackground(Color.green);
		tj_li.setSize(100, 40);
		
		JTextField number_text_li=new JTextField();
		number_text_li.setLocation(475, 0);
		number_text_li.setSize(200, 20);
		
		JTextField name_text_li=new JTextField();
		name_text_li.setLocation(475, 50);
		name_text_li.setSize(200, 20);
		
		JTextField course_text_li=new JTextField();
		course_text_li.setLocation(475, 150);
		course_text_li.setSize(200, 20);
		
		JTextField pra_text_li=new JTextField();
		pra_text_li.setLocation(475, 200);
		pra_text_li.setSize(200, 20);
		
		JTextField teacher_text_li=new JTextField();
		teacher_text_li.setLocation(475, 100);
		teacher_text_li.setSize(200, 20);
		
		JComboBox<String> time_text_li=new JComboBox<>();
		time_text_li.setLocation(475, 250);
		time_text_li.setSize(200, 20);
		
		JLabel number_li=new JLabel("人数：");
		JLabel name_li=new JLabel("班级名称：");
		JLabel teacher_li=new JLabel("教师姓名：");
		JLabel course_li=new JLabel("课程名称：");
		JLabel pra_li=new JLabel("实验名称：");
		JLabel time_li=new JLabel("时间：");
		
		course_li.setSize(200, 20);
		course_li.setFont(new Font("仿宋", Font.BOLD, 20));
		course_li.setLocation(250, 150);
		
		pra_li.setSize(200,20);
		pra_li.setFont(new Font("仿宋", Font.BOLD, 20));
		pra_li.setLocation(250, 200);
		
		time_li.setSize(200, 20);
		time_li.setFont(new Font("仿宋", Font.BOLD, 20));
		time_li.setLocation(250, 250);
		
		number_li.setSize(200, 20);
		number_li.setFont(new Font("仿宋", Font.BOLD, 20));
		number_li.setLocation(250, 0);
		
		name_li.setSize(200, 20);
		name_li.setFont(new Font("仿宋", Font.BOLD, 20));
		name_li.setLocation(250, 50);
		
		teacher_li.setSize(200, 20);
		teacher_li.setFont(new Font("仿宋", Font.BOLD, 20));
		teacher_li.setLocation(250, 100);
		
		panel1_4_2.add(name_li);
		panel1_4_2.add(number_li);
		panel1_4_2.add(teacher_li);
		panel1_4_2.add(tj_li);
		panel1_4_2.add(time_li);
		panel1_4_2.add(pra_li);
		panel1_4_2.add(course_li);
		
		panel1_4_2.add(course_text_li);
		panel1_4_2.add(pra_text_li);
		panel1_4_2.add(time_text_li);
		panel1_4_2.add(teacher_text_li);
		panel1_4_2.add(number_text_li);
		panel1_4_2.add(name_text_li);
		
		database data_li=new database();
		Statement sta_li=data_li.Get_Statement();
	
		tj_li.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					sta.execute("insert into lab values("+"'"+course_text_li.getText()+"',"+"'"+pra_text_li.getText()+"',"
						+"'"+teacher_text_li.getText()+"',"+"'"+name_text_li.getText()+"',"+"'"+number_text_li.getText()+"',"+"'"
							+(String)time_text_li.getSelectedItem()+"')"	
							);
					JOptionPane.showMessageDialog(null,"添加成功","成功",JOptionPane.PLAIN_MESSAGE);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		database data_lin=new database();
		Statement sta_lin=data_lin.Get_Statement();
		insert_l.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_4_1.setVisible(false);
				panel1_4_3.setVisible(false);
				panel1_4_4.setVisible(false);
				panel1_4_2.setVisible(true);
				ResultSet set=null;
				try {
					set=sta_lin.executeQuery("select * from time");
					time_text_li.removeAllItems();
					while (set.next())
					{
						time_text_li.addItem(set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
		});
		//lab insert end
		
		
		//lab search 
		ArrayList<String> a1=new ArrayList<>();
		ArrayList<String> a2=new ArrayList<>();
		ArrayList<String> a3=new ArrayList<>();
		ArrayList<String> a4=new ArrayList<>();
		ArrayList<String> a5=new ArrayList<>();
		ArrayList<String> a6=new ArrayList<>();
		
		JTextField number_text_ls=new JTextField();
		number_text_ls.setLocation(475, 50);
		number_text_ls.setSize(200, 20);
		
		JTextField name_text_ls=new JTextField();
		name_text_ls.setLocation(475, 100);
		name_text_ls.setSize(200, 20);
		
		JTextField pra_text_ls=new JTextField();
		pra_text_ls.setLocation(475, 150);
		pra_text_ls.setSize(200, 20);
		
		JTextField teacher_text_ls=new JTextField();
		teacher_text_ls.setLocation(475, 200);
		teacher_text_ls.setSize(200, 20);
		
		JTextField time_text_ls=new JTextField();
		time_text_ls.setLocation(475, 250);
		time_text_ls.setSize(200, 20);
		
		JTextField course_text_ls=new JTextField();
		course_text_ls.setLocation(475, 300);
		course_text_ls.setSize(200, 20);
		
		JLabel number_ls=new JLabel("人数：");
		JLabel name_ls=new JLabel("班级名称：");
		JLabel teacher_ls=new JLabel("教师姓名：");
		JLabel course_ls=new JLabel("课程名称：");
		JLabel pra_ls=new JLabel("实验名称");
		JLabel time_ls=new JLabel("时间：");
		
		course_ls.setSize(200, 20);
		course_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		course_ls.setLocation(250,300);
		
		number_ls.setSize(200, 20);
		number_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		number_ls.setLocation(250, 50);
		
		name_ls.setSize(200, 20);
		name_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		name_ls.setLocation(250, 100);
		
		pra_ls.setSize(200, 20);
		pra_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		pra_ls.setLocation(250, 150);
		
		time_ls.setSize(200, 20);
		time_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		time_ls.setLocation(250, 250);
		
		teacher_ls.setSize(200, 20);
		teacher_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		teacher_ls.setLocation(250, 200);
		
		
		
		JButton up_b_ls=new JButton("下一个结果"); 
		up_b_ls.setSize(100, 40);
		up_b_ls.setBackground(Color.green);
		up_b_ls.setLocation(800, 200);
		
		JLabel pre_ls=new JLabel("教师姓名或实验名称：");
		pre_ls.setLocation(250, 0);
		pre_ls.setFont(new Font("仿宋", Font.BOLD, 20));
		pre_ls.setSize(225, 20);
		
		JTextField search_text_ls=new JTextField();
		search_text_ls.setSize(250, 20);
		search_text_ls.setLocation(475, 0);
		
		panel1_4_1.add(course_text_ls);
		panel1_4_1.add(course_ls);
		
		panel1_4_1.add(pre_ls);
		panel1_4_1.add(search_text_ls);
		panel1_4_1.add(name_ls);
		panel1_4_1.add(pra_ls);
		panel1_4_1.add(time_ls);
		panel1_4_1.add(teacher_ls);
		panel1_4_1.add(course_ls);
		panel1_4_1.add(number_ls);
		panel1_4_1.add(number_text_ls);
		panel1_4_1.add(name_text_ls);
		panel1_4_1.add(pra_text_ls);
		panel1_4_1.add(time_text_ls);
		panel1_4_1.add(teacher_text_ls);
		
		panel1_4_1.add(up_b_ls);
		
		up_b_ls.addActionListener(new ActionListener() {
			int count=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (course_text_ls.getText().equals(""))
					;
				else {
				if (count>=a1.size())
					count=0;
				else
					count++;
				course_text_ls.setText(a1.get(count));
				pra_text_ls.setText(a2.get(count));
				teacher_text_ls.setText(a3.get(count));
				name_text_ls.setText(a4.get(count));
				number_text_ls.setText(a5.get(count));
				time_text_ls.setText(a6.get(count));
				
				
				}
			}
		});
		search_text_ls.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=search_text_ls.getText();
				ResultSet set=null;
				a1.clear();
				a2.clear();
				a3.clear();
				a4.clear();
				a5.clear();
				a6.clear();
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
					course_text_ls.setText(a1.get(0));
					pra_text_ls.setText(a2.get(0));
					teacher_text_ls.setText(a3.get(0));
					name_text_ls.setText(a4.get(0));
					number_text_ls.setText(a5.get(0));
					time_text_ls.setText(a6.get(0));
					
					
				}
			}
					
		});

		search_l.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_4_1.setVisible(true);
				panel1_4_2.setVisible(false);
				panel1_4_3.setVisible(false);
				panel1_4_4.setVisible(false);
				ResultSet set=null;
				try {
					set=sta_li.executeQuery("select * from time");
					time_text_li.removeAllItems();
					while (set.next())
					{
						time_text_li.addItem(set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		//lab search end
		p_b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_1.setVisible(false);
				panel1_2.setVisible(false);
				panel1_3.setVisible(false);
				panel1_4.setVisible(true);
				panel1_5.setVisible(false);
			}
		});
		//lab end
		
		//时间管理
		
		panel1_5.setLayout(null);
		
		JLabel ava_time_tm=new JLabel("可用时间:");
		ava_time_tm.setLocation(200, 20);
		ava_time_tm.setFont(new Font("仿宋", Font.BOLD, 20));
		ava_time_tm.setSize(100, 20);
		
		JLabel ava_time_des_tm=new JLabel();
		ava_time_des_tm.setSize(500, 50);
		ava_time_des_tm.setFont(new Font("仿宋", Font.BOLD, 10));
		ava_time_des_tm.setLocation(320, 20);
		
		JTextArea add_time_tm=new JTextArea();
		add_time_tm.setSize(500, 200);
		add_time_tm.setFont(new Font("仿宋", Font.BOLD, 10));
		add_time_tm.setLocation(320, 80);
		
		JComboBox<String> time_box_tm=new JComboBox<String>();
		time_box_tm.setSize(200, 30);
		time_box_tm.setLocation(200, 450);
		
		JButton addb_tm=new JButton("添加");
		addb_tm.setSize(100, 40);
		addb_tm.setBackground(Color.green);
		addb_tm.setLocation(500,450);
		
		JButton delb_tm=new JButton("删除");
		delb_tm.setSize(100,40);
		delb_tm.setBackground(Color.green);
		delb_tm.setLocation(700, 450);
		
		panel1_5.add(add_time_tm);
		panel1_5.add(delb_tm);
		panel1_5.add(addb_tm);
		panel1_5.add(time_box_tm);
		panel1_5.add(ava_time_des_tm);
		panel1_5.add(ava_time_tm);
		
		time_box_tm.addItem("周一 8：20-10：00");
		time_box_tm.addItem("周一 10：20-12：00");
		time_box_tm.addItem("周一 14：00-15：40");
		time_box_tm.addItem("周一 16：00-17：40");
		
		time_box_tm.addItem("周二 8：20-10：00");
		time_box_tm.addItem("周二 10：20-12：00");
		time_box_tm.addItem("周二 14：00-15：40");
		time_box_tm.addItem("周二 16：00-17：40");
		
		time_box_tm.addItem("周三 8：20-10：00");
		time_box_tm.addItem("周三 10：20-12：00");
		time_box_tm.addItem("周三 14：00-15：40");
		time_box_tm.addItem("周三 16：00-17：40");
		
		time_box_tm.addItem("周四 8：20-10：00");
		time_box_tm.addItem("周四 10：20-12：00");
		time_box_tm.addItem("周四 14：00-15：40");
		time_box_tm.addItem("周四 16：00-17：40");
		
		time_box_tm.addItem("周五 8：20-10：00");
		time_box_tm.addItem("周五 10：20-12：00");
		time_box_tm.addItem("周五 14：00-15：40");
		time_box_tm.addItem("周五 16：00-17：40");
		//
		Set<String>time_set=new HashSet<String>();
		

		addb_tm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String) time_box_tm.getSelectedItem();
				time_set.add(s);
				
				try {
					sta.execute("delete * from time");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for (String string : time_set) {
					try {
						sta.execute("insert into time values('"+string+"');");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				String ava="";
				for (String string : time_set) {
					ava+="  "+string+"\n";
				}
				add_time_tm.setText(ava);
				panel1_5.updateUI();

			}
		});
		delb_tm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				time_set.remove((String)time_box_tm.getSelectedItem());
				try {
					sta.execute("delete from time where lab_time='"+(String)time_box_tm.getSelectedItem()+"'");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String ava="";
				for (String string : time_set) {
					ava+="  "+string+"\n";
				}
				add_time_tm.setText(ava);
				panel1_5.updateUI();
			}
		});
		p_b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1_2.setVisible(false);
				panel1_4.setVisible(false);
				panel1_1.setVisible(false);
				panel1_3.setVisible(false);
				panel1_5.setVisible(true);
				
				try {
					set=sta_all.executeQuery("select * from time");
					time_set.clear();
					while (set.next())
					{
						time_set.add(set.getString("lab_time"));
					}
					String ava="";
					for (String string : time_set) {
						ava+="  "+string+"\n";
					}
					add_time_tm.setText(ava);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
		});
		//时间管理结束
		
		
		
	}
	
	
	
	
	
}
