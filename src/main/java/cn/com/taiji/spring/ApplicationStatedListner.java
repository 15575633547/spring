package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import sun.applet.AppletEvent;
import sun.applet.AppletListener;

@Component
public class ApplicationStatedListner implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

//        ApplicationContext context = contextRefreshedEvent.getApplicationContext();
//        System.out.println(contextRefreshedEvent.getTimestamp());

//        for (String s :context.getBeanDefinitionNames()
//        ) {
//            System.out.println(s);
//        }

//        System.out.println("listner");
    }
}
