# Task 1
import random 

maxN      = 2000
TCmaxN    = 200
taskStart = 31
taskNum   = 10

for task in range(taskStart,taskStart+taskNum):
    with open(f"testcase/{task}.in","w") as f:
        for i in range(random.randrange(1,TCmaxN+1)):
            f.write(str(random.randrange(1,maxN+1))+"\n")