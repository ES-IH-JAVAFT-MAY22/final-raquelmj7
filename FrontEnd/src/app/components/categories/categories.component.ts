import { Component, OnInit } from '@angular/core';
import { Title } from '@angular/platform-browser';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {
  backgroundColor1:string;
  color1:string;
  padding1:string;
  border1:string;
  bordercolor1:string;
  font1:string;
  fontw1:string;
  shadow1: boolean;
  

  backgroundColor2:string;
  color2:string;
  padding2:string;
  border2:string;
  bordercolor2:string;
  shadow2: boolean;
  

  backgroundColor3:string;
  color3:string;
  padding3:string;
  border3:string;
  bordercolor3:string;
  shadow3: boolean;

  backgroundColor4:string;
  color4:string;
  padding4:string;
  border4:string;
  bordercolor4:string;
  shadow4: boolean;

  backgroundColor5:string;
  color5:string;
  padding5:string;
  border5:string;
  bordercolor5:string;
  shadow5: boolean;

  backgroundColor6:string;
  color6:string;
  padding6:string;
  border6:string;
  bordercolor6:string;
  shadow6: boolean;

  backgroundColor7:string;
  color7:string;
  padding7:string;
  border7:string;
  bordercolor7:string;
  shadow7: boolean;

  backgroundColor8:string;
  color8:string;
  padding8:string;
  border8:string;
  bordercolor8:string;
  shadow8: boolean;

  backgroundColor9:string;
  color9:string;
  padding9:string;
  border9:string;
  bordercolor9:string;
  shadow9: boolean;

  backgroundColor11:string;
  color11:string;
  padding11:string;
  border11:string;
  bordercolor11:string;
  shadow11: boolean;

  newTitle = 'Categories';


  constructor(private titleService: Title) {
    this.backgroundColor1= '#ECB1FF';
    this.color1='';
    this.padding1='15px';
    this.border1='15%';
    this.bordercolor1='#FFFFFF';
    this.font1='20px';
    this.fontw1='bold';
    this.shadow1 = false;
    

    this.backgroundColor2= '#65FFEA';
    this.color2='#B300FF';
    this.padding2='8px';
    this.border2='15%';
    this.bordercolor2='#FFFFFF';
    this.shadow2= false;

    this.backgroundColor3= '#ECB1FF';
    this.color3='';
    this.padding3='8px';
    this.border3='15%';
    this.bordercolor3='#FFFFFF';
    this.shadow3= false;

    this.backgroundColor4= '#65FFEA';
    this.color4='#B300FF';
    this.padding4='8px';
    this.border4='15%';
    this.bordercolor4='#FFFFFF';
    this.shadow4 = false;

    this.backgroundColor5= '#ECB1FF';
    this.color5='';
    this.padding5='8px';
    this.border5='15%';
    this.bordercolor5='#FFFFFF';
    this.shadow5 = false;

    this.backgroundColor6= '#65FFEA';
    this.color6='#B300FF';
    this.padding6='8px';
    this.border6='15%';
    this.bordercolor6='#FFFFFF';
    this.shadow6 = false;

    this.backgroundColor7= '#ECB1FF';
    this.color7='';
    this.padding7='8px';
    this.border7='15%';
    this.bordercolor7='#FFFFFF';
    this.shadow7 = false;

    this.backgroundColor8= '#65FFEA';
    this.color8='#B300FF';
    this.padding8='8px';
    this.border8='15%';
    this.bordercolor8='#FFFFFF';
    this.shadow8= false;

    this.backgroundColor9= '#ECB1FF';
    this.color9='';
    this.padding9='8px';
    this.border9='15%';
    this.bordercolor9='#FFFFFF';
    this.shadow9 = false;

    this.backgroundColor11= '#ECB1FF';
    this.color11='';
    this.padding11='12px';
    this.border11='15%';
    this.bordercolor11='#FFFFFF';
    this.shadow11 = false;

  }

  ngOnInit(): void {
  }
  
  setTitle( newTitle: string) {
    this.titleService.setTitle( newTitle );
  }
  
   
   
}
