package com.tallerspringbootmvc.client.service.service;

import com.tallerspringbootmvc.client.service.dto.ClientRequestDTO;
import com.tallerspringbootmvc.client.service.dto.ClientResponseDTO;
import com.tallerspringbootmvc.client.service.model.ClientEntity;
import com.tallerspringbootmvc.client.service.model.mapper.ClientMapper;
import com.tallerspringbootmvc.client.service.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public ClientResponseDTO createClient(ClientRequestDTO requestDTO) {
        if (Objects.isNull(requestDTO))
            throw new RuntimeException("The request must not be empty.");

        ClientEntity client = clientMapper.toEntity(requestDTO);
        client = clientRepository.save(client);
        clientRepository.findById(client.getId());

        return clientMapper.toDto(client);
    }
}
