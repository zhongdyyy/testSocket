package com.itjob.zdy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) {
		try {
			Socket  socket = new Socket("127.0.0.1",5200);
			System.out.println("�ͻ��������ɹ�");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String readline;
			readline = br.readLine(); // ��ϵͳ��׼�������һ�ַ���
			while(!readline.equals("end")) {
				pw.println(readline);
				pw.flush();
				System.out.println(in.readLine());
			}
			in.close();
			pw.close();
			br.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



