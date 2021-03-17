package enumTest;

public class Singleton {
	private Singleton (){}

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
