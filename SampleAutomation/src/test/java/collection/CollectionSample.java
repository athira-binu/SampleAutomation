package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {
	public void show() {
		//non generic
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add("hello");
		a1.add(20.0f);
		a1.remove(2);
		//generic
		ArrayList<String> a2=new ArrayList();
		a2.add("hey");
		a2.add("athira");
		//a2.remove(0);
		//a2.add(10);
		System.out.println(a1);
		System.out.println(a2);
		ArrayList<String> a3=new ArrayList();
		a3.addAll(a2);
		
		System.out.println(a3);
		a2.removeAll(a2);
		System.out.println(a2);
		System.out.println("Size of a3 is " +a3.size());
		System.out.println(a3.get(0));
		boolean b = a3.contains("hello");
		System.out.println(b);
		Iterator itr = a3.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(a3);
	}

	public static void main(String[] args) {
		CollectionSample c = new CollectionSample();
		c.show();

	}

}
