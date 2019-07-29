package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Init, destroy method work
 */

public class TestSpring {
    public static void main(String[] args) {
        // Get app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic music = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(music.getSong());
        context.close();
    }
}
