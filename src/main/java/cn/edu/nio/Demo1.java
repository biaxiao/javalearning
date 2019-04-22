package cn.edu.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class Demo1 {
	public static void main(String[] args) {
		try {
			SocketChannel sockerChannel = SocketChannel.open();
			InetSocketAddress remote = new InetSocketAddress("www.baidu.com",80);
			sockerChannel.configureBlocking(false);//在其之后才是阻塞
			sockerChannel.connect(remote);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
