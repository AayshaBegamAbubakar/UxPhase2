import { Component, OnInit } from '@angular/core';
import { Mentor } from '../model/Mentor';
import { MentorService } from '../mentor.service';
import { Router } from '@angular/router';




@Component({
  selector: 'app-mentor-registration',
  templateUrl: './mentor-registration.component.html',
  styleUrls: ['./mentor-registration.component.scss']
})
export class MentorRegistrationComponent implements OnInit {
  mentor: Mentor = new Mentor();
    submitted = false;
   login:any;
 
    constructor(private router: Router, private mentorService: MentorService) { }
  
  
  ngOnInit() {
  }
  newMentor(): void {
    this.submitted = false;
    this.mentor = new Mentor();
  }
  save() {
    this.mentorService.createMentor(this.mentor)
      .subscribe(data =>this.login=data, error => console.log(error));
    this.mentor = new Mentor();

    if(this.login!=null)
    {
      this.router.navigate(['MentorRegistration']);
    }
  }
  onSubmit() {
    this.submitted = true;
    this.save();
  }
}
