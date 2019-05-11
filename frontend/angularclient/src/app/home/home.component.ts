import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import {Router} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  private movies = [];

  private movie: any[];

  constructor(private httpClient: HttpClient, private modalService: NgbModal) {
    this.get_movies();
  }
  get_movies(){
    this.httpClient.get('http://localhost:8181/movies/all').subscribe((res : any[])=>{
      this.movies = res;
    });
  }
  openDialog(id: string, content) {
  this.httpClient.get('http://localhost:8181/movies/id/'+id).subscribe((res : any[])=>{
    this.movie = res;
  });
  this.modalService.open(content, {backdropClass: 'light-blue-backdrop'});
}

  titleSearch() {
    let inputValue = (<HTMLInputElement>document.getElementById('searchBar')).value;
    this.httpClient.get('http://localhost:8181/search/'+inputValue).subscribe((res : any[])=>{
      this.movies = res;
    });
  }
  // onSelect(id){
  //   this.router.navigate(['/movies',id]);
  // }
  ngOnInit() {
  }

}
