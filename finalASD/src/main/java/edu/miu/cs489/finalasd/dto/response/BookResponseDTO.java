package edu.miu.cs489.finalasd.dto.response;

import java.util.Set;

public record BookResponseDTO(
        String title,
        String isbn,
        Set<AuthorResponseDTO>authorResponseDTO
) {
}
