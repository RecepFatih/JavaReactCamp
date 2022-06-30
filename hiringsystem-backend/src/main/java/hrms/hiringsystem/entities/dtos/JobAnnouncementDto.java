package hrms.hiringsystem.entities.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAnnouncementDto {
	//private int id;
	private String companyName;
	private String jobPositionName;
	private int numberOfPositions;
	private LocalDateTime postingDate;
	private LocalDate applicationDeadline;
}
