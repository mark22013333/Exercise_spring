package idv.cheng;

public class SingleTon2 {
	// 在類載入時就會被實例化
	private static SingleTon2 singleton = new SingleTon2();

	private SingleTon2() {
	}

	public static SingleTon2 getInstance() {
		return singleton;
	}
}
