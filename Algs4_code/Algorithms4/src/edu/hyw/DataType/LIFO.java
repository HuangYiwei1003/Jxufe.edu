package edu.hyw.DataType;

import java.util.Iterator;

public class LIFO<Item> implements Iterable<Item>{
	/**
	  * @Title:  ResizingArrayStack.java   
	  * @Package com.hyw.LIFO   
	  * @Description:    下压栈的链表实现   
	  * @author: hyw 
	  * @date:   2018年11月29日 下午9:53:17   
	  * @version V1.0       */
	
	//LIFO主要数据类型
	private Node first;	//栈顶（最近添加元素）
	private int N;			//元素数量
	private class Node{
		//定义Node的嵌套类型
		Item item;
		Node next;
	}
	
	///LIFO功能方法
	//基础
	public boolean isEmpty()		{	return	first == null;	} 	//栈为空
	public int size()					{	return N;	}					//返回栈的大小
	
	//栈方法
	public void push(Item item) {
		//向栈添加元素
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public Item pop() {
		//从栈顶删除元素
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	///iterator()实现
	public Iterator<Item> iterator() {
		return new LIFOIterator();
	}
	public class LIFOIterator implements Iterator<Item>{
		//支持先进后出的迭代
		private Node current = first;
		public boolean hasNext()	{	return current != null;	}
		public void remove()	{		}
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		public String toString() {
			String item = current.item.toString();
			return item;
		}
	}


}
