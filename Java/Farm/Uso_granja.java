package pregunta1;

public class Uso_granja {

	public static void main(String[] args) {
		Granjas granjaTomates=new Granjas("Tomate");
        Granjas granjaCebollas=new Granjas("Cebolla");
        
        Granjeros Juan=new Granjeros("Juan",granjaTomates);
        Granjeros Pedro=new Granjeros("Pedro",granjaCebollas);
        
        Plantas tomate1=new Plantas("Tomate");
        Plantas cebolla1=new Plantas("Cebolla");
        Plantas lechuga1=new Plantas("Lechuga");
        Plantas tomate2=new Plantas("Tomate");
        Plantas cebolla2=new Plantas("Cebolla");
        Plantas lechuga2=new Plantas("Lechuga");
        
        Juan.plantar(tomate1);
        Juan.regar(tomate1);
        Juan.regar(tomate1);
        Juan.regar(tomate1);
        Juan.plantar(cebolla1);
        Juan.plantar(lechuga1);
        Juan.regar(lechuga1);
        
        Pedro.plantar(tomate2);
        Pedro.plantar(lechuga2);
        Pedro.plantar(cebolla2);
        Pedro.regar(cebolla2);
        Pedro.regar(cebolla2);
        Pedro.regar(cebolla2);
        Pedro.plantar(cebolla2);
	}
}
