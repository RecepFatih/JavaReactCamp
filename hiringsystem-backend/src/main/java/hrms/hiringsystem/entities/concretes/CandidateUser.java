package hrms.hiringsystem.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "candidates")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CandidateUser extends User{
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "national_ıdentification", nullable = false, unique = true)
	private String nationalIdentity;
	
	@Column(name = "birtday", nullable = false)
	private int birthDate;
	
}
