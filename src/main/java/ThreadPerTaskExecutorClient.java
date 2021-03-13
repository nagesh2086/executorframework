import java.util.concurrent.Executor;

public class ThreadPerTaskExecutorClient {

	public static void main(String[] args) {
		Executor executor = new ThreadPerTaskExecutor();
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
