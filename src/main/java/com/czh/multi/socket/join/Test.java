package com.czh.multi.socket.join;

public class Test {
	public static void main(String[] args) {
		try{
			Thread1 t = new Thread1();
			t.start();
			t.join(2000);
			System.out.println("想在上面执行完再执行,OK!!解决");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
