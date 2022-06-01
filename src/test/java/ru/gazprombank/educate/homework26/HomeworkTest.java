package ru.gazprombank.educate.homework26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import ru.gazprombank.educate.test.util.Modifier;
import ru.gazprombank.educate.test.util.Pair;
import ru.gazprombank.educate.test.util.reflection.ClassCash;
import ru.gazprombank.educate.test.util.reflection.TestClass;
import ru.gazprombank.educate.test.util.reflection.TestConstructor;
import ru.gazprombank.educate.test.util.reflection.TestField;
import ru.gazprombank.educate.test.util.reflection.TestMethod;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HomeworkTest {
    private TestClass catClass;

    @BeforeEach
    void setUp() {
        catClass = ClassCash.getClass("ru.gazprombank.educate.homework26.Cat");
    }

    @DisplayName("'name' field exist")
    @Test
    void nameFieldTest() {
        getNameField();
    }

    @DisplayName("'age' field exist")
    @Test
    void ageFieldTest() {
        getAgeField();
    }

    @DisplayName("'weight' field exist")
    @Test
    void weightFieldTest() {
        getWeightField();
    }

    @DisplayName("no args constructor: exist check")
    @Test
    void noArgsConstructorExistTest() {
        getNoArgsCatConstructor();
    }

    @DisplayName("no args constructor: create object check")
    @Test
    void noArgsConstructorObjectCreateTest() throws Exception {
        Object catShroedinger = getNoArgsCatConstructor().getInstance();
        Assertions.assertEquals("Кот Шрёдингера", getNameField().getValue(catShroedinger), "wrong cat shroedinger name");
    }

    @DisplayName("constructor(name, age, weight): exist check")
    @Test
    void argsConstructorExistTest() {
        getArgsCatConstructor();
    }

    @DisplayName("constructor(name, age, weight): name exception (null name)")
    @Test
    void argsConstructorNameException1Test() {
        getArgsCatConstructor();
        assertThrowsExactly(IllegalArgumentException.class,
                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), null, 1, 1), "must be exception of creation");
    }

    @DisplayName("constructor(name, age, weight): name exception (empty name)")
    @Test
    void argsConstructorNameException2Test() {
        getArgsCatConstructor();
        assertThrowsExactly(IllegalArgumentException.class,
                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "", 1, 1), "must be exception of creation");
    }

    @DisplayName("constructor(name, age, weight): age exception (negative age)")
    @Test
    void argsConstructorAgeException1Test() {
        getArgsCatConstructor();
        assertAll(
                Stream.concat(
                                Stream.of((Executable) () -> assertThrowsExactly(IllegalArgumentException.class,
                                        () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", -1, 1), "must be exception of creation")),
                                IntStream.range(0, 10).boxed()
                                        .map(i -> ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, -1))
                                        .map(age -> () -> assertThrowsExactly(IllegalArgumentException.class,
                                                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", age, 1), "must be exception of creation"))
                        )
                        .collect(Collectors.toList())
        );
    }

    @DisplayName("constructor(name, age, weight): age exception (to old age)")
    @Test
    void argsConstructorAgeException2Test() {
        getArgsCatConstructor();
        assertAll(
                Stream.concat(
                                Stream.of((Executable) () -> assertThrowsExactly(IllegalArgumentException.class,
                                        () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", 19, 1), "must be exception of creation")),
                                IntStream.range(0, 10).boxed()
                                        .map(i -> ThreadLocalRandom.current().nextInt(20, Integer.MAX_VALUE))
                                        .map(age -> () -> assertThrowsExactly(IllegalArgumentException.class,
                                                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", age, 1), "must be exception of creation"))
                        )
                        .collect(Collectors.toList())
        );
    }

    @DisplayName("constructor(name, age, weight): weight exception (negative age)")
    @Test
    void argsConstructorWeightException1Test() {
        getArgsCatConstructor();
        assertAll(
                Stream.concat(
                                Stream.of((Executable) () -> assertThrowsExactly(IllegalArgumentException.class,
                                        () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", -1, 1), "must be exception of creation")),
                                IntStream.range(0, 10).boxed()
                                        .map(i -> ThreadLocalRandom.current().nextInt(Integer.MIN_VALUE, -1))
                                        .map(age -> () -> assertThrowsExactly(IllegalArgumentException.class,
                                                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", age, 1), "must be exception of creation"))
                        )
                        .collect(Collectors.toList())
        );
    }

    @DisplayName("constructor(name, age, weight): weight exception (to old age)")
    @Test
    void argsConstructorWeightException2Test() {
        getArgsCatConstructor();
        assertAll(
                Stream.concat(
                                Stream.of((Executable) () -> assertThrowsExactly(IllegalArgumentException.class,
                                        () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", 19, 1), "must be exception of creation")),
                                IntStream.range(0, 10).boxed()
                                        .map(i -> ThreadLocalRandom.current().nextInt(20, Integer.MAX_VALUE))
                                        .map(age -> () -> assertThrowsExactly(IllegalArgumentException.class,
                                                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Catzilla", age, 1), "must be exception of creation"))
                        )
                        .collect(Collectors.toList())
        );
    }

    @DisplayName("constructor(name, age, weight): try to create Cat Shroedinger")
    @Test
    void tryToCreateCatShroedinger() {
        assertThrowsExactly(ClassCash.getClass("ru.gazprombank.educate.homework26.CollapseOfUniverse").getGenericClazz(),
                () -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), "Кот Шрёдингера", 1, 1), "must be exception of creation");
    }

    @DisplayName("constructor(name, age, weight): success create")
    @Test
    void successCreateCatArgsConstructor() {
        getArgsCatConstructor();
        assertAll(
                IntStream.range(1, 19).boxed()
                        .flatMap(age -> IntStream.range(1, 11).boxed()
                                .map(Double::valueOf)
                                .map(weight -> new Pair<>(age, weight)))
                        .map(pair -> (Executable) () -> assertDoesNotThrow(() -> getArgsCatConstructor().getInstance(constructorExceptionClasses(), randomString(), pair.getFirst(), pair.getSecond()), "must be normal cat creation"))
                        .collect(Collectors.toList())
        );
    }

    @DisplayName("'stronger' method: exist check")
    @Test
    void noArgsConstructorTest() {
        getStrongerCatMethod();
    }

    @DisplayName("'stronger' method: cat found no one")
    @Test
    void stronger1() throws Exception {
        Object catVasya = getArgsCatConstructor().getInstance("Vasya", 1, 1);
        assertThrowsExactly(ClassCash.getClass("ru.gazprombank.educate.homework26.CatFoundNoOne").getGenericClazz(),
                () -> getStrongerCatMethod().invokeMethod(methodExceptionClasses(), catVasya, (Object) null), "exception expected");
    }

    @DisplayName("'stronger' method: cat with him self")
    @Test
    void stronger2() throws Exception {
        Object catVasya = getArgsCatConstructor().getInstance("Vasya", 1, 1);
        assertFalse((boolean) getStrongerCatMethod().invokeMethod(methodExceptionClasses(), catVasya, catVasya));
    }

    @DisplayName("'stronger' method: Cat Shroedinger ultimate")
    @Test
    void stronger3() throws Exception {
        Object catShroedinger = getNoArgsCatConstructor().getInstance();
        assertAll(
                IntStream.range(1, 19).boxed()
                        .flatMap(age -> IntStream.range(1, 11).boxed()
                                .map(Double::valueOf)
                                .map(weight -> new Pair<>(age, weight)))
                        .map(pair -> {
                            try {
                                return getArgsCatConstructor().getInstance("Vasya", pair.getFirst(), pair.getSecond());
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        })
                        .map(catVasya -> (Executable) () -> assertTrue((boolean) getStrongerCatMethod().invokeMethod(catShroedinger, catVasya), "Cat Shroedinger has ultimate power"))
                        .collect(Collectors.toList())
        );
    }

    @DisplayName("'stronger' method: symmetry principal")
    @Test
    void stronger4() throws Exception {
        List<Object> catList = sortedCatList();
        Object cat1 = catList.get(0);
        Object cat2 = catList.get(1);
        assertFalse((boolean) getStrongerCatMethod().invokeMethod(cat1, cat2), cat2 + " must be stronger than " + cat1);
        assertTrue((boolean) getStrongerCatMethod().invokeMethod(cat2, cat1), cat2 + " must be stronger than " + cat1);
    }

    @DisplayName("'stronger' method: transitivity principal")
    @Test
    void stronger5() throws Exception {
        List<Object> catList = sortedCatList();
        Object cat1 = catList.get(0);
        Object cat2 = catList.get(1);
        Object cat3 = catList.get(2);
        assertTrue((boolean) getStrongerCatMethod().invokeMethod(cat3, cat2), cat3 + " must be stronger than " + cat2);
        assertTrue((boolean) getStrongerCatMethod().invokeMethod(cat2, cat1), cat2 + " must be stronger than " + cat1);
        assertTrue((boolean) getStrongerCatMethod().invokeMethod(cat3, cat1), cat3 + " must be stronger than " + cat1);
    }

    private TestField getNameField() {
        return catClass.getField("name", List.of(Modifier.PRIVATE, Modifier.FINAL), ClassCash.getClass(String.class));
    }

    private TestField getAgeField() {
        return catClass.getField("age", List.of(Modifier.PRIVATE, Modifier.FINAL), ClassCash.getClass(int.class));
    }

    private TestField getWeightField() {
        return catClass.getField("weight", List.of(Modifier.PRIVATE, Modifier.FINAL), ClassCash.getClass(double.class));
    }

    private TestConstructor getNoArgsCatConstructor() {
        return catClass.getConstructor(List.of(Modifier.PUBLIC), Collections.emptyList());
    }

    private TestConstructor getArgsCatConstructor() {
        return catClass.getConstructor(List.of(Modifier.PUBLIC), List.of(ClassCash.getClass(String.class), ClassCash.getClass(int.class), ClassCash.getClass(double.class)));
    }

    private TestMethod getStrongerCatMethod() {
        return catClass.getMethod("stronger", ClassCash.getClass(boolean.class), List.of(Modifier.PUBLIC), List.of(catClass));
    }

    private List<Class<? extends Exception>> constructorExceptionClasses() {
        return List.of(
                IllegalArgumentException.class,
                ClassCash.getClass("ru.gazprombank.educate.homework26.CollapseOfUniverse").getGenericClazz()
        );
    }

    private List<Class<? extends Exception>> methodExceptionClasses() {
        return List.of(
                ClassCash.getClass("ru.gazprombank.educate.homework26.CollapseOfUniverse").getGenericClazz(),
                ClassCash.getClass("ru.gazprombank.educate.homework26.CatFoundNoOne").getGenericClazz()
        );
    }

    private String randomString() {
        int length = ThreadLocalRandom.current().nextInt(5, 16);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append((char) ThreadLocalRandom.current().nextInt('a', 'z'));
        }
        return builder.toString();
    }

    private List<Object> sortedCatList() throws Exception {
        List<Object> first = IntStream.range(1, 19).boxed()
                .flatMap(age -> IntStream.range(1, 11).boxed()
                        .map(Double::valueOf)
                        .map(weight -> new Pair<>(age, weight)))
                .map(pair -> {
                    try {
                        return getArgsCatConstructor().getInstance(randomString(), pair.getFirst(), pair.getSecond());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .sorted((o1, o2) -> {
                    try {
                        return getStrongerCatMethod().invokeMethod(o1, o2) ? 1 : -1;
                    } catch (Exception e) {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
        List<Object> result = new LinkedList<>();
        for (int i = 0; i < first.size() - 1; i++) {
            Object currentCat = first.get(i);
            Object nextCat = first.get(i + 1);
            boolean a = getStrongerCatMethod().invokeMethod(currentCat, nextCat);
            boolean b = getStrongerCatMethod().invokeMethod(nextCat, currentCat);
            if (!a && b) {
                result.add(currentCat);
            }
        }
        return result;
    }
}
