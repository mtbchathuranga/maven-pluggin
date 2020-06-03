package api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;

@ApiModel(value = "Car Entity", description = "Describe Car Entity")
public class Car {

	@ApiModelProperty(example="Id can be null for new car")
	@Id
	protected long id;

	@ApiModelProperty(required=true, example="Car name")
	protected String name;

	@ApiModelProperty(required=true, example="Brand name")
	protected String brand;

	public Car(long id, String name,String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}