package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    //Property Injection
//    Girl1 girl = new Girl1();
//
//    public void chatWithGirl(){
//        girl.chat();
//    }

    //Constructor Through Injection
//    Girl1 girl;
//    public Boy(Girl1 girl){
//        this.girl = girl;
//    }
//
//    public void chatWithGirl(){
//        Boy boy = new Boy(new Girl1());
//        girl.chat();
//    }

    //Setter Injection
//    Girl1 girl;
//    public void setGirl(Girl1 girl){
//        this.girl = girl;
//    }
//
//    public void chatWithGirl(){
//        Boy boy = new Boy();
//        boy.setGirl(girl);
//        girl.chat();
//    }

    @Autowired
    @Qualifier("girl2")
    Agreement girl;

    public Boy(){
        System.out.println("Boy Constructor Called");
    }

    public void chatWithGirl(){
        girl.chat();
    }
}

