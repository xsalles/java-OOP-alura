public class Main {
   public static void main(String[] args) {
      Movie myMovie = new Movie();

      myMovie.setName("Vingadores Ultimato");
      myMovie.setYearOfRealease(2020);
      myMovie.setDurationInMinutes(90);
      myMovie.setIncluseInPlan(true);

      myMovie.setReviews(9);
      myMovie.setReviews(9);
      myMovie.setReviews(9);

      myMovie.showInformations();
   }
}
