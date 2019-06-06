public class Test{
    public static void main(String[] args){
        Basics basics = new Basics();

        basics.print1To255();
        basics.printOdd1To255();
        basics.printSum();
        int[] arr = {1,4,5,8,12};
        basics.iterateArray(arr);
        basics.findMax(arr);
        basics.getAverage(arr);
        basics.oddArray();
        basics.greaterThanY(arr, 6);
        basics.squareValues(arr);
        basics.eliminateNegatives(arr);
        basics.maxMinAverage(arr);
        basics.shiftValues(arr);
    }
}