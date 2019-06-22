package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Merge {

	/**
		  * @Title:  Merge.java  
		  * @Package edu.hyw.Sort
		  * @Description:    TODO �鲢����
		  * @author: hyw 
		  * @date:   2018��12��5�� ����5:11:35   
		  * @version V1.0       */
	
	private static Comparable[] aux;
	
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		//ԭ�ع鲢����
		int i = lo , j = mid + 1;
		for (int k = lo; k <= hi; k++)    //��a[lo..hi]���Ƶ�aux[0..(hi-lo)]
			aux[k] = a[k]; 
		
		for (int k = lo; k <= hi; k++)     //�鲢��a[lo..hi]
			if			(i > mid )							a[k] = aux[j++];
			else if	(j > hi    )							a[k] = aux[i++];
			else if (less(aux[j], aux[i]))		a[k] = aux[j++];
			else												a[k] = aux[i++];
	}
	
	public static boolean less(Comparable v,  Comparable w) {
		//�Ƿ�v < w
		return v.compareTo(w) < 0;
	}
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		//����a[lo..hi]
		if(hi <= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid);					//��������
		sort(a, mid+1, hi);				//�����Ұ��
		merge(a, lo, mid, hi);			//�鲢
		//Change(a);
		}
	
	public static void Allshow (Comparable[] a) {
		StdOut.print("a: ");
		for (int i = 0; i < a.length; i++) 
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
	
	public static void show(Comparable[] a) {
		//��̬ͼ����ʾ
		//for (int i = 0; i < a.length; i++) StdOut.print(a[i] + " ");
		//StdOut.println();
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
}
