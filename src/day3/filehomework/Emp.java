package day3.filehomework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date Hiredate;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return Hiredate;
	}

	public void setHiredate(Date hiredate) {
		Hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Emp [姓名:" + name + ", 年龄:" + age + ", 性别:" + gender + ", 薪资:" + salary + ", 入职时间:" + Hiredate + "]";
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public static void CopyFileSteam(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int count;
		byte buffer[] = new byte[1024];
		while ((count = in.read(buffer)) != -1) {
			System.out.println("已读取"+count+"个字节");
			for (int i = 0; i < count; i++)
				out.write(buffer[i]);
		}
		in.close();
		out.close();
	}
}
