package hrms.hiringsystem.entities.dtos;

import java.time.LocalDateTime;
import java.util.List;

import hrms.hiringsystem.entities.concretes.CandidateUser;
import hrms.hiringsystem.entities.concretes.CoverLetter;
import hrms.hiringsystem.entities.concretes.Image;
import hrms.hiringsystem.entities.concretes.JobExperience;
import hrms.hiringsystem.entities.concretes.Language;
import hrms.hiringsystem.entities.concretes.Link;
import hrms.hiringsystem.entities.concretes.School;
import hrms.hiringsystem.entities.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResumeWithAllRelatedEntitiesDto {
	
	private CandidateUser candidateUser;
	
	private CoverLetter coverLetter;
	
	private Image image;
	
	private List<JobExperience> jobExperiences;
	
	private List<Language> languages;
	
	private Link link;
	
	private List<School> schools;
	
	private List<Skill> skills;
	
	private LocalDateTime postingDate;

}
