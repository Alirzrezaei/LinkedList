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
                    element = element.insertElementSorted(value);
        }
    }
    public void deleteElement(char value){
        if(isEmpty()){
            this.isEmpty();
        }
        else{
            element = element.deleteElement(value);
        }
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        else{
            return element.size();
        }
    }
    public boolean isSorted(){
        if(isEmpty()){
            return true; 
        }
        else{
            return element.isSorted();
        }
    }
    public boolean existsElement(char value){
        if(isEmpty()){
            return false;
        }
        else{
            return element.existsElement(value);
        }
    }
    public String showElements() {
        if (!isEmpty());
        return "{" + element.showElements() + "} ";
    }
    public char[] getValues(){
        char[] values = new char[size()];
        if (!isEmpty()) {
            for (int i = 0; i < values.length; i++) {
                values[i] = element.getElementAt(i);
            }
        }
        return values;
    }
   public char getValueAt(int index){
       if(isEmpty()){
           return element.INVALID_VALUE;
       }
       else{
           return element.getElementAt(index);
       }
   } 
   public void insertElementAt(char value, int index){
       if(isEmpty() && index == 0){
             appendElement(value);
        }
       else if(isEmpty()){
           element = element;
       }
       else{
           element = element.insertElementAt(value, index);
       }
   }
   public void insertElementAtFront(char Value){
       if(isEmpty()){
           appendElement(Value);
       }
       else{
           element = element.insertElementAtFront(Value);
       }
   }
   public void insertSortedIfUnique(char value){
       if(isEmpty()){
           appendElement(value);
       }
       else{
           if(!existsElement(value)){
               element = element.insertElementSorted(value);
           }
       }
   }
}
