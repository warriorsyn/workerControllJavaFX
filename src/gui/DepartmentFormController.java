package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

		
	@FXML 
	private TextField txtId;
	
	@FXML 
	private TextField txtName;

	@FXML 
	private Button successBtn;
	
	@FXML
	private Button cancelBtn;
	
	@FXML
	private Label labelErrorName;
	
	@FXML 
	public void onSuccessBtn() {
		System.out.println("SAVE");
	}
	
	@FXML 
	public void onCancelBtn() {
		System.out.println("Cancel");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializeNodes();
		
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 20);
		
	}
	
}
