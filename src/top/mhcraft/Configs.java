package top.mhcraft;

public class Configs {
	private static boolean ready=false;
	private static boolean running=false;
	public static  boolean isReady() {
		return ready;
	}

	public static final boolean isRunning() {
		return running;
	}

	public static final void setRunning(boolean running) {
		Configs.running = running;
	}

	public static void setReady(boolean ready) {
		Configs.ready = ready;
	} 

}
