import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MentorRegistrationComponent} from './mentor-registration/mentor-registration.component';
import { RouterComponent } from './router/router.component';
import { SearchTrainingComponent } from './search-training/search-training.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
import { AdminRegistrationComponent } from './admin-registration/admin-registration.component';

const routes: Routes = [
  {path:'',component:RouterComponent,pathMatch:'full'},
  { path: 'SearchTraining', component:SearchTrainingComponent },
  { path: 'UserRegistration', component:UserRegistrationComponent },
  { path: 'AdminRegistration', component:AdminRegistrationComponent },
  { path: 'MentorRegistration', component: MentorRegistrationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
