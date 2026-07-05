<?php


class saudepessoal{
public $nome;
public $idade;
public $altura;
public $peso;



 // Os dados entram aqui e são guardados no objeto
  function __construct($nome,$idade,$altura,$peso){

  $this->nome   =     $nome;
  $this->idade  =    $idade;
  $this->altura =   $altura;
  $this->peso   =     $peso;
  

  }

  
 //Calcular IMC
 public function calcularIMC() {
        return number_format($this->peso / ($this->altura * $this->altura), 2);
    }



    //peso ideal
public function pesoideal(){
 $imc = $this->calcularIMC();


 if($imc<18.5){
    return"Abaixo do peso ideal"; 
 } 

 else if($imc>=18.5 && $imc<=24.9){
        return "Peso ideal";
    }

 else if ($imc>=25 && $imc<=29.9){
        return "Sobrepeso";
    }
   

 }




}
  
// 2. Lógica de Recebimento (Aqui é onde você "puxa" os dados do HTML)
if ($_SERVER["REQUEST_METHOD"] == "POST") {

  // Captura os dados do formulário em variáveis locais

  $nome = $_POST['nome'];
  $idade = $_POST['idade'];
  $altura = $_POST['altura'];
  $peso = $_POST['peso'];

  $saudepessoal = new saudepessoal($nome, $idade, $altura, $peso);
  echo "Nome: " . $saudepessoal->nome . "<br>";
  echo "Idade: " . $saudepessoal->idade . "<br>";
  echo "Altura: " . $saudepessoal->altura . "<br>";
  echo "Peso: " . $saudepessoal->peso . "<br>";
  echo "IMC: " . $saudepessoal->calcularIMC() . "<br>";
 echo "Situação: " . $saudepessoal->pesoideal() . "<br>";





}

 
