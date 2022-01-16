package day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MathAlgorithms {

	private List<Integer> myArrayList = new ArrayList<>();
	private List<Integer> myLinkedList = new LinkedList<>();

	public int greatestCommonDivisor (int firstNumber, int secondNumber) {
		int gcd = 1;
		for (int i=2; i <= firstNumber && i <= secondNumber; i++) {
			if (firstNumber % i == 0 && secondNumber % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public int greatestCommonDivisorWhile (int firstNumber, int secondNumber) {
		while (firstNumber != secondNumber) {
			if (firstNumber > secondNumber) {
				firstNumber -= secondNumber;
			} else {
				secondNumber -= firstNumber;
			}
		}

		return firstNumber;




	}



//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int elsoSzam, masodikSzam;
//		do {
//			System.out.print("Kérjük adja meg az 1. számot (nagyobb 0-nál): \n");
//			String elso = in.nextLine();
//			elsoSzam = Integer.parseInt(elso);
//			System.out.print("Kérjük adja meg a 2. számot (nagyobb 0-nál): \n");
//			String masodik = in.nextLine();
//			masodikSzam = Integer.parseInt(masodik);
//		}while (elsoSzam <= 0 || masodikSzam <= 0);
//		int szorzat = elsoSzam * masodikSzam;
//		int maradek = elsoSzam % masodikSzam;
//		while (maradek != 0){
//			elsoSzam = masodikSzam;
//			masodikSzam = maradek;
//			maradek = elsoSzam % masodikSzam;
//		}
//		System.out.println ("A legnagyobb közös osztó: " + masodikSzam);
//		System.out.println ("A legkisebb közös szorzó: " + szorzat/masodikSzam);
//	}
}
