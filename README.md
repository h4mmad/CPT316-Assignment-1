Bubble sort implementation in Python and Java

Psuedocode Python
```
SET myStringList to empty list

WHILE text file is open
READ each string from text file
    APPEND to myStringList



FOR i in the range (0 to length of myStringList)
    FOR  j in the range (1 to length of myStringList - number i)

        IF myStringList[number j] is less than myStringList[number j - 1] THEN
            SET temp to myStringList[number j]
            SET myStringList[number j] to myStringList[number j - 1]
            SET myStringList[number j - 1] to temp
                
END


```



Psuedocode Java

```
SET myArrayListSize to length of myArrayList
SET start to the current time in milliseconds

DECLARE temp variable of type string

FOR SET i to 0, i less than myArrayListSize, increment i by 1
    FOR SET j to 1, j less than myArrayListSize - i, increment j by 1

    IF myStringList[number j] is less than myStringList[number j - 1] THEN
            SET temp to myStringList[number j]
            SET myStringList[number j] to myStringList[number j - 1]
            SET myStringList[number j - 1] to temp

    ENDFOR
ENDFOR

PRINT TO TERMINAL current time in milliseconds minus start

END

```