import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {MovieComponent} from "./movie/movie.component";
import {HomeComponent} from "./home/home.component";


const routes: Routes = [
    {path: 'movies/:id',component: MovieComponent},
  {path: 'home', component:HomeComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
// export  const  routingComponents = [MovieComponent]
