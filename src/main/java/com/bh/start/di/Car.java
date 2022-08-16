package com.bh.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//spring에게 객체 생성 위임
//@Component
public class Car {
	
	//0816 Spring Legacy - 03.DI 예제
	
	//Car는 Engine이 없으면 안됨
	//Car는 Engine에 의존적 (=/=상속)
	
	//멤버변수에 값을 대입하는 방법 = 주입
	
	//1. private Engine engine = new Engine();
//	private Engine engine;
	
	//2. Car car = new Car();
	//   car.engine = new Engine();
	//   ㄴ 사용 불가 -> private 이라서
	
	//3-1. 기본 생성자 (매개변수 X)
//	public Car() {
//		this.engine = new Engine();
//	}
	
	//3-2. 매개변수가 있는 생성자
//	public Car(Engine engine) {
//		this.engine = engine;
//	}

	private Engine engine;
	private LeftWheel leftWheel;
	private RightWheel rightWheel;
	
//	@Autowired
	public Car(/*Engine engine,*/ LeftWheel leftWheel, RightWheel rightWheel){
		this.engine = engine;
		this.leftWheel = leftWheel;
		this.rightWheel = rightWheel;
	}
	
	
	//	다른 파일에서
//	Engine engine = new Engine();
//	Car car = new Car(engine);
	
	//4. Instance Block
	{
		this.engine = new Engine();
	}

	
	//5. Setter, Getter
//	@Autowired
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
		
	}	
//	다른 파일에서	
//	Car car = new Car();
//	Engine engine = new Engine();
//	car.setEngine(engine);
	
	
	
	
	
}
