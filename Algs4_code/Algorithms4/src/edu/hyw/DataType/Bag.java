package edu.hyw.DataType;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

	
	/**
	  * @Title:  Bag.java   
	  * @Package edu.hyw.DataType   
	  * @Description:    背包(链表实现) 
	  * @author: hyw 
	  * @date:   2018年12月1日 下午4:42:35   
	  * @version V1.0       */
	
	//数据类型
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	
	
	//方法
	//基本
	public boolean isEmpty()		{	return	first == null;	} 	//Bag为空
	public int size()					{	return N;	}					//返回Bag的大小
	//背包
	public void add(Item item) {
		//添加元素
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = null;
		oldfirst.next = first;
	}
	//迭代
	public Iterator<Item> iterator() {
		return new BagIterator();
	}
	private class BagIterator<Item> implements Iterator<Item> {
		//支持只进不出的迭代
				private Node current = first;
				public boolean hasNext()	{	return current != null;	}
				public void remove()	{		}
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
