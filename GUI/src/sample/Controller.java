package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    Float x1 = 0f;
    String operator = "";

    //Buttons
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button0;
    @FXML
    private Button decimal;

    //Display
    @FXML
    private TextField display;
    @FXML
    private Button equal;
    @FXML
    private Button C;

    //Operators
    @FXML
    private Button mulitply;
    @FXML
    private Button divide;
    @FXML
    private Button plus;
    @FXML
    private Button subtract;


    @FXML
    public void LabelChanger(ActionEvent event) {
        if(event.getSource() == button1){
            display.setText(display.getText() + "1");
        }
        else if(event.getSource() == button2){
            display.setText(display.getText() + "2");
        }
        else if(event.getSource() == button3){
            display.setText(display.getText() + "3");
        }
        else if(event.getSource() == button4){
            display.setText(display.getText() + "4");
        }
        else if(event.getSource() == button5){
            display.setText(display.getText() + "5");
        }
        else if(event.getSource() == button6){
            display.setText(display.getText() + "6");
        }
        else if(event.getSource() == button7){
            display.setText(display.getText() + "7");
        }
        else if(event.getSource() == button8){
            display.setText(display.getText() + "8");
        }
        else if(event.getSource() == button9){
            display.setText(display.getText() + "9");
        }
        else if(event.getSource() == button0){
            display.setText(display.getText() + "0");
        }
        else if(event.getSource() == decimal){
            display.setText(display.getText() + ".");
        }
        else if(event.getSource() == C){
            display.setText("");
        }
        else if(event.getSource() == plus){
            x1 = Float.parseFloat(display.getText());
            operator = "+";
            display.setText("");
        }
        else if(event.getSource() == subtract){
            x1 = Float.parseFloat(display.getText());
            operator = "-";
            display.setText("");
        }
        else if(event.getSource() == mulitply){
            x1 = Float.parseFloat(display.getText());
            operator = "X";
            display.setText("");
        }
        else if(event.getSource() == divide){
            x1 = Float.parseFloat(display.getText());
            operator = "/";
            display.setText("");
        }

        else if(event.getSource() == equal){
            Float secondOperand = Float.parseFloat(display.getText());
            if(operator=="+"){
                Float ans = x1 + secondOperand;
                display.setText(String.valueOf(ans));
            }
            else if(operator=="-"){
                Float ans = x1 - secondOperand;
                display.setText(String.valueOf(ans));
            }
            else if(operator=="X"){
                Float ans = x1 * secondOperand;
                display.setText(String.valueOf(ans));
            }
            else if(operator=="/"){
                Float ans = x1 / secondOperand;
                display.setText(String.valueOf(ans));
            }
        }
    }

}
