import { Component } from '@angular/core';
import { NavController, AlertController } from 'ionic-angular';
import { Storage } from '@ionic/storage';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  inputChamado:string;
  key:string = 'username';
  constructor(public navCtrl: NavController, private storage: Storage,
    public alertCtrl: AlertController) {

  }

  saveChamado(){
    this.storage.set(this.key, this.inputChamado);
    this.showAlert();
  }

  showAlert() {
    let alert = this.alertCtrl.create({
      title: 'Criado com Sucesso',
      subTitle: this.inputChamado,
      buttons: ['OK']
    });
    alert.present();
  }

  loadChamado(){
  this.storage.get(this.inputChamado).then((val) => {
    console.log('Chamado e', val);
    this.showAlert();
  });
  }
}
