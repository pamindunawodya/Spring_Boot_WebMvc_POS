package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig instansiated");
    }
}
