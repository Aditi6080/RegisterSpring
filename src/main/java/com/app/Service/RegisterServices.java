package com.app.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Register;
import com.app.Repo.RegisterRepo;

@Service
public class RegisterServices {

    private static final Logger logger = LoggerFactory.getLogger(RegisterServices.class);

    private final RegisterRepo repo;

    @Autowired
    public RegisterServices(RegisterRepo repo) {
        this.repo = repo;
    }

    public void save(Register registers) {
        repo.save(registers);
        logger.info("Saved register: {}", registers);
    }

    public Iterable<Register> listAll() {
        Iterable<Register> registers = repo.findAll();

        // Log each register
        registers.forEach(register -> logger.info("Retrieved register: {}", register));

        return registers;
    }
}



















//package com.app.Service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.app.Entity.Register;
//import com.app.Repo.RegisterRepo;
//
//@Service
//public class RegisterServices {
//
//    private final RegisterRepo repo;
//
//    @Autowired
//    public RegisterServices(RegisterRepo repo) {
//        this.repo = repo;
//    }
//
//    public void save(Register registers) {
//        repo.save(registers);
//    }
//
//    public Iterable<Register> listAll() {
//    	Iterable<Register> registers = repo.findAll();
//        // Add logging here
//        for (Register register : registers) {
//            System.out.println(register.toString());
//        }
//        return registers;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package com.app.Service;
////
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Service;
////
////import com.app.Entity.Register;
////import com.app.Repo.RegisterRepo;
////
////@Service
////public class RegisterServices {
////	
////	@Autowired
////	private static RegisterRepo repo;
////	
////	public void save(Register registers) {
////		repo.save(registers);
////	}
////
////	public static Iterable<Register> listAll() {
////
////		 return repo.findAll();
////	}
////
////}
