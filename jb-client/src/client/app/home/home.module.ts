import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from '../shared/shared.module';
import { HomeComponent } from './home.component';
import { ContentComponent } from '../content/content.component';
import { ContentEntryComponent } from '../content-entry/content-entry.component';
import { NameListService } from '../shared/name-list/index';
import { ContentService } from '../shared/content/index';


@NgModule({
  imports: [CommonModule, SharedModule],
  declarations: [HomeComponent, ContentComponent, ContentEntryComponent],
  exports: [HomeComponent, ContentComponent, ContentEntryComponent],
  providers: [NameListService, ContentService]
})
export class HomeModule { }
