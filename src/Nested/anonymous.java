package Nested;

interface Faktoriyel{
    double hesap();
}

public class anonymous {
        public Faktoriyel fak(int s){//kitapta anonymous class lar sadece final tipteki variable lara eirşir yazıyor ama bu yanlış final olmasada erişti.
            return new Faktoriyel() { //anonymous class return edilebildi bir değer gibi işlem gördü.
                public double hesap(){
                    int x=1;
                    for(int i=s; i>0; i-- ){
                        x=x*i;
                    }
                    return x;
                }

            };
        }

    public static void main(String[] args) {

            interface versioncontrol { }
        anonymous a=new anonymous();
        Faktoriyel f=a.fak(4); //bu şekildede yazılabilir normalde direk new deyip anonymous class oluşturuyorduk ama buda farklı bir bakış.
        System.out.println(f.hesap()); //functioal interfacedeki abstract metodu temsil etti
        System.out.println("git deneme");
        System.out.println("git deneme 2" );
        System.out.println("git deneme 3");
        System.out.println("git denem 4");
    }

}
