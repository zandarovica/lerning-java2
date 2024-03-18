package classroom;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44, 20));
        printTextMultipleTimes("I Love You", 10);
        String[] shop = {"Banana, Milk, Bread, Cucumber"};
        printAllValuesFromStringArray(shop);
        System.out.println(isEven(5));

        int[] numbers = {2, 5, 8, 6, 9};
        int arraySum = printSumOfArrayNumbers(numbers);
        System.out.println(arraySum);


    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    //Task: create method that receives String array and print all values
    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    //Task: Create methd that will return true of number is even or false is odd
    public static boolean isEven(int number) {
//        boolean result = number % 2 == 0;
//        return result;
        return number % 2 ==0;
    }

    //Task: Create method that accepted int array and return sum of number
    private static int printSumOfArrayNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }
}
