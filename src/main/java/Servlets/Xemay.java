package Servlets;

public class Xemay {
	private String Id;
	private String Name;
	private String Type;
	private String Price;

public Xemay() {
		
	}
public Xemay(String Id, String Name,String Type,String Price) {
	this.setId(Id);
	this.setName(Name);
	this.setType(Type);
	this.setPrice(Price);	
}

public String getId() {
	return Id;
}
public void setId(String id) {
	this.Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	this.Type = type;
}
public String getPrice() {
	return Price;
}
public void setPrice(String price) {
	this.Price = price;
}
}
