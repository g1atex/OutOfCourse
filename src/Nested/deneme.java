package Nested;

 public class deneme {
    private String s="java";

    public static void main(String args[]){
        deneme d=new deneme();
        d.nestedInstance();


    }

    public void nestedInstance(){
        inner i=new inner(); //outer class içinde de inner classın instance ı oluşturuldu.
        i.write();
    }

    public class inner{

        String inn="rhrt";
        public void write(){
            System.out.println("inner class metodu "+s); //outer class değişkenine private olsa bile erişebildi
        }
    }

    public class inner2{
        String inn2="gerg";
        inner2 in=new inner2();
        public void ff(){
            System.out.println("greger");
        }

    }

}
