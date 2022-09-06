package hrms.hiringsystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "schools")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "starting_year")
	private int startingYear;
	
	@Column(name = "end_year", nullable = true)
	private Integer endYear;
	
	@ManyToOne()
	@JoinColumn(name = "resume_id")
	private Resume resume;
	
	public String getEndYear() {
        if (this.endYear == null) {
        	return "Devam ediyor";
        }
        return this.endYear.toString();
    }

}
