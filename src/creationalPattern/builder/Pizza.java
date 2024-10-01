package creationalPattern.builder;

//Product
//최종적으로 생성될 객체
class Pizza {
	private String dough;
	private String sauce;
	private String topping;
	
	//메소드 체이닝을 위해 return을 this로
	
	public String getDough() { return dough; }
	public String getSauce() { return sauce; }
	public String getTopping() {return topping; }
	
	public void setDough(String dough) { this.dough = dough; }
	public void setSauce(String sauce) { this.sauce = sauce; }
	public void setTopping(String topping) { this.topping = topping; }
	
	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", topping=" + topping + "]";
	}
	
}
