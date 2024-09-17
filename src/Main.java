public class Main {
     public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Vingadores: Ultimato";
        myMovie.yearOfRealease = 2019;
        myMovie.durationInMinutes = 181;
        myMovie.incluseInPlan = true;
        myMovie.reviews = 8.1;
        myMovie.allReviews = 8;

        System.out.println(myMovie.name);
     }
}
