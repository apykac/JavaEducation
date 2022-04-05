package ru.gazprombank.educate.test.util.reflection;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class EqualsHashCodeClass<T> {
    private Integer hashCode;

    abstract boolean fieldEquals(T t);

    abstract int calculateHashCode();

    protected <O> boolean equalsLists(List<O> list1, List<O> list2) {
        if (list1 == null && list2 == null) {
            return true;
        } else if (list1 != null && list2 != null && list1.size() == list2.size()) {
            Iterator<O> iterator1 = list1.listIterator();
            Iterator<O> iterator2 = list2.listIterator();
            while (iterator1.hasNext()) {
                O o1 = iterator1.next();
                O o2 = iterator2.next();
                if (!Objects.equals(o1, o2)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    protected <O> HashCodeCalculator hashList(List<O> list) {
        return new HashCodeCalculator() {
            @Override
            public int hashCode() {
                if (list == null || list.isEmpty()) {
                    return 0;
                } else {
                    int result = 1;
                    for (O element : list) {
                        result = 31 * result + (element == null ? 0 : element.hashCode());
                    }
                    return result;
                }
            }
        };
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() || !hashCode.equals(((EqualsHashCodeClass<?>) o).hashCode)) {
            return false;
        }
        return fieldEquals((T) this);
    }

    @Override
    public int hashCode() {
        if (hashCode == null) {
            hashCode = calculateHashCode();
        }
        return hashCode;
    }

    private interface HashCodeCalculator {
        int hashCode();
    }
}
