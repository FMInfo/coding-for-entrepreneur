package test;


public class Work1 {
    int a;

    public Work1(int a) {
        this.a =a;
    }


    public void grade(){

        if (a>=0&&a<60){
            System.out.println("F");
        }

        else if (a>=60&&a<70){
            System.out.println("D");
        }

        else if (a>=70&&a<80){
            System.out.println("C");
        }

        else if (a>=80&&a<=90){
            System.out.println("B");
        }

        else if (a>=90&&a<=100){
            System.out.println("A");
        }
    }

}
