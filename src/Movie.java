public class Movie {
        String name;
        int yearOfRealease, allReviews, durationInMinutes;
        boolean incluseInPlan;
        double reviews, average;

        void sumOfReviews(double note) {
                reviews += note;

                allReviews++;

                average = reviews / allReviews;
        }

        void showInformations() {
                System.out.printf("""
                                Nome do filme: %s
                                Ano de Lançamento: %d
                                Duração em minutos: %d minutos
                                Nota média do filme: %.1f
                                Quantidade de avaliações: %d
                                """, name, yearOfRealease, durationInMinutes, average, allReviews);
        }
}
