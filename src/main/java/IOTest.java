public class IOTest extends Father {


    public int ad1(int a, int b) {
        return a + b;
    }
    //子类实现父类的抽象方法
    public static void main(String[] args) {
        IOTest ii=new IOTest();
        int a = 3;
        int b = 4;
        ii.add1(a,b);
       // System.out.println(ii);
        /*子类向上转型为父类*/
        Father ff=new IOTest();
        ff.add1(a,b);
        ff.sss();
        int c=ff.add(a,b);
        IOTest ip=(IOTest) ff;
        ip.say();
        ip.sss();
        int d=ip.add(a,b);
        System.out.println(d);
    }

    @Override
    public void add1(int a, int b) {
        System.out.println(a+b);
    }
    @Override
    public int add(int a,int b)
    {
        return a+b+1;
    }
    public void say()
    {
        System.out.println("hehe");
    }
}


