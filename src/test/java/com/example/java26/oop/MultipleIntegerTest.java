package com.example.java26.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class MultipleIntegerTest {

    MultipleInteger newInstance = new MultipleInteger();

    @Test
    @DisplayName("Creating new instance should be 10 places")
    void createNewInstance() {

        assertEquals(0, newInstance.size());
    }

    @Test
    @DisplayName("Adding one value should make size one")
    void addingOneValueShouldMakeSizeOne() {
        newInstance.add(1);
        assertEquals(1, newInstance.size());
    }


    @Test
    void afterAddingOneValueIndex0ShouldReturnValue() {
        newInstance.add(1);
        assertEquals(1, newInstance.getValue(0));
    }

    @Test
    void addingMoreThanTenValuesWorks(){
        for (int i = 0; i < 11; i++) {
            newInstance.add(i);

            assertEquals(11, newInstance.size());
            assertEquals(0, newInstance.getValue(0));
            assertEquals(10, newInstance.getValue(1));
        }
    }

    @Test
    void addingValueFirstShould(){
        newInstance.addFirst(1);
        newInstance.addFirst(2);
        assertEquals(2, newInstance.getValue(0));
        assertEquals(1, newInstance.getValue(1));
    }

    @Test
    void removeingValueFromEmptyListShouldNotThrowException(){
        assertDoesNotThrow(newInstance::removeLast);
        assertEquals(0, newInstance.size());

    }

    @Test
    void sortingShouldPutValuesInNormalOrder(){
        newInstance.add(4);
        newInstance.add(1);
        newInstance.add(3);
        newInstance.add(2);
        newInstance.sort();

        assertEquals(1, newInstance.getValue(0));
        assertEquals(2, newInstance.getValue(1));
        assertEquals(3, newInstance.getValue(3));
        assertEquals(4, newInstance.getValue(2));
    }

    @Test
    void removeAtIndexShouldDecreaseSize(){
        newInstance.add(1);
        newInstance.add(2);
        newInstance.add(3);

        newInstance.removeAtIndex(1);

        assertEquals(2, newInstance.size());
    }
    @Test
    void removeAtIndexShouldHandleRemoveLastElement(){
        newInstance.add(1);
        newInstance.add(2);
        newInstance.add(3);

        newInstance.removeAtIndex(2);

        assertEquals(2, newInstance.size());
        assertEquals(1, newInstance.getValue(0));
        assertEquals(2, newInstance.getValue(1));
    }

    @Test
    void removingValueFromEmptyListShouldNotThrowException(){
        assertDoesNotThrow(newInstance::removeLast);
        assertEquals(0, newInstance.size());
        assertThat(newInstance.size()).isEqualTo(0);
    }

}