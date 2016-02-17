package view;

import java.awt.event.ActionListener;
import java.util.Observable;

import controller.Controller;
import model.Model;

public abstract class AbstractView implements View {
	private Controller controller;
	private Model model;
	
	public AbstractView(Model m){
		this.model=m;
	}
	
	protected final Model getModel() {
		return model;
	}
	protected final GUIListener getController(){
		return controller;
	}
	
	@Override
	public void setController(GUIListener ctrl) {
		// TODO Auto-generated method stub
		this.controller=(Controller) ctrl;
	}
	

}
