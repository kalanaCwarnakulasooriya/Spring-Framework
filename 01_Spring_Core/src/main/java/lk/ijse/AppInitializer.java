package lk.ijse;

import lk.ijse.bean.SpringBean;
import lk.ijse.bean.SpringBean2;
import lk.ijse.bean.TestBean;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBean bean = context.getBean(SpringBean.class);
        bean.testBean();
        System.out.println(bean);

        SpringBean bean2 = context.getBean(SpringBean.class);
        bean2.testBean();
        System.out.println(bean2);

        SpringBean2 springBean = context.getBean(SpringBean2.class);
        System.out.println(springBean);

        SpringBean2 springBean2 = context.getBean(SpringBean2.class);
        System.out.println(springBean2);

        TestBean testBean = (TestBean) context.getBean("kalana");
        System.out.println(testBean);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutdown hook called");
            context.close();
        }));
    }
}