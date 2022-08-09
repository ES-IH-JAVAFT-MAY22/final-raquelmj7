import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CognitiveComponent } from './cognitive.component';

describe('CognitiveComponent', () => {
  let component: CognitiveComponent;
  let fixture: ComponentFixture<CognitiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CognitiveComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CognitiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
