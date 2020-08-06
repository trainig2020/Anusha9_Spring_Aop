package org.abc.aop;

import org.abc.aop.service.FactoryService;
import org.abc.aop.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
	
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService
				.getBean("shapeService");

		shapeService.getCircle();
		

	}

}
