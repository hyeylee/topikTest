package org.zerock.topik.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Table(name = "TB_READING_QUESTION")
public class ReadingQuestion {
    @Id
    @GeneratedValue
    @Column(name="ID")
    private long id;

    @Column(name="CONTEXT", nullable = false)
    private String context;

    @Column(name="CHOICE1", nullable = false)
    private String choice1;
    @Column(name="CHOICE2", nullable = false)
    private String choice2;
    @Column(name="CHOICE3", nullable = false)
    private String choice3;
    @Column(name="CHOICE4", nullable = false)
    private String choice4;

    @Column(name="ANSWER", nullable = false)
    private String answer;



    @Override
    public String toString(){
        String result = "";
        result += "====================================" + "\n";
        result += this.id + "번 문제" + "\n";
        result += "====================================" + "\n";
        result += this.context + "\n";
        result += "다음 중 사실이 아닌 내용을 고르세요.";
        result += "====================================" + "\n";
        result += this.choice1 + "\n";
        result += this.choice2 + "\n";
        result += this.choice3 + "\n";
        result += this.choice4 + "\n";
        result += "====================================" + "\n";

        return result;
    }


}
