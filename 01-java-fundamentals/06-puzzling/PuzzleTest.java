import java.util.Arrays;

public class PuzzleTest{
    public static void main(String[] args){
        Puzzle test = new Puzzle();
        System.out.println(test.greaterThanTen());
        System.out.println(test.shuffleNames());
        test.Alphabet();
        System.out.println(test.randomArr());
        test.randomSort();
        System.out.println(test.randomStr());
        System.out.println(Arrays.toString(test.tenStr()));
    }
}