package hrms.hiringsystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{
	City getByCityName(String cityName);
}
