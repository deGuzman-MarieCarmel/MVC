package newMVCpackage;

// MAIN CLASS THAT PUTS ALL THE OBJECTS IN MVC TOGETHER

public class calc_multiply {

    public static void main (String[] args){
        calc_view theView = new calc_view();
        calc_model theModel = new calc_model();
        calc_controller theController = new calc_controller(theView, theModel);
        theView.setVisible(true);
    }

}
