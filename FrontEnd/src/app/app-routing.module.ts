import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllComponent } from './components/all/all.component';
import { CategoriesComponent } from './components/categories/categories.component';
import { CognitiveComponent } from './components/cognitive/cognitive.component';
import { CreativeComponent } from './components/creative/creative.component';
import { EntertainmentComponent } from './components/entertainment/entertainment.component';
import { FallComponent } from './components/fall/fall.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { PsychomotorComponent } from './components/psychomotor/psychomotor.component';
import { RegisterComponent } from './components/register/register.component';
import { SpringComponent } from './components/spring/spring.component';
import { SummerComponent } from './components/summer/summer.component';
import { WinterComponent } from './components/winter/winter.component';
import { AuthGuardService } from './services/auth-guard.service';

const routes: Routes = [
  {
    path: '',
    canActivate: [AuthGuardService],
    component: CategoriesComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegisterComponent
  },
  {
    path: 'games',
    component: AllComponent
  },
  {
    path: 'games/seasons/winter',
    component: WinterComponent
  },
  {
    path: 'games/seasons/spring',
    component: SpringComponent
  },
  {
    path: 'games/seasons/summer',
    component: SummerComponent
  },
  {
    path: 'games/seasons/fall',
    component: FallComponent
  },
  {
    path: 'games/types/creative',
    component: CreativeComponent
  },
  {
    path: 'games/types/cognitive',
    component: CognitiveComponent
  },
  {
    path: 'games/types/entertainment',
    component: EntertainmentComponent
  },
  {
    path: 'games/types/psychomotor',
    component: PsychomotorComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
