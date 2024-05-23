package ppg.demo.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"ppg.demo.service", "ppg.demo.mapper"})
@Import({MybatisConf.class, DatasourceConf.class})
public class SpringConfig {
}
