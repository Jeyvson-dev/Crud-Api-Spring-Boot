# Crud-Api-Spring-Boot

Api de Crud utilizando spring boot separado por verbos dessa vez com conexão ao banco de dados.

--Modo de usar--

Basta iniciar o servidor Spring no arquivo: "src\main\java\com\startup\startup"

Criar um banco de dados chamado: "crud_spring_boot" caso o banco selecionado possua uma senha ou um usuário especifico
Deve-se alterar no arquivo: "application.yml" localizado em: "src\main\resources" nos campos:(
username:
password:
) 

A aplicação irá criar às colunas utilizadas automaticamente no banco "crud_spring_boot"

feito iso basta utlizar o verbos e rotas abaixo:

GET{id} - trás informações de apenas um usuário cadastrado no banco;
GET - trás informação de todos os usuários cadastrados no banco;
POST - Cria um usuário no banco (Enviar um JSON com às colunas usando o exemplo:
{
        "firstName": "Example",
        "lastName": "Example",
        "gender": "Example",
        "addres": "Example"
}
);
PUT - Atualiza a informação de um usuário já cadastrado no banco (Enviar um json com às colunas identicas ao método POST
porém adicionar a coluna ID (Pode ser adiquirida essa informação trazendo todos os usuários no verbo GET sem ID) e alterar
às informações desejadas);
DELETE{id} - Exclui um usuário no banco de dados utilizando o ID passado na rota.
