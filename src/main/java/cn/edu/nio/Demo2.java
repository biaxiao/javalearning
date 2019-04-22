package cn.edu.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.Selector;

public class Demo2 {
	public static void main(String[] args) {
		ByteBuffer bb= ByteBuffer.allocate(1024);
		IntBuffer ib=IntBuffer.allocate(1024);
		try {
			Selector open = Selector.open();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
