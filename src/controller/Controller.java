package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.UserList;
import view.GUIListener;
import view.View;

public class Controller implements GUIListener{
	private UserList model;
	private View gui;
	 
	public Controller(UserList ul, View vue){
		this.model=ul;
		vue.setController(this);
		this.gui=vue;
		model.addObserver(gui);
	}
	public void start(){
		gui.start();
	}
	
	@Override
	public ActionListener getAddUserListener(JTextComponent textComponent) {
		// TODO Auto-generated method stub
		
	return new A(textComponent,model);
	}
	
	public class A implements ActionListener{
		private JTextComponent tx;
		private UserList model;
		
		
		public A (JTextComponent textComponent, UserList listuser){
		
			this.tx=textComponent;
			this.model=listuser;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("hh"+tx.getText());
			this.model.addUser(tx.getText());
			
			//System.out.println(model.getData());
		}
		
	}
}
