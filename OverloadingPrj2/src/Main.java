
//Method overloading - examplke 2

class SearchUtil {
	public int search(int a[], int ele) {
		return search(a, ele, 0);
	}
	public int search(int a[], int ele, int pos) {

		for( int i = pos; i < a.length; i++ ) {
			if (a[i] == ele) {
				return i;
			}
		}
		return -1;
	}
}

public class Main {

	public static void main(String[] args) {
		int arr[] = {10,20,30,10,30,40};
		int ele = 30;
		
		SearchUtil obj = new SearchUtil();
		int x = obj.search(arr, ele); // expect index 2
		
		int y = obj.search(arr, ele, x + 1); // Search starting from after x position
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}

}
