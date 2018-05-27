import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { DestinoPage } from './destino';

/** 
 * @author Felipe Videira 81613656
 */
@NgModule({
  declarations: [
    DestinoPage,
  ],
  imports: [
    IonicPageModule.forChild(DestinoPage),
  ],
})
export class DestinoPageModule {}
