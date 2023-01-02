package in.durgesh.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;
	private Double amount;

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Date getAmount() {
		// TODO Auto-generated method stub
		return null;
	}
}