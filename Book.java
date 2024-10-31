/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance. 
 * Edit this class to complete the exercise.
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Sets the author and title fields 
     * when this object is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int aPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = aPages;
    }
    
    public String getAuthor()
    {
        return author;
    }
   public String getTitle()
   {
       return title;
   }
   public int getPages()
    {
        return pages;
    }
     public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * Method to print the title of the book.
     */
    public void printTitle()
    {
        System.out.println(title);
    }
}