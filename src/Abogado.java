public class Abogado extends  Empleado{

    public int getVacaciones() {
        return super.getVacaciones() / 2;
    }
    public double getSalario() {
        return super.getSalario() + 10000;
    }

}
