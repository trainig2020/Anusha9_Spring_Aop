package org.abc.aop.service;

import org.abc.aop.model.Circle;
import org.abc.aop.model.Triangle;

public class FactoryService {
	
	public Object getBean(String beanType){
		if(beanType.equals("shapeService"))return new ShapeServiceProxy();
		if(beanType.equals("circle"))return new Circle();
		if(beanType.equals("triangle"))return new Triangle();
		return null;

	}

}
