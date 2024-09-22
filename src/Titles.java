public class Titles {
        private String name;
        private double reviews, average;
        private int yearOfRealease, allReviews, durationInMinutes;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getDurationInMinutes() {
                return durationInMinutes;
        }

        public void setDurationInMinutes(int durationInMinutes) {
                this.durationInMinutes = durationInMinutes;
        }

        public int getAllReviews() {
                return allReviews;
        }

        public void setAllReviews(int allReviews) {
                this.allReviews = allReviews;
        }

        public int getYearOfRealease() {
                return yearOfRealease;
        }

        public void setYearOfRealease(int yearOfRealease) {
                this.yearOfRealease = yearOfRealease;
        }

        boolean incluseInPlan;

        public boolean isIncluseInPlan() {
                return incluseInPlan;
        }

        public void setIncluseInPlan(boolean incluseInPlan) {
                this.incluseInPlan = incluseInPlan;
        }

        public double getAverage() {
                return average;
        }

        public void setAverage(double average) {
                this.average = average;
        }

        public double getReviews() {
                return reviews;
        }

        public void setReviews(double reviews) {
                this.reviews = reviews;
        }

        void showInformations() {
                System.out.printf("""
                                Nome: %s
                                Ano de Lançamento: %d
                                Duração em minutos: %d minutos
                                Nota média: %.1f
                                Quantidade de avaliações: %d
                                """, name, yearOfRealease, durationInMinutes, average, allReviews);
        }
}
