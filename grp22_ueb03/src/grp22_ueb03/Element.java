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
    private int value;
    private Element next;
    
    public int getValue(){
        return this.value;
    }
    public void setValue(int value){
        this.value = value;
    }
    public Element getElement(){
        return this.next;
    }
    public void setNext(Element next){
        this.next = next;
    }
    public Element appendElement(int value){
        Element newElement = new Element();
        this.next = newElement;
        return this;
    }
}
