import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PsychomotorComponent } from './psychomotor.component';

describe('PsychomotorComponent', () => {
  let component: PsychomotorComponent;
  let fixture: ComponentFixture<PsychomotorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PsychomotorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PsychomotorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
