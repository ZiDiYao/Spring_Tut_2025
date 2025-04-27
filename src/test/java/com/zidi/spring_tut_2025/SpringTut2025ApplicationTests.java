package com.zidi.spring_tut_2025;

import com.zidi.spring_tut_2025.bean.User;
import org.apache.naming.factory.BeanFactory;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringTut2025ApplicationTests {

    @Test
    void testFirstSpringCode() {
        // 第一步： 获取 spring 容器对象
//       ApplicationContext 这个是一个接口，下面有很多个实现类。
        // ClassPathXmlApplicationContext 专门从类的根路径中加载 spring 配置文件的 一个 spring 上下文对象
        // 这一行代码只要执行：就相当于启动了 spring 容器， 解析 springhxml 文件，并且实例化所有的 bean 对象，放到 spring 容器当中
        ApplicationContext applicationConext = new ClassPathXmlApplicationContext("spring.xml");
        // 第二部： 根据spring id 在容器中获取对象
        Object uiserBean = applicationConext.getBean("userBean", User.class);
        System.out.println("Testing result" + uiserBean);

        Logger logger = LoggerFactory.getLogger(SpringTut2025Application.class);
        logger.error(() -> "wrong");
    }

}
