package ABSTRACT;
public abstract class Hinh {
    protected ToaDo toado;

    public Hinh(ToaDo toaDo){
        this.toado = toaDo;
    }

    public ToaDo getToado(){
        return this.toado;
    }
    public void setToaDo(ToaDo toado){
        this.toado = toado;
    }

    public abstract double TinhDienTich(); 
}
