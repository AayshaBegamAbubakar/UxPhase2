import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl = 'http://localhost:8254/api';
private _email=new BehaviorSubject<String>(this._email);
_email$=this._email.asObservable();
  

   constructor(private http: HttpClient) { }

 
  getCourseDetails(searchItem : string): Observable<any> {
    console.log('router ts file ',searchItem)
    return this.http.get<any>(`${this.baseUrl}`+'/user/searchCourseDetails/${searchItem}');
  }
  
  setEmail(email:string)
  {
    this._email.next(email);
  }
}
