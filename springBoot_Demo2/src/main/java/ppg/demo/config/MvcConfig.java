package ppg.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ppg.demo.interceptor.MyInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor interceptor;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("abc5").setViewName("abc");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/abc5");
    }

}
