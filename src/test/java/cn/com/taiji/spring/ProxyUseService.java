package cn.com.taiji.spring;

import java.util.Date;

public class ProxyUseService implements UseService{

    private UseService useService;
    public ProxyUseService(UseService useService){
        this.useService = useService;
    }

    @Override
    public void save() {
        Date start = new Date();
        System.out.println("before");
        useService.save();
        System.out.println("after");
        Date end = new Date();
        System.out.println("执行时间："+(end.getTime()-start.getTime()));
    }


}
