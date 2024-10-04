package singelton.design.pattern;

public class BrakeSingletonByReflection {
    public BrakeSingletonByReflection() {
        //To overcome singleton rules from braking
        if (lazySingletonInstance!=null){
            throw new IllegalStateException("Object can't be created using reflection");
        }
    }
    public  static BrakeSingletonByReflection lazySingletonInstance;

    public static BrakeSingletonByReflection getInstance(){
        if(lazySingletonInstance == null){
            return lazySingletonInstance = new BrakeSingletonByReflection();
        }else {
            return lazySingletonInstance;
        }
    }
}
