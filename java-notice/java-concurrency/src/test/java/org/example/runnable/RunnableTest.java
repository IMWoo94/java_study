package org.example.runnable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class RunnableTest {
	/**
	 * Thread 를 상속받은 클래스를 통해서 멀티 쓰레드 환경을 구현할 수 있었다.
	 * Runnable 은 무엇인가?
	 * Runnable 은 1 개의 메소드 ( run ) 을 가지는 함수형 인터페이스 입니다.
	 * Thread 를 상속을 통해 구현하게 되면 별도의 클래스를 만들어야 하며, 다중 상속이 불가한 상황이 처해버린다.
	 * 이를 편리하게 하기 위해서 Runnable 구현체, 익명 함수로 제공하여 Thread 생성 시 매개변로 전달하면 별도의 쓰레드에서 Custom 된 run 이 동작
	 */

	@Test
	@DisplayName("runnable 을 익명함수로 customThread 만들기")
	public void runnableAnonymousCustomThreadStart() {
		log.info("=====================================================================");
		log.info("thread name : {}", Thread.currentThread().getName());

		Thread customThread = new Thread(new Runnable() {
			@Override
			public void run() {
				log.info("runnable 익명 함수");
				log.info("customThread name : {}", Thread.currentThread().getName());
			}
		});
		customThread.start();
		log.info("=====================================================================");
	}

	@Test
	@DisplayName("runnable 을 구현체로 customThread 만들기")
	public void runnableObjectCustomThreadStart() {
		log.info("=====================================================================");
		log.info("thread name : {}", Thread.currentThread().getName());
		Thread thread1 = new Thread(new Racer("1"));
		Thread thread2 = new Thread(new Racer("2"));
		Thread thread3 = new Thread(new Racer("3"));
		Thread thread4 = new Thread(new Racer("4"));
		Thread thread5 = new Thread(new Racer("5"));

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		log.info("=====================================================================");
	}
	
	class Racer implements Runnable {

		private String name;

		public Racer(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			log.info("racer name : {} / customThread name : {}", this.name, Thread.currentThread().getName());
		}
	}

}