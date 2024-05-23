package ppg.demo.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ppg.demo.servletComponent.MyServlet;

import java.util.ArrayList;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean<MyServlet> getServlet(MyServlet myServlet){
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(myServlet,"/bye1");
        return bean;
    }
}
