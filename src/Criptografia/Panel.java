package Criptografia;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JFrame{
	static JFrame f;
	static JLabel l;
	static JTextField t1;
	static JButton b;

	public void UI() {
		f = new JFrame("panel");
		l = new JLabel("panel label");
		
		b = new JButton("criptograph");
		b.setBounds(30,50,300,30);

		JPanel p = new JPanel();
		p.setBounds(40,80,200,200);
		p.setLayout((LayoutManager) new BoxLayout(p, BoxLayout.Y_AXIS));
		p.getBackground();
		
		t1=new JTextField("text to criptograph");
		t1.setBounds(30,10, 300,30);


		
		f.add(p);
		f.add(t1);

		f.add(b);

		// add functions to button
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				enim = ENIGMA enim(t1.getText());
				result(enim.CypherTxt);
			}
		});

	    f.setSize(400, 200);  
	    f.setLayout(null);    
	    f.setVisible(true);  
	
	    f.show();
	}
	
	private void result(String result) {
		JFrame a;
		JLabel i;
		a = new JFrame("panel");
		i = new JLabel(result);
		i.setBounds(10,10,300,10);
		
		JPanel p = new JPanel();
		
		p.setBounds(40,80,200,200);
		p.setLayout((LayoutManager) new BoxLayout(p, BoxLayout.Y_AXIS));
		p.getBackground();
		
		a.add(i);
		
		a.setSize(40,90);
		a.setLayout(null);
		a.setVisible(true);

	}
}