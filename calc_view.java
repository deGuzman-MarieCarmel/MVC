package newMVCpackage;

import javax.swing.*;
import java.awt.event.ActionListener;

public class calc_view extends JFrame {

    // DECLARE COMPONENTS OF FRAME
    private JTextField firstnum  = new JTextField(10);
    private JTextField secondnum = new JTextField(10);
    private JButton calcButton = new JButton("CALCULATE");
    private JTextField calcSolution = new JTextField(10);

    // SETUP COMPONENTS OF THE FRAME
    calc_view(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(firstnum);
        calcPanel.add(secondnum);
        calcPanel.add(calcButton);
        calcPanel.add(calcSolution);
        this.add(calcPanel);
    }

    // GETTERS OF VALUES
    public int getfirstnum(){
        return Integer.parseInt(firstnum.getText());
    }
    public int getsecondnum(){
        return Integer.parseInt(secondnum.getText());
    }
    public int getcalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(int solution){
        calcSolution.setText(Integer.toString(solution));
    }

    // ACTION LISTENER FOR THE BUTTON
    void addCalculateListener(ActionListener listenForCalcButton){
        calcButton.addActionListener(listenForCalcButton);
    }

    // ERROR HANDLER
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
