public class Classes {
    int a;
    int b;

    public Classes(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int multiply(){
        return a * b;
    }
}

//자식 클래스(inheritance) 오버라이드해서 수정가능!
class  Subclasses extends Classes{
    public Subclasses(int a, int b){
        super(a,b);
    }

    @Override
    public int sum() {
        return a+b +100;
    }

    public int substract(){
        return  a-b;
    }
    public  int divide(){
        return  a/b;
    }
}
