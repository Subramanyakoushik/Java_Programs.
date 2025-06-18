public class EvenAndOdd{
  public static void main(String[] args) {
    EvenAndOdd n = new EvenAndOdd();
    System.out.println(n.evenAndOdd(5));
  }
  public String evenAndOdd(int num){
    if(num % 2 == 0) return "even number";
    return "odd number";
  }
}