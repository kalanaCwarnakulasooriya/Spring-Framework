package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public SpringBeanTwo(){
        System.out.println("Spring Bean Two - Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Two - setBeanFactory called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Two - setBeanName called with name: ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean Two - destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean Two - afterPropertiesSet called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean Two - setApplicationContext called");
    }
}
