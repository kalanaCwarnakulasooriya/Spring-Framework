package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
//    public SpringBean() {}

    /*@Autowired(required = false)
    public SpringBean(@Value("kalana") String name,
                      @Value("10")int num,
                      @Value("true") boolean b){
        System.out.println("SpringBean name: " + name);
        System.out.println("SpringBean num: " + num);
        System.out.println("SpringBean b: " + b);
    }
    @Autowired(required=false)
    public SpringBean(@Value("jaya") String name, @Value("20")int num){
        System.out.println("SpringBean name: " + name);
        System.out.println("SpringBean num: " +num);
    }*/

    @Value("kalana-W")
    private String name;

    public SpringBean() {
        System.out.println(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
    }


}
