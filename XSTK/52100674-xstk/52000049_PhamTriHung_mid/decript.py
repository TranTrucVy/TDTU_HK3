import string


def frequency_analysis(ciphertext):
    # make sure input is correct
    ciphertext = ciphertext.lower()
    # create list containing all letters of the alphabet
    alphabet = list(string.ascii_lowercase)
    # create list of all letters in alphabet order by frequency of appearance
    base_frequency = list("etaoinshrdlcumwfgypbvkjxqz")
    # create a dict to store the frequency of each letter
    letter_count = {}
    # loop through ciphertext and count the frequency of each letter
    for i in alphabet:
        letter_count[i] = ciphertext.count(i)
    encripted_text_frequency = sorted(
        letter_count, key=letter_count.get, reverse=True)
    result = ""
    # loop through the ciphertext and decrypt each letter
    for i in ciphertext:
        if i.isalpha():
            result += base_frequency[encripted_text_frequency.index(i)]
        else:
            result += i
    return result


fread = open("ciphertext.txt", "r")
fwrite = open("descriptedtext.txt", "w")
fwrite.write(frequency_analysis(fread.read()))
fwrite.close()
