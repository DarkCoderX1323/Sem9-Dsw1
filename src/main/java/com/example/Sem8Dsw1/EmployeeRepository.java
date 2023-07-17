package main.java.com.example.Sem8Dsw1;

import org.springframework.data.repository.CrudRepository; // Importa la interfaz CrudRepository

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

