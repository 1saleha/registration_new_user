package com.reg.registration_new_user._Controller;



import java.io.IOException;
import java.util.HashMap;
//import java.sql.CallableStatement;
//import java.sql.Types;
//import java.util.Collections;
import java.util.List;
//import java.util.Map;
//import java.util.Optional;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.SqlParameter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.reg.registration_new_user._Model.Employee;
import com.reg.registration_new_user._Model.Employee_Leave;
import com.reg.registration_new_user._Model.Employee_Login;
import com.reg.registration_new_user._Model.Employee_Salary;
import com.reg.registration_new_user._Model.Manager_Login;
import com.reg.registration_new_user._Model.Manager_reg;
import com.reg.registration_new_user._Model.New_Company_Model;
import com.reg.registration_new_user._Model.New_User_Model;
import com.reg.registration_new_user._Model.Recruiters_Model;
import com.reg.registration_new_user._Model.Salary;
import com.reg.registration_new_user._Model.Timesheet_Model;
//import com.reg.registration_new_user._Model.Timesheet;
//import com.reg.registration_new_user._Model.UserModel;
import com.reg.registration_new_user._Model.company_model;
import com.reg.registration_new_user._Repository.EmployeeRepository;
import com.reg.registration_new_user._Repository.Employee_Leave_Repo;
import com.reg.registration_new_user._Repository.Employee_Login_Repo;
import com.reg.registration_new_user._Repository.Employee_Salary_Repo;
import com.reg.registration_new_user._Repository.Manager_Login_Repo;
import com.reg.registration_new_user._Repository.Manager_Reg_Repo;
import com.reg.registration_new_user._Repository.New_Company_repo;
import com.reg.registration_new_user._Repository.New_User_Repo;
import com.reg.registration_new_user._Repository.Recruiters_Repo;
import com.reg.registration_new_user._Repository.SalaryRepository;
import com.reg.registration_new_user._Repository.Timesheet_Emp_Repo;
//import com.reg.registration_new_user._Repository.TimesheetRepository;
//import com.reg.registration_new_user._Repository.UserRepo;
import com.reg.registration_new_user._Repository.company_repo;
import com.reg.registration_new_user._exception.ResourceNotFoundException;
import com.reg.registration_new_user._exception.ResourceNotFoundExceptionLeave;
import com.reg.registration_new_user._service.BlobStorageService;
//import com.reg.registration_new_user._exception.ResourceNotFoundExceptionTimesheet;
//import com.reg.registration_new_user._service.user_service;



@RestController
@RequestMapping("/api/")
public class Contoller {
	
	//@Autowired
	//private UserRepo userrepo;
	
	@Autowired
    BlobStorageService blobStorageService;
	
	@Autowired
	private Employee_Leave_Repo employee_leave_repo;
	
	@Autowired
	private Timesheet_Emp_Repo timesheet_emp_repo;
	
	@Autowired
	private Recruiters_Repo recruiters_repo;
	
	@Autowired
	private New_User_Repo new_User_Repo;
	
	@Autowired
	private company_repo comp_repo;
	
	@Autowired
	private New_Company_repo new_Company_repo;
	
	//@Autowired
	//private user_service user_ser;
	//@Autowired
	//private TimesheetRepository timesheetrepository;
	
	@Autowired
	private Employee_Login_Repo employee_login_repo;
	
	@Autowired
	private Manager_Reg_Repo manager_reg_repo;
	
	@Autowired
	private Manager_Login_Repo manager_login_repo;
	
	@Autowired
	private EmployeeRepository employerepository;
	
	@Autowired
	private Employee_Salary_Repo employee_salary_repo;
	
	@Autowired
	private SalaryRepository salaryrepository;
	
	//get all salary
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/sal")
	public List<Salary> getAllSal(){
		return salaryrepository.findAll();
	}
	//get all salary
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/time")
	public List<Timesheet_Model> getAllTime(){
		return timesheet_emp_repo.findAll();
	}
	
	//get all employee leave api
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/leave")
	public List<Employee_Leave> getAllLeave(){
		return  employee_leave_repo.findAll();
	}
	
	
	
	//get all salries of employees
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/salary")
	public List<Employee_Salary> getAllSalary(){
		return employee_salary_repo.findAll();
	}
	
