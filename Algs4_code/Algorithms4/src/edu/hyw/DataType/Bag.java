package edu.hyw.DataType;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

	
	/**
	  * @Title:  Bag.java   
	  * @Package edu.hyw.DataType   
	  * @Description:    ����(����ʵ��) 
	  * @author: hyw 
	  * @date:   2018��12��1�� ����4:42:35   
	  * @version V1.0       */
	
	//��������
	private Node first;
	private int N;
	private class Node{
		Item item;
		Node next;
	}
	
	
	//����
	//����
	public boolean isEmpty()		{	return	first == null;	} 	//BagΪ��
	public int size()					{	return N;	}					//����Bag�Ĵ�С
	//����
	public void add(Item item) {
		//���Ԫ��
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = null;
		oldfirst.next = first;
	}
	//����
	public Iterator<Item> iterator() {
		return new BagIterator();
	}
	private class BagIterator<Item> implements Iterator<Item> {
		//֧��ֻ�������ĵ���
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
