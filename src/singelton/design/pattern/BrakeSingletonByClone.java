package singelton.design.pattern;

public class BrakeSingletonByClone extends MyClone{
    public  static BrakeSingletonByClone lazySingletonInstance;

    private BrakeSingletonByClone() {
    }

    //To overcome singleton rules from braking
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Object can't be created using clone");
    }

    public static BrakeSingletonByClone getInstance(){
        if(lazySingletonInstance == null){
            return lazySingletonInstance = new BrakeSingletonByClone();
        }else {
            return lazySingletonInstance;
        }
    }
}
