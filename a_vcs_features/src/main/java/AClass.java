import java.util.ArrayList;
import java.util.List;

public class AClass {

	public void foo() {
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

		// use add() method to add elements in the list
		arrlist.add(15);
		arrlist.add(22);
		arrlist.add(30);
		arrlist.add(40);
		arrlist.add(41);
		arrlist.add(42);
		arrlist.add(42);
		arrlist.add(10);
		arrlist.add(20);
		arrlist.add(340);
		arrlist.add(44);
		arrlist.add(45);
		arrlist.add(48);
		arrlist.add(48);
		arrlist.add(46);
		arrlist.add(49);
		arrlist.add(454);
		arrlist.add(404);
		arrlist.add(400);
		arrlist.add(401);
		arrlist.add(430);
		arrlist.add(440);
		arrlist.add(430);
		arrlist.add(420);
		arrlist.add(430);
		arrlist.add(440);
		arrlist.add(430);
		arrlist.add(140);
		arrlist.add(940);
		arrlist.add(420);

		// adding element 25 at third position
		arrlist.add(2,25);

		// let us print all the elements available in list
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}
	}

	public void bar() {

	}
}
