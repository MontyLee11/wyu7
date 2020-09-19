package day2.com.phonetest;
import day2.com.phone.*;

public class Main {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.setScreenSize(6.39);
		phone.setBrand("小米9");
		phone.setCpu("骁龙855");
		phone.setMemory(128);
		System.out.println("手机参数\t屏幕\t品牌\t芯片\t内存");
		System.out.println("\t"+phone.getScreenSize()+"寸\t"+phone.getBrand()+"\t"+phone.getCpu()+"\t"+phone.getMemory()+"g");
		
	}

}
