package cc.xiaoerbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplicationMain.class, args);
        System.out.println("admin 启动");
    }

}
