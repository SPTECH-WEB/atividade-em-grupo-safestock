Bem vindo ao Software SafeStock!

Esse é apenas uma amostra do nosso sistema que visa realizar o controle de produtos de limpeza, nesse caso realizamos a criação de novos pedidos dos produtos para seu fornecedor, deixando assim seu estoque mais seguro e organizado 🫧🧹

Oque o sistema faz?

✅Cadastro de novos pedidos
✅Registra e notifica um novo pedido junto com o valor do frete dos pedidos
✅Apresentar os produtos pedidos

Como?
Nosso projeto está estruturado com as melhores técnicas do mercado atual, sendo assim conseguimos através dos nosso endpoints:

/pedidos/{id}/processar -> registra um novo pedido junto com o valor do frete

/pedidos/cadastrarProdutos -> cadastrar novos produtos passando como body (corpo) JSON as propriedades: nome, descrição e preço (o id vai automático começando do 1 até o infinito e além 😉)

/pedidos/apresentarProdutos -> mostra nosso produtos no formato JSON

Como testar?

Utilizando o Insomnia:
Rode o projeto utilizando uma IDE (indicamos o IntelliJ)
Abra o Insomnia e coloque o endpoint correspondente.

(Nosso sistema é configurado para rodar no ambiente local na porta 8080 - http://localhost:8080/pedidos/url...)

Utilizando o Swagger:

Rode o projeto utilizando uma IDE (indicamos o IntelliJ)
Coloque essa URL no seu navegador: http://localhost:8080/swagger-ui/index.html

Utilize esse exemplo como body JSON 
{
    "nome": "Detergente Líquido",
    "descricao": "Detergente para remoção de sujeiras difíceis e gorduras.",
    "preco": 15.50
}

Após você conseguir cadastrar um novo pedido você pode processar seu pedido com o valor da entrega dependendo do tipo escolhido seguinte URL:

http://localhost:8080/pedidos/1/processar?categoria=EntregaTransporte&valor=5.5

O que ela faz 🧐
Ela utiliza o parâmetro id para buscar o produto no banco de dados, e após o processar adicionamos o '?' categoria -> que indica qual é a categoria de entrega que queremos em seguida valor -> que seria o valor do produto.

Sugerimos que você utilize esse modelo para teste:
http://localhost:8080/pedidos/1/processar?categoria=EntregaTransporte&valor=15.5

Mas você também pode testar utilizando as seguintes categorias
Economica
Expressa
EntregaTransporte

Após rodar, se tudo der certo aparecerá no console da IDE utilizada 3 notificações mostrando de maneiras diferentes que o pedido foi registrado.
