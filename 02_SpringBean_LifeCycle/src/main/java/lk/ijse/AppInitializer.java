package lk.ijse;

import lk.ijse.bean.MyConnection;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        MyConnection myConnection = context.getBean(MyConnection.class);
        System.out.println(myConnection);
        context.registerShutdownHook();
    }
}