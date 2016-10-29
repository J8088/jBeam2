import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SharedModule } from '../shared/shared.module';
import { HomeComponent } from './home.component';
import { ContentComponent } from '../content/content.component';
import { ContentEntryComponent } from '../content-entry/content-entry.component';
import { NameListService } from '../shared/name-list/index';
import { ContentService } from '../shared/content/index';
import { SideMenuService } from '../shared/side-menu/index';
import { SideMenuComponent } from '../side-menu/side-menu.component';


@NgModule({
  imports: [CommonModule, SharedModule],
  declarations: [HomeComponent, ContentComponent, ContentEntryComponent, SideMenuComponent],
  exports: [HomeComponent, ContentComponent, ContentEntryComponent, SideMenuComponent],
  providers: [NameListService, ContentService, SideMenuService]
})
export class HomeModule { }
