public class Movie {
  String name;
  int duration;
  int rating;
  public static void main(String[] args) {
    Movie m = new Movie("Bahubali the beginning",2,5);
    m.isHit();
    m.details();
  }
  Movie(String name,int duration,int rating){
    this.name = name;
    this.rating = rating;
    this.duration = duration;
  }
  String isHit(){
    if(rating == 5 || rating < 5 && rating > 3){
      return "The move is Hit.";
    }
    return null;
   }
   void details(){
    System.out.println("> The name of the movie is "+ name+".");
    System.out.println("> "+isHit());
    System.out.println("> the duration of movie is "+duration+" hours.");
   }
}
