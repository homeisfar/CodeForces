import sys

a = input()
b = list(a)

for i in range (0, len(b)) :
	if i == 0 and b[i] == '9':
		continue
	
	if b[i] > '4' :
		b[i] = chr(ord('9') - (ord(b[i]) - ord('0')))

if b[len(b)-1] == '9' and len(b) > 1:
	b[len(b)-1] = '0'

print(''.join(b))

#THERE HAS TO BE A BETTER WAY!