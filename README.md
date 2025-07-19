# Sistema de Gerenciamento de Monitorias 

Este projeto foi desenvolvido como parte do Trabalho de Conclusão de Disciplina (TCD) da matéria de Programação Orientada a Objetos (POO), no curso de Ciência da Computação, sendo utilizado o método CRUD.

## Equipe

- Aline Soares – responsável pela entidade **Aluno**
- João Vitor Ribeiro – responsável pela entidade **Professor**
- Maria Fernanda Vicente – responsável pela entidade **Monitoria** (com relacionamento entre Aluno e Professor)

---

## Minimundo

O IFNMG - Campus Montes Claros deseja informatizar o sistema de monitorias do curso de Ciência da Computação. Cada **aluno** pode se candidatar a uma monitoria, que é orientada por um **professor** da instituição.

- Cada **Aluno** possui: 
- Cada **Professor** possui: 
- Cada **Monitoria** possui: código da monitoria, o aluno que será monitor e o professor orientador.

O sistema permite o gerenciamento completo dos dados (cadastro, consulta, atualização e exclusão) de alunos, professores e monitorias.

---

## Objetivo

Implementar um sistema simples em Java com funcionalidades completas de **CRUD** (Criar, Ler, Atualizar e Deletar) para três entidades:

- `Aluno`
- `Professor`
- `Monitoria`

A entidade `Monitoria` representa a associação entre um aluno e um professor.

Todas as operações foram testadas no método `main()` da classe `Main.java`, como exigido pela atividade.

---

## Estrutura do Projeto

```bash
/src
│
├── Main.java
│
├── /entidade
│   ├── Aluno.java
│   ├── Professor.java
│   └── Monitoria.java
│
└── /repositorio
    ├── AlunoRepository.java
    ├── ProfessorRepository.java
    └── MonitoriaRepository.java
