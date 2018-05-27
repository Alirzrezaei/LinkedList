/**
 * this class, Element, is making new element and appending, deleting, inserting
 * elements recursivly. It also check if the element is sorted and return the
 * sum of elements. This class can be used as intance class for Mylist class.
 *
 */
package grp22_ueb03;

/**
 *
 * @author Alireza
 */
public class Element {
    private char value;
     private Element next;
    public char INVALID_VALUE = 0;


     /**
     * gets the value of the element
     *
     * @return value of the element
     */
    public char getValue(){
        return this.value;
    }
      /**
     * sets the values of an element
     *
     * @param value is the given value
     */
    public void setValue(char value){
        this.value = value;
    }
    /**
     * sets the next element
     *
     * @param next element
     */
    public void setNext(Element next){
        this.next = next;
    }
     /**
     * gets the next element
     *
     * @return next element
     */
    public Element getNext(){
        return this.next;
    }
     /**
     * appends an element in an empty place
     *
     * @param value of the element in Integer type
     * @return element
     */
    public Element appendElement(char value) {
        if (this.next == null) {
            Element newElement = new Element();
            newElement.setValue(value);
            this.next = newElement;
            
        } else {
            this.next = this.next.appendElement(value);
        }
            return this;
    }
     /**
     * deletes the element with given value
     *
     * @param value of an elements in Integer type
     * @return element
     */
    public Element deleteElement(char value) {

        if (this.value == value) {
            return this.next;
        } else {
            if (this.next != null) {
                this.next = this.next.deleteElement(value);
            }
            return this;
        }
    }
     /**
     * insert new element between sorted elements
     *
     * @param value of the element in Integer type
     * @return element
     */
    public Element insertElementSorted(char value) {
        if (this.value > value) {
            Element newElement = new Element();
            newElement.setValue(value);
            newElement.setNext(this);
            return newElement;
        } else if (this.next == null) {
            Element newElement = new Element();
            newElement.setValue(value);
            this.next = newElement;
            return this;
        } else {
            this.next = this.next.insertElementSorted(value);
            return this;
        }
    }
    /**
     * return the number of existing elements
     *
     * @return size of the total elements in Integer type
     */
    public int size(){
        int size = 1;
        if(this.next == null){
           return size;
        }
        else{
            return size = size + this.next.size();
        }
    }
     /**
     * return true if the elements are sorted in ascending order.
     *
     * @return boolean (true/false)
     */
    public boolean isSorted() {
        if (this.next == null) {
            return true;
        } else if (this.value <= this.next.value) {
            return this.next.isSorted();

        } else {
            return false;
        }
    }
    /**
     * return true if there is an element with given value
     *
     * @param value is the given value
     * @return boolean (true/false)
     */
    public boolean existsElement(char value){
        if(this.value == value){
            return true;
        }
        else if(this.next != null){
           return this.next.existsElement(value);
            
        }
        else return false;
    }
    /**
     * return string in a single line containing current value and all
     * succeeding values separated by space
     *
     * @return String
     */
    public  String showElements(){
     
        if (this.next == null) {
            return Character.toString(this.getValue());
        } else {

            return this.getValue() + " " + this.next.showElements();
        }
    
    }
     /**
     * return value of the elements at specific position with given index
     *
     * @param index
     * @return
     */
    public char getElementAt(int index){
       
        if(index < 0 ){
            return INVALID_VALUE;
        }
        else if(index == 0){
            return this.value;
        }
        else if(this.next != null){
            return this.next.getElementAt(index-1);
        }
        else{
            return INVALID_VALUE;
        }
    }
      /**
     * inserts elements with given value at the beginning of the elements
     *
     * @param value of the elements in Integer type
     * @return element
     */
     public Element insertElementAtFront(char value){ 
         Element elem = new Element(); 
         elem.setValue(value);
         elem.setNext(this);
         return elem;
     }  
      /**
     * insert an element with given value in given position(index)
     *
     * @param value is the given value
     * @param index of position for element
     * @return element containing the value
     */
     public Element insertElementAt(char value, int index){
          if (index < 0) {
            return this;
        } else if (index == 0) {
            return insertElementAtFront(value);
        } else if (index == 1 && this.next == null) {
            Element newElement = new Element();
            newElement.setValue(value);
            this.next = newElement;
            return this;
        } else if (this.next != null) {
            this.next = this.next.insertElementAt(value, index - 1);
            return this;
        } else {
            return this;
        }
     }
}
