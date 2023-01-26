package cn.edkso.oco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class OcoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OcoApplication.class, args);
    }

}
