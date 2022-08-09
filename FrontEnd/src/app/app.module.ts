import { NgModule } from '@angular/core';
import { BrowserModule, Title } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CategoriesComponent } from './components/categories/categories.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { WinterComponent } from './components/winter/winter.component';
import { GamesComponent,  } from './components/games-item/games-item.component';
import { SummerComponent } from './components/summer/summer.component';
import { SpringComponent } from './components/spring/spring.component';
import { FallComponent } from './components/fall/fall.component';
import { CreativeComponent } from './components/creative/creative.component';
import { CognitiveComponent } from './components/cognitive/cognitive.component';
import { EntertainmentComponent } from './components/entertainment/entertainment.component';
import { PsychomotorComponent } from './components/psychomotor/psychomotor.component';
import { AllComponent } from './components/all/all.component';



@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CategoriesComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    GamesComponent,
    WinterComponent,
    SummerComponent,
    SpringComponent,
    FallComponent,
    CreativeComponent,
    CognitiveComponent,
    EntertainmentComponent,
    PsychomotorComponent,
    AllComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MatCardModule,
    MatButtonModule,
    MatInputModule,
    MatFormFieldModule
  ],
  providers: [
    Title
  ],
  bootstrap: [
    AppComponent
  ]
})
export class AppModule { }
