.globl main #exports symbol main
.data #global data section
a: .quad
b: .quad
d: .quad
push %rbp
mov %rsp, %rbp
sub %rsp, $112
-16(%rbp)
-32(%rbp)
-48(%rbp)
-64(%rbp)
-80(%rbp)
-96(%rbp)
-112(%rbp)
add %rsp, $112
pop %rbp
push %rbp
mov %rsp, %rbp
sub %rsp, $16
-16(%rbp)
add %rsp, $16
pop %rbp
main: .quad
