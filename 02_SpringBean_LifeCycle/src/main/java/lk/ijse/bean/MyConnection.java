package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean, BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean {
    //the state of object creation
    public MyConnection() {
        System.out.println("My Connection Constructor Called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("My Connection Bean Factory Called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My Connection Bean Name Called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My Connection Destroy Called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("My Connection After Properties Set Called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("My Connection Application Context Called");
    }
}
