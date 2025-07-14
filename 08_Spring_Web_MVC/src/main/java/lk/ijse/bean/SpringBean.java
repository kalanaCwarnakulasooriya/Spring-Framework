package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {
    public SpringBean() {
        System.out.println("Spring Bean - Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean - setBeanFactory");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean - destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Spring Bean - afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean - setApplicationContext");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean - setBeanName: " + name);
    }
}
