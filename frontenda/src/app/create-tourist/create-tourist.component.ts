import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { Tourist } from '../tourist';
import { TouristService } from '../tourist.service';



@Component({
  selector: 'app-create-tourist',
  templateUrl: './create-tourist.component.html',
  styleUrls: ['./create-tourist.component.css']
})
export class CreateTouristComponent implements OnInit {

  tourist:Tourist = new Tourist();
  regForm!: FormGroup;
  constructor(private touristService: TouristService,
    private router:Router, private fb:FormBuilder) { }

  ngOnInit(): void {
    this.regForm=this.fb.group({
    name:['',[Validators.required,Validators.maxLength]],
    age:['',[Validators.required,Validators.max(90)]],
    id:['',[Validators.required,Validators.maxLength(4)]],
    gender:['',Validators.required],
    fromPlace:['',[Validators.required,Validators.pattern('[a-zA-Z]*')]],
    numberOfDaysVisits:['',[Validators.required,Validators.pattern('[0-9]*')]]

    })
    
  }

  saveTourist(){
    this.touristService.createTourist(this.tourist).subscribe( data =>{
      console.log(data);
      alert("submitted successfully")
      this.goToTouristList();
    },
    error=>console.log(error));
  }

  goToTouristList(){

    this.router.navigate(['/tourist']);
  }
  onSubmit(){

    console.log(this.tourist);
    this.saveTourist();
  }

}