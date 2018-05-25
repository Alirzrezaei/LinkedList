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
    
    public char getValue(){
        return this.value;
    }
    public void setValue(char value){
        this.value = value;
    }
    public Element getElement(){
        return this.next;
    }
    public void setNext(Element next){
        this.next = next;
    }
    public Element getNext(){
        return this.next = next;
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
            newElement.setNext(next);
            return this;
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
        return this.value + " " + this.next.showElements();
    }
    public char getElementAt(int index){
        
        
    }
            
}
