package newpackage1;

import java.util.ArrayList;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Integer> list1=new ArrayList<>();
       ArrayList<Integer> list2=new ArrayList<>();
       ArrayList<Integer> list3=new ArrayList<>();
       boolean x=true;
       int a;
       while(x)
       {
          System.out.println("Select Operation:\n1.Append to List-1\n2.Append to List-2\n3.Find Intersection\n4.Exit");
          a=sc.nextInt();
          switch(a)
          {
              case 1:
              {
                  System.out.println("Enter the number:");
                  int b=sc.nextInt();
                  list1.add(b);
                  System.out.println(list1);
                  break;
              }
              case 2:
              {
                  System.out.println("Enter the number:");
                  int b=sc.nextInt();
                  list2.add(b);
                  System.out.println(list2);
                  break;
              }
              case 3:
              {
                  for(int i=0;i<list1.size();i++)
                  {
                      for(int j=0;j<list2.size();j++)
                      {
                          int a1=list1.get(i);
                          int a2=list2.get(j);
                          if(a1==a2)
                          {
                              list3.add(list1.get(i));
                          }
                      }
                  }
                  System.out.println(list3);
                  break;
              }
              case 4:
              {
                  x=false;
                  break;
              }
          }
       }
    }
    
}
