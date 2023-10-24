import string


def caesar(plaintext, key_length):
    # make sure input is correct
    plaintext = plaintext.lower()
    # create list containing all letters of the alphabet
    alphabet = list(string.ascii_lowercase)
    # create list of shifted alphabet
    key = alphabet[key_length:] + alphabet[:key_length]
    # create string to store ciphertext
    ciphertext = ""
    print(key)
    for i in plaintext:
        # if letter is in alphabet, encrypt it
        if i.isalpha():
            ciphertext += key[ord(i) - 97]
        # if letter is not in alphabet, add it to ciphertext
        else:
            ciphertext += i
    return ciphertext.upper()


# print(caesar("caesar", 3))
fread = open("plaintext_50.txt", "r")
fwrite = open("ciphertext.txt", "w")

fwrite.write(caesar(fread.read(), 3))
fwrite.close()
