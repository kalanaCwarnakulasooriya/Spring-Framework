package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "lk.ijse")
@ComponentScan(basePackages = {"lk.ijse.di","lk.ijse.bean"})
public class AppConfig {
}