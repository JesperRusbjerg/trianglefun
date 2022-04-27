import { Component, OnInit } from '@angular/core';
import { ApiService } from './api.service';
import { Triangle } from './triangle';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'triangleFrontend';
  error = ""

  triangles: Triangle[] = [];
  triangleMaker = new Triangle();
  
  constructor(private apiService:ApiService) {}
 
  ngOnInit() {
  }

  addTriangle() {

    this.apiService.addTriangle(this.triangleMaker)
      .subscribe(data => {
        console.log(data)
        this.error = ""
        this.triangles?.push(data) 
      }
      , (error) =>  this.error = error.error
      )}
}
