add $t3, $0, $0 #add 0 to 0 and store in t3

loop: 

li $v0, 5 # prepare input from user input
syscall #output

or $t1, $0, $v0 # first input in t1
add $t3, $t3, $t1 #add 0 to user input store in t3
bne $t1, $0, loop # condition (if) input not 0 loop
li $v0, 1 
or $a0,$0, $t3 # prints t3
syscall 
or $v0, $0, 10 # prepare to exit 
syscall # exit 

