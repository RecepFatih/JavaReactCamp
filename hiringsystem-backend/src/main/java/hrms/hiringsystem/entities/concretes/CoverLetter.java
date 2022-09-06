package hrms.hiringsystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "cover_letters")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CoverLetter {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "cover_letter_name")
	private String coverLetterName;
	
	@Column(name = "cover_letter_content")
	private String coverLetterContent;
	
	@OneToOne
	@JoinColumn(name = "resume_id")
	private Resume resume;
	

}
