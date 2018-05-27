import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { FecharChamadoPage } from './fechar-chamado';

/** 
 * @author Felipe Videira 81613656
 */
@NgModule({
  declarations: [
    FecharChamadoPage,
  ],
  imports: [
    IonicPageModule.forChild(FecharChamadoPage),
  ],
})
export class FecharChamadoPageModule {}
