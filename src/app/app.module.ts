import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MentorRegistrationComponent} from './mentor-registration/mentor-registration.component';
import { RouterComponent } from './router/router.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchTrainingComponent } from './search-training/search-training.component';
import { AdminRegistrationComponent } from './admin-registration/admin-registration.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';
@NgModule({
  declarations: [
    AppComponent,
    MentorRegistrationComponent,
    RouterComponent,
    SearchTrainingComponent,
    AdminRegistrationComponent,
    UserRegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ]
  ,
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
