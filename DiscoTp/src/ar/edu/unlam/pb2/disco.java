package ar.edu.unlam.pb2;

public class disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	
	public Double getRadioInterior() {
		return radioInterior;
	}
	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}
	public Double getRadioExterior() {
		return radioExterior;
	}
	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	public Double getPerimetroInterior() {
		return perimetroInterior;
	}
	public void setPerimetroInterior(Double perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}
	public Double getPerimetroExterior() {
		return perimetroExterior;
	}
	public void setPerimetroExterior(Double perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}
	public Double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}
	
	
	public Double sacarPerimetroExterior(Double oper1){
		this.perimetroExterior = 3.14*2*oper1;
		return perimetroExterior;
	} 
		
	public Double sacarPerimetroInterior(Double oper1){
		this.perimetroInterior = 3.14*2*oper1;
		return perimetroInterior;
		
	}
	
	public Double sacarSuperficie(Double oper1, Double oper2){
		
		this.superficie = ((oper1*oper1)*3.14) + ((oper2*oper2)*3.14);
		return superficie;
	
	}

}
