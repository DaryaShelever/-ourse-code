package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BasicEngine implements Engine{

	@Override
	public void turnOf() {
		System.out.println("Basic engine of");
		
	}

	@Override
	public void turnOnn() {
		System.out.println("Basic engine on");
		
		
	}

}
