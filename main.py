import time

myStringList = [] # intialise an empty list to hold strings from text file

with open('cpt316-assignment-1-strings.txt') as f:
    for line in f:
        myStringList.append(line.strip())


def my_bubble_sort(arr):
    start_time = round(time.time() * 1000)
    
    n = len(arr)

    for i in range(0, n):
        for j in range(1, n-i):
            if arr[j] < arr[j-1]:
                temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp
                
                
    print("--- %s miliseconds to bubble sort in python ---" % (round(time.time() * 1000) - start_time))
    return


my_bubble_sort(myStringList)

for idx in range(0,10):
    print(myStringList[idx], end=" ")

