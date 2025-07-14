package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanOne(){
        System.out.println("Spring Bean One - Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean One - setBeanFactory called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean One - setBeanName called with name: ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean One - setApplicationContext called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One - destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean One - afterPropertiesSet called");
    }
}