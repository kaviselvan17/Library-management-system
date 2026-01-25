public class member {
    private int id;
    private String name;
    private boolean isadded;
    
    public member(int id,String name){
        this.id =id;
        this.name=name;
        this.isadded=true;
        
     }
    public int getid(){return id;}
    public String getName(){return name;}
        public boolean isadded(){return isadded;}
   
    
    
    public String toString(){
        return id+"|"+name+"|"+(isadded?"added":"issued");


    }



    
    
}
