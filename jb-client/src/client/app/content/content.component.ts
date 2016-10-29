import { Component, OnInit } from '@angular/core';
import { ContentService, Product } from '../shared/index';


@Component({
    moduleId: module.id,
    selector: 'jb-content',
    templateUrl: 'content.component.html',
    styleUrls: ['content.component.css'],
})

export class ContentComponent implements OnInit {

    errorMessage: string;
    items: Product[] = [];

    constructor(public contentService: ContentService) {
    }

    ngOnInit() {
        console.log('$..................!!! on init:');
        this.getItems();
    }

    getItems() {
        this.contentService.get()
        .subscribe(
            items => { this.items = items; },
            error => this.errorMessage = <any>error
        );
    }
}
