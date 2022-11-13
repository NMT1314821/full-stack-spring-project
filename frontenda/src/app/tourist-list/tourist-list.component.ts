import { Component, OnInit } from '@angular/core';
import { TouristService } from '../tourist.service';

@Component({
  selector: 'app-tourist-list',
  templateUrl: './tourist-list.component.html',
  styleUrls: ['./tourist-list.component.css']
})
export class TouristListComponent implements OnInit {
tourists: any[]= [];


  constructor(private touristService: TouristService) { }

  ngOnInit(): void{
    this.getTourists();

    
  }
  private getTourists()
  {
    this.touristService.getTouristList().subscribe(data => {
      this.tourists=data
    });
  }

}
