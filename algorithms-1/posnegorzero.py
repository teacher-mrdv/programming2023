numbers = int(input("How many numbers? "))
counter=numbers
positives=negatives=zeroes=0
while counter > 0:
    x = int(input("Enter a number: "))
    if x > 0:
        positives = positives + 1
    elif x < 0:
        negatives = negatives + 1
    else:
        zeroes = zeroes + 1
    counter = counter - 1

print("Positives " + str(positives), "| Negatives " + str(negatives), "| Zeroes " + str(zeroes));
