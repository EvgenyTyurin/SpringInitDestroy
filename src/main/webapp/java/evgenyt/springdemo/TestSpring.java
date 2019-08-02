package evgenyt.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Init (@Postconstruct), destroy (@Predestroy) in ClassicalMusic class
 */

public class TestSpring {
    public static void main(String[] args) {
        // Get app context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music.getSong());
        context.close();
    }
}
