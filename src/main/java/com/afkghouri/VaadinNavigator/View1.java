package com.afkghouri.VaadinNavigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
public class View1 extends Composite implements View {

    public View1() {
        setCompositionRoot(new Label("This is view 1"));
    }

}
