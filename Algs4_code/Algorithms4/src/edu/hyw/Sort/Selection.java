package edu.hyw.Sort;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Selection {
	/**
	  * @Title:  Shell.java   
	  * @Package edu.hyw.Sort   
	  * @Description:    ֱ��ѡ������ 
	  * @author: hyw 
	  * @date:   2018��12��2�� ����11:04:12   
	  * @version V1.0       */
	
	public static void sort (Comparable[] a) {
		//�����㷨
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+2; j < N; j++)
				if(less(a[j], a[min])) min = j;
			exch(a, i ,min);
			//Change(a);
		}
	}
	
	public static boolean less(Comparable v,  Comparable w) {
		//�Ƿ�v < w
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		//����a[i] a[j]
		//StdOut.println("Exchange: " + a[i] + a[j]);
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
