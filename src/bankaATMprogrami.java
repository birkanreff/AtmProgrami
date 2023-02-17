import java.util.Scanner;

public class bankaATMprogrami {

	public static void main(String[] args) {
		int bakiye=2000;
		int counter=3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("X Bankası'na hoşgeldiniz!");
		System.out.println("Kullanıcı adınızı giriniz:  ");
		String userName=input.nextLine();
		System.out.println("Şifrenizi giriniz:  ");
		String passWord=input.nextLine();
		
		if ((userName.equals("patikadev")) && (passWord.equals("12345"))) {
			System.out.println("1-Para yatırma \n" +
		"2-Para çekme \n" +
					"3-Bakiye Sorgulama \n" +
		"4-Çıkış yap");
			System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
			int secim = input.nextInt();
			 switch(secim) {
			 case 1:
				System.out.println("Ne kadar para yatıracaksınız?");
				int amount = input.nextInt();
				bakiye += amount;
				System.out.println("Yeni bakiyeniz: " + bakiye);
				 break;
			 case 2:
				 System.out.println("Ne kadar para çekmek istersiniz?");
				 int price = input.nextInt();
				 if(price > bakiye ) {
					 System.out.println("Bakiye yetersiz");
					 
				 }else {
				 bakiye -= price;
				 System.out.println("Yeni bakiyeniz: " + bakiye);
				 }
				 break;
			 case 3:
				 System.out.println("Bakiyeniz: " + bakiye);
				 break;
			 case 4:
				 System.out.println("İyi günler dileriz!");
				 
				 
				 
			 }
			 
			
		} else {
			counter--;
			
			System.out.println("Hatalı kullanıcı adı veya şifre!");
			if (counter == 0 ) {
					System.out.println("Kartınız bloke olmuştur!");
			} else System.out.println("Kalan hakkınız: " + counter);
			
		}
		

	}

}
