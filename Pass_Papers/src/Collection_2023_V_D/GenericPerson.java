package Collection_2023_V_D;

import java.util.ArrayList;

public class GenericPerson extends GenericPersonDeno{
    public <T extends IPerson> void displayElements(ArrayList<T> list){
    for(T element : list){
        System.out.println(element.displayDetails());
      }
    }
}
