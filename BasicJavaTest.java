import java.util.Arrays;

public class BasicJavaTest{
    public static void main(String[] args){
        BasicJava basic = new BasicJava();
        // basic.printNums(255);
        // basic.printOdds(255);
        // basic.printSum(25);
        int[] myArray = {1,3,5,7,9,13,1,4};
        // basic.printArray(myArray);
        // System.out.println(basic.findMax(myArray));
        // System.out.println(basic.getAvg(myArray));
        // System.out.println(basic.oddArray(255));
        // System.out.println(basic.greaterThanY(myArray, 3));
        // int[] newArr = basic.sqrVals(myArray);
        // System.out.println(Arrays.toString(newArr));
        // System.out.println(Arrays.toString(basic.noNeg(myArray)));
        // System.out.println(Arrays.toString(basic.maxMinAvg(myArray)));
        System.out.println(Arrays.toString(basic.shiftVals(myArray)));
    }
}