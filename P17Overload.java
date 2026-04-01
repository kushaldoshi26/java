class Overload1
{
    void add(int a, int b)
    {
        int sum = a+b;
        System.out.println("Sum of a+b is:- "+sum);
    }
   
    void add(int a,int b, int c)
    {
        int sum = a+b+c;
        System.out.println("Sum of a+b+c is :-"+sum);
    }
    void add(String a, String b)
    {
        String sum = a+b;
        System.out.println("Sum of String is :- "+sum);
    }
    void add(int a, int b, String c, int d, int e)
    {
        String sum = a+b+c+d+e;
        System.out.println("Sum of a+b+c+d+e is:- "+sum);
    }
}

class P17Overload
{
    public static void main(String args[])
    {
    Overload1 obj = new Overload1();
    obj.add(10,20,30);
    obj.add("Hello", "Java");
    obj.add(10,20,"Hello", 11,13);
    }
}

