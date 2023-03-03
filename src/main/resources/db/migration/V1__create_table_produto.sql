CREATE TABLE caixa_de_pagamento.produto (
                         id_Produto SERIAL PRIMARY KEY,
                         descricao VARCHAR(255) NOT NULL,
                         preco DECIMAL(10, 2) NOT NULL,
                         unidade_De_Medida VARCHAR(20) NOT NULL,
                         codigo_interno VARCHAR(50) NOT NULL
);

CREATE TABLE caixa_de_pagamento.nota_fiscal (
                                                id_NotaFiscal SERIAL PRIMARY KEY,
                                                numero_da_nota INTEGER NOT NULL,
                                                valor_da_nota NUMERIC(10,2) NOT NULL,
                                                id_produto integer,
                                                CONSTRAINT fk_notafiscal_produto FOREIGN KEY (id_produto) REFERENCES caixa_de_pagamento.produto (id_Produto)
);
