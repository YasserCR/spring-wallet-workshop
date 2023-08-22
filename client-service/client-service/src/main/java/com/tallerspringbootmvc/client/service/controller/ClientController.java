package com.tallerspringbootmvc.client.service.controller;

import com.tallerspringbootmvc.client.service.constants.ClientConstants;
import com.tallerspringbootmvc.client.service.dto.ClientRequestDTO;
import com.tallerspringbootmvc.client.service.dto.ClientResponseDTO;
import com.tallerspringbootmvc.client.service.service.ClientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ClientConstants.BASE_URI)
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientResponseDTO> createClient(@Valid @RequestBody ClientRequestDTO requestDTO){
        ClientResponseDTO responseDTO = clientService.createClient(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
}
