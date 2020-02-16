package newMVCpackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// THIS CONTROLLER IS THE MIDDLE MAN BETWEEN THE CALC_VIEW AND CALC_MODEL

public class calc_controller {

    //SPECIFY WHICH VIEW AND MODEL IT WILL HANDLE
    private calc_view theView;
    private calc_model theModel;

    public calc_controller(calc_view theView, calc_model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int firstnum, secondnum = 0;
            try{
                firstnum = theView.getfirstnum();
                secondnum = theView.getsecondnum();
                theModel.multiply_numbers(firstnum, secondnum);
                theView.setCalcSolution(theModel.getCalcValue());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You need to enter 2 integers");
            }
        }
    }

}
