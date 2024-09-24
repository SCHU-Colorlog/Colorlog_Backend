package color_log.colorlog;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOriginPatterns("*") // 안에 해당 주소를 넣어도 됨
                .allowedHeaders("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");

    }
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/{userId}").setViewName("forward:/index.html");
    }*/


}
