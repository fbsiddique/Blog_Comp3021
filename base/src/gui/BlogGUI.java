package gui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BlogGUI extends JFrame{

	JFrame all;
	JPanel top;
	JPanel bottom;
	JPanel buttonPanel;
	JButton refresh;
	JButton post;
	JTextArea topJTA;
	JTextField bottomJTF;
	JLabel topText;
	private int size;
	
	
	public BlogGUI()
	{
		all = new JFrame("Micro Blog");
		top = new JPanel();
		bottom = new JPanel();
		
		top.setLayout(new BorderLayout());
		bottom.setLayout(new BoxLayout(this, getDefaultCloseOperation()));
		
		topText = new JLabel("You can still input 140 Characters");
		topJTA = new JTextArea(30, 50);
		
		buttonPanel = new JPanel();
		refresh = new JButton("refresh");
		refresh.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				bottomJTF.setText("Post");
			}
		});
		buttonPanel.add(BorderLayout.WEST, refresh);
		post = new JButton("post");
		post.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				bottomJTF.setText(topJTA.getText());
			}
		});
		buttonPanel.add(BorderLayout.EAST, post);

		top.add(BorderLayout.NORTH, topText);
		top.add(BorderLayout.CENTER, topJTA);
		top.add(BorderLayout.SOUTH, buttonPanel);
		
		bottomJTF = new JTextField(50);
		bottomJTF.setColumns(30);
		
		all.add("North", top);
		all.add(bottomJTF);
		all.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		all.pack();
		all.setVisible(true);
	}
	public void setWindow() {
		JFrame mainFrame = new JFrame("Your Name");
		
		mainFrame.setSize(size,size);
		mainFrame.setVisible(true);
	}

	
	public static void main(String[] args) {
		BlogGUI blogGUi = new BlogGUI();
		
	}
	
	
}




