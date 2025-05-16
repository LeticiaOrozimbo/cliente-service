-- Criação da tabela Cliente
CREATE TABLE cliente (
    id UUID PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    data_nascimento DATE
);

-- Criação da tabela Endereco
CREATE TABLE endereco (
    id UUID PRIMARY KEY,
    cliente_id UUID NOT NULL,
    rua VARCHAR(100),
    numero VARCHAR(10),
    cep VARCHAR(10),
    cidade VARCHAR(100),
    estado VARCHAR(2),
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);