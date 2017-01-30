package top.mhcraft;

public class RAMs {
	Thread t;
	Long time;
	public Thread getThread(){
		return t;
		
	}
	public long GetTime(){
		return time;
		
	}
	public RAMs(long time,Thread t){
		this.time=time;
		this.t=t;
		
	}
}
