package wang.story.bookrack;

import wang.story.book.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicBookrack<BookType> {
    int number;

    abstract List<BookType> getBooks();

    public int getNumber() {
        Object o = new GenericsBookrack<Book>().t1;
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        if(number<=100 && number>0)
            System.out.println("当前单册数量"+number+",上限数量100");
        else
            System.out.println("上限数量为100，超过上限");
    }

}
