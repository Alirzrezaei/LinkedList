package grp22_ueb03;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 * Tests of the methods that have been presented in the lecture.
 * @author klk
 */
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyListTest {
    
    /**
     * Creates a list with the given values. 
     * @param value value, that should be inserted into the list
     * @return Liste mit den Werten.
     */
    private MyList createList(char... value) {
        MyList list = new MyList();
        for (char i : value) {
            list.appendElement(i);
        }
        return list;
    }
    
//<editor-fold defaultstate="collapsed" desc="Method tests for methods from the lecture">
    //-----------------------------------------------
    
    @Test
    public void testIsEmpty() {
        MyList list = new MyList();
        assertTrue(list.isEmpty());
        list = createList('a');
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void testAppendElement() {
        MyList list = new MyList();
        assertEquals(0, list.size());
        list.appendElement('a');
        assertEquals(1, list.size());
    }
    
    //-----------------------------------------------
    
    //<editor-fold defaultstate="collapsed" desc="testInsertElement">
    @Test
    public void testInsertElement_InEmptyList() {
        MyList list = createList();
        list.insertElementSorted('a');
        assertEquals(1, list.size());
    }
    
    @Test
    public void testInsertElement_AtFront() {
        MyList list = createList('b', 'c', 'd');
        list.insertElementSorted('a');
        assertEquals(4, list.size());
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, list.getValues());
    }
    
    @Test
    public void testInsertElement_InMiddle() {
        MyList list = createList('a', 'c', 'd');
        list.insertElementSorted('b');
        assertEquals(4, list.size());
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, list.getValues());
    }
    
    @Test
    public void testInsertElement_AtEnd() {
        MyList list = createList('a', 'b', 'c');
        list.insertElementSorted('d');
        assertEquals(4, list.size());
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd'}, list.getValues());
    }
//</editor-fold>
    
    //-----------------------------------------------
    
    //<editor-fold defaultstate="collapsed" desc="testDeleteElement">
    @Test
    public void testDeleteElement_AtFront() {
        MyList list = createList('a', 'b', 'c');
        list.deleteElement('a');
        assertEquals(2, list.size());
        assertArrayEquals(new char[]{'b', 'c'}, list.getValues());
    }
    
    @Test
    public void testDeleteElement_InMiddle() {
        MyList list = createList('a', 'b', 'c');
        list.deleteElement('b');
        assertEquals(2, list.size());
        assertArrayEquals(new char[]{'a', 'c'}, list.getValues());
    }
    
    @Test
    public void testDeleteElement_AtEnd() {
        MyList list = createList('a', 'b', 'c');
        list.deleteElement('c');
        assertEquals(2, list.size());
        assertArrayEquals(new char[]{'a', 'b'}, list.getValues());
    }
    
    @Test
    public void testDeleteElement_NotExisting() {
        MyList list = createList('a', 'b', 'c');
        list.deleteElement('d');
        assertEquals(3, list.size());
        assertArrayEquals(new char[]{'a', 'b', 'c'}, list.getValues());
    }
    
    @Test
    public void testDeleteElement_EmptyList() {
        MyList list = createList();
        list.deleteElement('d');
        assertEquals(0, list.size());
        assertArrayEquals(new char[]{}, list.getValues());
    }
//</editor-fold>
  
//</editor-fold>
  
    
    
    //-----------------------------------------------
    
//<editor-fold defaultstate="collapsed" desc="required situation tests">
    
    /*TODO Test ListOfThree with list     {'a', 'c', 'e'}      */
    /*TODO Test ListWithDoubleValues with {'a', 'b', 'b', 'c'} */
    /*TODO Test ListUnsortedAtBegin  with {'b', 'a', 'c'}      */
    /*TODO Test ListEmpty            with {}           */
    
    /*
    for each test
    - is empty
    - is sorted
    - list length
    - exists the value [..] (check all existing values and at least one non-existant value)
    - getValueAt for each available value and at least one wrong index
    
    use
    - assertTrue(), assertFalse(), assertEquals(), as needed assertArrayEquals()
    */
    

//</editor-fold>
   
}
