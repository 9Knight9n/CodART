package pushdown_field_test1;

public class A
{
    
}

class B extends A
{
    protected int a;
    int b, c, d;
}

class C extends A
{
    protected int a;
    int[] b, c;

    C()
    {
        b = null;
    }

    C(int d)
    {
        c = new int[1];
    }
}
