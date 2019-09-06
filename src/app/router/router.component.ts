import { Component, OnInit } from '@angular/core';
import { User } from '../model/User';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-router',
  templateUrl: './router.component.html',
  styleUrls: ['./router.component.scss']
})
export class RouterComponent implements OnInit {
  submitted = false;
  searchResult: any [];
  searchItem: string;
  user: User = new User();
  constructor(private router: Router, private userService: UserService) { }
  

  ngOnInit() {
  }
  

  onSubmit() {
    this.submitted = true;
    console.log(this.searchItem)
    this.userService.getCourseDetails(this.searchItem)
    .subscribe((res:any[])=>{
      console.log('oooooooo',res[0].course)
      this.searchResult=res;
    })
  }
}