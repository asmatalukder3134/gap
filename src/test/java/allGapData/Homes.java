package allGapData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Homes {
	@Test
	public void bb() {

		Integer []ar= {2,5,4,3,4};
		Integer []aa= {3,1,7,9,8,5};
		
	List li=Arrays.asList(ar);
	List lo=Arrays.asList(aa);
	List ll=new ArrayList();
	ll.addAll(li);
	ll.addAll(lo);
	//Set set=new HashSet();
	//set.addAll(li);
	//set.addAll(lo);
		//System.out.println(set);
	for(int i=0;i<ll.size();i++) {
		for(int j=i+1;j<ll.size();j++) {
			if(ll.get(i)==ll.get(j)) {
				System.out.println(ll.get(i));
			}
		}
	}
}
}