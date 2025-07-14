package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${user.name}")
    private String userName;

    @Value("${db.name}")
    private String dbname;

    @Value("${db.user}")
    private String dbuser;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Operating System Name: " + osName);
        System.out.println("User Name: " + userName);
        System.out.println("Database Name: " + dbname);
        System.out.println("Database User: " + dbuser);
    }
}
