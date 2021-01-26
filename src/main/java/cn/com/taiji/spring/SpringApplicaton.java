package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class SpringApplicaton {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cn.com.taiji.spring");
        context.register(AppConfig.class);
      //  context.addApplicationListener( new ApplicationStatedListner());
       //  context.refresh();
//         for (String s :context.getBeanDefinitionNames()
//             ) {
//            System.out.println(s);
//        }

        //spring 默认类为单例，
//        UseService useService = context.getBean(UseService.class);
//        UseService useService1 = context.getBean(UseService.class);
//        System.out.println(useService);
//        System.out.println(useService1);

 }
}
