public class DataTypes {
    public static void main(String[] args) {
        int numbersOfStudents = 30;
        int maxScore = 100;
        System.out.println(numbersOfStudents);
        System.out.println(maxScore);

        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //casting/okruglenie
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        char symbol = '$';
        System.out.println(symbol);

        char d = 68;
        char a = 97;
        char r = 114;
        char j = 106;
        System.out.println(d);
        System.out.println(a);
        System.out.println(r);
        System.out.println(j);
        System.out.println(a);

        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
