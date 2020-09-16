package teacher;

public class Teacher {

	private String name;
	private Integer age;
	private String sex;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
//	public Teacher(String name,int age,String sex) {
//		this.name = name;
//		this.age = age;
//		this.sex = sex;	
//	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setName("dongge");
		teacher.setSex("female");
		teacher.setAge(18);
		System.out.println("name:"+teacher.getName()+",sex:"+teacher.getSex()+",age:"+teacher.getAge());

		
	}
}
	
	
