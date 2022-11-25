/* Topic:- Event Handling

An event can be defined as changing the state of an object or behavior by performing actions. Actions can be a button click, 
cursor movement, keypress through keyboard or page scrolling, etc. 

The java.awt.event package can be used to provide various event classes. 

Flow of Event Handling
User Interaction with a component is required to generate an event.
The object of the respective event class is created automatically after event generation, and it holds all information of the event source.
The newly created object is passed to the methods of the registered listener.
The method executes and returns the result.
  
Program:-  Java program to demonstrate the event handling within the class.

output:-   Abhishek!
  
          click Here
          
Explanation:- 
Firstly extend the class with the applet and implement the respective listener.
Create Text-Field and Button components.
Registered the button component with respective event. i.e. ActionEvent by addActionListener().
In the end, implement the abstract method.
  
Code:- */
 
package company.com;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event extends Frame implements ActionListener {
    TextField textField;
    void Event() {
        textField = new TextField();         // Component Creation
        // setBounds method is used to provide
        // position and size of the component
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);
        // Registering component with listener
        button.addActionListener((ActionListener) this);    // this refers to current instance
        add(textField);    // add Components
        add(button);
        setVisible(true);    // set visibility
    }
    public void actionPerformed(ActionEvent e) {  // implementing method of actionListener
        textField.setText("Abhishek!");    // Setting text to field
    }
    public static void main(String[] args) {
        new Event();
    }
}


  

 
