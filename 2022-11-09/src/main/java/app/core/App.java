package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.Car;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Configff.class)) {
			Car car = ctx.getBean("famalyCar", Car.class);
			car.start();
			car.drive(60);
			car.stop();
			
			System.out.println("-------------");
			
			Car car1 = ctx.getBean("raceCar", Car.class);
			car1.start();
			car1.drive(200);
			car1.stop();
			
			System.out.println("-------------");
			
			Car car2 = ctx.getBean("spotsCar", Car.class);
			car2.start();
			car2.drive(190);
			car2.stop();

		}

	}

}
