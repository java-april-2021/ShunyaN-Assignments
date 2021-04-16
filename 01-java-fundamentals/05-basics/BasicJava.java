import java.util.ArrayList;
import java.util.Arrays;
public class BasicJava {
    //print 1-255
    public static void OneTo255() {
        for(int i = 1; i<=255; i++){
            System.out.println("Count is" + i);
        }
    }
    //print odd numbers 1-255
    public static void PrintOdds() {
        for(int i = 1; i <= 255; i++) {
            if(i % 2 == 1)
                System.out.println("Count is" + i);
        }
    }

    //Print Sum 0-255
    public static int GetArraySum(int[] numbers) {
        int sum = 0;
        for(int i = 0; i <= numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static void PrintSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += 1;
            System.out.println(String.format("New number: %d, Sum: %d",i, sum));
        }
    }

    // iterating through an array
    public static void LoopArray(int[] arr) {
        for(int val: arr)
            System.out.println(val);
    }

    // find Max
    public void FindMax(int[] arr) {
        int max = arr[0];
        for(int val: arr){
            if(val > max)
                max = val;
        }
        System.out.println(max);
    }

    // //find Min
    // public static int FindMin(int[] arr) {
    //     for(int val:arr){
    //         if(val < currMin)
    //             currMin = val;
    //     }
    //     return currMin;
    // }   

    //get Avg
    public double GetAverage(int[] arr) {
        double sum = 0;
        for(int val: arr) {
            sum += val;
        }
        double avg = sum/arr.length;
        return avg;
    }

    //Arry with odd numbers
    public ArrayList<Integer> OddArray() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++) {
            if(i % 2 == 1)
                nums.add(i);
        }
        return nums;
    }

    //Greater than Y
    public int GreaterThanY(int[] arr, int y) {
        int count = 0;
        for(int num: arr) {
            if(num > y)
                count++;
        }
        return count;
    }

    // square the values
    public String SquareArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return Arrays.toString(arr);
    }

    //Eliminate Negative Numbers
    public String EliminateNegative(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0)
                arr[i] = 0;
        }
        return Arrays.toString(arr);
    }

    //Max, Min, Avg
    public String MaxMinAverage(int[] arr) {
        double min = (double)arr[0];
        double max = (double)arr[0];
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        double avg = sum/arr.length;
        double[] result = {max, min, avg};
        return Arrays.toString(result);
    }

    //shifting the values in the array
    public String ShiftArrayValues(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        return Arrays.toString(arr);
    }
}