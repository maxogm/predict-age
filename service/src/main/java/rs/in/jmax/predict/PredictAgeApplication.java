package rs.in.jmax.predict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PredictAgeApplication {
    public static void main(String[] args) {
        SpringApplication.run(PredictAgeApplication.class, args);
    }
}