package book;

public class Book {
    private String nameOfTheAuthor;
    private String nameOfTheBook;

    public String getNameOfTheAuthor(){
        return nameOfTheAuthor;
    }

    public void setNameOfTheAuthor(String nameOfTheAuthor){
        this.nameOfTheAuthor = nameOfTheAuthor;
    }

    public String getNameOfTheBook(){
        return nameOfTheBook;
    }

    public void setNameOfTheBook(String nameOfTheBook){
        this.nameOfTheBook = nameOfTheBook;
    }

    void showDetails(){
        System.out.printf("""

                **********************

                Nome do livro: %s
                Nome do autor do livro: %s
                
                """, nameOfTheBook, nameOfTheAuthor);
    }
}
