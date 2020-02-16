package newMVCpackage;

public class calc_model {

    private int calcValue;

    // PERFORMS CALCULATIONS
    public void multiply_numbers(int firstnum, int secondnum){
        calcValue = firstnum * secondnum;
    }

    // RETURNS THE RESULT
    public int getCalcValue(){
        return calcValue;
    }
}
