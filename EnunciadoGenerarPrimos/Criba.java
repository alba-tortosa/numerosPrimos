import java.util.*;

/**
 * Esta clase genera todos los número primos de 1 hasta un número 
 * máximo especificado por el usuario utilzando la criba de  Eratóstenes.
 * 
 * Eratóstenes de Cirene (en griego antiguo Ἐρατοσθένης, Eratosthénēs) 
 * (Cirene, 276 a. C.1​-Alejandría, 194 a. C.) fue un matemático, astrónomo 
 * y geógrafo griego de origen cirenaico. Concibió por primera vez la geografía 
 * como una disciplina sistemática, desarrollando una terminología que todavía 
 * se usa en la actualidad.2​ Eratóstenes es conocido principalmente por ser 
 * la primera persona en calcular la circunferencia de la Tierra, lo que hizo 
 * al comparar las altitudes del sol del mediodía en dos lugares separados por 
 * una distancia Norte-Sur
 * 
 * Dado un vector de enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación se encuentra el siguiete entero no tachado y se 
 * tachan sus múltiplos. Cuando se llega a la raiz cuadrada del valor máximo,
 * los número que quedan sin tachar son los números primos
 * 
 * @author anonimo
 * @version 1.0 Febrero 2018
 */
public class Criba
{
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int número = scanner.nextInt();
		System.out.println("La lista de numeros primos es: " + Arrays.toString(metodo1(número)));
		scanner.close();
	}
	
	
    /**
     * Generar números primos de 1 a max
     * @param max es el valor maximo
     * @return vector de números primos
     */
    public static int[] metodo1(int max)
    {
        Integer i,j;
        
        if(max>=2)
        {
            //Declaraciones
            int dim=max+1;
            boolean es_primo[] = new boolean[dim];
            
            //Inicializar array
            for (i=0;i<dim;i++)
                es_primo[i] = true;
            
            //Eliminar el 0 y el 1 que no son primos
            es_primo[0] = false;
            es_primo[1] = false;
            
            //Criba
            for (i=2; i<Math.sqrt(dim)+1;i++)
            {
                if (es_primo[i])
                {
                    for(j=2*i; j<dim; j+=i)
                        es_primo[j]= false;
                }
            }
            
            //¿Cuantos primos hay?
            int cuenta = 0;
            
            for (i=0;i<dim;i++)
            {
                if (es_primo[i])
                    cuenta++;
            }
            
            //Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            
            for (i=0,j=0; i<dim;i++)
            {
                if(es_primo[i])
                    primos[j++]=i;
            }
            
            return primos;
        }
        else //Menor de 2
        {
            return new int[0]; //Vector vacio
        }
    };

    
}
