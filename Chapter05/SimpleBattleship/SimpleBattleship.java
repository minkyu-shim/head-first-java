public class SimpleBattleship{
	private int[] locationCells;
	private int numOfHits;
	
	public SimpleBattleship(int[] locationCells){
		this.locationCells = locationCells;
		this.numOfHits = 0;
	}
	
	public String checkYourself(int guess) {
		String result = "miss";
		
		for (int cell : this.locationCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				
				if (numOfHits == locationCells.length) {
					result = "kill";
				} // end if
				
				break;
			} // end if
			
		}
		System.out.println(result);
		return result;
		// end for
	} // end method
}