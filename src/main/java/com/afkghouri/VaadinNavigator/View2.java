package com.afkghouri.VaadinNavigator;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
 
public class View2 extends VerticalLayout implements View {

    public View2() { 
     //   setCompositionRoot(new Label("This is view 1"));
        TextField textField_category = new TextField("enter category");
        Button button_submit = new Button("Add"); 
       
        addComponents(textField_category,button_submit);
        
        Button button = new Button("Go to View1 with parameter",
                new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	UI.getCurrent().getNavigator().navigateTo("view1"+"/"+"param1"); 
            }
        });
        addComponent(button);
    }
    
    @Override
    public void enter(ViewChangeEvent event) {
        Notification.show("Welcome to the View2");
    }
}
