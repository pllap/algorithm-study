import java.util.Iterator;

public class LC284 implements Iterator<Integer> {

    private Integer next;
    private Iterator<Integer> it;

    public LC284(Iterator<Integer> iterator) {
        it = iterator;
        next = it.next();
    }

    public Integer peek() {
        return next;
    }

    @Override
    public Integer next() {
        Integer result = next;
        if (hasNext()) {
            next = it.next();
        } else {
            next = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}

// list로 구현
//class PeekingIterator implements Iterator<Integer> {
//
//    private int index;
//    private List<Integer> list;
//    private int length;
//
//    public PeekingIterator(Iterator<Integer> iterator) {
//        list = new ArrayList<>();
//        while (iterator.hasNext()) {
//            list.add(iterator.next());
//        }
//        length = list.size();
//        index = 0;
//    }
//
//    public Integer peek() {
//        return list.get(index);
//    }
//
//    @Override
//    public Integer next() {
//        return list.get(index++);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return index < length;
//    }
//}
