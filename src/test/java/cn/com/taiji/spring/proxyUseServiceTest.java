package cn.com.taiji.spring;

import org.junit.Test;

public class proxyUseServiceTest {


    @Test
    public  void testProxyUseService() {
        ProxyUseService proxyUseService = new ProxyUseService(new UseServiceImpl());
             // proxyUseService.save();
    }

@Test
    public void testProxyUseServicejdk(){
        ProxyUseServiceJdk proxyUseServiceJdk = new ProxyUseServiceJdk(new UseServiceImpl());
       UseService useService = (UseService) proxyUseServiceJdk.getProxy();
       useService.save();
}

    }

