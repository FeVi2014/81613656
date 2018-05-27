import { Http, RequestOptions, Headers} from '@angular/http';
import { Injectable } from '@angular/core';
import { Chamado } from '../../Entity/Chamado';

/*
 *@author Felipe Videira 81613656 SI3AN-MCA1 
*/

@Injectable()
export class ChamadosProvider {
  private baseURL = 'http://localhost:8080/arqsw_sdesk/';
  constructor(public http: Http) {
    console.log('Hello ChamadosProvider Provider');
  }

  getChamados(id: number) {
    return this.http.get(this.baseURL+ 'rest/chamados/idFila='+id); 
  }

  postChamados(chamado){
    let opt: RequestOptions
    let myHeaders: Headers = new Headers
    myHeaders.set('app-id', 'c2549df0');
    myHeaders.append('app-key', 'a2d31ce2ecb3c46739b7b0ebb1b45a8b');
    myHeaders.append('Content-type', 'application/json')
    
    opt = new RequestOptions({
      headers: myHeaders
     })
    console.log('Insercao');
    return this.http.post(this.baseURL+'rest/chamados',chamado,opt);
  }
}
