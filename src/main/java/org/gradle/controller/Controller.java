package org.gradle.controller;
import org.gradle.model.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ListView;

public class Controller {
	private Model userList;
	
    @FXML
    private ListView<String> tf_List_View;
    
    @FXML
    private void initialize(){
    	userList= new Model();
    	userList.add("Vignesh");
    	userList.add("Vincent");
    	userList.add("Fauberteau");
    	tf_List_View.setItems(userList.items());
    
    }
}
