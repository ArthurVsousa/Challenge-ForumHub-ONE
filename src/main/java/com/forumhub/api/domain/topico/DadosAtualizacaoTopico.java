package com.forumhub.api.domain.topico;


public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        StatusTopico status
) {}