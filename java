import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    System.out.print("Number of Lecture Subject: ");
    int numlec = input.nextInt();
    
    System.out.print("Number of Laboratory Subject: ");
    int numlab = input.nextInt();
    
    System.out.print("Price per Subject: ");
    int prips = input.nextInt();
    
    
    
    int numleclab = (numlec + numlab);
    System.out.println("Total number of Subjects: " + numleclab );

    double numlabmul = (numlab * 300);
    System.out.println("Laboratory Fee: " + numlabmul);
    
    double ttlprslab = (numleclab + prips + numlab);
    System.out.println("Tuition Fee: " + ttlprslab);
    
    int libfee = 500;
    int medfee = 600;
    int denfee  = 400;
  
    System.out.println("Library Fee: " + libfee);
    System.out.println("Medical Fee: " + medfee);
    System.out.println("Dental Fee: " + denfee);
    
    
    double libmeden = libfee + medfee + denfee;
    System.out.println("Miscellaneous Fee: " + libmeden);
    
    double mistui = libmeden + ttlprslab;
    System.out.print("Total Fees: " + mistui); 
    
    input.close();
  }
}
