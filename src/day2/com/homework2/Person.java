package day2.com.homework2;

public class Person {
	private String name;
	private String gender;
	private int age;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
		System.out.println("姓名："+name);
	}
	public Person(String gender,int age) {
		this.gender = gender;
		this.age = age;
		System.out.println("性別："+gender+",年龄："+age);
	}
	public Person(String name,String gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.println("姓名："+name+",性別："+gender+",年龄："+age);
	}
	
}
