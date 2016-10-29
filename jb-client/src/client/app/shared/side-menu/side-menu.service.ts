import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/observable/throw';

export class Category {
    constructor(
        public categoryId: number,
        public categoryCode: string,
        public categoryName: string,
        public categoryDesc: string,
        public active: number
    ) {}
}

@Injectable()
export class SideMenuService {
    constructor(private http: Http) {}

    get(): Observable<Category[]> {
        return this.http.get('/assets/categories.json')
        .map((res: Response) => {
            let data: Category[] = [];

            for(let o of res.json()){
                data.push(new Category(o.category_id,
                    o.category_code,
                    o.category_name,
                    o.category_desc,
                    o.active));
            }

            return data;})
        .catch(this.handleError);
    }

    private handleError(error: any) {
        let errMsg = (error.message) ? error.message :
            error.status ? `${error.status} - ${error.statusText}` : 'Server error';
        console.error(errMsg); // log to console instead
        return Observable.throw(errMsg);
    }
}
