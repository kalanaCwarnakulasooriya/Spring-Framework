package lk.ijse.bean;

import org.springframework.stereotype.Component;

@Component("kalana")
public class TestBean {
    public TestBean() {
        System.out.println("Test Bean Object Created");
    }
}
