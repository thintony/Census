import java.util.Scanner;

public class HealthEquipmentSupply {

	public static void main(String[] args) {
		int equipNum = 0;
		int total = 0;
		int equipCounter = 0;
		int aCount = 0, bCount = 0, cCount = 0, dCount = 0,eCount = 0, fCount = 0;  
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter equipNum");
			while(scanner.hasNext()) {
				 equipNum = scanner.nextInt();
				 total = total + equipNum;
				 ++equipCounter;
			switch(equipNum/10) {
				 case 9:
				 case 10:
				 	++aCount;
				 		break;
				 case 8:
				 	++bCount;
				 		break;
				 case 7:
				 	++cCount;
				 		break;
				 case 6:
				 	++dCount;
				 		break;
				 case 5:
					 	++eCount;
					 		break;
				default:
				 	++fCount;
				 		break;
		}
			
			
	}
		if(equipCounter != 0) {
			
	double average = (double)total/equipCounter;
	
			
			System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n%n","Syring:",aCount,"Scanner:",bCount,"Incubator:",cCount, "Bed:",dCount,"Dispencer:",eCount,"Drip:",fCount);
			System.out.printf("TOTAL:%d%nEQUIPnum:%d%nAVERAGEsupply:%.2f%n", total,equipCounter,average);

	}
			else
				System.out.print("No supply");
	}
}
