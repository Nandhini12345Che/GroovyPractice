//This will integrate the model class with the application via the database
class BookService{
    String title
    Date releaseDate
    Author author
    Book book
    if(book.bookType == "comedy"){
      author.AuthorName= "Test"  
    }
}