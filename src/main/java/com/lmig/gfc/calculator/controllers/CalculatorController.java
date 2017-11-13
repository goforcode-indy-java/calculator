package com.lmig.gfc.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.calculator.models.Calculator;

@Controller
public class CalculatorController {
	
	private Calculator calc;
	
	public CalculatorController() {
		calc = new Calculator();
	}
	
	@RequestMapping("/")
	public ModelAndView defaultPage() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		return mv;
		
	}
	
	@RequestMapping("/calculate")
	public ModelAndView calculatePage(double firstNumber, double secondNumber, String operator) {
		
		if( operator.equals("+") ) {
			calc.add(firstNumber, secondNumber);
		}
		
		if( operator.equals("-") ) {
			calc.subtract(firstNumber, secondNumber);
		}
		
		if( operator.equals("*") ) {
			calc.multiply(firstNumber, secondNumber);
		}
		
		if( operator.equals("/") ) {
			calc.divide(firstNumber, secondNumber);
		}
		
		if( operator.equals("^") ) {
			calc.exponent(firstNumber, secondNumber);
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("calculator");
		mv.addObject("calc", calc);
		
		return mv;
		
	}

}
