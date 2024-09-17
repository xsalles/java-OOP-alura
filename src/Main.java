public class Main {
   public static void main(String[] args) {
      Movie myMovie = new Movie();

      myMovie.name = "Vingadores: Ultimato";
      myMovie.yearOfRealease = 2019;
      myMovie.durationInMinutes = 181;
      myMovie.incluseInPlan = true;

      myMovie.averageOfReviews(8);
      myMovie.averageOfReviews(7);
      myMovie.averageOfReviews(3);

      myMovie.showInformations();
   }
}
