# Padrão de Commits

## 1. Estrutura do Commit

O padrão segue o formato Conventional Commits, que é amplamente adotado na comunidade. A estrutura é:

```text
<tipo>(<escopo>): :emoji: <descrição>

[corpo opcional]

[rodapé opcional]
```

**Explicação:**
- **<tipo>**: Indica o tipo de mudança. Exemplos: feat, fix, docs, chore, etc.
- **(<escopo>)**: Define o escopo da mudança. Exemplos: docs, api, ui, config, etc.
- **:emoji:**: Adiciona um emoji para facilitar a identificação visual do tipo de commit.
- **<descrição>**: Descrição curta e clara da mudança.
- **[corpo opcional]**: Detalhes adicionais sobre a mudança.
- **[rodapé opcional]**: Informações como referências a issues ou breaking changes.

## 2. Tipos de Commits

Aqui estão os tipos mais comuns e seus significados:

| Tipo     | Emoji                   | Descrição                                                    |
|----------|-------------------------|--------------------------------------------------------------|
| feat     | :sparkles:              | Nova funcionalidade.                                         |
| fix      | :bug:                   | Correção de bugs.                                            |
| docs     | :memo:                  | Alterações na documentação.                                  |
| style    | :art:                   | Mudanças de formatação (espaços, vírgulas, etc.) que não afetam o código. |
| refactor | :recycle:               | Refatoração de código, sem adicionar funcionalidades ou corrigir bugs. |
| test     | :white_check_mark:      | Adição ou alteração de testes.                               |
| chore    | :wrench:                | Tarefas de manutenção (atualizações de dependências, configurações, etc.). |
| ci       | :construction_worker:   | Mudanças relacionadas à integração contínua (CI).            |
| perf     | :zap:                   | Melhorias de desempenho.                                     |
| build    | :package:               | Mudanças no processo de build ou em dependências externas.   |
| revert   | :rewind:                | Reverte um commit anterior.                                  |
