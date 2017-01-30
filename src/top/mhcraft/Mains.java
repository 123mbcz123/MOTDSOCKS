package top.mhcraft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Mains {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		String ip = null;
		int th = 0;
		int port = 0;
		Configs c=new Configs();
		c.setRunning(true);
		Scanner s=new Scanner(System.in);
		System.out.println("ip:");
		ip=s.next();
		System.out.println("port:");
		port=s.nextInt();
		System.out.println("Thread:");
		th=s.nextInt();
		File f=new File("socks.txt");
		s.close();
		try {
			FileInputStream fi=new FileInputStream(f);
			InputStreamReader in=new InputStreamReader (fi);
			BufferedReader bf=new BufferedReader (in);
			String socks;
			ArrayList<String > list=new ArrayList<String >();
			while ((socks=bf.readLine())!=null){
				list.add(socks);
			}
			tools t=new tools();
			t.Update(list);
			bf.close();
		} catch (FileNotFoundException e) {
			try {
				f.createNewFile();
			} catch (IOException e1) {
				// TODO �Զ����ɵ� catch ��
				e1.printStackTrace();
			}
			
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		System.out.println(ip+" "+port+" "+th);
		System.out.println(new tools().getSocks());
		Thread lt=new Thread(new ListenThread(ip,port,th));
		lt.start();
		System.out.println("�����̴߳����ɹ�");
		tools t=new tools();
		t.setths(th);
		while(true){
			try {
				Thread.sleep(10000);
				System.out.println("��ʼ�ڴ�����");
				System.out.println("�Ѿ����"+t.getTimes()+"�ι���");
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			;
		}
		
		
		/*
		 * δ���
		 * map�������
		 * ������
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
