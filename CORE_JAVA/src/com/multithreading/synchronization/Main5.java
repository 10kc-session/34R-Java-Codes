package com.multithreading.synchronization;

class Producer implements Runnable{
	StringBuffer sb;
	
	public Producer() {
		sb = new StringBuffer();
	}

	@Override
	public void run() {
		try {
			synchronized(sb) {
				for(int i = 1 ; i <= 10 ; i++) {
					sb.append(i + " ");
					System.out.println(sb);
					Thread.sleep(2000);
				}
				sb.notify(); // notifying consumer 
			}
			
		}catch(Exception e) {
			System.out.println("Message " + e);
		}
	}
}

class Consumer implements Runnable{
	Producer producer;
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		try {
			synchronized (producer.sb) {
				System.out.println("Consumer waiting for string buffer result from producer");
				
				producer.sb.wait(); // waiting for producer
				
				System.out.println("........Consuming buffer......");
				System.out.println(producer.sb.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Main5 {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		
		thread2.start();
		thread1.start();
		
	}
}
