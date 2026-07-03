# Leitura de Arquivos CSV em Java

Projeto desenvolvido como exercício de manipulação de arquivos em Java utilizando `Scanner`, `BufferedWriter`.

## Objetivo

O programa lê um arquivo `.csv` contendo uma lista de produtos vendidos e gera automaticamente um novo arquivo chamado `summary.csv`, contendo apenas o nome do produto e o valor total de cada item (`preço × quantidade`).

## Estrutura do arquivo de entrada

Cada linha do arquivo deve seguir o formato:

```csv
TV,1000.00,2
Mouse,40.00,3
Tablet,400.00,1
HD Case,80.90,2
```

Onde:

- Nome do produto
- Preço unitário
- Quantidade

## Arquivo gerado

O programa gera/recria o arquivo:

```
program_out/summary.csv
```

Exemplo:

```csv
TV,2000.00
Mouse,120.00
Tablet,400.00
HD Case,161.80
```

## Tecnologias utilizadas

- Java
- Scanner
- BufferedWriter
- FileWriter

## Conceitos praticados

- Leitura de arquivos CSV
- Escrita de arquivos
- Tratamento de exceções (`try-with-resources`)
- Manipulação de diretórios
- Programação Orientada a Objetos

## Como executar

1. Clone o repositório.
2. Abra o projeto em sua IDE.
3. Informe o caminho do arquivo `.csv` quando solicitado.
4. O arquivo `summary.csv` será criado dentro da pasta `program_out`.

## Origem

Exercício desenvolvido durante o curso **Java COMPLETO Programação Orientada a Objetos + Projetos**, aula **169**, como prática de manipulação de arquivos em Java.