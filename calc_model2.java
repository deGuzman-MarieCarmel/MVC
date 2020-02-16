package newMVCpackage;

public class calc_model2 {

    private int calcValue;

    // PERFORMS CALCULATIONS
    public void add_numbers(int firstnum, int secondnum){
        calcValue = firstnum + secondnum;
    }

    // RETURNS THE RESULT
    public int getCalcValue(){
        return calcValue;
    }

}
