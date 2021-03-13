package code.executor.framework;

import java.util.concurrent.Executor;

/*
 *  An Executor is normally usedinstead of explicitly creating threads
 *  DirectExecutor - the Executor interface does not strictlyrequire that execution be asynchronous. In the simplest case, anexecutor can run the submitted task immediately in the caller'sthread
 */
public class ExecutorExplicitThreadUseTest {

	public static void main(String[] args) {
		Executor executor = new Executor() {

			public void execute(Runnable command) {
				command.run();
			}
		};

		Runnable t1 = new Runnable() {

			public void run() {
				try {
					Thread.sleep(1600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Runnable tsk 1");
			}
		};

		Runnable t2 = new Runnable() {

			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Runnable tsk 2");
			}
		};

		executor.execute(t1);
		executor.execute(t2);
	}

}
