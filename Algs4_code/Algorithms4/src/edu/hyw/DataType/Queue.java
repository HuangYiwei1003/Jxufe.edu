package edu.hyw.DataType;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {


	
	/**
	  * @Title:  Queue.java   
	  * @Package edu.hyw.DataType   
	  * @Description:    Queue(链表实现)  
	  * @author: hyw 
	  * @date:   2018年12月1日 下午4:11:03   
	  * @version V1.0       */
	
	//Queue主要数据类型
	private Node first,last;   //队列头与队列尾
	private int N;				 //队列元素数量
	private class Node {
		//定义节点
		Item item;
		Node next;
	}
	
	///功能方法
	//基本
	public boolean isEmpty() 	{ 	return first == null;	 }
	public int size()					{	return N;	}
	
	//队列方法
	public void enqueue(Item item) {
		//向队列尾添加元素
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else				oldlast.next = last;
		N++;
	}
	
public Item dequeue() {
	//删除队列头元素
	Node oldfirst = first;
	Item item = first.item;
	first = first.next;
	N--;
	return item;
}
	
	//设置迭代
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}
	private class QueueIterator<Item> implements Iterator<Item> {
		//支持先进后出的迭代
				private Node current = first;
				public boolean hasNext()	{	return current != null;	}
				public void remove()	{
					throw new UnsupportedOperationException();
				}
				public Item next() {
					Item item = (Item) current.item;
					current = current.next;
					return item;
				}
				public String toString() {
					String item = current.item.toString();
					return item;
				}
	}
}
