package rs.in.jmax.predict;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${predict.server.url}", name = "predictAgeClient")
public interface PredictAgeClient {

    @GetMapping
    AgeResponse predict(@RequestParam("name") String name);

}
