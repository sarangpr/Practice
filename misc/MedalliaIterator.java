package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MedalliaIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Iterator<String>> lists = new ArrayList<>();
		lists.add(Arrays.asList("a", "b", "c").iterator());
		lists.add(null);
		lists.add(Arrays.<String> asList().iterator());
		lists.add(Arrays.asList("d", "e").iterator());
		lists.add(Arrays.<String> asList().iterator());
		Iterator<Iterator<String>> iters = lists.iterator();
		Iterator<String> flattened = flatten(iters);
		while (flattened.hasNext()) {
			System.out.println(flattened.next());
		}
	}

	private static Iterator<String> flatten(
			final Iterator<Iterator<String>> iters) {
		
		if (iters == null) {
			throw new IllegalArgumentException("Cannot be null");
		}
		Iterator<String> returnIterator = new Iterator<String>() {
			
			Iterator<String> currentIterator = null;

			@Override
			public void remove() {
				// TODO Auto-generated method stub

			}

			@Override
			public String next() {
				updateCurrent();
				if(currentIterator==null){
					throw new NoSuchElementException();
				}
				return currentIterator.next();
			}

			private void updateCurrent() {
				if (currentIterator == null || !currentIterator.hasNext()) {
					do {
						if (iters.hasNext()) {
							currentIterator = iters.next();
						}else{
							currentIterator = null;
							break;
						}
					}while (currentIterator==null||!currentIterator.hasNext());
				}
			}

			@Override
			public boolean hasNext() {
				updateCurrent();
				if(currentIterator==null){
					return false;
				}
				return currentIterator.hasNext();
			}
		};
		return returnIterator;
	}

}
