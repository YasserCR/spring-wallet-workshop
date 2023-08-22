package com.tallerspringbootmvc.client.service.model.mapper;

import com.tallerspringbootmvc.client.service.dto.ClientRequestDTO;
import com.tallerspringbootmvc.client.service.dto.ClientResponseDTO;
import com.tallerspringbootmvc.client.service.model.ClientEntity;

public interface ClientMapper {

    ClientEntity toEntity(ClientRequestDTO dto);

    ClientResponseDTO toDto(ClientEntity entity);

}
