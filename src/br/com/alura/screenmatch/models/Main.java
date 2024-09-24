package br.com.alura.screenmatch.models;
import br.com.alura.screenmatch.calculate.CalculateOfTime;
import br.com.alura.screenmatch.calculate.FilterRecomendate;

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

      CalculateOfTime calculate = new CalculateOfTime();

      calculate.include(myMovie);
      System.out.println(calculate.getTempoTotal());

      Series mySeries = new Series();

      mySeries.setSeasons(20);
      mySeries.setEpisodesBySeason(12);
      mySeries.setMinutesByEpisodes(42);

      calculate.include(mySeries);
      System.out.println("Duração em minutos para maratonar essa série é: " + calculate.getTempoTotal());

      FilterRecomendate filtro = new FilterRecomendate();
      filtro.filter(myMovie);

      Episode episode = new Episode();
      episode.setNumber(1);
      episode.setSerie(mySeries);
      episode.setTotalVisualizations(50);
      filtro.filter(episode);
   }
}
