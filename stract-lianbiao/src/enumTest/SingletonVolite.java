package enumTest;

public class SingletonVolite {
	// 双重检验锁，使用volatile对变量设置对所有对象都是可见的，
	private volatile static SingletonVolite instance;

	private SingletonVolite() {
	}

	public static SingletonVolite getInstance() {
		if (instance == null) {
			synchronized (SingletonVolite.class) {
				if (instance == null) {
					instance = new SingletonVolite();
				}
			}
		}
		return instance;
	}
}
