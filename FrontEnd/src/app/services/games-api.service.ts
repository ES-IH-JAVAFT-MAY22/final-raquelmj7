import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Games } from '../models/games.model';

/* cambiar esto tb */

@Injectable({
  providedIn: 'root'
})
export class GamesApiService {
 private readonly BASE_URL='http://localhost:8080';
  constructor(
    private http : HttpClient
  ) {}

  //Llamamos a nuestro Backend 
  
  getAll(): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games`);
  }

  getWinter(season:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/seasons/${season}`);
  }

  getSpring(season:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/seasons/${season}`);
  }

  getSummer(season:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/seasons/${season}`);
  }

  getFall(season:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/seasons/${season}`);
  }

  getCreative(type:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/type/${type}`);
  }

  getCognitive(type:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/type/${type}`);
  }

  getEntertainment(type:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/type/${type}`);
  }

  getPsychomotor(type:string): Observable<any>{
    return this.http.get(`${this.BASE_URL}/games/type/${type}`);
  }



}
