package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface{

    //property injection
//    @Autowired
//    DI test1;
//
//    public Test2(){
//        System.out.println("Test 2 Constructor Called");
//    }
//
//    public void calledHello(){
//        test1.sayHello();
//    }

    //constructor through injection
//    DI test1;
//
//    @Autowired //Awashyama ne
//    public Test2(DI t1) {
//        this.test1 = t1;
//    }
//
//    public void calledHello(){
//        test1.sayHello();
//    }

    //Setter injection
//    DI test1;
//
//    @Autowired
//    public void setTest1(DI t1){
//        this.test1 = t1;
//    }
//
//    public void calledHello(){
//        test1.sayHello();
//    }

    //Interface injection

    DI test1;

    @Autowired
    @Override
    public void inject(DI di) {
        this.test1 = di;
    }

    public void calledHello(){
        test1.sayHello();
    }
}
