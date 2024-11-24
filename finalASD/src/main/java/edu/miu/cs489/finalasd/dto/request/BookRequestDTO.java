package edu.miu.cs489.finalasd.dto.request;

import java.util.Set;

public record BookRequestDTO(
        String title,
        String isbn,
        Set<Long> authorIds
) {
}
