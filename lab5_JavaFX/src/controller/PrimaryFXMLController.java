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
    private TextField namefeild;
    @FXML
    private TextField agefield;
    @FXML
    private TextField emailField;
    
    
    @FXML
    public void submit() {
        try {
            // Check if fields are null (debugging)
            if (namefeild == null || agefield == null || emailField == null) {
                throw new IllegalStateException("One or more fields are not initialized.");
            }

            String name = namefeild.getText();
            String age = agefield.getText();
            String email = emailField.getText();

            // Validate input
            if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
                throw new IllegalArgumentException("Please fill in all fields.");
            }

            // Display the details in an alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Registration Details");
            alert.setHeaderText("Thank you for registering!");
            alert.setContentText("Name: " + name + "\nAge: " + age + "\nEmail: " + email);
            alert.showAndWait();
        } catch (Exception e) {
            // Handle exceptions (e.g., show an error alert)
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText("An error occurred");
            errorAlert.setContentText(e.getMessage());
            errorAlert.showAndWait();
        }
    }
}
