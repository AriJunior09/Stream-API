
# Comandos

## Git Ignore:
É usado para especificar arquivos ou diretórios que você deseja ignorar durante o controle de versão. Isso significa que o Git não rastreará as alterações nesses arquivos, permitindo que você evite incluí-los acidentalmente em commits. Ele é útil para excluir arquivos temporários, arquivos de compilação, ou quaisquer outros que não devam ser versionados.

```
echo + nome-da-pasta/ > .gitignore
Para a pasta ser ignorada pelo git e não ser versionada;

```

## Gitkeep:
O arquivo `.gitkeep` é usado para manter diretórios vazios em repositórios Git, permitindo que eles sejam versionados mesmo sem arquivos dentro deles. Ele é útil para estruturar projetos de forma organizada, mantendo a hierarquia de diretórios, mesmo que inicialmente vazios. 

Quando você cria um diretório e não adiciona nenhum arquivo dentro dele, o Git não o rastreia automaticamente. Para contornar isso, você pode usar um arquivo chamado **`.gitkeep`**. Ao incluí-lo no diretório vazio, você permite que o Git o rastreie, mantendo assim a estrutura do diretório dentro do repositório.

```
touch nome-da-pasta/.gitkeep;

```