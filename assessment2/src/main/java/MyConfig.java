

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@EnableCaching
@ComponentScan(basePackages = {"com.assessmenttwo.controller","com.assessmenttwo.dao","com.assessmenttwo.service"})
@Configuration
public class MyConfig {}
