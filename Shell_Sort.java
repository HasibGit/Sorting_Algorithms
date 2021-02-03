// For explanation : https://www.youtube.com/watch?v=1yDcmjLTWOg

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

public class Shell_Sort {

    static void shellSort(int[] arr){
        int gap = (int)Math.floor(arr.length/2);

        while (gap >= 1){
            for(int i = 0; i+gap < arr.length; i++){
                if(arr[i] > arr[i+gap]){
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                    int j = i;
                    while (j-gap >= 0){
                        if(arr[j] < arr[j-gap]){
                            int temp2 = arr[j];
                            arr[j] = arr[j-gap];
                            arr[j-gap] = temp2;
                            j = j - gap;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
            gap = gap / 2;
        }
    }



    public static void main(String[] args) {
        FastReader input = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);

        int[] arr = {5,8,1,2,0,6,4,2,2,7};

        shellSort(arr);  // time complexity O(n^2)

        for(int i : arr)
            pw.print(i + " ");
        pw.println();



        // ****If sorting is required, use ArrayList
        // *** If string concatenation is required, use StringBuffer
        // ** check for overflow
        // ** Check for case with min value
        // ** check for case with max value

        pw.flush();
        pw.close();
    }

    static void sort(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : arr)
            list.add(i);
        Collections.sort(list);
        for(int i = 0;i < list.size();i++){
            arr[i] = list.get(i);
        }
        return;
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
