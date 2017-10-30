import java.util.ArrayList;

public class BasicJava{
    public void printNums(int number){
        for (int i = 0; i < number; i++){
            System.out.println(i+1);
        }
    }
    public void printOdds(int number){
        for (int i = 0; i < number; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
    public void printSum(int number){
        int sum = 0;
        for (int i = 0; i < number; i++){
            sum += i;
            System.out.println(String.format("New number: %d, Sum: %d", i, sum));
        }
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public Integer findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public Integer getAvg(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum / array.length;
    }
    public ArrayList oddArray(int number){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < number; i++){
            if (i%2 != 0){
                y.add(i);
            }
        }
        return y;
    }
    public Integer greaterThanY(int[] array, int y){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > y){
                count++;
            }
        }
        return count;
    }
    public int[] sqrVals(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
        }
        return array;
    }
    public int[] noNeg(int[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = 0;
            }
        }
        return array;
    }
    public int[] maxMinAvg(int[] array){
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        int avg = sum / array.length;
        int[] newArr = {max, min, avg};
        return newArr;
    }
    public int[] shiftVals(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length- 1] = 0;
        return array;
    }
}