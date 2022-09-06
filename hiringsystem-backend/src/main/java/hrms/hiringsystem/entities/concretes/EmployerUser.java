package hrms.hiringsystem.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAnnouncements"})

public class EmployerUser extends User{
	
	@Column(name = "company_name", nullable = false)
	private String companyName;
	
	@Column(name = "web_address", nullable = false)
	private String webAddress;
	
	@Column(name = "phone", nullable = false)
	private String phoneNumber;
	
	@OneToMany(mappedBy = "employerUser")
	private List<JobAnnouncement> jobAnnouncements;
	
}
