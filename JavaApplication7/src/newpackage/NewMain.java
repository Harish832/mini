package newpackage;
public class NewMain {

    public static void main(String[] args) {
        Integer num[]={1,0,5,9,1};
        sample s=new sample();
        s.max(num);
    }    
}
class sample{
    <T extends Comparable<T>> void max(T[]y)
    {
        T max;
        max=y[0];
        for(int i=1;i<y.length;i++)
        {
         if(max.compareTo(y[i])<0){       
             max=y[i];
         }        
        }
        System.out.println(max);   
    }
}

