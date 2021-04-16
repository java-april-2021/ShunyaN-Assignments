// import java.util.Arrays;
public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava ans = new BasicJava();
        int [] arr = {1,3,5,7,9,11};
        int [] array = {1,5,10,-2};
        int y = 8;
        ans.OneTo255();
        ans.PrintOdds();
        ans.PrintSum();
        ans.LoopArray(arr);
        ans.FindMax(arr);
        System.out.println(ans.GetAverage(arr));
        System.out.println(ans.OddArray());
        System.out.println(ans.GreaterThanY(arr, y));
        System.out.println(ans.SquareArray(arr));
        System.out.println(ans.EliminateNegative(array));
        System.out.println(ans.MaxMinAverage(array));
        System.out.println(ans.ShiftArrayValues(array));    }
}