package com.bit.ex01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public void afterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 비정상 종료");
	}
	
	public void afterReturning(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 정상 처리");
	}
	
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "가 완료 후");
	}
	
//	public void before() {
//		System.out.println("타깃이 되는 메소드 실행하기 전이다");
//	}
	
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println(methodName +" 타깃이 되는 메소드 실행하기 전이다");
	}
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		
		Object re = null;
		
		// 조인포인터를 통해 메소드 이름을 알 수 있따
		String methodName = joinPoint.getSignature().toShortString();
		
		// 시작하는 메소드 출력
		System.out.println(methodName + "시작");
		
		// 현재 시간
		long start = System.currentTimeMillis();
		
		try {
			re = joinPoint.proceed();
			
		} catch(Throwable e) {
			System.out.println(e.getMessage());
		}
			
			// 끝나는 메소드
			System.out.println(methodName + "종료");
			
			// 종료 후 시간을 계산
			long finish = System.currentTimeMillis();
			System.out.println("걸린시간" + (finish-start));
			
		return re;
	}

}
