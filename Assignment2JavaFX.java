/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Rutik Patel-101235165
// Harsh Patel-101243993
// Prishita Ribadia-101284685

package assignment2javafx;


import javafx.event.EventHandler;
import java.util.HashSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author rutikpatel
 */
public class Assignment2JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Assignment2"); // Creating panel to add stuff to it in different location
        ContactManager cm = new ContactManager(100);
        MyDate date = new MyDate();
        Contact contact = new Contact();
        // creatibg grid---
       GridPane grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setHgap(10); // Adding horizontal margin
       grid.setVgap(10); // Adding verticle margin
       
       grid.setPadding(new Insets(25,25,25,25));
       Scene scene = new Scene(grid,700,700);
       primaryStage.setScene(scene);
        
        // adding button
       Button addBtn = new Button("Add contact");
       grid.add(addBtn,1,1);
       
       Button editBtn = new Button("Edit contact");
       grid.add(editBtn,1,2);
       
       Button dltBtn = new Button("Delete contact");
       grid.add(dltBtn,1,3);
       
        Button viewcntctBtn = new Button("View All contact");
        grid.add(viewcntctBtn,1,4);
        
        viewcntctBtn.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent e){
            
                TextArea textArea = new TextArea();
                VBox vbox = new VBox(textArea);
                grid.add(vbox,1,10);
                textArea.setText(cm.getContactList());
                 Button cnclBtn = new Button("Cancel");
                  grid.add(cnclBtn,2,10);
     
                  cnclBtn.setOnAction(event -> {
                      primaryStage.setScene(scene);
                  });
                
        }});

        Button findBtn = new Button("FindContact");
        grid.add(findBtn,1,5);
        findBtn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent e)
            {
                primaryStage.setTitle("Find Contact");
                GridPane grid4 = new GridPane();
                grid4.setAlignment(Pos.CENTER);
                grid4.setHgap(10); // Adding horizontal margin
                grid4.setVgap(10); // Adding verticle margin
                grid4.setPadding(new Insets(25,25,25,25));
                Scene scene1 = new Scene(grid4,300,300);
                primaryStage.setScene(scene1);
                
                Label fName = new Label("First name: ");
                grid4.add(fName, 1, 1);
                TextField fNameTextField = new TextField();
                fNameTextField.setPrefColumnCount(15);
                fNameTextField.setPromptText("e.g. Rutik");
                grid4.add(fNameTextField, 2, 1);

                Label lName = new Label("Last name: ");
                grid4.add(lName, 1, 2);
                TextField lNameTextField = new TextField();
                lNameTextField.setPrefColumnCount(15);
                lNameTextField.setPromptText("e.g. Patel");
                grid4.add(lNameTextField, 2, 2);

                Button sbmtBtn = new Button("Submit");
                grid4.add(sbmtBtn,1,3);
                sbmtBtn.setOnAction(new EventHandler<ActionEvent>() 
                {
                    @Override
                    public void handle(ActionEvent e)
                    {
                        if(fNameTextField.getText().isEmpty() || lNameTextField.getText().isEmpty())
                        {
                            showAlert(Alert.AlertType.ERROR,grid4.getScene().getWindow(),"Form Error","Please enter first name or last name");
                        
                        TextArea textArea = new TextArea();
                        VBox vbox = new VBox(textArea);
                        grid4.add(vbox,1,5);
                        textArea.setText(cm.findContact(fNameTextField.getText(),lNameTextField.getText()));
                        }
                
                }});
                Button cnclBtn = new Button("Cancel");
                  grid4.add(cnclBtn,1,4);
     
                  cnclBtn.setOnAction(event -> {
                      primaryStage.setScene(scene);
                  });
                    
            }});
       
       Text actiontarget = new Text();
       grid.add(actiontarget, 0, 1);
       
       addBtn.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent e)
            {
                
                primaryStage.setTitle("Add Contact");
                GridPane grid1 = new GridPane();
                grid1.setAlignment(Pos.CENTER);
                grid1.setHgap(10); // Adding horizontal margin
                grid1.setVgap(10); // Adding verticle margin
                grid1.setPadding(new Insets(25,25,25,25));
                Scene scene1 = new Scene(grid1,700,700);
                primaryStage.setScene(scene1);
                  actiontarget.setFill(Color.FIREBRICK);
                
                  Text scenetitle = new Text("Add Contact");// creating an obj from text class
                  scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
                  grid1.add(scenetitle, 2, 2);

                  Label fName = new Label("First name: ");
                  grid1.add(fName, 1, 1);
                  TextField fNameTextField = new TextField();
                  fNameTextField.setPrefColumnCount(15);
                  fNameTextField.setPromptText("e.g. Rutik");
                  grid1.add(fNameTextField, 2, 1);

                  Label lName = new Label("Last name: ");
                  grid1.add(lName, 1, 2);
                  TextField lNameTextField = new TextField();
                  lNameTextField.setPrefColumnCount(15);
                  lNameTextField.setPromptText("e.g. Patel");
                  grid1.add(lNameTextField, 2, 2);

                  Label hPhone = new Label("Home Phone: ");
                  grid1.add(hPhone, 1, 3);
                  TextField hPhoneTextField = new TextField();
                  hPhoneTextField.setPrefColumnCount(10);
                  hPhoneTextField.setPromptText("e.g. +13794834332");
                  grid1.add(hPhoneTextField, 2, 3);

                  Label wPhone = new Label("Work Phone: ");
                  grid1.add(wPhone, 1, 4);
                  TextField wPhoneTextField = new TextField();
                  wPhoneTextField.setPrefColumnCount(10);
                  wPhoneTextField.setPromptText("e.g. +18763446337");
                  grid1.add(wPhoneTextField, 2, 4);

                  Label hAddress = new Label("Home Address: ");
                  grid1.add(hAddress, 1, 5);
                  TextField hAddressTextField = new TextField();
                  hAddressTextField.setPrefColumnCount(15);
                  hAddressTextField.setPromptText("e.g. jalaram society");
                  grid1.add(hAddressTextField, 2, 5);

                  Label email = new Label("Email: ");
                  grid1.add(email, 1, 6);
                  TextField emailTextField = new TextField();
                  emailTextField.setPrefColumnCount(15);
                  emailTextField.setPromptText("e.g. rutik@gmail.com");
                  grid1.add(emailTextField, 2, 6);

                  Label bday = new Label("Birthday: ");
                  grid1.add(bday, 1, 7);
                  TextField bYearTextField = new TextField();
                  bYearTextField.setPrefColumnCount(4);
                  bYearTextField.setPromptText("YYYY");
                  grid1.add(bYearTextField, 2, 7);

                  TextField bMonthTextField = new TextField();
                  bMonthTextField.setPrefColumnCount(2);
                  bMonthTextField.setPromptText("MM");
                  grid1.add(bMonthTextField, 3, 7);

                  TextField bdayTextField = new TextField();
                  bdayTextField.setPrefColumnCount(2);
                  bdayTextField.setPromptText("DD");
                  grid1.add(bdayTextField, 4, 7);

                  Label notes = new Label("Notes: ");
                  grid1.add(notes, 1, 8);
                  TextField notesTextField = new TextField();
                  notesTextField.setPrefColumnCount(15);
                  notesTextField.setPromptText("e.g. XYZ");
                  grid1.add(notesTextField, 2, 8);
                  
                       
                  
                  Button sbmtaddBtn = new Button("Submit");
                  grid1.add(sbmtaddBtn,2,9);
                  
                  Button cnclBtn = new Button("Cancel");
                  grid1.add(cnclBtn,2,10);
     
                  cnclBtn.setOnAction(event -> {
                      primaryStage.setScene(scene);
                  });
                  
                  sbmtaddBtn.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent e){
                      
                      if(fNameTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter your First name");
                      }
                      else if(lNameTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter Last Name");
                      }
                      else if(hPhoneTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter Home Phone");
                      }
                      else if(wPhoneTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter Work Phone");
                      }
                      else if(hAddressTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter home Address");
                      }
                      else if(emailTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter email");
                      }
                      else if(bdayTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter birth-day");
                      }
                      else if(bMonthTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter birth_month");
                      }
                      else if(bYearTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter birth-year");
                      }
                      else if(notesTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid1.getScene().getWindow(),"Form Error","Please enter notes");
                      }
                      else
                      {
                        int day = Integer.parseInt(bdayTextField.getText());
                        int month = Integer.parseInt(bMonthTextField.getText());
                        int year = Integer.parseInt(bYearTextField.getText());
                        date.setDay(day);
                        date.setMonth(month);
                        date.setYear(year);
                        
                        showAlert(Alert.AlertType.INFORMATION,grid1.getScene().getWindow(),"Done","Contact added successfully");
                        cm.addContact(fNameTextField.getText(),lNameTextField.getText(),hPhoneTextField.getText(),wPhoneTextField.getText(),hAddressTextField.getText(),emailTextField.getText(),date,notesTextField.getText());
                        actiontarget.setText(cm.getContactList());
                      }
                }});       
                  
            }});
       
            dltBtn.setOnAction((ActionEvent e) -> {
           primaryStage.setTitle("Delete Contact");
           GridPane grid2 = new GridPane();
           grid2.setAlignment(Pos.CENTER);
           grid2.setHgap(10); // Adding horizontal margin
           grid2.setVgap(10); // Adding verticle margin
           grid2.setPadding(new Insets(25,25,25,25));
           Scene scene2 = new Scene(grid2,350,275);
           primaryStage.setScene(scene2);
           
           Label hPhone = new Label("Enter Home Phone number: ");
           grid2.add(hPhone, 1, 8);
           TextField hPhoneTextField = new TextField();
           hPhoneTextField.setPrefColumnCount(15);
           hPhoneTextField.setPromptText("Enter numeric only ");
           grid2.add(hPhoneTextField, 2, 8);
           
           Button sbmtdltBtn = new Button("Submit");
           grid2.add(sbmtdltBtn,2,9);
           
                    Button cnclBtn = new Button("Cancel");
                  grid2.add(cnclBtn,2,10);
                  
                  cnclBtn.setOnAction(event -> {
                      primaryStage.setScene(scene);
                  });
           sbmtdltBtn.setOnAction(new EventHandler<ActionEvent>(){
               @Override
               public void handle(ActionEvent e){
                   if(hPhoneTextField.getText().isEmpty())
                   {
                       showAlert(Alert.AlertType.ERROR,grid2.getScene().getWindow(),"Form Error","Please enter home Phone number");
                   }
                   else
                   {
                       cm.deleteContact(hPhoneTextField.getText());
                       showAlert(Alert.AlertType.INFORMATION,grid2.getScene().getWindow(),"Done","Contact deleted successfully");
                   }
               }});
        });
       
       editBtn.setOnAction(new EventHandler<ActionEvent>() 
       {
            @Override
            public void handle(ActionEvent e)
            {
                
                primaryStage.setTitle("Edit Contact");
                GridPane grid3 = new GridPane();
                grid3.setAlignment(Pos.CENTER);
                grid3.setHgap(10); // Adding horizontal margin
                grid3.setVgap(10); // Adding verticle margin
                grid3.setPadding(new Insets(25,25,25,25));
                Scene scene1 = new Scene(grid3,700,700);
                primaryStage.setScene(scene1);
                  actiontarget.setFill(Color.FIREBRICK);
                
                  Text scenetitle = new Text("Add Contact");// creating an obj from text class
                  scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
                  grid3.add(scenetitle, 2, 2);

                  Label fName = new Label("First name: ");
                  grid3.add(fName, 1, 1);
                  TextField fNameTextField = new TextField();
                  fNameTextField.setPrefColumnCount(15);
                  fNameTextField.setPromptText("e.g. Rutik");
                  grid3.add(fNameTextField, 2, 1);

                  Label lName = new Label("Last name: ");
                  grid3.add(lName, 1, 2);
                  TextField lNameTextField = new TextField();
                  lNameTextField.setPrefColumnCount(15);
                  lNameTextField.setPromptText("e.g. Patel");
                  grid3.add(lNameTextField, 2, 2);

                  Label hPhone = new Label("Home Phone: ");
                  grid3.add(hPhone, 1, 3);
                  TextField hPhoneTextField = new TextField();
                  hPhoneTextField.setPrefColumnCount(10);
                  hPhoneTextField.setPromptText("e.g. +13794834332");
                  grid3.add(hPhoneTextField, 2, 3);

                  Label wPhone = new Label("Work Phone: ");
                  grid3.add(wPhone, 1, 4);
                  TextField wPhoneTextField = new TextField();
                  wPhoneTextField.setPrefColumnCount(10);
                  wPhoneTextField.setPromptText("e.g. +18763446337");
                  grid3.add(wPhoneTextField, 2, 4);

                  Label hAddress = new Label("Home Address: ");
                  grid3.add(hAddress, 1, 5);
                  TextField hAddressTextField = new TextField();
                  hAddressTextField.setPrefColumnCount(15);
                  hAddressTextField.setPromptText("e.g. jalaram society");
                  grid3.add(hAddressTextField, 2, 5);

                  Label email = new Label("Email: ");
                  grid3.add(email, 1, 6);
                  TextField emailTextField = new TextField();
                  emailTextField.setPrefColumnCount(15);
                  emailTextField.setPromptText("e.g. rutik@gmail.com");
                  grid3.add(emailTextField, 2, 6);

                  Label bday = new Label("Birthday: ");
                  grid3.add(bday, 1, 7);
                  TextField bYearTextField = new TextField();
                  bYearTextField.setPrefColumnCount(4);
                  bYearTextField.setPromptText("YYYY");
                  grid3.add(bYearTextField, 2, 7);

                  TextField bMonthTextField = new TextField();
                  bMonthTextField.setPrefColumnCount(2);
                  bMonthTextField.setPromptText("MM");
                  grid3.add(bMonthTextField, 3, 7);

                  TextField bdayTextField = new TextField();
                  bdayTextField.setPrefColumnCount(2);
                  bdayTextField.setPromptText("DD");
                  grid3.add(bdayTextField, 4, 7);

                  Label notes = new Label("Notes: ");
                  grid3.add(notes, 1, 8);
                  TextField notesTextField = new TextField();
                  notesTextField.setPrefColumnCount(15);
                  notesTextField.setPromptText("e.g. XYZ");
                  grid3.add(notesTextField, 2, 8);
                  
                       
                  
                  Button sbmteditBtn = new Button("Submit");
                  grid3.add(sbmteditBtn,2,9);
                  Button cnclBtn = new Button("Cancel");
                  grid3.add(cnclBtn,2,10);
                  
                  cnclBtn.setOnAction(event -> {
                      primaryStage.setScene(scene);
                  });
                  sbmteditBtn.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent e){
                      
                      if(fNameTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter your First name");
                      }
                      else if(lNameTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter Last Name");
                      }
                      else if(hPhoneTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter Home Phone");
                      }
                      else if(wPhoneTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter Work Phone");
                      }
                      else if(hAddressTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter home Address");
                      }
                      else if(emailTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter email");
                      }
                      else if(bdayTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter birth-day");
                      }
                      else if(bMonthTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter birth_month");
                      }
                      else if(bYearTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter birth-year");
                      }                     
                      else if(notesTextField.getText().isEmpty())
                      {
                        showAlert(Alert.AlertType.ERROR,grid3.getScene().getWindow(),"Form Error","Please enter notes");
                      }
                      else
                      {
                        int day = Integer.parseInt(bdayTextField.getText());
                        int month = Integer.parseInt(bMonthTextField.getText());
                        int year = Integer.parseInt(bYearTextField.getText());
                        date.setDay(day);
                        date.setMonth(month);
                        date.setYear(year);
                        
                        showAlert(Alert.AlertType.INFORMATION,grid3.getScene().getWindow(),"Done","Contact Edited successfully");
                        cm.editContact(fNameTextField.getText(),lNameTextField.getText(),hPhoneTextField.getText(),wPhoneTextField.getText(),hAddressTextField.getText(),emailTextField.getText(),day,month,year,notesTextField.getText());
                        actiontarget.setText(cm.getContactList());

                      }
                }});       
                  
            }});
       
       primaryStage.show(); 
}   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public void showAlert(Alert.AlertType alertType, Window owner, String title, String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    
}
