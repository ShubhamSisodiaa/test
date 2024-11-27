package core.concepts;
import org.springframework.stereotype.Component;
//  create bean of this class through Annotation or making this class as spring component, so that Spring container create the object of this bean class or component.
@Component
public class Engine {
    public void startEngine()
    {
        System.out.println("Engine started");


    }
}
