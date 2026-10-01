package kodlamaio.northwind.core.utilities.results;

public class Result {

    private boolean success;
   
    private String massage;

    public Result(boolean success){

    }

    public Result(boolean success,String massage){
        this.success=success;
        this.massage=massage;
        
    }

     public boolean isSuccess() {
        return this.success;
    }


    
    public String getMassage() {
        return this.massage;
    }




    
}
