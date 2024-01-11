package java8;

import java.util.ArrayList;
import java.util.List;

public class StreamAPImap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("seshu");
		list.add("babu");
		list.add("karanam");
		list.add("akhil");
		list.add("veerakumari");
        list.stream().filter(element->element.length()>=5).map(ele->ele).forEach(System.out::println);
	}

}
