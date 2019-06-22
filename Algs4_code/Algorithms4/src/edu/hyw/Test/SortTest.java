package edu.hyw.Test;

import java.awt.Color;
import java.util.Random;

import edu.hyw.Sort.Insertion;
import edu.hyw.Sort.Merge;
import edu.hyw.Sort.Quick;
import edu.hyw.Sort.Selection;
import edu.hyw.Sort.Shell;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortTest {
	/**
	  * @Title:  SortTest.java   
	  * @Package edu.hyw.Test   
	  * @Description:    测试排序   
	  * @author: hyw 
	  * @date:   2018年12月2日 下午11:22:02   
	  * @version V1.0       */
	public static double time(String alg, Comparable[] a) {
		Stopwatch timer = new Stopwatch();
		if (alg.equals("Insertion"))			Insertion.sort(a);
		if (alg.equals("Shell"))				Shell.sort(a);
		if (alg.equals("Selection"))			Selection.sort(a);
		if (alg.equals("Merge"))				Merge.sort(a);
		return timer.elapsedTime();
	}
	
	public static double timeRandomInput(String alg, int N, int T) {
		//使用算法alg将T个长度为N的数组排列
		double total = 0.0;
		Double[] a = new Double[N];
		for (int t = 0; t < T; t++) {
			//进行一次测试
			for (int i = 0; i < N;  i++)
				a[i] = StdRandom.uniform();
			total += time(alg, a)*100;
		}
		return total/T;
	}
	
	public static void timePaint(String alg, int N, int T){
		for (int n = 0; n < N; n++) 
			StdDraw.point(n,timeRandomInput(alg, n, T));
	}
	
	public static void main(String[] args) {
			int N = Integer.parseInt(args[0]);
			//int T = Integer.parseInt(args[1]);   
			//String[] algs = {"Shell", "Merge", "Selection", "Insertion"};
			/*Double[] times = new Double[algs.length];
			StdOut.printf("For %d random Doubles\n", N);
			for (int i = 0; i < algs.length; i++) {
				StdOut.println("test " + algs[i]);
				times[i] = timeRandomInput(algs[i], N, T);
				StdOut.printf("%s spend %.2f ms\n", algs[i], times[i]*100);
			}*/
			 /*StdDraw.setXscale(0,N);
		     StdDraw.setYscale(0,10);
		     StdDraw.setPenRadius(.01);
		     Color[] colors = {Color.BLUE, Color.red, Color.GREEN, Color.black};
			for(int j = 0; j < algs.length; j++) {
				StdDraw.setPenColor(colors[j]);
				timePaint(algs[j], N, T);
			}*/
			Double[] a = new Double[N];
			for (int i = 0; i < N;  i++)
				a[i] = StdRandom.uniform();
			Quick.sort(a);
			Quick.Allshow(a);
	}
	
	
}
