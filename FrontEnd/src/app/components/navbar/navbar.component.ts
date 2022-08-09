import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  backgroundColor1:string;
  color1:string;
  padding1:string;
  border1:string;
  shadow1: boolean;

  backgroundColor2:string;
  color2:string;
  padding2:string;
  border2:string;
  shadow2: boolean;

  backgroundColor3:string;
  color3:string;
  padding3:string;
  border3:string;
  shadow3: boolean;

  backgroundColor4:string;
  color4:string;
  padding4:string;
  border4:string;
  shadow4: boolean;

  backgroundColor5:string;
  color5:string;
  padding5:string;
  border5:string;
  shadow5: boolean;

  constructor( private authService: AuthService,
    private router: Router) {
    this.backgroundColor1= '#00FFFF';
    this.color1='#B300FF';
    this.padding1='8px';
    this.border1='50%';
    this.shadow1 = false;

    this.backgroundColor2= '#00FFFF';
    this.color2='#B300FF';
    this.padding2='8px';
    this.border2='50%';
    this.shadow2 = false;

    this.backgroundColor3= '#00FFFF';
    this.color3='#B300FF';
    this.padding3='8px';
    this.border3='50%';
    this.shadow3 = false;

    this.backgroundColor4= '#00FFFF';
    this.color4='#B300FF';
    this.padding4='8px';
    this.border4='50%';
    this.shadow4 = false;

    this.backgroundColor5= '#00FFFF';
    this.color5='#FF0000';
    this.padding5='8px';
    this.border5='50%';
    this.shadow5 = false;
   }

  ngOnInit(): void {
  }

  logout(): void {
    console.log('logging out...');
    this.authService.logout();

    this.router.navigate(['/login']);

  }

}
