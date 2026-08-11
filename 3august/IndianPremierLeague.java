class IndianPremierLeague{
    public static void iplInfo(String teamName,String captainName,double teamValue,int trophiesWon,boolean isQualified,String homeGround,int totalPlayers,boolean hasForeignPlayers,String topBatsman,int topRuns,String topBowler,int wickets,String ownerName){
		System.out.println("Team Name:"+teamName);
		System.out.println("Captain Name:"+captainName);
		System.out.println("Team Value:"+teamValue);
		System.out.println("Trophies Won:"+trophiesWon);
		System.out.println("Is Qualified:"+isQualified);
		System.out.println("Home Ground:"+homeGround);
		System.out.println("Total Players:"+totalPlayers);
		System.out.println("Has Foreign Players:"+hasForeignPlayers);
		System.out.println("Top Batsman:"+topBatsman);
		System.out.println("Top Runs:"+topRuns);
		System.out.println("Top Bowler:"+topBowler);
		System.out.println("Wickets:"+wickets);
		System.out.println("Owner Name:"+ownerName);
	}
	public static void main(String[] args){

		String teamName="RCB";
		String captainName="Virat Kohli";
		double teamValue=8500;
		int trophiesWon=0;
		boolean isQualified=true;
		String homeGround="Chinnaswamy";
		int totalPlayers=25;
		boolean hasForeignPlayers=true;
		String topBatsman="Virat Kohli";
		int topRuns=8004;
		String topBowler="Yash Dayal";
		int wickets=15;
		String ownerName="Ananya Birla";

		IndianPremierLeague.iplInfo(teamName,captainName,teamValue,trophiesWon,isQualified,homeGround,totalPlayers,hasForeignPlayers,topBatsman,topRuns,topBowler,wickets,ownerName);

		IndianPremierLeague.iplInfo("CSK","MS Dhoni",9000,5,true,"Chepauk",25,true,"Ruturaj Gaikwad",2500,"Ravindra Jadeja",170,"India Cements");
	}
}