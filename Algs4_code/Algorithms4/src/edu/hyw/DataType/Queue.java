package edu.hyw.DataType;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {


	
	/**
	  * @Title:  Queue.java   
	  * @Package edu.hyw.DataType   
	  * @Description:    Queue(����ʵ��)  
	  * @author: hyw 
	  * @date:   2018��12��1�� ����4:11:03   
	  * @version V1.0       */
	
	//Queue��Ҫ��������
	private Node first,last;   //����ͷ�����β
	private int N;				 //����Ԫ������
	private class Node {
		//����ڵ�
		Item item;
		Node next;
	}
	
	///���ܷ���
	//����
	public boolean isEmpty() 	{ 	return first == null;	 }
	public int size()					{	return N;	}
	
	//���з���
	public void enqueue(Item item) {
		//�����β���Ԫ��
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isEmpty()) first = last;
		else				oldlast.next = last;
		N++;
	}
	
public Item dequeue() {
	//ɾ������ͷԪ��
	Node oldfirst = first;
	Item item = first.item;
	first = first.next;
	N--;
	return item;
}
	
	//���õ���
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}
	private class QueueIterator<Item> implements Iterator<Item> {
		//֧���Ƚ�����ĵ���
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
