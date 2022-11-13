import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tourist } from './tourist';

@Injectable({
  providedIn: 'root'
})
export class TouristService {

  private baseURL = "http://localhost:8083/apitour";

  constructor(private http: HttpClient) { }

  getTouristList(): Observable<Tourist[]>{
    return this.http.get<Tourist[]>(`${this.baseURL}/getdesc`);
  }

  createTourist(tourist: Tourist):Observable<Object>{
    return this.http.post(`${this.baseURL}/insert`, tourist);
  }
}
