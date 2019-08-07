import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Adam","Tom",12,19.02);
        Person p2 = new Person("Piotr","Tom",23,111.99);
        Person p3 = new Person("Adam","Proc",9,9.99);
        Person p4 = new Person("Szymon","Szkuta",60,2.20);
        Person p5 = new Person("Szymon","Seweryn",49,0.99);
        Person p6 = new Person("Kacper","Nowakowski",12,12.04);
        Person p7 = new Person("Janusz","Nowakowski",1,600.0);
        Person p8 = new Person("Daniel","Kłusek",50,2.20);
        Person p9 = new Person("Piotr","Białek",5,19.02);

        List<Person> list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);

        list.stream().sorted().forEach(System.out::println);

        System.out.println("==============================");

        list.stream().sorted((o1,o2) -> {
            int comp = Double.compare(o1.getCena(), o2.getCena());
            if(comp == 0){
                comp = Integer.compare(o1.getWiek(), o2.getWiek());
            }
            return  comp;
        }).forEach(System.out::println);
    }
}
