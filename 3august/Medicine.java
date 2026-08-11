class Medicine{
	public static void medicineInfo(String medicineName,double medicinePrice, int expiryYear,char medicineGrade,boolean prescriptionRequired,int batchNumber){

        System.out.println("Medicine Name : " +medicineName);
        System.out.println("Medicine Price : " +medicinePrice);
        System.out.println("Expiry Year : " +expiryYear);
        System.out.println("Medicine Grade : " +medicineGrade);
        System.out.println("Prescription Required : "+prescriptionRequired);
        System.out.println("Batch Number : "+batchNumber);
    }
	public static void main(String[] args) {

        String medicineName = "Dolo 650";
        double medicinePrice = 35.50;
        int expiryYear = 2028;
        char medicineGrade = 'A';
        boolean prescriptionRequired = false;
        int batchNumber = 20260;

        Medicine.medicineInfo(medicineName, medicinePrice, expiryYear,medicineGrade, prescriptionRequired, batchNumber);
		
		Medicine.medicineInfo("Paracetomol",30,2029,'B',true,23255);
    }
}