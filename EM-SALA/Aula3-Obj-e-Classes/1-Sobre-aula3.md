# Sistema de Clientes e Tickets em Java

## 1. Sobre o programa

Este programa demonstra classes, objetos, atributos, construtores,
métodos, getters, setters e `enum` em Java.

O exemplo possui três arquivos: - `Cliente.java`: representa um cliente
e contém seus dados e o método `calculo()`. - `Ticket.java`: define os
tipos de ticket e seus descontos. - `Main.java`: contém o método
principal e executa o exemplo.

## 2. `Ticket.java`

### O que é `enum`?

Um `enum` representa um conjunto fixo de constantes. Neste programa, os
tipos de ticket são `NORMAL`, `MEIA_ENTRADA` e `VIP`.

  Constante          Desconto
  ---------------- ----------
  `NORMAL`              `0.0`
  `MEIA_ENTRADA`        `0.5`
  `VIP`                 `0.1`

O número entre parênteses de cada constante é enviado ao construtor
`Ticket(double desconto)`.

``` java
public enum Ticket {
    NORMAL(0.0),
    MEIA_ENTRADA(0.5),
    VIP(0.1);

    double desconto;

    Ticket(double desconto) {
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }
}
```

-   `double desconto`: armazena o desconto associado à constante.
-   `Ticket(double desconto)`: construtor que recebe o desconto.
-   `this.desconto = desconto`: guarda o parâmetro no atributo.
-   `getDesconto()`: retorna o desconto.

## 3. `Cliente.java`

### Atributos

``` java
Ticket entrada;
private String nome;
private double valor;
```

-   `entrada`: tipo de ticket associado ao cliente. Não tem modificador
    de acesso, então tem acesso de pacote.
-   `nome`: nome do cliente, com acesso `private`.
-   `valor`: valor associado ao cliente, com acesso `private`.

Os atributos `private` são acessados por meio dos métodos públicos
getters e setters.

### Getters e setters

``` java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}
```

-   `getNome()` retorna o nome.
-   `setNome(String nome)` altera o nome.
-   `getValor()` retorna o valor.
-   `setValor(double valor)` altera o valor.
-   Em `this.nome = nome`, `this.nome` é o atributo do objeto atual e
    `nome` é o parâmetro recebido.

### Construtores

A classe possui dois construtores.

**Sem ticket:**

``` java
public Cliente(String nome, double valor) {
    this.nome = nome;
    this.valor = valor;
}
```

Recebe nome e valor. Como não atribui `entrada`, esse atributo começa
como `null`.

**Com ticket:**

``` java
public Cliente(Ticket entrada, String nome, double valor) {
    this.entrada = entrada;
    this.nome = nome;
    this.valor = valor;
}
```

Recebe e inicializa o ticket, o nome e o valor. Ter construtores com
parâmetros diferentes é chamado de sobrecarga de construtores.

### Método `calculo()`

``` java
public void calculo() {
    if (entrada != null) {
        System.out.println("Desconto anunciado: " + entrada.desconto);
        double novovalor = entrada.desconto * valor;
        System.out.println("Novo valor: " + novovalor);
        System.out.println("O valor do Ticket é: " + valor);
        System.out.println("E o tipo do Ticket é: " + entrada);
    } else {
        System.out.println("\nTicket não inserido.");
    }
}
```

-   Se `entrada != null`, existe um ticket associado. O método imprime o
    desconto, calcula `entrada.desconto * valor` e mostra o valor e o
    tipo do ticket.
-   Se `entrada == null`, imprime `Ticket não inserido.`.

**Observação:** a expressão `entrada.desconto * valor` calcula o valor
correspondente ao desconto, não o preço final após aplicar o desconto. A
documentação descreve o comportamento atual do código.

## 4. `Main.java`

