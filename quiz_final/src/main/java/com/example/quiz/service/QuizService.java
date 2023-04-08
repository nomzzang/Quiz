package com.example.quiz.service;

import com.example.quiz.entity.Quiz;

import java.util.Optional;

public interface QuizService {

    // 등록된 모든 퀴즈 정보를 가져옵니다.
    Iterable<Quiz> selectAll();

    // id를 키로 사용해 퀴즈 정보를 한건 가져옵니다.
    Optional<Quiz> selectOneById(Integer id);

    // 퀴즈 정보를 랜덤으로 한건 가져옵니다.
    Optional<Quiz> selectOneRandomQuiz();

    // 퀴즈의 정답/오답 여부를 판단합니다.
    Boolean checkQuiz(Integer id, boolean myAnswer);

    // 퀴즈를 등록합니다.
    void insertQuiz(Quiz quiz);

    // 퀴즈를 변경합니다.
    void updateQuiz(Quiz quiz);

    // 퀴즈를 삭제합니다.
    void deleteQuizById(Integer id);

}
