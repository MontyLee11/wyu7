package day3.filehomework;

import java.io.IOException;

public class EmpTest {

	public static void main(String[] args) throws IOException {
		String filesrc = "H:/JMPX/myfile.txt";
		String filedest = "H:/JMPX/myfile_cp.txt";
		Emp emp = new Emp();
		emp.CopyFileSteam(filesrc, filedest);
		System.out.println("复制文件成功！");
	}

}