``` java
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro", 30.0);

        c1.calculo(); // vazio
        c1.entrada = Ticket.NORMAL;
        c1.calculo(); // cálculo normal

        System.out.println("TESTE: " + (30 * Ticket.NORMAL.desconto));

        System.out.println(c1.getNome());
        System.out.println(c1);
        System.out.println("\n");
    }
}
```

### Explicação das instruções

-   `public static void main(String[] args)`: ponto de entrada do
    programa.
-   `new Cliente("Pedro", 30.0)`: cria um cliente chamado Pedro com
    valor `30.0`; o ticket começa como `null`.
-   `c1.calculo()`: na primeira chamada, não há ticket, então aparece
    `Ticket não inserido.`.
-   `c1.entrada = Ticket.NORMAL`: associa o ticket normal ao cliente. O
    desconto de `NORMAL` é `0.0`.
-   `c1.calculo()`: na segunda chamada, imprime as informações do
    ticket.
-   `System.out.println("TESTE: " + (30 * Ticket.NORMAL.desconto))`:
    multiplica `30` por `0.0` e imprime `TESTE: 0.0`. O número `30` está
    escrito diretamente na expressão; não é obtido do atributo `valor`
    do cliente.
-   `System.out.println(c1.getNome())`: imprime `Pedro`.
-   `System.out.println(c1)`: imprime a representação padrão do objeto,
    semelhante a `Cliente@1a2b3c`, que pode variar porque a classe não
    implementa `toString()`.
-   `System.out.println("\n")`: imprime uma quebra de linha; `println()`
    também termina com uma quebra de linha.

## 5. Fluxo de execução

1.  Cria o cliente Pedro com valor `30.0`.
2.  Chama `calculo()` sem ticket e imprime `Ticket não inserido.`.
3.  Atribui `Ticket.NORMAL` ao cliente.
4.  Chama `calculo()` novamente e imprime as informações do ticket.
5.  Calcula e imprime `30 * Ticket.NORMAL.desconto`.
6.  Imprime o nome.
7.  Imprime a representação do objeto.
8.  Imprime uma quebra de linha.

## 6. Saída esperada

A saída será semelhante a:

``` text
Ticket não inserido.
Desconto anunciado: 0.0
Novo valor: 0.0
O valor do Ticket é: 30.0
E o tipo do Ticket é: NORMAL
TESTE: 0.0
Pedro
Cliente@1a2b3c
```

`Cliente@1a2b3c` é apenas um exemplo e pode variar. A última instrução
também produz uma linha em branco.

## 7. Conceitos utilizados

  ------------------------------------------------------------------------
  Conceito                 Exemplo                 Função
  ------------------------ ----------------------- -----------------------
  Classe                   `Cliente`, `Main`       Define estrutura e
                                                   comportamentos.

  Objeto                   `new Cliente(...)`      Cria uma instância da
                                                   classe.

  Atributo                 `nome`, `valor`,        Armazena dados.
                           `entrada`               

  Construtor               `Cliente(...)`,         Inicializa o objeto ou
                           `Ticket(...)`           constante.

  Getter                   `getNome()`             Retorna um valor.

  Setter                   `setNome(...)`          Altera um atributo.

  Método                   `calculo()`,            Executa uma ação.
                           `main(...)`             

  `enum`                   `Ticket`                Define constantes
                                                   fixas.

  `if/else`                `calculo()`             Escolhe um bloco
                                                   conforme uma condição.

  `null`                   `entrada` inicialmente  Indica que não há
                                                   ticket associado.

  `this`                   `this.nome = nome`      Refere-se ao objeto
                                                   atual.

  `System.out.println()`   `Main` e `calculo()`    Imprime no console.
  ------------------------------------------------------------------------

## 8. Como executar

Deixe `Main.java`, `Cliente.java` e `Ticket.java` na mesma pasta. No
terminal, execute:

``` bash
javac Main.java Cliente.java Ticket.java
java Main
```

`javac` compila os arquivos e `java Main` executa o método `main`.