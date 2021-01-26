package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@Configuration
@ComponentScan("cn.com.taiji.spring")
public class AppConfig {
//    @Bean
//    public UseService userService(){
//        return new UseService();
//    }
//
//    @Bean
//    public UseDao userDao(){
//        return new UseDao();
//    }

    @EventListener
    public void refeshListner(ContextRefreshedEvent event){
        System.out.println(event.getTimestamp());
        ApplicationContext context = event.getApplicationContext();
        for (String s :context.getBeanDefinitionNames()
        ) {
            System.out.println(s);
        }
    }
}
