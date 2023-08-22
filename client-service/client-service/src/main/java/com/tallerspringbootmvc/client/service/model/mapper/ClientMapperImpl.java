package com.tallerspringbootmvc.client.service.model.mapper;

import com.tallerspringbootmvc.client.service.dto.ClientRequestDTO;
import com.tallerspringbootmvc.client.service.dto.ClientResponseDTO;
import com.tallerspringbootmvc.client.service.model.ClientEntity;
import org.springframework.stereotype.Component;

@Component
public class ClientMapperImpl implements ClientMapper {
    @Override
    public ClientEntity toEntity(ClientRequestDTO dto) {
        return ClientEntity.builder()
                .documentNumber(dto.documentNumber())
                .phoneNumber(dto.phoneNumber())
                .email(dto.email())
                .build();
    }

    @Override
    public ClientResponseDTO toDto(ClientEntity entity) {
        return ClientResponseDTO.builder()
                .clientId(entity.getId())
                .documentNumber(entity.getDocumentNumber())
                .email(entity.getEmail())
                .build();
    }
}
