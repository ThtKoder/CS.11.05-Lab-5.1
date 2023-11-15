
import java.lang.Math;
import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        System.out.println(array);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) Math.floor((sum / array.length) * 100) / 100;
    }

    public static int minimum(int[] array) {
        int minimum = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static int evenCount(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int[] reverseOne(int[] array) {
        int[] myArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[array.length - 1 - i];
        }
        return myArray;
    }

    public static void reverseTwo(int[] array) {

        int[] myArray = Arrays.copyOf(array, array.length);

        int ln = array.length;

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = myArray[ln - 1 - i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (str == array[i]) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            int k = array[i];
            if (i != 0) {
                str = str + ", " + k;
            } else {
                str += k;
            }
        }
        return str;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] + array[j] == num && j != i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] myArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < myArray.length; i++) {
            if (i == 0) {
                array[0] = myArray[array.length-1];
            } else {
                array[i] = myArray[i - 1];
            }
        }
    }

    public static void shiftLeft(int[] array) {
        int[] myArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray.length - 1) {
                array[myArray.length - 1] = myArray[0];
            } else {
                array[i] = myArray[i + 1];
            }
        }
        System.out.println(Arrays.toString(array) + Arrays.toString(myArray));
        //used to actually check what was going on
    }

    public static void shiftRightNTimes(int[] array, int n) {
        //loop to repeat n number of times
        for (int l = 0; l < n; l++){
            int lastIndex = array[array.length-1];
            for(int i = array.length-1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastIndex;
            //used to set the first index, as this index is a PAIN to do as part of the loop itself
            System.out.println("array being tested: " + Arrays.toString(array) + "i value:");
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        //loop to repeat n number of times
        for (int l = 0; l < n; l++) {
            int firstIndex = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length-1] = firstIndex;
            //similar to above, yet opposite function
            System.out.println("array being tested: " + Arrays.toString(array) + "i value:");
        }
    }
}

//Note: Decided to use a different kind of function for the last two, as I continuously tried triple
//looping and MULTIPLE IF-ELSE statements but got WAY to repetitive and I kept losing what I was doing