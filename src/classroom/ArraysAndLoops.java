package classroom;

import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        //Array
        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};

        String  eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        //Print all grades
        System.out.println(Arrays.toString(grades));

        //Create empty array
        int[] emptyArray = new int[4];
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        String[] emptyName = new String[5];
        System.out.println(Arrays.toString(emptyName));
        emptyName[0] = "Darja";
        emptyName[1] = "Eduard";
        emptyName[2] = "Olivija";
        emptyName[3] = "Svetlana";
        emptyName[4] = "Dmitrij";
        System.out.println(Arrays.toString(emptyName));

        String[] names = {"Darja", "Eduard", "Olivija", "Svetlana", "Dmitrij"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        double[] emptyNum = new double[5];
        System.out.println(Arrays.toString(emptyNum));
        emptyNum[0] = 65.55;
        emptyNum[1] = 8.68;
        emptyNum[2] = 33.45;
        emptyNum[3] = 12.32;
        emptyNum[4] = 3.87;
        System.out.println(Arrays.toString(emptyNum));

        //Print numbers from 0 to 10
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        //calculate from 1 to 100
        int summa = 0;
        for (int i = 0; i <= 100 ; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        //for
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        for (String s : shoppingList) {
            System.out.println(s);
        }

        // Print from 10 till 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        // Even from 2 till 100
        //ONE LINE
        int even = 0;
        while (even <= 100) {
            System.out.print(even + " ");
            even = even + 2;
        }

        for(int i = 2; i<=100; i = i + 2){
            System.out.println(i);
        }

        //Even with IF
        for (int i = 2; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


    }
}
