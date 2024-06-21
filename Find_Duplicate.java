import java.util.ArrayList;
import java.util.Arrays;
public class Find_Duplicate {
    ArrayList<Integer> b1=new ArrayList<>();
    public ArrayList<Integer> Duplicate(int[] a1) {
        Arrays.sort(a1);
        for (int i = 0; i < a1.length - 1; i++) {
            if (a1[i] == a1[i + 1]) {
                b1.add(a1[i]);
            }
        }
        return b1;
    }
    public static void main(String args[])
    {
        int a[]={3,2,1,3,5,2,7,8,9};
        Find_Duplicate s1=new Find_Duplicate();
        ArrayList<Integer> b=s1.Duplicate(a);
        for(int i:b)
        {
            System.out.print(i+" ");
        }
    }
}
