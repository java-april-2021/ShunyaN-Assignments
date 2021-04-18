import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Puzzle {
    public ArrayList<Integer> greaterThanTen() {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i: arr) {
            if(i > 10){
                arrList.arr(i);
            }
        }
        return arrList;
    }

    public ArrayList<String> shuffleNames(){
        ArrayList<String> names = new ArrayList<String>();
        arr.add("Nancy");
        arr.add("Junichi");
        arr.add("Fujibayashi");
        arr.add("Momochi");
        arr.add("Ishikawa");

        Collections.shuffle(names);
        System.out.println(names);
        System.out.println();
        ArrayList<String> nameList = new ArrayList<String>();
        for(String str : names) {
            if(str.length() > 5){
                nameList.add(str);
            }
        }
        return nameList;
    }
    
    public void Alphabet(){
        ArrayList<String> alph = new ArrayList<String>();
        char a = 'a';
        for(int i = 0; i < 26; i++){
            alph.add(Character.toString(a));
            a++;
        }
        Collections.shuffle(alph);
        System.out.println(alph.get(alph.size() - 1));
        if(alph.get(0).equals("a") || alph.get(0).equals("e")|| alph.get(0).equals("i")|| alph.get(0).equals("o")|| alph.get(0).equals("u")){
            System.out.println("First Letter is a vowel" + alph);
        }
    }

    public ArrayList<Integer> randomArr() {
        ArrayList<Integer> randList = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            Integer rdm = r.nextInt(100 - 55) + 45;
            randList.add(rdm);
        }
        return randList;
    }

    public void randomSort(){
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        Random r = new Random();
        int max = -100000000;
        int min = 100000000;
        for(int i = 0; i < 10; i++){
            Integer rand = r.nextInt(100-55) + 55;
            sortList.add(rand);
        }
        Collections.sort(sortList);
        System.out.println(sortList);
        for(Integer i : sortList){
            if(Integer.compare(i,max) > 0){
                max = i;
            }
            if(Integer.compare(i,min)< 0){
                min = i;
            }
        }
        System.out.println("Minimum is: " + Integer.toString(min));
        System.out.println("Maximum is: " + Integer.toString(max));
    }

    public String randomStr(){
        ArrayList<String> str = new ArrayList<Sgtring>();
        char a = 'a';
        for(int i = 0; i <26; i++){
            str.add(Character.toString(a));
            a++;
        }
        String rdmstr = "";
        for(int i = 0; i < 5; i++){
            Collection.shuffle(str);
            rdmstr += str.get(0);
        }
        return rdmstr;
    }

    public String[] tenStr(){
        String[] arr = {randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),randStr(),};
        return arr;
    }
}