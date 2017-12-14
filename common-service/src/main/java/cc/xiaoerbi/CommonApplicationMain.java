package cc.xiaoerbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(CommonApplicationMain.class, args);
        System.out.println("common 启动");
    }

}
