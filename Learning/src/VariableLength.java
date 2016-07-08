class VariableLength {
	public static void main(String []args) {
		System.out.println(average(43, 56, 76, 8, 2, 31));
		
	}
	public static int average(int...numbers) { //int...numbers means an unknown amount of numbers
		int total=0;
		for(int x:numbers) { //enhanced for loop
			total+=x; 
		}
		return total/numbers.length;
	}
}

	
	