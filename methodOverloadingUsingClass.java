class sum_of_nums{
    int a;
    int b;
    int c;
    int d;
    int e;
    int plus;

    public int sum(int a, int b){
        return (a+b);
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class methodOverloadingUsingClass {
    public static void main(String[] args) {
        sum_of_nums great = new sum_of_nums();
        great.a = 10;
        great.b = 20;
        great.c = 30;

        int sum1 = great.sum(great.a, great.b);
        System.out.println("The sum of a,b = " + sum1);
        
        int sum2 = great.sum(great.a,great.b,great.c);
        System.out.println("The sum of a,b,c = " + sum2);
    }
}
