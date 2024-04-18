ALTER TABLE pessoa ADD CONSTRAINT fk_pessoa_endereco
FOREIGN KEY (endereco_id) REFERENCES endereco (id);