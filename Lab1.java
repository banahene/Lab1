import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        System.out.println(reverse("Who the hell do you think you are?"));
    }

    //-------------------------------QUESTION 1-------------------------------
    public static int stringLength(String input){
        int strLength = input.length();
        return strLength;
    }
    //------------------------------END OF QUESTION 1---------------------------------




    //------------------------------QUESTION 2-------------------------------
    public static String reverse(String word){
        //use scanner object to decompose string into single words
        Scanner words = new Scanner(word).useDelimiter(" ");
        //create StringBuilder to accumulate reversed sentence
        StringBuilder reversed = new StringBuilder();

        //create temporary char array that will be used to reverse each word
        char[] temp;
        while (words.hasNext()){
            temp = words.next().toCharArray();
            //reverse the character array
            reverseCharArray(temp);
            //append to stringBuilder with whitespace
            reversed.append(temp);
            reversed.append(' ');
        }
        //return sentence with words reversed as string
        return reversed.toString();
    }

    //------------------------------Utility Methods for Question 2-----------------------------
    //recursive method that reverses Array
    private static void reverseCharArray(char[] array){
        reverseCharArray(array, 0, array.length - 1);
    }

    private static void reverseCharArray(char[] array, int start, int end){
        if (end > start){               //recursion ends when end and start become equal or end becomes greater
            //temporarily store value at start
            char temp = array[start];
            //swap value of start and end
            array[start] = array[end];
            array[end] = temp;
            //continue recursive call (progress start and reduce end to move towards center of the array)
            reverseCharArray(array, start + 1, end - 1);
        }
    }
    //-----------------------------END OF QUESTION 2----------------------------------




    //----------------------------QUESTION 3----------------------------------
    public static double Area(float radius){
        return ((22/7) * Math.pow(radius, 2));
    }

    public static double Circumference(float radius){
        return 2 * (22/7) * radius;
    }
}
