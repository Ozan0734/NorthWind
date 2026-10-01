package kodlamaio.northwind.core.utilities.results;

import org.springframework.data.domain.Page;

import kodlamaio.northwind.entities.concretes.Product;

public class SuccessDataResult<T> extends DataResult <T> {
    public SuccessDataResult(T data,String massage){
        super(data,true,massage);

    }
    public SuccessDataResult(Page<Product> data){
        super(data,true);

    }

    public SuccessDataResult(Page<Product> massage){
        super(null ,true,massage);

    }

    public SuccessDataResult(){
        super(null,true);

    }


}
