package br.com.fiap.mspagamentos.controller;

import br.com.fiap.mspagamentos.dto.PagamentoDTO;
import br.com.fiap.mspagamentos.service.PagamentoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(PagamentoController.class)
public class PagamentoControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PagamentoService services;
    private PagamentoDTO pagamentoDTO;
    private Long idExistente;
    private Long idNaoExistente;

    @Autowired
    private ObjectMapper objectMapper;
}
