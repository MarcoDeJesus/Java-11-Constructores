package clases;

public class Mesa {
    public int numeroDePatas;
    public String material;
    public Mesa instanciaDeLaMesa;

    public Mesa(){
        this.numeroDePatas = 4;
        this.material = "Madera";
    }

    public Mesa(int numeroDePatas, String material){
        this.numeroDePatas = numeroDePatas;
        this.material = material;
    }

    public Mesa(int numeroDePatas){
        this.numeroDePatas = numeroDePatas;
    }

    public Mesa(String material){
        this.material = material;
    }

    public Mesa(String material, int numeroDePatas){
        instanciaDeLaMesa = new Mesa(numeroDePatas, material);
    }
}
