public class book {
    public int id;
    private String title;
    private String author;
    book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        
    }
    public int getid(){return id;}
    public String gettitle(){return title;}
    public String getauthor(){return author;}
   
    
   
    public String toString(){
        return id+"|"+title+"|"+author+"|";
    }}
    

