public class Abogado extends  Empleado{

    public int getVacaciones() {
        return super.getVacaciones() / 2;
    }
    public double getSalario() {
        return super.getSalario() + 10000;
    }
    public int getHoras() {
        return super.getHoras() + 5;
    }
    public String getMesVacaciones() {
        return "Julio";
    }
    public void mostrarMensaje(){
        System.out.println("Estoy en el congreso");
    }
}
