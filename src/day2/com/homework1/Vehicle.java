package day2.com.homework1;

public class Vehicle {
	private double speed;
	private double size;
	
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	public void speedUp() {
		System.out.println("加速");
	}
	public void speedDown() {
		System.out.println("减速");
	}
	
}
