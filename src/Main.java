import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws FileNotFoundException {

        Scanner scanner=new Scanner(new File("input.txt"));
        Integer k=scanner.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        int c=0;
        int i=1;
        while (true) {
            if(c==k){ break;}
             if(!check(i)) {
                list.add(i);
                c++;
             }
             i++;
        }
        scanner.close();
       try{ PrintWriter writer=new PrintWriter(new File("output.txt"));
           writer.println(list.get(list.size()-1));
           writer.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
       }

        //System.out.println(list.get(list.size()-1));
    }


    private static boolean check(Integer k) {
        boolean b = false;
        char[] c = k.toString().toCharArray();
            for (int i = 0; i < c.length - 1; i++) {
                for (int j = i; j < c.length - 1; j++) {
                    if (c[i] == c[j + 1]) {
                        b = true;
                        break;
                    }
                }
                if (b==true) {
                    break;
                }

            }
            return b;
        }

}
