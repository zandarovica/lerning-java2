package classroom;

public class PlayWithObjects {
    public static void main(String[] args) {

        Animal luna = new Animal();
        luna.setName("Luna");
        luna.setAge(3);
        luna.setColour("Peach");
        System.out.println(luna.getName());
        System.out.println(luna);
        luna.walk();
        luna.eat();

        Animal sheba = new Animal();
        sheba.setName("Sheba");
        sheba.setAge(6);
        sheba.setColour("Gray");
        System.out.println(sheba.getName());
        System.out.println(sheba);
        sheba.walk();
        sheba.eat();

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(1);
        leo.setColour("Orange");
        System.out.println(leo.getName());

        System.out.println(luna);
        System.out.println(leo);

        luna.walk();
        leo.walk();

        luna.walk();
        leo.eat();

        //Create 2 object


    }
}
