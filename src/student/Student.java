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
		System.out.println("������" + name + "�����g��" + age + "�����I��" + major);
	}

	public static void main(String[] args) {
		Student student = new Student("�S��ƽ", 18, "�a��خa");
		student.setName("�S�|ƽ");
		student.setAge(18);
		student.setMajor("�����خa");
		System.out.println("������" + student.getName() + "�����g��18" + "�����I��" + student.getMajor());

	}

}
