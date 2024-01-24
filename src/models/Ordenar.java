package models;

public class Ordenar {
    private short[][] data;

    public void setSize(short n){
        data = new short[n][n];
    }
    public void setData(short[][] array){
        for (short i = 0; i < array.length; i++){
            for (short j = 0; j < array.length; j++)
                data[i][j] = array[i][j];
        }
    }
    public short[][] getData(){
        return data;
    }

    public void ordenamiento(){
        for (short i = 0; i < data.length; i++) {
            for (short j = 0; j < data.length; j++) {
                for (short k = 0; k < data.length; k++) {
                    for (short z = 0; z < data.length; z++) {
                        if (data[i][j] < data[k][z]) {
                            intercambiar(i,j,k,z);
                        }
                    }
                }
            }
        }
    }
    public void intercambiar(short i, short j, short k, short z){
        short aux = data[i][j];
        data[i][j] = data[k][z];
        data[k][z] = aux;
    }
}