package evgenyt.springdemo;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Factory method");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Classical init");
    }

    public void doMyDestroy() {
        System.out.println("Classical destroy");
    }

    @Override
    public String getSong() {
        return "Swan Lake";
    }
}
