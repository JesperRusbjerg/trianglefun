import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Triangle } from './triangle';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
 
@Injectable({providedIn:'root'})
export class ApiService {
 

  //Below are the different base URL's for the current 3 different deploy options

  //Below is the url to the deployed backend
  baseURL: string = "http://138.68.69.204:4201/";

  //Below is the url to the local docker backend
  //baseURL: string = "http://localhost:4201/";

  //Below is the url to the local backend if you just run it without docker
  //baseURL: string = "http://localhost:8080/";
 
  constructor(private http: HttpClient) {
  }
 

  addTriangle(triangle:Triangle): Observable<any> {
    const headers = { 'content-type': 'application/json'}  
    const body=JSON.stringify(triangle);
    console.log(body)
    return this.http.post(this.baseURL + 'triangle', body,{'headers':headers})
  }
 
}
 