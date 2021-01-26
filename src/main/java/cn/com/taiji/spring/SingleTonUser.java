package cn.com.taiji.spring;

public class SingleTonUser {

    private SingleTonUser(){}

    private static SingleTonUser sinletonUser;

    private static SingleTonUser getInstance(){
        if(sinletonUser==null){
            sinletonUser=new SingleTonUser();
            return sinletonUser;
        }else{
            return sinletonUser;
        }
    }
}
