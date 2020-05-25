class Solution {
	public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
//    public String defangIPaddr(String address) {
//        String[] split = address.split("\\.");
//        String join = String.join("[.]", split);
//        System.out.println(join);
//        return join;
//    }
}

public class Main {

	public static void main(String[] args) {
		Solution s1 = new Solution();
		
		s1.defangIPaddr("1.1.1.1");
		
	}

}
