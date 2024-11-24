package edu.miu.cs489.finalasd.dto.request;

import java.util.Set;

public record AuthorRequestDTO(
        String name,
        Set<Long> bookIds
) {
}
