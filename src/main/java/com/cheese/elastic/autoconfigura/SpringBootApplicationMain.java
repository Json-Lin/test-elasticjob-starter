package com.cheese.elastic.autoconfigura;

import com.cheese.elastic.autoconfigure.ElasticJobAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Description: </p>
 *
 * @author JiaSonglin
 * @version V1.0, 2017年4月1日 上午9:43:16
 */
@SpringBootApplication(exclude = ElasticJobAutoConfiguration.class)
public class SpringBootApplicationMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationMain.class, args);
        System.out.println("=====================");
    }
}
