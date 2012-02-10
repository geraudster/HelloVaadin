package com.example.hellovaadin;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class HellovaadinApplication extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Hellovaadin Application");
		HelloVaadinComposite hvc = new HelloVaadinComposite();
//		mainWindow.getContent().setSizeFull();
		mainWindow.addComponent(hvc);
		setMainWindow(mainWindow);
	}

}