	//get all timesheetdetails
	
	
	//get all employees
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("employees")
	public List<Employee> getAllEmployees(){
		return employerepository.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getlogmanager")
	public List<Manager_Login> getAllLogmanager(){
		return manager_login_repo.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getmanager")
	public List<Manager_reg> getAllManager(){
		return manager_reg_repo.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getemp")
	public List<Employee_Login> getAllEmp(){
		return employee_login_repo.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getuser")
	public List<New_User_Model> getAllUser(){
		return new_User_Repo.findAll();
	}
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getrecruiter")
	public List<Recruiters_Model> getAllRecruiter(){
		return recruiters_repo.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getcompany")
	public List<company_model> getcompany(){
		return comp_repo.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getnewcompany")
	public List<New_Company_Model> getnewcompany(){
		return new_Company_repo.findAll();
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/newuser")
	public New_User_Model CreateUser(@RequestBody New_User_Model new_User_Model){
		return new_User_Repo.save(new_User_Model);
	}
	//create leave rest api
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/leave")
	public Employee_Leave CreateLeave(@RequestBody Employee_Leave employee_leave){
		return employee_leave_repo.save(employee_leave);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/newcompany")
	public New_Company_Model CreateCompany(@RequestBody New_Company_Model new_Company_Model){
		return new_Company_repo.save(new_Company_Model);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/newRecruiter")
	public Recruiters_Model CreateCompany(@RequestBody Recruiters_Model new_recruiter_Model){
		return recruiters_repo.save(new_recruiter_Model);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/newemp")
	public Employee_Login CreateEmp(@RequestBody Employee_Login employee_login) {
		return employee_login_repo.save(employee_login);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/newmanager")
	public Manager_reg CreateManager(@RequestBody Manager_reg manager_reg) {
		return manager_reg_repo.save(manager_reg);
	}
	
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/newlogmanager")
	public Manager_Login CreateLogmanager(@RequestBody Manager_Login manager_login) {
		return manager_login_repo.save(manager_login);
	}
	
	//create employee rest api
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/employees")
	public Employee CreateEmployee(@RequestBody Employee employee) {
		return employerepository.save(employee);
	}
	//create times rest api
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("time")
	public Timesheet_Model createTimesheet(@RequestBody Timesheet_Model time_sheet) {
		return timesheet_emp_repo.save(time_sheet);
	}
	//create image in azure 
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/upload")
    public void uploadFiles(@RequestParam("file") MultipartFile file) throws IOException {
        blobStorageService.uploadFiles(file);

    }
	
	//create employee salary rest api
	@CrossOrigin("http://localhost:4200/")
	@PostMapping("/salary")
	public Employee_Salary CreateEmployeeSalary(@RequestBody Employee_Salary employee_salary) {
		return employee_salary_repo.save(employee_salary);
	}
	
	//get employee by id rest api
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		
		Employee employee = employerepository.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}
	//update employee rest api
	@CrossOrigin("http://localhost:4200/")
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails){
		
		Employee employee = employerepository.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employee.setFirstname(employeeDetails.getFirstname());
		employee.setLastname(employeeDetails.getLastname());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Employee updateEmployee = employerepository.save(employee);
		return ResponseEntity.ok(updateEmployee);
	}
	
	//update employee leave rest api
	@CrossOrigin("http://localhost:4200/")
	@PutMapping("/leave/{id}")
	public ResponseEntity<Employee_Leave> updateLeave(@PathVariable Long id,@RequestBody Employee_Leave leaveDetails){
		
		Employee_Leave employee_leave = employee_leave_repo.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employee_leave.setEmail(leaveDetails.getEmail());
		employee_leave.setPsnumber(leaveDetails.getPsnumber());
		employee_leave.setFromdate(leaveDetails.getFromdate());
		employee_leave.setTodate(leaveDetails.getTodate());
		employee_leave.setDescription(leaveDetails.getDescription());
		employee_leave.setStatus(leaveDetails.getStatus());
		
		Employee_Leave updateLeave = employee_leave_repo.save(employee_leave);
		return ResponseEntity.ok(updateLeave);
	}
	
	
	//delete employee leave rest employee
		@CrossOrigin("http://localhost:4200/")
		@DeleteMapping("/leave/{id}")
		public ResponseEntity<Map<String,Boolean>>deleteLeave(@PathVariable Long id){
			Employee_Leave employee_leave = employee_leave_repo.findById(id)
					.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
			
			
			employee_leave_repo.delete(employee_leave);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		
		
	
	//delete employee rest employee
	@CrossOrigin("http://localhost:4200/")
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String,Boolean>>deleteEmployee(@PathVariable Long id){
		Employee employee = employerepository.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employerepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	//get employeesalary by id restapi
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/salary/{id}")
	public ResponseEntity<Employee_Salary> getEmployeeSalaryById(@PathVariable Long id) {
		
		Employee_Salary employee_salary = employee_salary_repo.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee_salary);
	}
	
	//get employee timesheet by id restapi
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/time/{id}")
	public ResponseEntity<Timesheet_Model> getTimesheetById(@PathVariable Long id) {
		
		Timesheet_Model timesheet_model = timesheet_emp_repo.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(timesheet_model);
	}
	
	//get employee leaves by id restapi
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/leave/{id}")
	public ResponseEntity<Employee_Leave> getLeaveById(@PathVariable Long id) {
		
		Employee_Leave employee_leave = employee_leave_repo.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundExceptionLeave("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee_leave);
	}
	
	//delete employeesalary rest employee
			@CrossOrigin("http://localhost:4200/")
			@DeleteMapping("/time/{id}")
			public ResponseEntity<Map<String,Boolean>>deleteTimesheet(@PathVariable Long id){
				Timesheet_Model timesheet_model = timesheet_emp_repo.findById(id)
						.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
				
				
				timesheet_emp_repo.delete(timesheet_model);
				Map<String, Boolean> response = new HashMap<>();
				response.put("deleted", Boolean.TRUE);
				return ResponseEntity.ok(response);
			}
			
			
	
	//update employee time rest api
	@CrossOrigin("http://localhost:4200/")
	@PutMapping("/time/{id}")
	public ResponseEntity<Timesheet_Model> updateTimesheet(@PathVariable Long id,@RequestBody Timesheet_Model employeeDetails){
		
		Timesheet_Model timesheet_model = timesheet_emp_repo.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		timesheet_model.setEmail(employeeDetails.getEmail());
		timesheet_model.setWorktitle(employeeDetails.getWorktitle());
		timesheet_model.setHours(employeeDetails.getHours());
		timesheet_model.setDate(employeeDetails.getDate());
		timesheet_model.setStatus(employeeDetails.getStatus());
		
		Timesheet_Model updateTimesheet = timesheet_emp_repo.save(timesheet_model);
		return ResponseEntity.ok(updateTimesheet);
	}

	
	//update employee rest api
	@CrossOrigin("http://localhost:4200/")
	@PutMapping("/salary/{id}")
	public ResponseEntity<Employee_Salary> updateEmployeeSalary(@PathVariable Long id,@RequestBody Employee_Salary employeeDetails){
		
		Employee_Salary employee_salary = employee_salary_repo.findById(id)
				.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employee_salary.setEmailId(employeeDetails.getEmailId());
		employee_salary.setMonth(employeeDetails.getMonth());
		employee_salary.setYear(employeeDetails.getYear());
		employee_salary.setPS_nummber(employeeDetails.getPS_nummber());
		employee_salary.setAmount(employeeDetails.getAmount());
		
		Employee_Salary updateEmployeeSalary = employee_salary_repo.save(employee_salary);
		return ResponseEntity.ok(updateEmployeeSalary);
	}
	
	//delete employeesalary rest employee
		@CrossOrigin("http://localhost:4200/")
		@DeleteMapping("/salary/{id}")
		public ResponseEntity<Map<String,Boolean>>deleteEmployeeSalary(@PathVariable Long id){
			Employee_Salary employee_salary = employee_salary_repo.findById(id)
					.orElseThrow(()  -> new ResourceNotFoundException("Employee not exist with id :" + id));
			
			
			employee_salary_repo.delete(employee_salary);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
		
		
		
		//create employee sal rest api
		@CrossOrigin("http://localhost:4200/")
		@PostMapping("/sal")
		public Salary CreateEmploye(@RequestBody Salary salary) {
			return salaryrepository.save(salary);
		}
	/*	@CrossOrigin("http://localhost:4200/")
		@PostMapping("/timesheets")
		public Timesheet CreateTImeSheet(@RequestBody Timesheet timesheet) {
			return timesheetrepository.save(timesheet);
		}
		//update timsheet rest api
		@CrossOrigin("http://localhost:4200/")
		@PutMapping("/timesheets/{id}")
		public ResponseEntity<Timesheet> updateTimesheet(@PathVariable Long id,@RequestBody Timesheet employeeDetails){
			
			Timesheet timesheet = timesheetrepository.findById(id)
					.orElseThrow(()  -> new ResourceNotFoundExceptionTimesheet("Employee not exist with id :" + id));
			
			 timesheet.setEmailId(employeeDetails.getEmailId());
			 timesheet.setWorktitle(employeeDetails.getWorktitle());
			 timesheet.setHours(employeeDetails.getHours());
			 timesheet.setDate(employeeDetails.getDate());
			 timesheet.setStatus(employeeDetails.getStatus());
			
			 Timesheet updateTimesheet = timesheetrepository.save(timesheet);
			return ResponseEntity.ok(updateTimesheet);
		}*/
	
}
	
//	@PostMapping("/post")
//	public UserModel createuser(@RequestBody UserModel usermodel) {
//		return userrepo.save(usermodel);
//	}
	/*@CrossOrigin("http://localhost:4200/")
	@GetMapping("/getall")
	public List<UserModel> gett(){
		return user_ser.getTotalBlogs();
}
	
	
	 private final JdbcTemplate jdbcTemplate;

	    @Autowired
	    Contoller(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	    @GetMapping("/call")
	    public Object get() {
	        final Map<String, Object> call = jdbcTemplate.call(connection -> {
	            CallableStatement cs = connection.prepareCall("{call fetch_sample_logs (?)}");
	            cs.setString(1, "%wel%");
	            return cs;
	        }, Collections.singletonList(new SqlParameter(Types.VARCHAR)));
	        return Optional.of(call.getOrDefault("#result-set-1", Collections.emptyList()));
	    }
	}
	
	
	
	*/

