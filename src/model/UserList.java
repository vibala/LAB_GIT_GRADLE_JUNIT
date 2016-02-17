package model;

import java.util.List;
import java.util.Observable;
import java.util.ArrayList;

public class UserList extends Observable implements Model{
	List<String> list;
	
	public UserList(){
		list = new ArrayList<String>();
		
	}
	
	public boolean addUser(String user) {
		
		 if(list.add(user)){
			 this.setChanged();
			 this.notifyObservers();
			 return true;
		 
		 }else{
			 return false;
		 }
	}

	@Override
	public String[] getData() {
		String[] myArray = list.toArray(new String[list.size()]);
		// TODO Auto-generated method stub
		return myArray;
	}

}
