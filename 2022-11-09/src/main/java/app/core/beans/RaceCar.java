package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RaceCar implements Car {

	@Autowired
	@Qualifier("turboEngine")
	private Engine engine;
	private int maxSpeed = 210;

	public void start() {
		engine.turnOnn();
		System.out.println("Race car started");

	}

	@Override
	public void drive(int speed) {
		if (speed <= maxSpeed) {
			System.out.println("Race car driving at speed " + speed);
		} else {
			System.out.println("erorr - over max speed");

		}
	}

	@Override
	public void stop() {
		engine.turnOf();
		System.out.println("Race car stopted");

	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;

	}

}
