package kim.bidetchoong.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfig {

    @Bean
    @Primary
    public TestService testService() {
        return new TestService();
    }

    @Bean
    public SampleService sampleService() {
        return new SampleService();
    }
}
