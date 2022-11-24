package org.zerock.topik.dto;

import lombok.Getter;
import org.zerock.topik.domain.ReadingQuestion;

@Getter
public class ReadingQuestionDto {
    private String context;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String answer;


    //repository 를 통해 조회한 entity 를 dto 로 변환 용도
    public ReadingQuestionDto(ReadingQuestion entity) {

        this.context = entity.getContext();
        this.choice1 = entity.getChoice1();
        this.choice2 = entity.getChoice2();
        this.choice3 = entity.getChoice3();
        this.choice4 = entity.getChoice4();
        this.answer = entity.getAnswer();
    }
}
