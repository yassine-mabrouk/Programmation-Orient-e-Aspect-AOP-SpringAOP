import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        aspects.ApplicationContext.login("root","1234",new String[]{"ADMIN"});

        ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
        IMetier metier=context.getBean(IMetier.class);
        metier.process();
        System.out.println(metier.compute());
    }
}
