import { Component, OnInit } from '@angular/core';
import { SideMenuService, Category } from '../shared/index';


@Component({
    moduleId: module.id,
    selector: 'jb-side-menu',
    templateUrl: 'side-menu.component.html',
    styleUrls: ['side-menu.component.css']
})


export class SideMenuComponent implements OnInit {

    errorMessage: string;
    categories: Category[] = [];

    constructor(public sideMenuService: SideMenuService) {
    }

    ngOnInit() {
        this.getCategories();
    }

    getCategories() {
        this.sideMenuService.get()
        .subscribe(
            items => this.categories = items,
            error => this.errorMessage = <any>error
        );
    }
}
