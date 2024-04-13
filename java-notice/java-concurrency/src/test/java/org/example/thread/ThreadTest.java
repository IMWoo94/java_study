package org.example.thread;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ThreadTest {

	@Test
	@DisplayName("테스트 메인 쓰레드만 진행")
	public void mainThread() {
		log.info("=====================================================================");
		log.info("thread name : {}", Thread.currentThread().getName());
		log.info("=====================================================================");
	}

	@Test
	@DisplayName("테스트 메인 쓰레드와 새로운 쓰레드를 생성하여 진행")
	public void customThreadStart() {
		log.info("=====================================================================");
		log.info("thread name : {}", Thread.currentThread().getName());

		/**
		 * start() 명령어를 통해 실행하게 되면, 새로운 스레드를 실행하는 필요한 호출 스택(call stack) 을 생성하고, 다음에 run 을 호출하게 됩니다.
		 * 그렇기 때문에 동작 시 Thread 가 메인과 다른 새로운 스레드 이름을 가지는 것을 볼 수 있습니다.
		 * 이는 start() 에서 start0() 명령어를 통해 JVM 에 의해 Thread 가 생성이 됩니다.
		 *         synchronized (this) {
		 *             // zero status corresponds to state "NEW".
		 *             if (holder.threadStatus != 0)
		 *                 throw new IllegalThreadStateException();
		 *             start0();
		 *         }
		 */

		CustomThread customThread = new CustomThread();
		customThread.start();
		log.info("=====================================================================");
	}

	@Test
	@DisplayName("테스트 메인 쓰레드에 Custom 쓰레드를 진행")
	public void customThreadRun() {
		log.info("=====================================================================");
		log.info("thread name : {}", Thread.currentThread().getName());

		/**
		 * start() 명령어를 통해서 신규 쓰레드를 만들어서 진행되는 것을 알 수 있습니다.
		 * run() 명령어만 진행한다면 기존에 메인 쓰레드에 의해서 Custom thread 가 동작하는 걸 알 수 있습니다.
		 * run() 호출하는 것은 생성된 스레드 객체를 실행하는 것이 아닌 스레드 클래스 내부의 run 메소드를 실행시키는 것이다.
		 * 그렇기 때문에 Thread 는 main name 이 나오고 병렬처리가 되지 않는다.
		 * 명령어 순차적으로 처리가 됩니다.
		 */

		CustomThread customThread = new CustomThread();
		customThread.run();
		customThread.run();
		customThread.run();
		customThread.run();
		log.info("=====================================================================");
	}

	@Test
	@DisplayName("새로운 쓰레드 start() 2번 호출 시 예외 상황")
	public void customTheadException() {
		log.info("=====================================================================");
		CustomThread customThread = new CustomThread();
		/**
		 * start() 메소드를 바라보면 스레드가 실행가능한지를 확인합니다.
		 *         if (threadStatus != 0)
		 *             throw new IllegalThreadStateException();
		 * 0 ( New ) 상태가 아니라면 예외를 일으켜요
		 * 쓰레드는 New, Runnable, Waiting, Timed Waiting, Terminated 총 5가지 상태
		 */
		// 첫 start() 호출 시 문제 없이 진행
		assertDoesNotThrow(customThread::start);
		// start() 재 호출 시 예외 발생
		assertThrows(IllegalThreadStateException.class, customThread::start);
		log.info("=====================================================================");
	}

	static class CustomThread extends Thread {
		@Override
		public void run() {
			log.info("customThread name : {}", Thread.currentThread().getName());
		}
	}

	@Test
	@DisplayName("Custom Thread 의 병렬 실행")
	public void customThreadParallel() throws InterruptedException {
		log.info("=====================================================================");
		/**
		 * 해당 처리는 1,2,3,4,5 순으로 처리가 될 것으로 예상을 할 수 있다.
		 * 하지만, 생각한 대로 순차적으로 처리가 되지 않는 것을 알 수 있는데 이는 Thread 마다 병렬 방식으로 진행되기 때문이다.
		 * 이를 제어 하기 위해서 join() 메소드를 통해서 제어를 할 수 있다.
		 * join() 메소드는 해당 Thread 가 종료 될 때 까지 잡아 둡니다. 아래 명령어에 대해서 처리가 되지 않아요.
		 */
		RacerThread r1 = new RacerThread("1");
		RacerThread r2 = new RacerThread("2");
		RacerThread r3 = new RacerThread("3");
		RacerThread r4 = new RacerThread("4");
		RacerThread r5 = new RacerThread("5");

		r1.start();
		r1.join();
		r2.start();
		r2.join();
		r3.start();
		r3.join();
		r4.start();
		r4.join();
		r5.start();
		r5.join();
		log.info("=====================================================================");
	}

	class RacerThread extends Thread {
		private String name;

		public RacerThread(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			log.info("racer name : {} / customThread name : {}", this.name, Thread.currentThread().getName());
		}
	}

	@Test
	@DisplayName("Thread Group")
	public void theadGroup() throws InterruptedException {
		/**
		 * Thread 를 바라보면 Group 이라는 정보가 있는데 이는 무엇일까?
		 * 별도의 설정이 존재하지 않으면 main 으로 동일한 그룹을 가지게 된다.
		 */
		log.info("thread name : {}", Thread.currentThread().getName());
		log.info("thread group : {}", Thread.currentThread().getThreadGroup().getName());

		Thread thread1 = new Thread(new Wating("1"));
		Thread thread2 = new Thread(new Wating("2"));
		/**
		 * 그룹을 다르게 준다면 무슨 효과가 있을까?
		 * 대표적으로 사용하는 것이 Thread 를 종료하기 위해 interrupt() 메소드를 사용하는데 이점이 있다.
		 * 일반 thread 의 경우 해당 스레드 마다 interrupt() 를 통해 스레드를 종료해야 한다.
		 * 하지만 group 으로 지정해두면 group 을 통해서 interrupt() 하면 그룹에 포함된 스레드를 일괄 종료 할 수 있다.
		 */
		ThreadGroup threadGroup = new ThreadGroup("new Group");
		Thread thread3 = new Thread(threadGroup, new Wating("3"));
		Thread thread4 = new Thread(threadGroup, new Wating("4"));
		Thread thread5 = new Thread(threadGroup, new Wating("5"));

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

		thread1.interrupt();
		threadGroup.interrupt();

	}

	class Racer implements Runnable {

		private String name;

		public Racer(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			log.info("racer name : {} / customThread name : {}", this.name, Thread.currentThread().getName());
			log.info("racer thread group : {}", Thread.currentThread().getThreadGroup().getName());
		}
	}

	class Wating implements Runnable {

		private String name;

		public Wating(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			log.info("Wating name : {} / customThread name : {} / group : {}", this.name,
				Thread.currentThread().getName(), Thread.currentThread().getThreadGroup().getName());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// throw new RuntimeException(e);
				log.info("InterruptedException!!!");
			} finally {
				log.info("Wating name : {} finish", this.name);
			}
		}
	}
}