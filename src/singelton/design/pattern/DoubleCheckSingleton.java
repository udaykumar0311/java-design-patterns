package singelton.design.pattern;

public class DoubleCheckSingleton {
    private DoubleCheckSingleton(){

    }
    private static DoubleCheckSingleton doubleCheckSIngletonInstance;

    public static DoubleCheckSingleton getInstance(){
        if(doubleCheckSIngletonInstance == null){
            synchronized (DoubleCheckSingleton.class){
                if(doubleCheckSIngletonInstance == null){
                    doubleCheckSIngletonInstance = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSIngletonInstance;
    }
}
