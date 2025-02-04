
package javassortaula;

import java.util.Comparator;

public class InsertionSort<T extends Comparable<T>> {
    private long comparacoes;

    public long getComparacoes() {
        return comparacoes;
    }

    private void insert(T[] v, int i, Comparator<T> comparator){
        T eleito = v[i];
        int indice_comp = i-1;
        while(indice_comp>=0&& comparator.compare(eleito,v[indice_comp])<0){
            this.comparacoes++;
               v[indice_comp+1] = v[indice_comp];// deslocando
               indice_comp--;
        }// fim while
        this.comparacoes++;
        v[indice_comp+1] = eleito;
    }// fim insert
    
        private void insert(T[] v, int i){
        T eleito = v[i];
        int indice_comp = i-1;
        while(indice_comp>=0&& eleito.compareTo(v[indice_comp])<0){
               v[indice_comp+1] = v[indice_comp];// deslocando
               indice_comp--;
        }// fim while
        v[indice_comp+1] = eleito;
    }// fim insert
    
    public void sort(T[] v, Comparator<T> comparator){
        this.comparacoes = 0;
        for(int i=1;i<v.length;i++)
            insert(v, i, comparator);
    }
    
        public void sort(T[] v){
        this.comparacoes = 0;
        for(int i=1;i<v.length;i++)
            insert(v, i);
    }
    
}
