package com.bit.ex01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {
	
	public void afterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ������ ����");
	}
	
	public void afterReturning(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� ���� ó��");
	}
	
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "�� �Ϸ� ��");
	}
	
//	public void before() {
//		System.out.println("Ÿ���� �Ǵ� �޼ҵ� �����ϱ� ���̴�");
//	}
	
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toLongString();
		System.out.println(methodName +" Ÿ���� �Ǵ� �޼ҵ� �����ϱ� ���̴�");
	}
	
	public Object pro(ProceedingJoinPoint joinPoint) {
		
		Object re = null;
		
		// ���������͸� ���� �޼ҵ� �̸��� �� �� �ֵ�
		String methodName = joinPoint.getSignature().toShortString();
		
		// �����ϴ� �޼ҵ� ���
		System.out.println(methodName + "����");
		
		// ���� �ð�
		long start = System.currentTimeMillis();
		
		try {
			re = joinPoint.proceed();
			
		} catch(Throwable e) {
			System.out.println(e.getMessage());
		}
			
			// ������ �޼ҵ�
			System.out.println(methodName + "����");
			
			// ���� �� �ð��� ���
			long finish = System.currentTimeMillis();
			System.out.println("�ɸ��ð�" + (finish-start));
			
		return re;
	}

}
