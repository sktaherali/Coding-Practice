

public class SingletonClass {
	private SingletonClass () {}
	 private static class InnerSingletonClass {
		 private static final SingletonClass singletonClass =  new SingletonClass();
	} 
	 public static SingletonClass getSingletonClass() {
		 return InnerSingletonClass.singletonClass;
		 
	 }
	 
	 SingletonClass1 s1= SingletonClass1.getSingletonClass();
}

 class SingletonClass1 {
	 private static  SingletonClass1 singletonClass1;
	 
	 private SingletonClass1() {}
	 
	 public static SingletonClass1 getSingletonClass() {
		 
		 if(singletonClass1 == null) {
			 synchronized (SingletonClass1.class) {
				 if(singletonClass1 == null) {
				 singletonClass1 = new SingletonClass1();
				 }
			}
		 }
		 return singletonClass1;
	 }
 };
