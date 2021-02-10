package task.predicate;

import java.util.function.Predicate;

/**
 *
 * @author nicol
 */
class TaskPredicate<E> implements Predicate<Integer> {

    public boolean isEven(Integer num) {

        return num % 2 == 0;
    }

    public boolean isPositive(Integer num) {

        return num > 0;
    }
    
    @Override
    public boolean test(Integer t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
