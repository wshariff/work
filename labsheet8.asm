addi $t0, 2 #put 2 into register 0
addi $t1, 3 #put 3 into register 1
addi $t9, 1 #put 1 into register 9

main:
li $v0, 5
syscall 
or $t2, $0, $v0 # Register $t2 gets input 1
j loop
loop:   addiu $t6, $t6, 1
beq $t2, $t9, exit #if value is 1, exit
sltu $t8, $t5, $t2
bnez $t8 big
j return_here
return_here:
divu $t2, $t0
mfhi $t3
beqz $t3 even
bnez $t3 odd


even:   mflo $t2
j loop

odd: multu $t2, $t1 #mult value by 3
mflo $t2 #store in register 2
addi $t2, 1
j loop

exit: li $v0, 1
or $a0, $0, $t6
syscall
or $a0, $0, $t5
syscall
li $v0, 10
syscall

big: or $t5, $0, $t2 #store value in register 2 in register 6
j return_here