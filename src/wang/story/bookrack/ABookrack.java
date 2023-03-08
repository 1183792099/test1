package wang.story.bookrack;

import wang.story.book.Fiction;

import java.util.ArrayList;
import java.util.List;

public class ABookrack extends BasicBookrack<Fiction> {
    List<Fiction> books = new ArrayList<>();

    public ABookrack(int number){
        setNumber(number);
    }

    @Override
    List<Fiction> getBooks() {
        return books;
    }
}
