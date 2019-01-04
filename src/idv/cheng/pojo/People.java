package idv.cheng.pojo;

public class People {
	private int id;
	private String name;

	public People() {
		super();
		System.out.println("執行建構子");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Description:
	 * 
	 * @author chengmark Jan 4, 2019 5:33:32 PM
	 * @return
	 */
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + "]";
	}

}
