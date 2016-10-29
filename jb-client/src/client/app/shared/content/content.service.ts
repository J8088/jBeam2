import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/observable/throw';

export class Product {
    constructor(
        public id: number,
        public title: string,
        public thumbnail: Object,
        public price: number,
        public currency: string,
        public description: string,
        public rating: number
    ) {}
}

@Injectable()
export class ContentService {

    constructor(private http: Http) {
    }

    get(): Observable<Product[]> {
        return this.http.get('/assets/content.json')
        .map((res: Response) => {
            let data: Product[] = [];

            for(let o of res.json()){
                data.push(new Product(o.id, o.title, o.thumbnail, o.price, o.currency, o.description, o.rating));
            }

            return data;})
        // .map((res: Response) => res.json())
        // .do(data => console.log('$..................data:', data))
        .catch(this.handleError);
    }

    private handleError(error: any) {
        let errMsg = (error.message) ? error.message :
            error.status ? `${error.status} - ${error.statusText}` : 'Server error';
        console.error(errMsg); // log to console instead
        return Observable.throw(errMsg);
    }
}
