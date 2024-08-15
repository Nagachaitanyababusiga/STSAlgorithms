class Sts{
    public static void main(String[] args){
        //1.Arthematic operators
        int a=20;
        int b=40;
        int c=46;
        int d=50;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //2.Unary operators
        System.out.println(-c);
        System.out.println(+d);
        System.out.println(b++);
        System.out.println(a--);
        System.out.println(--c);
        System.out.println(--b);

        //3.Assignment operator
        int e=4534;
        System.out.println(e);

        //4.Relational operators
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(d==e);
        System.out.println(e>=a);
        System.out.println(e<=a);
        System.out.println(a!=b);
        

        //5.logical operators
        boolean t=true;
        boolean f=false;

        
        System.out.println(t&&f);
        System.out.println(t||f);
        System.out.println(!t);
        System.out.println(!f);

        //6.ternary operator
        int k=t&&f?1:645;
        System.out.println(k);
        k=t||f?34:12;
        System.out.println(k);

        //7.Bitwise operator
        System.out.println(a^b);
        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(~a);

        //8.Shift operators
        System.out.println(k>>1);
        System.out.println(k<<1);
        //unsigned right shift
        System.out.println(k>>>1);

        //9.instance of operator
        Sts s=new Sts();
        Integer test=2;
        System.out.println(s instanceof Sts);
        System.out.println(test instanceof Integer);
        
    }
}