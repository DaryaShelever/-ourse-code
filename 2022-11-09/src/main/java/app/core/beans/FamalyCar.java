package app.core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FamalyCar implements Car {

	@Qualifier("basicEngine")
	private Engine engine;
	@Value("${car.max.speed}")
	private int maxSpeed;

	public FamalyCar() {
		super();
	}

	@Autowired
	public FamalyCar(@Qualifier("basicEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public void start() {
		engine.turnOnn();
		System.out.println("famaly car started");

	}

	@Override
	public void drive(int speed) {
		if (speed <= maxSpeed) {
			System.out.println("famaly car driving at speed " + speed);
		} else {
			System.out.println("Erorr - over max speed");

		}
	}

	@Override
	public void stop() {
		engine.turnOf();
		System.out.println("famaly car stopted");

	}

	@Override
	public int getMaxSpeed() {
		return maxSpeed;

	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
