package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;
import com.briup.app02.vm.QuestionVM;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="问题相关接口")
@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	
	@ApiOperation(value="保存问题"
			,notes="保存问题的同时还应该保存选项,问题id,选项id,选项中的外键question_id也不必输入")
	@PostMapping("saveQuestion")
	public MsgResponse saveQuestion(QuestionVM questionVM) {
		try {
			//调用业务逻辑层方法完成保存
			System.out.println("===================="+questionVM);
			questionService.saveQuestion(questionVM);
			return MsgResponse.success("保存成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value="查询所有问题",notes="级联查询出属于该题目的选项")
	@GetMapping("findAllQuestionVM")
	public MsgResponse findAllQuestionVM(){
		try {
			List<QuestionVM> list = questionService.findAllQuestionVM();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
