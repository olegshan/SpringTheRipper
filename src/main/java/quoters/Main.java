package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Bors on 03.07.2016.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Thread.sleep(100);
//        context.getBean(quoters.Quoter.class).sayQuote();
    }
}
