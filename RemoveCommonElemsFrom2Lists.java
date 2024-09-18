package hm;
import java.util.*;

public class _13RemoveCommon {
    public static void main(String[] args){

             List<String> list1 = new ArrayList<>();
                        
                            list1.add("Apple");
                            list1.add("Banana");
                            list1.add("Cherry");
                            list1.add("Date");
                    
             List<String> list2 = new ArrayList<>();
                      
                            list2.add("Banana");
                            list2.add("Cherry");
                            list2.add("Elderberry");
                            list2.add("Fig");
                    
                            
                            Set<String> set1 = new HashSet<>(list1);
                            Set<String> set2 = new HashSet<>(list2);
                    
                            // to find common elements use hashSet:
                            Set<String> commonElements = new HashSet<>(set1);
                            commonElements.retainAll(set2); // Retain only elements present in both sets
                    
                            // Remove common elements from both lists
                            list1.removeAll(commonElements);
                            list2.removeAll(commonElements);
                    
                            // Print the modified lists
                            System.out.println("List 1 after removing common elements: " + list1);
                            System.out.println("List 2 after removing common elements: " + list2);
                        }
                    }
                    
                
