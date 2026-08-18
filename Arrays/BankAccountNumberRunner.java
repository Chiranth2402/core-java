class BankAccountNumberRunner{
	public static void main (String[] args){
		
		String chiranthAccountNumber="abc123321";
		String varunAccountNumber="def321123";
		String suhasAccountNumber="ghi456321";
		
		String[] accountNumbers={chiranthAccountNumber,varunAccountNumber,suhasAccountNumber,"jkl654123","mno987456"};
		
		int numberOfElementsInAnArray=accountNumbers.length;
		
		System.out.println("The number of elements in accountNumbers array are:"+numberOfElementsInAnArray);
	}
}