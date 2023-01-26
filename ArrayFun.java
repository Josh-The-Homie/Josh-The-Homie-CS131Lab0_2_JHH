//This class creates an Array of type Square and calculates different sums of said squares.
//Joshua Henderson
//CS131Lab0_2_JHH
public class ArrayFun {
	//Array of type Square
	Square[] myArray= new Square[6];
	/**
	 * set myArray index number to Squaere
	 */
	public ArrayFun() {
		for (int i=0;i<6;i++) {
			myArray[i]=new Square(i);
		}
	}//end ArrayFun
	/**
	 * 
	 * @param index the value of index in the array to be set to s
	 */
	public void setArrayItem(int index, Square s) {
		myArray[index]=s;
	}//end setArrayItem
	/**
	 * @return Square in index
	 */
	public Square getArrayItem(int index) {
		return myArray[index];
	}//end ArrayItem
	/**
	 * For loop to print the areas of the squares going forwards.
	 */
	public void forward() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Area of square at index " + i + ": " + myArray[i].getArea());
        }
    }//end forward
	/**
	 * For loop to print the areas of the squares going backwards.
	 */
    public void backward() {
        for (int i = 5; i >= 0; i--) {
            System.out.println("Area of square at index " + i + ": " + myArray[i].getArea());
        }
    }//end backward
    /**
	 * For loop to print sum of the areas of the squares.
	 */

    public void sum() {
        int total = 0;
        for (int i = 0; i < 6; i++) {
            total += myArray[i].getArea();
        }
        System.out.println("Total area of all squares: " + total);
    }//end sum
}//end class
