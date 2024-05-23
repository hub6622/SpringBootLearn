package ppg.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ppg.demo.controller.Interceptor.IndexInterceptor;
import ppg.demo.controller.Interceptor.ProjectInterceptor;

@EnableWebMvc
@Configuration
@ComponentScan({"ppg.demo.controller", "ppg.demo.config"})
public class SpringmvcConfig implements WebMvcConfigurer {
    @Autowired
    ProjectInterceptor projectInterceptor;
    @Autowired
    IndexInterceptor indexInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books/**");
        registry.addInterceptor(indexInterceptor).addPathPatterns("/index/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/11.html").addResourceLocations("/11.html");
    }
}
