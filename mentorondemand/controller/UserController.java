package com.mentorondemand.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentorondemand.model.MentorCalendar;
import com.mentorondemand.repo.LoginRepository;
import com.mentorondemand.repo.MentorCalendarRepository;
import com.mentorondemand.repo.MentorRepository;
import com.mentorondemand.repo.MentorSkillRepository;
import com.mentorondemand.repo.PaymentRepository;
import com.mentorondemand.repo.ProposalRequestRepository;
import com.mentorondemand.repo.SkillRepository;
import com.mentorondemand.repo.UserRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserRepository userRepo;
	 @Autowired 
     LoginRepository loginRepo;
	@Autowired
	SkillRepository skillRepo;
	@Autowired
	MentorSkillRepository mentorSkillRepo;
	@Autowired
	MentorCalendarRepository mentorCalendarRepo;
	@Autowired
	MentorRepository mentorRepo;
	
	@Autowired
	ProposalRequestRepository proposalRequestRepo;

	@Autowired
	PaymentRepository paymentRepo;
	
	List details=new ArrayList();
	List result=new ArrayList();
	
	
	
	@GetMapping(path="/user/searchCourseDetails/{searchItem}")
   
	public List<MentorCalendar> findBySkillName(@PathVariable("searchItem") String searchItem){
		
		System.out.println("serach Item "+searchItem);
         List<MentorCalendar> mentorCourseList=mentorRepo.findBySearchItem(searchItem);

		
		
		System.out.println(" search item list "+mentorCourseList);
		
		return mentorCourseList;
	}

/*
	@PostMapping(value = "/user/register")
	public void postCustomer(@RequestBody User user) {
System.out.println(user);
		User userInsert = userRepo.save(new User(user.getUserName(), user.getPassword(), user.getFirstName(),
				user.getLastName(), user.getGender(), user.getEmail(), user.getContactNumber(), user.getRegcode(),
				user.getActiveStatus(), user.getAddress(),"user"));
		Login loginDetails= loginRepo.save(new Login(user));
		

	}
	
	@PostMapping(value = "searchSkill/{skillName}")
	public List findBySkill(@PathVariable String skillName) {

         List<Mentor> mentorList=mentorRepo.findBySkills(skillName);

         Iterator itr=mentorList.iterator();
         while(itr.hasNext())
         {
        	 	Mentor mentor=(Mentor)itr.next();
        	 	Long mentorId=mentor.getMentorId();
        		List<MentorSkills> skillList = mentorSkillRepo.findByMentorId(mentorId);
        		List<MentorCalendar> calendarList=mentorCalendarRepo.findByMentorId(mentorId);
        		details.add(mentorList);
        		details.add(skillList);
        		details.add(calendarList);
        		result.add(details);
         }
         return result;
         }
	
	
	
	
	@PostMapping(value = "user/searchSkill/{skillName}")
	public List<Skills> findBySkillName(@PathVariable String skillName) {

         List<Mentor> mentorList=mentorRepo.findBySkills(skillName);

		List<Skills> skillList = skillRepo.findBySkillName(skillName);
		System.out.println("2"+skillList);
		
		details.add(skillList);
		details.add(mentorList);
		
		return details;
	}

	@PostMapping(value = "/user/proposeTraining")
	public ProposalRequest proposeTraining(@RequestBody ProposalRequest proposalRequest) {

		ProposalRequest proposalRequestInsert = proposalRequestRepo
				.save(new ProposalRequest(proposalRequest.getUserId(), proposalRequest.getMentorId(),
						proposalRequest.getTechnologyId(), proposalRequest.getStatus()));
		return proposalRequestInsert;

	}

	@PostMapping(value = "/user/proposalConfirmation")
	public Payments proposalConfirmation(@RequestBody ProposalRequest proposalRequest) {

		Payments paymentInsert = paymentRepo.save(
				new Payments(proposalRequest.getMentorId(), proposalRequest.getTechnologyId(), "0", "0", "0", "0"));
		return paymentInsert;

	}
	
*/
	
	
}
