package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("lk.ijse.bean")
@Import({AppConfig1.class,AppConfig2.class})
//if config file in the root folder
//@ImportResource("classpath:hibernate.cfg.xml")
//if not in the root
//@ImportResource("file:absolute-path-of-hibernate.cfg.xml")
public class AppConfig {
}