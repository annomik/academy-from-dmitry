package by.academy.lesson12.enums;

public class CoffeeSizeDemo {

	public static void main(String[] args) {

		CoffeeSize size = CoffeeSize.BIG;
//		System.out.println(size);
		
		CoffeeSize2 size2 = CoffeeSize2.OVERWHELMING;

		System.out.println(size2.getMl());
		System.out.println(size2.getS());
//
		for (CoffeeSize s : CoffeeSize.values()) {
			System.out.println(s.name());
		}

//		System.out.println(size);

	}

}
