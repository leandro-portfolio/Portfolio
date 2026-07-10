


class Pessoa {


    
    constructor(nome, idade, peso, altura) {
        this.nome    =   String(nome);
        this.idade   =   Number(idade);
        this.peso    =   Number(peso);
        this.altura  =   Number(altura);
       }


 //Metodo para Calcular o MC
    calcularImc() {

    if(this.altura <=0) return 0;
    
   return this.peso/(this.altura*this.altura);
 

    }
 
  // Metodo para Classificar o IMC

  classificarImc() {

 const imc= this.calcularImc();
 if(imc < 18.5) return "Abaixo do peso";
 if(imc < 25) return "Peso normal";
 if(imc < 30) return "Sobrepeso";
 if(imc >= 30) return "Obesidade";



  }

  // Método para estimar necessidade diária de água (35ml por kg)
  calcularagua(){

    const agua= (this.peso * 35)/1000; // 35ml por kg (Resultado em litros)
    return agua;

  }

  // Método para estimar necessidade diária de proteínas (0.8g por kg para sedentários)
  calcularproteina(){
    const proteina= this.peso*0.8; // 0.8g por kg
    return proteina;
  }


}
 
 // Função botão para calcular o IMC e exibir o resultado

 function BotaoCalcular() {
const nome = document.getElementById("nome").value;
const idade = document.getElementById("idade").value;
const peso = document.getElementById("peso").value;
const altura = document.getElementById("altura").value;

const pessoa = new Pessoa(nome, idade, peso, altura);

document.getElementById("resultado").innerHTML = `Olá ${pessoa.nome}<br> seu IMC é ${pessoa.calcularImc().toFixed(2)}<br> e você está classificado como: ${pessoa.classificarImc()}<br> e sua necessidade diária de água é: ${pessoa.calcularagua().toFixed(2)} Litros.<br> e sua necessidade diária de proteína é: ${pessoa.calcularproteina().toFixed(2)} g.`;


 }
