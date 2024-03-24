package tekbagli;

public class Liste {
	Bagli head = null;
	Bagli tail = null;
	void basaEkle(int x) {
		Bagli eleman = new Bagli();
		eleman.veri = x;
		if (head == null) {
			System.out.println("Boş Listedeki Tek Eleman Oldu Kanka");
			head = eleman;
			tail = eleman;
			eleman.next = null;
		}
		
		else {
			System.out.println("Başarıyla basa ekledim!");
			eleman.next = head;
			head = eleman;

		}
	}
	void yazdir() {
		if (head==null) {
			System.out.println("Listen Boş Kanka");
		}
		else {
			Bagli ref = head;
			while (ref != null) {
				System.out.println("---------->>>>>" + ref.veri);
				ref = ref.next;
				if (ref == null) {
					break;
				}
			}
		}
	}
	void sonaEkle(int x) {
		Bagli eleman1 = new Bagli();
		eleman1.veri = x;
		tail.next = eleman1;
		tail = eleman1;
		
	}
	void basSil() {
		if (head ==null) {
			System.out.println("Listen Boş Kanka");
		}
		else if (head.next == null) {
			head = null;
			tail = null;
			System.out.println("Eleman Silindi!");
		}
		else {
			head = head.next;
			System.out.println("Baştaki Elemanı Sildim!");
		}
	}
	void sonSil() {
		if (head ==null ) {
			System.out.println("Listen Boş Kanka");
		}
		else if (head.next == null) {
			head = null;
			System.out.println("Tek Eleman Silindi");
		}
		else {
			tail = null;
			head.next = null;
			System.out.println("Sondaki Eleman Silindi");
		}
	}
	void araSil() {
		if (head.next == null) {
			System.out.println("Listende Arada eleman kalmamış!");
		}
		else if (head.next == tail) {
			System.out.println("Listende arada eleman kalmamış!");
		}
		else {
			head.next = tail;
			System.out.print("Listenin arasındaki eleman başarıyla silindi kanka");
		}
	}
	void araEkle (int x , int y) {
		Bagli eleman2 = new Bagli();
		eleman2.veri = x;
		if (head == null && tail == null) {
			head = eleman2;
			head.next = null;
			System.out.println("Listen Boş oldugundan eleman başa eklendi!");
		}
		else if (head != null && tail == null) {
			tail = eleman2;
			eleman2.next = null;
			System.out.println("Listende tek bir eleman oldugu icin sona eklendi!");
		}
		else {
			int a = 0;
			Bagli ref = head;
			Bagli ref2 = head;
			while (a<y) {
				System.out.println("Eleman Sırası Aranıyor!");
				a++;
				ref2 = ref;
				ref = ref.next;
			}
			if (a==y) {
				ref2.next = eleman2;
				eleman2.next = ref;
			}
		}
	}
}
