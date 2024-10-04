package singelton.design.pattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainClass {
	public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
		//Test EagerSingelton
		/*EagerSingelton singeltonObject = EagerSingelton.getInstance();
		singeltonObject.simpleMethod();
		
		EagerSingelton singeltonObject2 = EagerSingelton.getInstance();
		singeltonObject2.simpleMethod();*/

		//Test LazySingleton
		/*LazySingleton singeltonObject = LazySingleton.getInstance();
		System.out.println(singeltonObject);
		LazySingleton singeltonObject2 = LazySingleton.getInstance();
		System.out.println(singeltonObject2);*/

		//Test DoubleCheckSingleton
		/*DoubleCheckSingleton singeltonObject = DoubleCheckSingleton.getInstance();
		System.out.println(singeltonObject.hashCode());
		DoubleCheckSingleton singeltonObject2 = DoubleCheckSingleton.getInstance();
		System.out.println(singeltonObject2.hashCode());*/

		//Test LazzyInnerClassSingleton
		/*LazzyInnerClassSingleton singeltonObject = LazzyInnerClassSingleton.getInstance();
		System.out.println(singeltonObject.hashCode());
		LazzyInnerClassSingleton singeltonObject2 = LazzyInnerClassSingleton.getInstance();
		System.out.println(singeltonObject2.hashCode());*/

		//Test BrakeSingletonByClone
		/*BrakeSingletonByClone singeltonObject = BrakeSingletonByClone.getInstance();
		System.out.println(singeltonObject);
		BrakeSingletonByClone singeltonObject2 = (BrakeSingletonByClone) singeltonObject.clone();
		System.out.println(singeltonObject2);
*/
		//Test BrakeSingletonByReflection
		/*BrakeSingletonByReflection singeltonObject = BrakeSingletonByReflection.getInstance();
		System.out.println(singeltonObject.hashCode());

		BrakeSingletonByReflection reflectionObject = null;
		Constructor[] constructors = singeltonObject.getClass().getConstructors();
		for (Constructor constructor:constructors){
			constructor.setAccessible(true);
			reflectionObject = (BrakeSingletonByReflection) constructor.newInstance();
		}
		System.out.println(reflectionObject.hashCode());*/

		//Serialize singleton object to a file
		LazySingleton instance1 = LazySingleton.getInstance();

		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(instance1);
		out.close();

		//deserialize singleton object from file
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		LazySingleton instance2 = (LazySingleton) in.readObject();
		in.close();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
