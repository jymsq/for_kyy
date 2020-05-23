package sjy;



import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class tui {
	String name=null;	
	public tui(String name)
	{
		this.name=name;
		
	}
	public void run() throws Exception
	{
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
		
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		panel4.setLayout(null);
		
	
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
		
		frame.add(panel);
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		frame.setLayout(null);
		
		frame.setVisible(true);
		
		//教师查询
		JLabel label1_ts=new JLabel("已占课程");
		JLabel label2_ts=new JLabel("空余时间");
		


	
		
		label1_ts.setSize(300, 100);
		label2_ts.setSize(300, 100);
		
		label1_ts.setFont(new Font("仿宋", Font.BOLD, 20));
		label2_ts.setFont(new Font("仿宋", Font.BOLD, 20));
		
		label1_ts.setLocation(240, 20);
		label2_ts.setLocation(790, 20);
		
		JTextArea text_course_ts=new JTextArea();
		text_course_ts.setEditable(false);
		
		
		JTextArea text_course_not_ts=new JTextArea();
		text_course_not_ts.setEditable(false);

		
		text_course_ts.setSize(300, 300);
		text_course_not_ts.setSize(300, 300);
		
		text_course_ts.setLocation(150, 150);
		text_course_not_ts.setLocation(700, 150);
		
		panel1.add(label2_ts);
		panel1.add(label1_ts);
		panel1.add(text_course_not_ts);
		panel1.add(text_course_ts);
		
		database data_ts=new database();
		Statement sta=data_ts.Get_Statement();
		
		HashSet<String> ss=new HashSet<String>();
		
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				panel1.setVisible(true);
				
				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from time");
					ss.clear();
					while (set.next()) {
						ss.add(set.getString("lab_time"));
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				try {
					set=sta.executeQuery("select course_name,lab_name,lab_time from lab where teacher_name='"+name+"'");
					String s="";
					while (set.next())
					{
						
						s+=set.getString("course_name")+"  ";
						s+=set.getString("lab_name")+" ";
						s+=set.getString("lab_time")+"\n";
					}
					text_course_ts.setText(s);
					s="";
					for (String string : ss) {
						s+=string+"\n";
						
					}
					text_course_not_ts.setText(s);
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
		});
		
		
		//教师预约
		JButton tj_ti=new JButton("预约");
		tj_ti.setLocation(500, 450);
		tj_ti.setBackground(Color.green);
		tj_ti.setSize(100, 40);
		
		JTextField number_text_ti=new JTextField();
		number_text_ti.setLocation(475, 100);
		number_text_ti.setSize(200, 30);
		
		JTextField name_text_ti=new JTextField();
		name_text_ti.setLocation(475, 150);
		name_text_ti.setSize(200, 30);
		
		JTextField course_text_ti=new JTextField();
		course_text_ti.setLocation(475, 200);
		course_text_ti.setSize(200, 30);
		
		JTextField pra_text_ti=new JTextField();
		pra_text_ti.setLocation(475, 250);
		pra_text_ti.setSize(200, 30);
		
		
		JComboBox<String> time_text_ti=new JComboBox<>();
		time_text_ti.setLocation(475, 300);
		time_text_ti.setSize(200, 30);
		
		JLabel number_ti=new JLabel("人数：");
		JLabel name_ti=new JLabel("班级名称：");
		JLabel course_ti=new JLabel("课程名称：");
		JLabel pra_ti=new JLabel("实验名称：");
		JLabel time_ti=new JLabel("时间：");
		
		course_ti.setSize(200, 20);
		course_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		course_ti.setLocation(250, 200);
		
		pra_ti.setSize(200,20);
		pra_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		pra_ti.setLocation(250, 250);
		
		time_ti.setSize(200, 20);
		time_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		time_ti.setLocation(250, 300);
		
		number_ti.setSize(200, 20);
		number_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		number_ti.setLocation(250, 100);
		
		name_ti.setSize(200, 20);
		name_ti.setFont(new Font("仿宋", Font.BOLD, 20));
		name_ti.setLocation(250, 150);
		
		panel2.add(name_ti);
		panel2.add(number_ti);
		panel2.add(tj_ti);
		panel2.add(time_ti);
		panel2.add(pra_ti);
		panel2.add(course_ti);
		
		panel2.add(course_text_ti);
		panel2.add(pra_text_ti);
		panel2.add(time_text_ti);
		panel2.add(number_text_ti);
		panel2.add(name_text_ti);
		
		tj_ti.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {

					sta.execute("insert into lab values("+"'"+course_text_ti.getText()+"',"+"'"+pra_text_ti.getText()+"',"
						+"'"+name+"',"+"'"+name_text_ti.getText()+"',"+"'"+number_text_ti.getText()+"',"+"'"
							+(String)time_text_ti.getSelectedItem()+"')"	
							);
					JOptionPane.showMessageDialog(null,"预约成功","成功",JOptionPane.PLAIN_MESSAGE);}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		
		
		
	}});
		appoint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				panel1.setVisible(false);
				panel2.setVisible(true);
				panel3.setVisible(false);
				panel4.setVisible(false);
				ResultSet set;
				try {
					set=sta.executeQuery("select * from time");
					time_text_ti.removeAllItems();
					while (set.next())
					{
						time_text_ti.addItem(set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

				
			}
		});
		
		//教师预约end
		//教师删除
		JComboBox<String>delete_box_td=new JComboBox<>();
		delete_box_td.setSize(400, 40);
		delete_box_td.setLocation(400, 100);
		
		JButton delete_button_td=new JButton("删除");
		delete_button_td.setSize(100, 40);
		delete_button_td.setBackground(Color.green);
		delete_button_td.setLocation(530, 250);
		panel3.add(delete_box_td);
		panel3.add(delete_button_td);
		
		delete_button_td.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s=(String)delete_box_td.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from lab where name='"+name+"';");
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
			delete_box_td.removeItem(delete_box_td.getSelectedItem());
			panel3.updateUI();
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel4.setVisible(false);
				panel3.setVisible(true);
				panel.updateUI();

				ResultSet set=null;
				try {
					set=sta.executeQuery("select * from lab where teacher_name='"+name+"';");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_td.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_td.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		
		//删除end
		
		//修改
		JComboBox<String>delete_box_tu=new JComboBox<>();
		delete_box_tu.setSize(200, 30);
		delete_box_tu.setLocation(475, 50);
		
		JTextField number_text_tu=new JTextField();
		number_text_tu.setLocation(475, 90);
		number_text_tu.setSize(200, 30);
		
		JTextField name_text_tu=new JTextField();
		name_text_tu.setLocation(475, 130);
		name_text_tu.setSize(200, 30);
		
		JTextField pra_text_tu=new JTextField();
		pra_text_tu.setLocation(475, 170);
		pra_text_tu.setSize(200, 30);
	
		
		JComboBox<String> time_text_tu=new JComboBox<>();
		time_text_tu.setLocation(475, 210);
		time_text_tu.setSize(200, 30);
		
		JTextField course_text_tu=new JTextField();
		course_text_tu.setLocation(475, 250);
		course_text_tu.setSize(200, 30);
		
		JLabel number_tu=new JLabel("人数：");
		JLabel name_tu=new JLabel("班级名称：");
		
		JLabel course_tu=new JLabel("课程名称：");
		JLabel pra_tu=new JLabel("实验名称:");
		JLabel time_tu=new JLabel("时间：");
		
		course_tu.setSize(200, 30);
		course_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		course_tu.setLocation(250,250);
		
		number_tu.setSize(200, 30);
		number_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		number_tu.setLocation(250, 90);
		
		name_tu.setSize(200, 30);
		name_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		name_tu.setLocation(250, 130);
		
		pra_tu.setSize(200, 30);
		pra_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		pra_tu.setLocation(250, 170);
		
		time_tu.setSize(200, 30);
		time_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		time_tu.setLocation(250, 210);
		
		JButton up_b_tu=new JButton("修改"); 
		up_b_tu.setSize(100, 45);
		up_b_tu.setBackground(Color.green);
		up_b_tu.setLocation(500, 400);
		
		JLabel pre_tu=new JLabel("修改实验:");
		pre_tu.setLocation(250, 50);
		pre_tu.setFont(new Font("仿宋", Font.BOLD, 20));
		pre_tu.setSize(125, 20);
		
		panel4.add(course_text_tu);
		panel4.add(course_tu);
		
		panel4.add(pre_tu);
		panel4.add(name_tu);
		panel4.add(pra_tu);
		panel4.add(time_tu);
		
		panel4.add(course_tu);
		panel4.add(number_tu);
		panel4.add(number_text_tu);
		panel4.add(name_text_tu);
		panel4.add(pra_text_tu);
		panel4.add(time_text_tu);
		
		panel4.add(delete_box_tu);
		panel4.add(up_b_tu);
		
		delete_box_tu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s=(String)delete_box_tu.getSelectedItem();
				try {
					ResultSet set=sta.executeQuery("select * from lab where teacher_name='"+name+"';");
					while (set.next())
					{
						if ((set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
						{
							course_text_tu.setText(set.getString("course_name"));
							name_text_tu.setText(set.getString("class_name"));
							
							pra_text_tu.setText(set.getString("lab_name"));
							time_text_tu.setSelectedItem(set.getString("lab_time"));
							
							number_text_tu.setText(set.getString("number"));
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
				try {
					
					
					ResultSet set=sta.executeQuery("select * from lab where teacher_name='"+name+"';");
					while (set.next())
					{
						if ((set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time")).equals(s))
						{
							sta.execute("delete from lab where teacher_name='"+set.getString("teacher_name")+"' and lab_name='"+
						set.getString("lab_name")+"' and lab_time='"+set.getString("lab_time")+"';");
							sta.execute("insert into lab values('"+course_text_tu.getText()+"',"
									+"'"+pra_text_tu.getText()+"','"+name+"','"
											+name_text_tu.getText()+"','"+number_text_tu.getText()+"','"
									+(String)time_text_tu.getSelectedItem()+"')");
							JOptionPane.showMessageDialog(null,"删除成功","成功",JOptionPane.PLAIN_MESSAGE);
							break;
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		database data_tu=new database();
		Statement sta_tu=data_tu.Get_Statement();
		
		move.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(true);
				
				
				
				ResultSet set=null;
				time_text_tu.removeAllItems();
				try {
					set=sta_tu.executeQuery("select * from time");
					while (set.next())
					{
						time_text_tu.addItem(set.getString("lab_time"));
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				try {
					set=sta_tu.executeQuery("select * from lab where teacher_name='"+name+"';");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				delete_box_tu.removeAllItems();
				try {
					while (set.next())
					{	
						
						delete_box_tu.addItem(set.getString("course_name")+"  "+ set.getString("lab_name")
						+"  "+set.getString("teacher_name")+"  "+set.getString("class_name")+"  "+set.getString("number")+"  "+set.getString("lab_time"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});

	}
}
