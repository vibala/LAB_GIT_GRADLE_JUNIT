package view;

import java.util.Observer;

public interface View extends Observer {
	void setController(GUIListener controller);
	void start();
}
