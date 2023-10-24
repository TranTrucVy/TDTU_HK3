import string


def affine(plaintext, a, b):
    # make sure input is correct
    plaintext = plaintext.lower()
    # create list containing all letters of the alphabet
    alphabet = list(string.ascii_lowercase)
    # create string to store ciphertext
    ciphertext = ""
    # create list containing all letters of the alphabet in after the encryption
    key = [chr(((a * (ord(i) - 97) + b) % 26) + 97) for i in alphabet]
    print(key)
    # loop through plaintext and encrypt each letter with affine cipher
    for i in plaintext:
        # if letter is in alphabet, encrypt it
        if i.isalpha():
            ciphertext += (key[ord(i) - 97])
        # if letter is not in alphabet, add it to ciphertext
        else:
            ciphertext += i
    return ciphertext.upper()


# print(affine("affine", 5, 8))
fread = open("plaintext_50.txt", "r")
fwrite = open("ciphertext.txt", "w")

fwrite.write(affine(fread.read(), 5, 8))
fwrite.close()
