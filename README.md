# Exercícios
<div align="justify">
  
1. Dada a classe abaixo:
```
public class Azul{
  static int cor;
  public static String NOME = "Azul";
  public Azul(int tonalidade) { ... }
  public int getTonalidade() {return tonalidade;}
  public void setTonalidade(int tonalidade) { ... }
  public void tornarMaisEscuro() { ... }
  void calcularTonalidade() { ... }
  private void TornarTonalidadeMaisEscura(int valor) { ... }
}
```
  - Responda:
      - Quais são as variáveis de classe?
      - Quais são os construtores?
      - Quais métodos fazem parte da interface dessa classe?
      - Sem mudar o código que está escrito. Implemente o método setTonalidade e
a variável que ele necessita.
      - Sem mudar o código que está escrito. Implemente o construtor.
      - O código abaixo roda? Justifique.
`
var color = new Blue();
`
      - Crie uma Main e implemente uma lógica a classe Azul.

2. Crie uma classe pública denominada `Funcionário`. Esta classe deve possuir
os atributos `nome`, `dataAdmissao` e `salario`. Todos os atributos devem ser
privados.
    - Crie os getters e setters necessários da sua classe `Funcionário`.
    - Crie uma classe pública denominada `Main`, que contém um método main.
Nesse método crie três instâncias da classe `Funcionário`,fornecendo os
atributos através dos métodos de acesso (getters e setters).
    - Adicione um atributo estático na classe `Funcionário` de tipo int que se
chama `identificador`. Esse identificador deve ser um valor único para
cada instância do tipo `Funcionário`. O primeiro `funcionário`
instanciado deve ter o identificador `1`, o segundo `2` e assim por diante. Isto
deve ser feito automaticamente na classe `Funcionário`, com uso do
construtor.
    - Crie os getters e os setters necessários para os identificadores.
    - Adicione uma validação no método `setSalario` de forma que não seja
permitido adicionar um salário inferior a R$ 700,00.
    - Adicione uma validação no método `setDataAdmissao`, de forma que não
seja permitido adicionar uma data no futuro.

<div>
