import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/observable/throw';

@Injectable()
export class ContentService {
    constructor(private http: Http) {
    }

    get(): Observable<string[]> {
        return this.http.get('/content')
        .map((res: Response) => res.json())
        .do(data => console.log('$..................data:', data))
        .catch(this.handleError);
    }

    private handleError(error: any) {
        let errMsg = (error.message) ? error.message :
            error.status ? `${error.status} - ${error.statusText}` : 'Server error';
        console.error(errMsg); // log to console instead
        return Observable.throw(errMsg);
    }
}
