
import java.util.Random;

public class Main {
    static Person[] allPersons = new Person[100];


    public static void main(String[] args) {

        for (int j = 0; j < allPersons.length; j++) {
            String names[] = {"Max", "John", "Mike", "Nick", "Jack", "Paul"};
            Random random = new Random();
            int index = random.nextInt(names.length);
            int age = random.nextInt(55);
            int height = random.nextInt(190);
            int weight = random.nextInt(100);
            allPersons[j] = new Person(names[index], "Ivanov",age,height,weight);
        }

        for (int i = 0; i < allPersons.length; i++) {
            System.out.println(allPersons[i]);

        }
    }
}



