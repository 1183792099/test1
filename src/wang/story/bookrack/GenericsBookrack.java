package wang.story.bookrack;

import wang.story.book.Fiction;
import wang.story.book.Suit;
import wang.study.room.Lamp;

import java.util.*;

public class GenericsBookrack<T> {
    T t1;

    T aa(T t) {
        return t;
    }
}

class FictionBookrack {
    Fiction fiction1;
    Fiction fiction2;
}

class SuitBookrack {
    Suit suit1;
    Suit suit2;
}

class LampBoolrack {
    Lamp lamp1;
    Lamp lamp2;
}

class GenericsBookrack1 {
    Object o1;
    Object o2;
}

class GenericsBookrack2<T, TypeA> {
    T t1;
    T t2;
    TypeA typeA;
    List<T> list;

    T getT() {
        return t1;
    }

    public static void main(String[] args) {
        Object t1 = new GenericsBookrack2<Object, Object>().t1;
        ArrayList<Suit> suits = new ArrayList<>();
        Map<String, Fiction> map = new HashMap<>();
        Suit suit1 = new Suit();
        map.put(suit1.name, suit1);
        Suit suit2 = new Suit();
        map.put(suit2.name, suit2);

        new ABookrack(0).getBooks();
        new BBookrack(0).getBooks();
    }
}