package core;
import core.concepts.Car;
import core.concepts.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[]args)
    {
      System.out.println("Project started");
      // Manual object creation itself.
       /*   Car car = new Car();
        car.start(); */
        // Object creation via spring
// Container will scan config.xml & create the instance of beans defined in config file. & Same syntax will be used for constructor injection & setter-getter injection.
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        // Copying or retrieving the bean object of Car class into ref variable c1.
        //  Car c1 = container.getBean("car", Car.class);
            // or
       Car c1 = container.getBean(Car.class);
        c1.start();
    }
}
