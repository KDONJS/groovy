def project = "KDON"
//def buildNumber = BUILD_NUMBER
//def projectPeriod = "kdon." + buildNumber

node(){
    stage('Instalacion'){
            //sh 'yum -y install cowsay'
            //sh 'yum -y install lolcat'
        sh 'echo "Instalando dependencias..."'
    }
    stage('Ejecución'){
        sh 'cowsay "KDON"|lolcat'
    }
    stage('Variables'){
        if(project == "KDON"){
            stage('Variable si'){
                sh 'cowsay "KDON"|lolcat'
            }
        }else{
            stage('Variable no'){
                sh 'cowsay "KDON"|lolcat'
            }
        }
    }
    stage('loop de entorno'){
        for(i = 0 ; i < 10 ; i++){
            echo "Entorno: " + i
        }
    }
}
