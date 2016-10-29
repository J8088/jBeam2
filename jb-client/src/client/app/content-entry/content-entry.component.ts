import { Component, Input } from '@angular/core';
import { Product } from '../shared/index';

@Component({
    moduleId: module.id,
    selector: 'jb-content-entry',
    templateUrl: 'content-entry.component.html',
    styleUrls: ['content-entry.component.css'],
})

export class ContentEntryComponent {
    @Input() product: Product;
}
