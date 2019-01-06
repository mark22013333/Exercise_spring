package idv.cheng.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
	private int id;
	private String name;
	private Set<String> sets;
	private List<String> list;
	private Map<String, String> maps;

	private Desk desk;

	public People() {
		super();
		System.out.println("執行建構子");
	}

	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("執行有參數的建構子");
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

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sets=" + sets + ", list=" + list + ", maps=" + maps + "]";
	}

}
