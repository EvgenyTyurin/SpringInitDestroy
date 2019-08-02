package evgenyt.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory method");
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Classical init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Classical destroy");
    }

    @Override
    public String getSong() {
        return "Swan Lake";
    }
}
