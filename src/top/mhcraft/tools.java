package top.mhcraft;

import java.util.ArrayList;
import java.util.HashMap;

//import java.util.List;

public class tools {
	private static  ArrayList<String > list=new ArrayList<String >();
	private static int i=0;
	private static ArrayList<MOTDThread> ListThread=new ArrayList<MOTDThread>();
	public HashMap<String, Object> getSocks(){
		String[] ips=getIp().split("\\:");
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("ip", ips[0]);
		map.put("port", (int )Integer.valueOf(ips[1]));
		return map;
		
	}
	public static ArrayList<MOTDThread> getListThread() {
		return ListThread;
	}
	public static  void setListThread(ArrayList<MOTDThread> listThread) {
		ListThread = listThread;
	}
	public void Update(ArrayList<String> list){
		tools.list=list;
	}
	public String getIp(){
		String ip=list.get(i);
		i++;
		if(i==list.size()){
			i=0;
		}
		return ip;
		
	}
	static int times=0;
	public void HookTime(){
		times++;
	}
	public int getTimes(){
		return times;
	}
	static int Ntimes=0;
	static int Itimes=0;
	static int ths=0;
	public void setths(int ths){
		tools.ths=ths;
	}
	static boolean alltrue=false;
	public boolean timer(){
		Ntimes++;
		if(Ntimes/100>Itimes&&Ntimes<ths&&!alltrue){
			System.out.println("正在缓启动中!");
			return true;
		}else{
			alltrue=true;
		}
		return false;
		
	}
	/*
	static List <RAMs> RList=new ArrayList<RAMs> ();

	public void addThread(Thread t,long unixtime){
		RList.add(new RAMs(unixtime,t));
	}
	public List <RAMs>  getList(){
		return RList;
		
	}
	public void Del(MOTDThread t){
		
	}
	*/

}