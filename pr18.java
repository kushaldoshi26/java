class a
{
    void print()
    {
        System.out.println("J");
    }
}

class b extends a
{
    void print1()
    {
        System.out.println("A");
    }
}

class c extends b
{
    void print2()
    {
        System.out.println("V");
    }
}

class pr18
{
    public static void main(String args[])
    {
        c obj = new c();
        obj.print();
        obj.print1();
        obj.print2();
        obj.print1();
    }
}
