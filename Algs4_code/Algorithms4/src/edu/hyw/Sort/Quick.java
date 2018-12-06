package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Quick {
	/**
	  * @Title:  Quick.java   
	  * @Package edu.hyw.Sort   
	  * @Description:    ��������
	  * @author: hyw 
	  * @date:   2018��12��2�� ����11:04:12   
	  * @version V1.0       */
	
	public static void sort (Comparable[] a) {
		//�����㷨
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi) {
		//ʵ���㷨
		if(hi <= lo) return;
		int j = partition(a, lo, hi);      //�з��㷨
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	private static int partition(Comparable[] a, int lo, int hi) {
		//�з��㷨
		int i = lo, j = hi+1;
		Comparable v = a[lo];
		while (true) {
			//ɨ�����ң� ���ɨ���Ƿ�������ҽ���Ԫ��
			while (less(a[++i], v)) if (i == hi ) break;     //ɸѡ��lo,hi�����ȴ���a[lo]��Ԫ��
			while (less(v, a[--j]))  if (j == lo ) break;     //ɸѡ��lo,hi������С��a[lo]��Ԫ��
			if (i >= j) break;                                             //������ȴ��ڵ�Ԫ��λ�ô�������С�ڵ�Ԫ��λ�������߲�����
			exch(a, i, j);
			//Change(a);
		}
		exch(a, lo, j);                    //��v = a[j]������ȷ��λ��
		//Change(a);
		return j;
		}
	
	public static boolean less(Comparable v,  Comparable w) {
		//�Ƿ�v < w
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		//����a[i] a[j]
		StdOut.println("Exchange: " + i + " " +  j);
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void show(Comparable[] a) {
		//��̬ͼ����ʾ
		for (int i = 0; i < a.length; i++){
			double x = 1.0 * i / a.length;
			double y = (double)a[i] / 2.0;
			double rw = 0.5 /  a.length;
			double rh = (double)a[i] / 2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
            //x ���������Ǹ�λ��  y��������ߵĸ߶�
            // rw rh ����ƽ���������
		}
	}
	
	public static void Change (Comparable[] a){
		//��̬ͼ��
		show(a); 
		StdDraw.show(); 
		//StdDraw.pause(1000);
		StdDraw.enableDoubleBuffering();  
		StdDraw.clear();
	}
	
	public static boolean isSorted(Comparable[] a) {
		//��������Ԫ���Ƿ�����
		for (int i = 0; i < a.length ; i++)
			if(less(a[i], a[i-1])) return false;
		return true;
	}
	
	public static void Allshow (Comparable[] a) {
		//���д�ӡ����
		for (int i = 0; i < a.length; i++) 
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
}
