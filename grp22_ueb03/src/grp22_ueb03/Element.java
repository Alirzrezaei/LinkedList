/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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


   
    public char getValue(){
        return this.value;
    }
    public void setValue(char value){
        this.value = value;
    }
    public void setNext(Element next){
        this.next = next;
    }
    public Element getNext(){
        return this.next;
    }
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
    public int size(){
        int size = 1;
        if(this.next == null){
           return size;
        }
        else{
            return size = size + this.next.size();
        }
    }
    public boolean isSorted() {
        if (this.next == null) {
            return true;
        } else if (this.value <= this.next.value) {
            return this.next.isSorted();

        } else {
            return false;
        }
    }

    public boolean existsElement(char value){
        if(this.value == value){
            return true;
        }
        else if(this.next != null){
           return this.next.existsElement(value);
            
        }
        else return false;
    }
    public  String showElements(){
     
        if (this.next == null) {
            return Character.toString(this.getValue());
        } else {

            return this.getValue() + " " + this.next.showElements();
        }
    
    }
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
     public Element insertElementAtFront(char value){ 
         Element elem = new Element(); 
         elem.setValue(value);
         elem.setNext(this);
         return elem;
     }  
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
