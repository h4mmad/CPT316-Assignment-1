import time

# intialise an empty list to hold strings from text file
myStringList = [] 


# reads each line and appends the string inside the list
with open('cpt316-assignment-1-strings.txt') as f: 
    for line in f:
        myStringList.append(line.strip())


#function takes in an array, uses bubble sort to compare the strings
def my_bubble_sort(arr):
    
    n = len(arr)

    #start time stored before sorting
    start_time = round(time.time() * 1000)
    

    #if the current string is smaller than the preious string, swap it 
    for i in range(0, n):
        for j in range(1, n-i):
            if arr[j] < arr[j-1]:
                temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp


    #time taken calculated by end_time - start_time
    end_time = round(time.time() * 1000)
    print("--- %s miliseconds to bubble sort in python ---" % (end_time - start_time))
    return



my_bubble_sort(myStringList)

for idx in range(0,10):
    print(myStringList[idx], end=" ")

