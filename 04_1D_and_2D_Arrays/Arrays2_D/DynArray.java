package Arrays2_D;

class Array {
	
	
	private int[] items;
	private int count;
	
	public Array(int length) {
		
		items = new int[length];
	}
	
	public void print() {
		
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
	
	public void insert(int number) {
		
		//If an item is added to the end
		items[count]=number;
		count++;
		
		//If the array is full, resize it
		if(items.length == count) {
			
			int[] newItems = new int[count*2];
			
			for(int i=0;i<count;i++) {
				newItems[i]=items[i];
			}
			
			items=newItems;
		}
		
	}
	
	//Delete
	public void removeAt(int index) {
		
		if(index<0 || index>=count ) {
			throw new IllegalArgumentException();
		}	
		
		for(int i=index;i<count;i++) {
			items[i]=items[i+1];
		}
		
		count--;
	}
	
	//Search
	public int indexOf(int number) {
		
		for(int i=0;i<count;i++) {
			if(number == items[i]) {
				return i;
			}
		}
		
		return -1;
		
	}
}


public class DynArray {
	
	public static void main(String[] args) {
		
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.removeAt(0);
		
		System.out.println("index of the number : " +numbers.indexOf(60));
		numbers.print();
	
	}

}
