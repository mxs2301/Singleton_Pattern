public class Singleton {
    private static volatile Singleton singleton_instance;
    private String data;

    private Singleton(String input){
        data = input;
    }

    public static Singleton getInstance(String input) {
        if (singleton_instance == null) {
            synchronized (Singleton.class) {
                if (singleton_instance == null) {
                    singleton_instance = new Singleton(input);
                }
            }
        }
        return singleton_instance;
    }

    public void printData(){
        System.out.println(data);
    }
}
