package edu.hyw.Test;

import edu.hyw.DataType.LIFO;
import edu.hyw.DataType.Queue;
import edu.princeton.cs.algs4.*;

public class DataTypeClient {
	/**
	  * @Title:  Client.java   
	  * @Package com.hyw.LIFOtest   
	  * @Description:    测试DataType 
	  * @author: hyw 
	  * @date:   2018年11月29日 下午10:24:20   
	  * @version V1.0       */
	
	public static void main(String[] args) {
		/*
		 //LIFOtest
		LIFO<String> l = new LIFO<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(item.equals("!")) break;
			else if(!item.equals("-")) l.push(item);
			else if (!l.isEmpty()) StdOut.print(l.pop() + " ");
		}
		StdOut.println("(" + l.size() + " left on LIFO)");
		//Iterator<String> i = l.iterator();
		//i.remove();
		for(String s : l) {
			StdOut.print(s + " ");
		}
		StdOut.println();
		while(!l.isEmpty()) {
			StdOut.print(l.pop() + " ");
		} */
		//QueueTest
		Queue<String> Q = new Queue<String>();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if(item.equals("!")) break;
			else if(!item.equals("-")) Q.enqueue(item);
			else if (!Q.isEmpty()) StdOut.print(Q.dequeue() + " ");
		}
		StdOut.println("(" + Q.size() + " left in Queue)");
		//迭代测试
		for(String s : Q) {
			StdOut.print(s + " ");
		}
		StdOut.println();                                                                                               
		while(!Q.isEmpty()) {
			StdOut.print(Q.dequeue() + " ");
		}

	}
}
