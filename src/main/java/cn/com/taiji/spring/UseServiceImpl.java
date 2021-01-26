package cn.com.taiji.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
//@Scope("prototype")修改为多例。默认单例
public class UseServiceImpl implements  UseService {

    @Autowired
    private UseDao usedao;

    public UseServiceImpl() {
    }

    public UseServiceImpl(UseDao usedao) {
        this.usedao = usedao;
    }

    public UseDao getUsedao() {
        return usedao;
    }

    public void setUsedao(UseDao usedao) {
        this.usedao = usedao;
    }


    public void save(){

       // usedao.dao();
        System.out.println("service save");

    }
}
