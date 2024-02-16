package com.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import com.app.Entity.Register;

public interface RegisterRepo extends JpaRepository<Register, Integer>{

}
