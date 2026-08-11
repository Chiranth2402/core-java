class Camera{
public static void cameraInfo(String cameraBrand,String cameraModel,double cameraPrice,int cameraPixels,boolean hasFlash,String cameraColor,int warrantyYears,boolean isMirrorless){
		System.out.println("Camera Brand:"+cameraBrand);
		System.out.println("Camera Model:"+cameraModel);
		System.out.println("Camera Price:"+cameraPrice);
		System.out.println("Camera Pixels:"+cameraPixels);
		System.out.println("Has Flash:"+hasFlash);
		System.out.println("Camera Color:"+cameraColor);
		System.out.println("Warranty Years:"+warrantyYears);
		System.out.println("Is Mirrorless:"+isMirrorless);
	}
	public static void main(String[] args){

		String cameraBrand="Canon";
		String cameraModel="EOS1500D";
		double cameraPrice=45999.0;
		int cameraPixels=24;
		boolean hasFlash=true;
		String cameraColor="Black";
		int warrantyYears=2;
		boolean isMirrorless=false;

		Camera.cameraInfo(cameraBrand,cameraModel,cameraPrice,cameraPixels,hasFlash,cameraColor,warrantyYears,isMirrorless);

		Camera.cameraInfo("Sony","A6400",74999.0,24,true,"Silver",3,true);
	}
}