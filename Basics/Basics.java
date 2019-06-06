import java.util.ArrayList;

public class Basics{

    public void print1To255(){
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void printOdd1To255(){
        for(int i = 1; i < 256; i+=2){
            System.out.println(i);
        }
    }

    public void printSum(){
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public Integer findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public Integer getAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int avg = sum / arr.length;
        return avg;
    }

    public ArrayList oddArray(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i < 256; i+=2){
            arr.add(i);
        }
        return arr;
    }

    public Integer greaterThanY(int[] arr, int Y){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > Y){
                count++;
            }
        }
        return count;
    }

    public int[] squareValues(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i]^2;
        }
        return arr;
    }

    public int[] eliminateNegatives(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }

    public int[] maxMinAverage(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        int[] newArr = { max, min, avg };
        return newArr;
    }

    public int[] shiftValues(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }
}