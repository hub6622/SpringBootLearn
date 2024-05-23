package ppg.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import ppg.demo.controller.Interceptor.IndexInterceptor;
import ppg.demo.controller.Interceptor.ProjectInterceptor;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    ProjectInterceptor projectInterceptor;
    @Autowired
    IndexInterceptor indexInterceptor;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books/**");
        registry.addInterceptor(indexInterceptor).addPathPatterns("/index/**");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/11.html").addResourceLocations("/11.html");
    }
}
