package hrms.hiringsystem.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "resumes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Resume {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "posting_date")
	private LocalDateTime postingDate = LocalDateTime.now();
	
	@OneToOne
	@JoinColumn(name = "candidate_id")
	private CandidateUser candidateUser;
	
	@JsonIgnore
	@OneToOne(mappedBy = "resume")
	private CoverLetter coverLetter;
	
	@JsonIgnore
	@OneToOne(mappedBy = "resume")
	private Image image;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<JobExperience> jobExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<Language> languages;
	
	@JsonIgnore
	@OneToOne(mappedBy = "resume")
	private Link link;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<School> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<Skill> skills;



}
