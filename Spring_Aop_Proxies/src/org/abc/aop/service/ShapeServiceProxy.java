package org.abc.aop.service;

import org.abc.aop.aspect.LoggingAspect;
import org.abc.aop.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();

		return super.getCircle();
	}

}
