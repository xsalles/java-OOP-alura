
    import java.util.Scanner;

    public class Audio {
        Scanner sc = new Scanner(System.in);
        private String title;
        private double duration;
        private int totalOfReproductions;
        private int likes = 0;
        String answer;

        void showInformations(){
            System.out.printf("""
                    Título: %s.
                    Duração: %.2f.
                    Total de reproduções: %d.
                    Curtidas: %d.
                    """, getTitle(), getDuration(), getTotalOfReproductions(), getLikes());
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }

        public int getTotalOfReproductions() {
            return totalOfReproductions;
        }

        public void setTotalOfReproductions(int totalOfReproductions) {
            this.totalOfReproductions = totalOfReproductions;
        }
        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        void likeOrNotLike(){
            System.out.println("\nVocê gostou? (sim ou não)\n");
            answer = sc.next();

            answer.toLowerCase();

            if (answer.equals("n")){
                answer.replace("n", "nao");
            } else if(answer.equals("s")){
                answer.replace("s", "sim");
            }

            if (answer.equals("sim")){
                likes += 1;
            } else if (answer.equals("nao") || answer.equals("não")){
                System.out.println("\nQue pena que você não gostou. :( \n");
            } else {
                System.out.println("Resposta inválida");
            }
        }

    }
