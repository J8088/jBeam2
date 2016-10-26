import { Component, OnInit } from '@angular/core';
import { ContentService } from '../shared/index';


@Component({
    moduleId: module.id,
    selector: 'jb-content',
    templateUrl: 'content.component.html',
    styleUrls: ['content.component.css'],
})

export class ContentComponent implements OnInit {

    errorMessage: string;
    items: any[] = [];

    constructor(public contentService: ContentService) {
    }

    ngOnInit() {
        this.getItems();
    }

    getItems() {
        this.contentService.get()
        .subscribe(
            items => this.items = items,
            error => this.errorMessage = <any>error
        );
    }
}
