class A{
    int i=1;
    int f(){return i;}
    }
    class B extends A{
    int i;
    int f(){
    i=super.i +1;
    return super.f()+i;
    }
    
    }
    class Test{
    public static void main(String[] args){
    B b =new B();
    System.out.println(b.i);
    System.out.println(b.f());
    A a = (A)b;
    System.out.println(a.i);
    System.out.println(a.f());
    }
    }