package hrms.hiringsystem.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_announcements")
public class JobAnnouncement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "open_positions", nullable = false)
	private int openPositions;
	
	@Column(name = "aplication_deadline", nullable = false)
	private LocalDate aplicationDeadline;
	
	@Column(name = "is_active", nullable = false)
	private boolean isActive;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "posting_date")
	private LocalDateTime postingDate = LocalDateTime.now();
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private EmployerUser employerUser;
	
	@ManyToOne()
	@JoinColumn(name = "city")
	private City city;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_position")
	private JobPosition jobPosition;
	
	
}
