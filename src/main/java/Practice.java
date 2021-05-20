public class Practice {
    public static void main(String[] args) {
        int [][] num=new int[][]{{1,2},{3,4},{5,6},{7,8}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                System.out.printf(" %d",num[i][j]);

            }
            System.out.println();

        }
        PrintGreeting("Leila","Nika");
    }

    public static void PrintGreeting(String ... names)
    {
        for (String n:names)
        {
            System.out.println("Hello "+n);
        }
    }
}
