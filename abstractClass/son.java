package abstractClass;

public class son extends parent {

    @Override
    void carrier(String name) {
        System.out.println("i am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love " + name + " she is " + age+" years old");
    }

   

}
