/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card A = new Card("One", "Diamonds", 5);
		Card B = new Card("one", "diamonds", 5);
		Card C = new Card("Joker", "rekoJ", 9001);
		System.out.println(A.suit());
		System.out.println(B.suit());
		System.out.println(C.suit());
		System.out.println(B.rank());
		System.out.println(A.rank());
		System.out.println(C.rank());
		System.out.println(C.pointValue());
		System.out.println(A.pointValue());
		System.out.println(B.pointValue());
		System.out.println(A.matches(C));
		System.out.println(B.matches(A));
		System.out.println(C.matches(B));
		System.out.println(C.toString());
		System.out.println(B.toString());
		System.out.println(A.toString());
	}
}
