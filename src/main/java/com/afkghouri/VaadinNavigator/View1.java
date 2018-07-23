package com.afkghouri.VaadinNavigator;
import com.vaadin.navigator.View;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
//@SpringView(name = "view1")
public class View1 extends Composite implements View {

    public View1() {
        setCompositionRoot(new Label("This is view 1"));
    }
    
    @Override
    public void enter(ViewChangeEvent event) {
        Notification.show("Welcome to the View1"); 
            if (event.getParameters() == null
                || event.getParameters().isEmpty()) { 
                return;
            } else
            	 Notification.show("Welcome to the View1: "+event.getParameters());  
        
    }

}
