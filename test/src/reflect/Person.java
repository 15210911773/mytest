package reflect;

public class Person {

	private String name = "zhangsan";
	public int age = 7;
	private String place;

	public Person() {
		super();
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void printName() {
		System.out.println("静态方法执行了...");
	}
	
	public void play(String game) {
		System.out.println(name + "正在玩" + game);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
