import string


def at_bash(plaintext):
    # make sure input is correct
    plaintext = plaintext.lower()
    # create list containing all letters of the alphabet
    alphabet = list(string.ascii_lowercase)
    # create list containing all letters of the alphabet in reverse order
    key = alphabet.copy()
    key.reverse()
    print(key)
    # create empty string to store ciphertext
    ciphertext = ""
    # loop through plaintext and encrypt each letter with at_bash cipher
    for i in plaintext:
        # if letter is in alphabet, encrypt it
        if i.isalpha():
            ciphertext += key[ord(i) - 97]
        # if letter is not in alphabet, add it to ciphertext
        else:
            ciphertext += i
    return ciphertext.upper()


# print(at_bash("atbash"))
fread = open("plaintext_1000.txt", "r")
fwrite = open("ciphertext.txt", "w")

fwrite.write(at_bash(fread.read()))
fwrite.close()


	
	