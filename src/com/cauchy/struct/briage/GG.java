package com.cauchy.struct.briage;

public class GG {
	public void chase(MM mm) {
		Gift warmFlower = new WarmGift(new Flower());
		give(mm,warmFlower);
		Gift warmBook = new WarmGift(new Book());
		give(mm,warmBook);
		Gift coldFlower = new ColdGift(new Flower());
		give(mm,coldFlower);
		Gift coldBook = new ColdGift(new Book());
		give(mm,coldBook);
		
	}
	public void give(MM mm, Gift g) {
		
	}
}
