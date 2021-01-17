import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
        Scanner klavye=new Scanner(System.in);
        
        System.out.println("***************************");
        System.out.println("İşlemler:\n"
                        +"1.Bakiye Öğrenme\n"
                        +"2.Para Çekme\n"
                        +"3.Para Yatırma\n"
                        +"4.Hesaptan Çıkış Yap");
        System.out.println("***************************");
        
        System.out.print("Yapacağınız İşlemi Seçiniz: ");
        int islem=klavye.nextInt();
        int bakiye=500;
        
        if(islem<1 || islem>4){
            System.out.println("İşlem Aralığı 1 ve 4'tür.Lütfen aralık dışı sayı girmeyiniz!...");
        }
        
        while(islem<5){
            if(islem==1){
                System.out.print("Bakiyen:500 TL");
                break;
            }
            
            if(islem==2){
                System.out.print("Çekmek İstediğin Miktar: ");
                int cekilen=klavye.nextInt();
                int yeni_bakiyen=(bakiye-cekilen);
                System.out.print("Yeni Bakiyen: "+yeni_bakiyen);
                break;
            }
            
            if(islem==3){
                System.out.print("Yatırmak İstediğin Miktar: ");
                int yatirilan=klavye.nextInt();
                int yeni_bakiyen=(bakiye+yatirilan);
                System.out.print("Yeni Bakiyen: "+yeni_bakiyen);
                break;
            }
            
            if(islem==4){
                System.out.print("Sistemden Çıkış Yapmış Bulunmaktasınız.");
                break;
            }
        }
    }
}
