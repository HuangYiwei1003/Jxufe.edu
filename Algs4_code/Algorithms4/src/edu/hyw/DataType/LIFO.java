package edu.hyw.DataType;

import java.util.Iterator;

public class LIFO<Item> implements Iterable<Item>{
	/**
	  * @Title:  ResizingArrayStack.java   
	  * @Package com.hyw.LIFO   
	  * @Description:    ��ѹջ������ʵ��   
	  * @author: hyw 
	  * @date:   2018��11��29�� ����9:53:17   
	  * @version V1.0       */
	
	//LIFO��Ҫ��������
	private Node first;	//ջ����������Ԫ�أ�
	private int N;			//Ԫ������
	private class Node{
		//����Node��Ƕ������
		Item item;
		Node next;
	}
	
	///LIFO���ܷ���
	//����
	public boolean isEmpty()		{	return	first == null;	} 	//ջΪ��
	public int size()					{	return N;	}					//����ջ�Ĵ�С
	
	//ջ����
	public void push(Item item) {
		//��ջ���Ԫ��
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	public Item pop() {
		//��ջ��ɾ��Ԫ��
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	///iterator()ʵ��
	public Iterator<Item> iterator() {
		return new LIFOIterator();
	}
	public class LIFOIterator implements Iterator<Item>{
		//֧���Ƚ�����ĵ���
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
