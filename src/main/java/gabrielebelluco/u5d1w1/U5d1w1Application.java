package gabrielebelluco.u5d1w1;

import gabrielebelluco.u5d1w1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication

public class U5d1w1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5d1w1Application.class, args);


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1w1Application.class);

        Menu menu = ctx.getBean("menu", Menu.class);
        menu.printMenu();
        ctx.close();

// HO AVUTO UN PROBLEMA CON IL MAIN SE FACCIO RUNNARE CON IL MAIN VISTO A LEZIONE ALLORA MI DARà UN ERRORE DEL TIPO:

//Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name
// 'springApplicationAdminRegistrar' defined in class path resource [org/springframework/boot/autoconfigure/admin/SpringApplicationAdminJmxAutoConfiguration.class]: org.springframework.boot:type=Admin,name=SpringApplication
//
// Caused by: javax.management.InstanceAlreadyExistsException: org.springframework.boot:type=Admin,name=SpringApplication

//    POI HO TROVATO QUESTA SOLUZIONE E VA MA NON CAPISCO PERCHè UNA SI E L'ALTRA NO. SUCCESSIVAMENTE HO RIPROVATO COMENTANDO SpringApplication.run(U5d1w1Application.class, args)
// ED HA FUNZIONATO, MA NON CON UN CODICE DEL TIPO:
//      SpringApplication.run(U5D1Application.class, args);
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D1Application.class);
//		Menu m = (Menu) ctx.getBean("menu");
//		m.printMenu();
//		ctx.close();
//	}
    }

}
//     ApplicationContext ctx = SpringApplication.run(U5d1w1Application.class, args);
//
//
//        Menu menu = (Menu) ctx.getBean("menu");
//        menu.printMenu();
//        System.out.println(menu);
//        SpringApplication.run(U5d1w1Application.class, args);
/// /
//