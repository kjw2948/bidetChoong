package kim.bidetchoong.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final Service service;

    @GetMapping("/api/v1/test")
    public String test() {
        return service.getTest();
    }
}
