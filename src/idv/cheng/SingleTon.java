package idv.cheng;

public class SingleTon {
	// 由於對象需要被靜態方法調用，所以需要把方法設定為static
	// 由於對象是static，必須要設定訪問權限修飾符為private，如果是public可以直接調用對象，不執行訪問入口
	private static SingleTon singleton;

	// 將建構子私有化讓其它類不能實例化這個類別
	// 對外提供訪問入口
	private SingleTon() {

	}

	// 實例方法，實例方法必須通過對象調用
	// 設置方法為靜態方法
	public static SingleTon getInstance() {
		// 如果實例化過，直接返回
		if (singleton == null) {
			// 多執行緒訪問下，可能出現if同時成立的情況，所以加入鎖
			synchronized (SingleTon.class) {
				// 雙重驗證
				if (singleton == null) {
					singleton = new SingleTon();
				}
			}
		}
		return new SingleTon();
	}
}
