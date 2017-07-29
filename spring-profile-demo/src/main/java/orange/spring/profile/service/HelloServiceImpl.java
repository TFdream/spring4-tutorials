package orange.spring.profile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public void sayHello(String msg) {

        System.out.println("username="+username+", password="+password);
    }
}
