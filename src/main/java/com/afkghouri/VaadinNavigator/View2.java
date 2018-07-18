package com.afkghouri.VaadinNavigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
public class View2 extends VerticalLayout implements View {

    public View2() {
     //   setCompositionRoot(new Label("This is view 1"));
        TextField textField_category = new TextField("enter category");
        Button button_submit = new Button("Add");

       
        addComponents(textField_category,button_submit);
    }
}
