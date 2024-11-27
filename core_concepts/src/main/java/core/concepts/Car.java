package core.concepts;

import org.springframework.stereotype.Component;

//  create bean of this class through Annotation or making this class as spring component, so that Spring container create the object of this bean class or component.
@Component ("Carabc")
// or
// @Component ()
 // or
// @Component (value = "CarAbc")

public class Car {
   // Manually creating object & injecting
   // Engine myengine = new Engine();
    Engine myengine;
    // 1- Dependency injection via setter & getter

     /*  public Engine getMyengine() {
        return myengine;
    }

    public void setMyengine(Engine myengine) {
        this.myengine = myengine;
        System.out.println("Setting engine via setter & getter");
    }  */

    // 2- Dependency injection via constructor

 public Car(Engine myengine)
    {
        this.myengine = myengine;
        System.out.println("Setting engine via constructor");
    }

    public void start()
    {
        // Car can not be started before starting the engine.
   myengine.startEngine();
     System.out.println("car started");
    }


}
