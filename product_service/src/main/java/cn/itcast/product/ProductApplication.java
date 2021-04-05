package cn.itcast.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan("cn.itcast.product.entity")
//激活eurekaClient   新版本spring中这下面两个注解不写都行， EnableDiscoveryClient包含EnableEurekaClient
@EnableEurekaClient
//@EnableDiscoveryClient
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class,args);
	}
}