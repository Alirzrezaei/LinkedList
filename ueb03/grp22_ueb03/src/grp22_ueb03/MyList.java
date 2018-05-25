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
public class MyList {
    private Element element;
    
    public boolean isEmpty(){
        return element == null;
    }
    public void appendElement(char value){
        if(isEmpty()){
            element = new Element();
            element.setValue(value);
        }
        else{
           element = element.appendElement(value);
        }
    }
    public void insertElementSorted(char value){
        if(isEmpty()){
            element = new Element();
            element.setValue(value);
        }
        else{
                if (element.existsElement(value)){
                    element = element.insertElementSorted(value);
                }
        }
    }
}
