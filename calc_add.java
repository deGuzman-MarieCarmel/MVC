package newMVCpackage;

// MAIN CLASS THAT PUTS ALL THE OBJECTS IN MVC TOGETHER

public class calc_add {

    public static void main (String[] args){
        calc_view theView = new calc_view();
        calc_model2 theModel = new calc_model2();
        calc_controller2 theController = new calc_controller2(theView, theModel);
        theView.setVisible(true);
    }

}
