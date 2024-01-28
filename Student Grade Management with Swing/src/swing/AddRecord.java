package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import functions.AddStudent;

public class AddRecord {

	public static void newRecord(){
		    JFrame f = new JFrame("Add New Record");
		    JLabel l = new JLabel("NEW RECORD");
		    l.setBounds(160,50,200,30);
		    f.add(l) ;
		
		    JTextField t1=new JTextField();  
		    t1.setBounds(150,100, 200,30);
		    JLabel l1 = new JLabel("NAME : ");
		    l1.setBounds(40,100, 200,30);
		    f.add(l1) ;
		    f.add(t1); 
		    
		    JTextField t2=new JTextField();  
		    t2.setBounds(150,150, 200,30); 
		    JLabel l2 = new JLabel("ENGLISH : ");
		    l2.setBounds(40,150, 200,30);
		    f.add(l2);
		    f.add(t2);
		    
		    JTextField t3=new JTextField();  
		    t3.setBounds(150,200, 200,30); 
		    JLabel l3 = new JLabel("MATHS : ");
		    l3.setBounds(40,200, 200,30);
		    f.add(l3) ;
		    f.add(t3) ;
		    
		    JTextField t4=new JTextField();  
		    t4.setBounds(150,250, 200,30); 
		    JLabel l4 = new JLabel("SCIENCE : ");
		    l4.setBounds(40,250, 200,30);
		    f.add(l4) ;
		    f.add(t4) ;
		    
		    JTextField t5=new JTextField();  
		    t5.setBounds(150,300, 200,30); 
		    JLabel l5 = new JLabel("SOCIAL SCIENCE : ");
		    l5.setBounds(40,300, 200,30);
		    f.add(l5) ;
		    f.add(t5) ;
		    
		    JButton b1 = new JButton("SAVE");
		    b1.setBounds(175,350,80,30);
		    f.add(b1);
		    
		    f.setSize(450,500);  
		    f.setLayout(null);  
		    f.setVisible(true);
		    
		    b1.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					String name = t1.getText();
					int English = Integer.parseInt(t2.getText());
					int Maths = Integer.parseInt(t3.getText());
					int Science = Integer.parseInt(t4.getText());
					int SocialSci = Integer.parseInt(t5.getText());
					
					AddStudent.newRecord(name, Maths, English, SocialSci,Science);
					JOptionPane.showMessageDialog(f, "New Record Added Successfully!");
					
				}
		    	
		    });
		    JButton b = new JButton("Exit");
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
					
				}
				
			});
			b.setBounds(280, 400, 80, 30 );
			f.add(b);
			
			JButton bm = new JButton("Menu");
			bm.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					Main.menuPage();
					f.dispose();
					
					
				}
				
			});
			bm.setBounds(70, 400, 80, 30 );
			f.add(bm);
	}

	

}
