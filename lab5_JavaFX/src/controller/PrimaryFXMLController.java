/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author aditt
 */
public class PrimaryFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    @FXML
    TextField namefeild;
    
    
    public  void submit(){
        String name = namefeild.getText();
        System.out.println("Thank you for the Name" +name);
        
        //Alert
        Alert userAlert = new Alert(AlertType.INFORMATION);
        userAlert.setTitle("Success");
        userAlert.setHeaderText(name);
    }
}
