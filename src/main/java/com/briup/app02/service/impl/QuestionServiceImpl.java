package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.dao.extend.QuestionVMMapper;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.vm.QuestionVM;

@Service
public class QuestionServiceImpl implements IQuestionService {
	@Autowired
	private QuestionVMMapper questionVMMapper;

	@Override
	public List<QuestionVM> findAllQuestionVM() throws Exception {
		return questionVMMapper.findAllQuestionVM();
	}

}
