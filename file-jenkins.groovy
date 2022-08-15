def metodo(texto) { 
   echo texto
}  

try {
   node(){
        texto = 'Hola' //Variables string con comillas simples o dobles
        numero = 990  //Puedo o no se indica el tipo de variable
        numero ++
        echo texto + " " + numero
        
        
        if(numero <= 900){
            stage('prueba dif'){
            echo "hola esta es una prueba de if"
        }
        }else{
            stage('prueba no if'){
            echo "hola esta es una prueba de no if"
        }
        }
        
        stage('Ejemplo') {
            valor = 1000
            if (numero >= valor) {
                echo 'en if'
            }else{
                echo 'esto no es verdad'
            } 
            
            for (i = 0; i< 10; i++) {
                echo "For: " + i
            }
        }
        stage("Saludando") {
            metodo("como estas yorlin")
        }
    

    }
}