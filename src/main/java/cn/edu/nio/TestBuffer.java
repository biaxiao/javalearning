package cn.edu.nio;

import java.nio.ByteBuffer;

import org.junit.Test;

public class TestBuffer {

	@Test
	public void test3() {
		ByteBuffer buf = ByteBuffer.allocateDirect(1024);
		System.out.println(buf.isDirect());
	}
	@Test
	public void test2() {
		String str= "abcde";
		ByteBuffer buf = ByteBuffer.allocate(1024);
		buf.put(str.getBytes());
		buf.flip();
		byte[] dst =new byte[buf.limit()];
		buf.get(dst,1,2);
		System.out.println(new String(dst,1,2));
		
		buf.mark();
		
		buf.get(dst, 3,2);
		System.out.println(new String(dst,3,2));
		System.out.println(buf.position());
		
		buf.reset();
		System.out.println(buf.position());
		
		if(buf.hasRemaining()) {
			System.out.println(buf.remaining());
		}
	}
	
	@Test
	public void test1() {
		String str="abcde";
		ByteBuffer buf = ByteBuffer.allocate(1024);
		
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		System.out.println("--------------------");
		
		buf.put(str.getBytes());
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		
		System.out.println("--------------------");
		buf.flip();
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		
		System.out.println(buf.get());
		
//		System.out.println("----------d--------");
//		buf.put(str.getBytes());
//		System.out.println(buf.position());
//		System.out.println(buf.limit());
//		System.out.println(buf.capacity());
		System.out.println("--------------------");
		byte[] dst= new byte[buf.limit()-1];
		buf.get(dst);
		System.out.println(new String (dst,0,dst.length));
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		System.out.println("--------------------");
		
		buf.rewind();
//		System.out.println(new String (dst,0,dst.length));
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		System.out.println("--------------------");
		
		buf.clear();
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		System.out.println((char)buf.get());
		System.out.println((char)buf.get());
		System.out.println((char)buf.get());
		System.out.println((char)buf.get());
		System.out.println((char)buf.get());
		System.out.println(buf.get());
		
		System.out.println(buf.position());
		System.out.println(buf.limit());
		System.out.println(buf.capacity());
		
		
	}
}
