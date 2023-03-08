package wang.story.bookrack;

import wang.story.book.Suit;

import java.util.ArrayList;
import java.util.List;

public class BBookrack extends BasicBookrack<Suit> {
    List<Suit> books = new ArrayList<>();
    public BBookrack(){

    }
    public BBookrack(int number) {
        setNumber(number);
    }

    @Override
    List<Suit> getBooks() {
        return books;
    }

    public double save(Suit suit){
        return suit.price-suit.price*suit.discount;
    }

}
