DEV 1 - Nivelamento

Foi criado um serviço SPRING REST, com dois endpoints:

    1 - POST - http://localhost:8500/v1/cliente/contato - Insere um contato.
        request: {
                    "nome": "Rafael Seilva",
                    "email": "rafael@gmail.com",
                    "telefones": ["51981885555", "51999904444"]
                }

    2 - GET - http://localhost:8500/v1/cliente/contato - Lista os contatos existentes.

