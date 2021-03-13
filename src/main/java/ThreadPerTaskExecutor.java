import java.util.concurrent.Executor;

/*
 * spawing new thread for each task
 */
class ThreadPerTaskExecutor implements Executor {
	public void execute(Runnable r) {
		new Thread(r).start();
	}
}