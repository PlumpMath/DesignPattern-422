package singleton;

/**
 * 枚举实现Singleton
 */

public class EnumSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE.getInstance();
        Singleton.INSTANCE.execute();
    }

    enum Singleton {
        INSTANCE;
        public static Singleton getInstance() {
            return INSTANCE;
        }

        public void execute() {
            System.out.println("doSomething!");
        }

    }
}