package lk.ijse;

import lk.ijse.bean.SpringBean;
import lk.ijse.bean.SpringBeanA;
import lk.ijse.bean.SpringBeanOne;
import lk.ijse.bean.SpringBeanTwo;
import lk.ijse.config.AppConfig;
import lk.ijse.config.AppConfig1;
import lk.ijse.config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class); // Registering the main configuration class
        context.refresh();

        /*//Configuration class 1
        SpringBeanOne springBeanOne = context.getBean(SpringBeanOne.class);
        System.out.println(springBeanOne);
        SpringBeanTwo springBeanTwo = context.getBean(SpringBeanTwo.class);
        System.out.println(springBeanTwo);

        //Configuration class 2
        SpringBeanTwo bean1 = context.getBean(SpringBeanTwo.class);
        SpringBeanTwo bean2 = context.getBean(SpringBeanTwo.class);
        System.out.println(bean1);
        System.out.println(bean2);*/

        SpringBean bean = context.getBean(SpringBean.class);

        context.registerShutdownHook();
    }
}