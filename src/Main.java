public class Main {
     public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Vingadores: Ultimato";
        myMovie.yearOfRealease = 2019;
        myMovie.durationInMinutes = 181;
        myMovie.incluseInPlan = true;

        myMovie.sumOfReviews(8);
        myMovie.sumOfReviews(7);
        myMovie.sumOfReviews(3);

        myMovie.showInformations();


     }
}
