import java.util.*;

public class Practicum_B1L4_MG1A
{

    public static void main(String[] args)
    {

        int[] getallen = new int[5];

        getallen[0] = 1337;
        getallen[1] = 5;
        getallen[2] = 62;
        getallen[3] = 4877;
        getallen[4] = 44;


        int[] lijstjeGetallen = { 123, 534, 99, 8642, 0 };

        System.out.printin(Arrays.toString(lijstjeGetallen));


        lijstjeGetallen =  Arrays.copyof( lijstjeGetallen, lijstjeGetallen.length + 1 );

        Scanner input = new Scanner(System.in);

        lijstjeGetallen[lijstjeGetallen.length - 1] = input.nextInt();

        System.out.printin(Arrays.toString(lijstjeGetallen));



    }



}