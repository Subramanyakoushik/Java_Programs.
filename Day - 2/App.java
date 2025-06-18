public class App {
  String name;
  String category;
  int downloads;
  int i = 0;
  String[] reviews = new String[10];
  public static void main(String[] args) {
    App a = new App("Crex","Sports",990,"Good application.");
    a.popularity();
    a.review("Best source for faster score.");
    a.getSummary();
    a.getReviews();
    System.out.println("==========================");
    App b = new App("Jio-Hotstar","Digital-Streaming",800,"Excellent streaming.");
    b.popularity();
    b.getSummary();
    b.getReviews();
    }
  App(String name,String category,int downloads,String rev){
      this.name = name;
      this.category = category;
      this.downloads = downloads;
      review( rev);
      }
    void popularity(){
      if(downloads >= 900){
        System.out.println("The app is more Popular");
      }
      else if (downloads >= 500 && downloads <=899){
        System.out.println("the game has a normal popularity");
      }
      else if(downloads >= 250 && downloads <=499 ){
        System.out.println("It has a low popularity");
      }
    }
    void review(String rev){
      this.reviews[i] =  rev;
      this.i++;
    }
    void getReviews(){
      System.out.println("The reviews are mentioned below.");
      for(int i = 0;i <this.i;i++){
        System.out.println(i+" > "+reviews[i]);
      }
    }
    void getSummary(){
      System.out.println("> The name of the applicationn is: "+name);
      System.out.println("> The category is: "+category);
      System.out.println("> the downloads are: "+downloads);
      System.out.println("The application has "+this.i+" reviews.");
    }
}
