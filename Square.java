//This class creates a Square from a given side and calculates the area.
//Joshua Henderson
//CS131Lab0_1_JHH
public class Square {
	//side
	private int side;
	/**
	 * @param this.side set to side
	 */
	public Square(int side) {
		this.side=side;
	}//end Square 
	/**
	 * @param side set to 2
	 */
	public void setSide(int i) {
		side = i;
	}// end setSide 
	/** 
	 * @return value of side
	 */
	public int getSide() {
		return side;
	}//end getSide
	/** 
	 * @return area of the square
	 */
	public int getArea() {
		return this.side*this.side;
	}//end area 
}//end class