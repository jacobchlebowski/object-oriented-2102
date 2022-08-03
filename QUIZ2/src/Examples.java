import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class Examples {
     WordList wList;
     Dictionary dict;

     public Examples() {
     }

     @Before
     public void setup() {
          wList = new WordList(); 
          wList.addWord("apples");
          wList.addWord("pears");
     }
     
     
     
     @Test
     public void testWordList() {
     	WordList wList2 = new WordList();
             wList2.addWord("apples");
             wList2.addWord("pears");
             System.out.println(wList);
             System.out.println(wList2);
     	assertEquals(wList, wList2);	
     }
     
  
     
     
     
     
     
}