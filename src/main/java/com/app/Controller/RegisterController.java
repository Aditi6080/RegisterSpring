package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.Entity.Register;
import com.app.Service.RegisterServices;


@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterServices registerServices;

    @PostMapping(value="/save")
    public ResponseEntity<String> saveRegister(@RequestBody Register registers) {
        registerServices.save(registers);
        return new ResponseEntity<>(String.valueOf(registers.getId()), HttpStatus.CREATED);
    }

        @GetMapping(value="/getAll")
        public ResponseEntity<Iterable<Register>> getRegister() {
            Iterable<Register> registers;
            try {
                registers = registerServices.listAll();
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
            return new ResponseEntity<>(registers, HttpStatus.OK);
        }
    }




































//package com.app.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.app.Entity.Register;
//import com.app.Service.RegisterServices;
//
//@RestController
////@CrossOrigin(origins = "*")
//@RequestMapping("/register")
//public class RegisterController {
//	
//	@Autowired
//	private RegisterServices registerServices;
//	
//	
//	@PostMapping(value="/save")
//	public String saveRegister(@RequestBody Register registers) {
//		
//		registerServices.save(registers);
//		return registers.get_id();
//	}
//	
//	@GetMapping(value="/getAll")
//	public Iterable<Register>getRegister() {
//		
//		return RegisterServices.listAll();
//	}
//
//}
