package student;

public class Student {
	private String name;
	private String major;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
		System.out.println("姓名：" + name + "，年齡：" + age + "，專業：" + major);
	}

	public static void main(String[] args) {
		Student student = new Student("黃西平", 18, "恆大地產");
		student.setName("黃東平");
		student.setAge(18);
		student.setMajor("富力地產");
		System.out.println("姓名：" + student.getName() + "，年齡：18" + "，專業：" + student.getMajor());

	}

}
