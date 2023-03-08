package wang.story.bookrack;

import wang.story.book.Book;
import wang.story.book.Volume;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CBookrack extends BasicBookrack<Book> {
    List<Book> books = new ArrayList<>();

    public void a(){
        List<Volume> filterList = new ArrayList<>();
        for(Book b : books){
            if (b instanceof Volume) {
                filterList.add((Volume) b);
            }
        }
        for(Volume c : filterList){
            if(c.time < System.currentTimeMillis()){
                filterList.remove(c);
            }
        }
    }

    @Override
    List<Book> getBooks() {
        return books;
    }

    public CBookrack(int number) {
        setNumber(number);
    }
}
