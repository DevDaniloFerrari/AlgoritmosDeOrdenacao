<h1> Algoritmos de Ordenação </h1>

<h2> BubbleSort </h2>

>É o algoritmo de ordenação dos mais simples, funciona por flutuação. Percorre o vetor várias vezes e passa os elementos maiores para o final.
* Pior caso: O(n^2)
* Caso médio: O(n^2)
* Melhor caso: O(n)

<h2> InsertionSort </h2>

>É um algoritmo que ordena por inserção. Percorre o vetor enquanto o valor atual for maior que o próximo, inverte os valores e depois diminui 1 no índice.
* Pior caso: O(n^2)
* Caso médio: O(n^2)
* Melhor caso: O(n)

<h2> HeapSort </h2>

>O Heapsort é um algoritmo que ordena os elementos enxergando-os como uma árvore binaria no max-heap ele vai comparando os elementos para que todo índice pai seja menor que o índice filho até que o vetor fique ordenado.
* Pior caso: O(n log(n))
* Caso médio: O(n log(n))
* Melhor caso: O(n log(n))

<h2> CountSort </h2>

>É um algoritmo de ordenação que utiliza vetor auxiliar para ordenar. Ele conta quantas vezes um número aparece e coloca em um vetor auxiliar. Depois insere no vetor ordenado com base no índice do vetor auxiliar.
* Pior caso: O(n)
* Caso médio: O(n)
* Melhor caso: O(n)

<h2> SelectionSort </h2>

>É um algoritmo que ordena por seleção, sempre passando o menor vetor para a o início.
* Pior caso: O(n^2)
* Caso médio: O(n^2)
* Melhor caso: O(n^2)

<h2> QuickSort </h2>

>Ordena os elementos de um vetor a partir da escolha de um pivô de modo que todos os elementos pequenos fiquem na parte esquerda do vetor e todos os elementos grandes fiquem na parte direita é um algoritmo que tem como objetivo dividir e conquistar até que todo vetor seja ordenado recursivamente.
* Pior caso: O(n^2)
* Caso médio: O(n log(n))
* Melhor caso: O(n log(n))

<h2> MergeSort </h2>

>Algoritmo que divide o problema em subproblemas para chegar em uma solução quando os vetores são divididos em subproblemas no final de tudo ocorre uma mistura para que se chegue na solução final.
* Pior caso: O(n log(n))
* Caso médio: O(n log(n))
* Melhor caso: O(n log(n))

<h2> BucketSort </h2>

>Bucketsort é um algoritmo de ordenação que funciona dividindo um vetor em um número finito de recipientes. Cada recipiente é então ordenado individualmente, seja usando um algoritmo de ordenação diferente, ou usando o ele recursivamente.
* Pior caso: O(n^2)
* Caso médio: O(n + k)
* Melhor caso: O(n + k)

<h2> BucketSort </h2>

>O Radixsort ordena itens que estão identificados por índices únicos dos dígitos menos significativos até os mais significativos.
* Pior caso: O(n^2)
* Caso médio: O(n + k)
* Melhor caso: O(n + k)

<h1>Resultados</h1>

**Vetor de 100**<br>
![vetor100](https://user-images.githubusercontent.com/40414119/68000188-d3e95680-fc3d-11e9-946c-bc51c78bbb16.png)

**Vetor de 1000**<br>
![vetor1000](https://user-images.githubusercontent.com/40414119/68000189-d3e95680-fc3d-11e9-92f7-11800e1369a5.png)

**Vetor de 10000**<br>
![vetor10000](https://user-images.githubusercontent.com/40414119/68000190-d3e95680-fc3d-11e9-9e60-90a9183358aa.png)

**Vetor de 100000**<br>
![vetor100000](https://user-images.githubusercontent.com/40414119/68000191-d3e95680-fc3d-11e9-84d9-9e96165b976c.png)

**Vetor de 1000000**<br>
![vetor1000000](https://user-images.githubusercontent.com/40414119/68000192-d481ed00-fc3d-11e9-84ac-2acab0743e31.png)


