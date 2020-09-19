package day2.com.homework1;

public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(30.00);
		vehicle.setSize(4.00);
		System.out.println("小车的速度："+vehicle.getSpeed()+"km/s,小车的体积："+vehicle.getSize()+"m³");
		vehicle.speedUp();
		vehicle.speedDown();
	}

}
