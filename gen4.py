# Task 1
import random 

maxN      = 1000
TCmaxN    = 1
taskStart = 21
taskNum   = 10

for task in range(taskStart,taskStart+taskNum):
    with open(f"testcase/{task}.in","w") as f:
        for i in range(random.randrange(1,TCmaxN+1)):
            f.write(str(random.randrange(1,maxN+1))+"\n")
        f.write("0\n")