package org.gradle.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

	private ObservableList<String> items;
	
	public Model(){
		items = FXCollections.observableArrayList();
	}
	
	public boolean add(String s){
		return items.add(s);
	}
	
	public ObservableList<String> items(){
		return items.sorted();
	}
	
	
}
