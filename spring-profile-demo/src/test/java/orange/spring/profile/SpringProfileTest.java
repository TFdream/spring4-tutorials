package orange.spring.profile;

import orange.spring.profile.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 激活 profile 方式：
 * 1. 使用@ActiveProfiles来进行激活
 * 2. 启动时指定 -Dspring.profiles.active="production"
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
@ActiveProfiles("test")
public class SpringProfileTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testApp() {

        helloService.sayHello("ricky");
    }
}
