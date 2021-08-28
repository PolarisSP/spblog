package xin.spgraceme.spblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("xin.spgraceme.spblog.mapper")
public class SpblogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpblogApplication.class, args);
    }

}
