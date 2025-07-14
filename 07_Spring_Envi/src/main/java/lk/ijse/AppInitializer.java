package lk.ijse;

import lk.ijse.bean.SpringBean;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        /*Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println(key + " : " + getenv.get(key));
        }

        System.out.println("===========================================================================");

        //Access Java Environment Variables
        Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + " : " + properties.getProperty(key));
        }

        System.out.println("===========================================================================");

        String osName = System.getProperty("os.name");
        System.out.println("Operating System Name: " + osName);
        String userName = System.getProperty("user.name");
        System.out.println("User Name: " + userName);*/


        context.registerShutdownHook();
    }
}