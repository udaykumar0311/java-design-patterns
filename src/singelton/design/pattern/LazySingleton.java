package singelton.design.pattern;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    public  static LazySingleton lazySingletonInstance;

    private LazySingleton() {
    }

    //To avoid serialization to brake singleton rules
    protected Object readResolve(){
        return lazySingletonInstance;
    }
    public static LazySingleton getInstance(){
        if(lazySingletonInstance == null){
            return lazySingletonInstance = new LazySingleton();
        }else {
            return lazySingletonInstance;
        }
    }
}
