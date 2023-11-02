public class movDiscos {
    void TorreHanoi(int d, char origem, char auxiliar, char destino){
        if(d>0){
            TorreHanoi(d-1, origem, destino, auxiliar);
            System.out.printf("Mover da %s para o %s \n", origem, destino);
            TorreHanoi(d-1, auxiliar, origem, destino);
        }
    }
}
