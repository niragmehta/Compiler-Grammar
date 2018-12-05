.globl _main #exports symbol main
.data #global data section
a:	.quad
b:	.quad
c:	.quad
d: .quad 0, 0, 0, 0, 0, 0, 0
	.text
_main:
push %rbp
mov %rsp, %rbp
sub $48, %rsp

push %rbp
mov %rsp, %rbp
sub $48, %rsp
mov -16(%rbp), %rax
mov $c, %rbx
add %rbx, %rax
mov %rax, -48(%rbp)
movq -48(%rbp), %rax
movq %rax, -32(%rbp)
add $48, %rsp
pop %rbp

add $48, %rsp
pop %rbp
