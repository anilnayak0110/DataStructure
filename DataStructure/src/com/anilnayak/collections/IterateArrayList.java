package com.anilnayak.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        
        Iterator<String> itr = c1.iterator();
        while(itr.hasNext()) {
        	System.out.print(itr.next()+", ");
        }
	}

}
