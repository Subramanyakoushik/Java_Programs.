class Game{
  String title ;
  String genre;
  int playcount;
  int rating;
  public static void main(String[] args) {
    Game g = new Game("Subwaysurf","Childy",5);
    System.out.println("Is it a familyfriendly ? "+g.isFamilyFriendly());
    g.play();
    g.play();
    System.out.println(g.rating());
    g.getSummary();

  }
  Game(String title,String genre,int rating){
    this.title = title;
    this.genre = genre;
    this.rating = rating;
  }
  boolean isFamilyFriendly(){
    if(genre == "Horror"){
      return false;
    }
    return true;
  }
  void play(){
    System.out.println("The game is on");
    playcount++;
  }
  String rating(){
    if(rating == 5){
      return " The Game is worthy";
    }
    return null;
    }
  void getSummary(){
    System.out.print("> The Title of the game is: "+ title+". You played the game "+playcount+" times. Is it family friendly ? "+isFamilyFriendly()+" .");
  }
}