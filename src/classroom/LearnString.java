package classroom;

public class LearnString {
    public static void main(String[] args) {
        String name = "Darja";
        String lastName = "Zandarovica";
        System.out.println(name);
        System.out.println(lastName);

        String fullname = name + " " + lastName;
        System.out.println(fullname);

        System.out.println(name + " " + lastName);

        System.out.println(String.format("%s %s", name, lastName));

        String myFullName = String.format("%s %s", name, lastName);
        System.out.println(myFullName);

        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        String myName = "My name is Darja. ";
        String language = "I love coding in JAVA!";
        String nameLove = myName.concat(language);
        System.out.println(nameLove);

        String mName = "Edgars";
        String programmingLanguage = "Python";
        System.out.println("My name is " + mName + ", I love programming in " + programmingLanguage);

        String myNameI = "My name is Daniel,";
        String java = "I love coding in Java";

        String iLoveJava = String.format("%s %s", myNameI, java);
        System.out.println(iLoveJava);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());
    }
}
