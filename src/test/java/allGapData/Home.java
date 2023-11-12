package allGapData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[]ar= {3,30,34,5,9};
		List<Integer>li=Arrays.asList(ar);
		Collections.sort(li);
		
		Collections.reverse(li);
		for(int i=0;i<li.size();i++) {
		
			System.out.print(li.get(i));
		
			
		}
		
	}
		
	
	//@Test	
public void cc() {
	List list=new ArrayList();
	list.add("asma");
	list.add("salma");
	list.add("lima");
	list.add("ruma");
	list.add("salma");
	Set set=new HashSet();
	set.addAll(list);
	//list.remove( )
	Iterator it=set.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
		
	}
		
	}	
		
		
	//@Test
	
public void getAddAllM() {
	Integer []i= {1,2,3,4};
	for(int in:i) {

	}
	List list1=new ArrayList();
	list1.add(4);
	list1.add(2);
	list1.add(3);
	
	List list2=new ArrayList(list1);	
	list2.add(list1);
	System.out.println(list2);
	}	
			



@Test//adding 2 array

public void addArray() {
	int []a= {1,2,3,7};
	int []b= {4,5,6,8};
	int size1=a.length;
	int size2=b.length;
	int index=0;
	int []c=new int[size1+size2];
	for(int i=0;i<size1;i++) {
		
		c[index]=a[i];
		index++;}
		
		for(int j=0;j<size2;j++) {
			
			c[index]=b[j];
			index++;
		}
		for(int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}}
