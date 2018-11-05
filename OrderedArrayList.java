import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	public OrderedArrayList() {

	}

	public OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}

	public boolean add(T element) {
		int max = 0;
		for(int i = 0; i < size(); i++) {
			if(element.compareTo(get(i)) >= 0) {max = i+1;}
		}
		super.add(max,element);
		return true;
	}

	public void add(int index, T element) {
			add(element);
	}

//	public T set(int index, T element) {
	//}

}
