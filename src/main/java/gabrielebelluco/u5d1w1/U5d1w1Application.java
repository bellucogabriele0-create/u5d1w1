package gabrielebelluco.u5d1w1;

import gabrielebelluco.u5d1w1.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1w1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5d1w1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1w1Application.class);

        Toppings toppings = ctx.getBean("formaggio", Toppings.class);
        System.out.println(toppings);
    }

}
