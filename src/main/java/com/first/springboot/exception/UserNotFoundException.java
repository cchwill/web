package com.first.springboot.exception;

// Ref: https://tpu.thinkpower.com.tw/tpu/articleDetails/1761#
// Author: 蔡維宇 2019/12/31 11:54:30
// Imitate exception happens in UserResource
public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -8494469376746439135L;

	public UserNotFoundException(String message) {
//		System.out.println("Exception happens: " + message);
		super(message);
	}
}
