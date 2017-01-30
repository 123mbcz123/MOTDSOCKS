package top.mhcraft;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.Proxy.Type;
import java.util.HashMap;

public class MOTDThread implements Runnable{
	HashMap<String,Object> map=null;
	public void run() {
		Proxy p = new Proxy(Type.SOCKS, new InetSocketAddress((String)map.get("socksip"),(int)map.get("socksport")));
		Socket s=new Socket(p);
		DataOutputStream dw = null;
		DataInputStream di = null;
		try {
			tools t=new tools();
			t.HookTime();
			s.connect(new InetSocketAddress((String)map.get("ip"),(int)map.get("port")),2);
			dw=new DataOutputStream(s.getOutputStream());
			di=new DataInputStream(s.getInputStream());
			dw.write(new byte[]{7,0,4,1,48,99,(byte) 221,1,1,0});
			dw.flush();
			while(di.read()!=-1){
				
			}
			dw.close();
			s.close();
			/*
			t.Del(this);
			*/
			
		} catch (IOException e) {
		}
		
	}
	public MOTDThread(HashMap<String,Object> map){
		this.map=map;
	}
	

}
