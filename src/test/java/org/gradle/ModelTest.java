package org.gradle;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.gradle.model.Model;
import org.junit.Before;
import org.junit.Test;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModelTest {

	private Model model;
	
	public ModelTest(){

		model = new Model();
		model.add("Inde");
		model.add("France");
		model.add("Espagne");
		
		
	}
	
	@Test
	public void testItems() throws Exception{

		// 	Arrange
		final ObservableList<String> items = model.items();
		
		// Act 
		@SuppressWarnings("serial")
		final ObservableList<String> ordered_items = FXCollections.observableList(new ArrayList<String>(){{
			add("Espagne");
			add("France");
			add("Inde");
		}});
		
		// Assert
		assertEquals(ordered_items, items);
	}
	
	@Before
	public void doBefore(){
	
	}


}
