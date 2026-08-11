class MirrorRunner{
	public static void main(String[] args){
		
		String shape="Rectangle";
		double height=5.5;
		String frameColor="Brown";
		boolean forWall=true;
		int price=500;

		Mirror.reflect(shape,height,frameColor,forWall,price);
	}
}