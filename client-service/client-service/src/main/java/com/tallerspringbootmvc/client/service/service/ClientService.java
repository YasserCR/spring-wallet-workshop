package com.tallerspringbootmvc.client.service.service;

import com.tallerspringbootmvc.client.service.dto.ClientRequestDTO;
import com.tallerspringbootmvc.client.service.dto.ClientResponseDTO;

public interface ClientService {

    ClientResponseDTO createClient(ClientRequestDTO requestDTO);
}
