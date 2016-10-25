import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import 'rxjs/add/observable/throw';

@Injectable()
export class ContentService {
    constructor(private http: Http){}
}
