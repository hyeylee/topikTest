package org.zerock.topik.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.topik.domain.ReadingQuestion;
import org.zerock.topik.dto.ReadingQuestionDto;
import org.zerock.topik.repository.ReadingQuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopikService {
    private final ReadingQuestionRepository readingQuestionRepository;

    public ReadingQuestionDto getRandomQuestion() {
        List<ReadingQuestion> entity = readingQuestionRepository.getRandomQuestion(1);

        return new ReadingQuestionDto(entity.get(0));

    }

}
