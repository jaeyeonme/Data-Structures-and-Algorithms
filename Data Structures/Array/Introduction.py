# Arrays are one of the most commonly-used data structures
# The elements of an array are stored in contiguous memory locations
# Arrays are of two types : Static and Dynamic
# Static arrays have fixed, pre-defined amount of memory that they can use, whereas in dynamic arrays this is flexible
# In Python we only have dynamic arrays
# Some basic operations and their complexities are given below :

# Look-up/Access - O(1)
# Push/Pop - O(1)*
# Insert - O(n)
# Delete - O(n)

array = [5, 8, 2, 9, 17, 43, 25, 10]

# Look-up/Acces
# Any element of an array cna be accessed by its index.
# We just need to ask for the particular index of the element we are interesred in and we will get the element in constant time
# This will return the first element of the array, in this case, 5, in O(1) time
first_element = array[0]
sixth_element = array[5]  # sixth-element = 43 Again, in O(1) time


# Push/Pop
# Push corresponds to pushing or adding an element at the end of the array.
# Similarly, pop corresponds to removing the elemnt at the end of the array.
# Since the index of the end of the array is known, finding it and pushing or popping an element will only require O(1) time
array.append(87)  # Adds 87 at the end of the array in O(1) time

# In some special cases, the append(push) operation may take greater time. This is beacuse as mentioned earlier, Python has dynamic arrays
# So when an element is to appended and the array is filled, the entire array has to be copied to a new location
# With more space allocated(generally double the space) this time so that more items can be appended.
# Therefore, some individual operations may reuire O(n) time or greater, but when averaged over a large number of operations,
# The complexity can be safely considered to be O(1)

array.pop()  # Pops/removes the element at the end of the array in O(1) time.

print(array)

# Delete
# Similar to insert, in deletes an element from the specified location in O(n) time
# The elements to the right of the deleted element have to shifted one space left, which required looping over entire array
# Hence, O(n) time complexity
array.pop()  # This pops the first element of the array, shifting the remaining elements of the array one place left. O(n)
print(array)
array.remove(17)  # This command removes the first occurence of the element 17 in the array, for which it needs to traverse the entire array. which required O(n) time
print(array)
# This command deletes from position 2 to position 4, again, in O(n) time
del array[2:4]
print(array)


# ===== print =====
# [5, 8, 2, 9, 17, 43, 25, 18]
# [5, 8, 2, 9, 17, 43, 25]
# [5, 8, 2, 9, 43, 25]
# [5, 8, 43, 25]
