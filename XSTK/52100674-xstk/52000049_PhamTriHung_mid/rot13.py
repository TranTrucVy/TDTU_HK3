import string


def rot13(plain_text):
    # make sure input is correct
    plain_text = plain_text.lower()
    # create list containing all letters of the alphabet
    alphabet = list(string.ascii_lowercase)
    # create list of shifted alphabet by 13 letters
    key = alphabet[13:] + alphabet[:13]
    # create string to store ciphertext
    ciphertext = ""
    print(key)
    # loop through plaintext and encrypt each letter with rot13 cipher
    for i in plain_text:
        # if letter is in alphabet, encrypt it
        if i.isalpha():
            ciphertext += (key[ord(i) - 97])
        # if letter is not in alphabet, add it to ciphertext
        else:
            ciphertext += i
    return ciphertext.upper()


# print(rot13("rot13"))
fread = open("plaintext_50.txt", "r")
fwrite = open("ciphertext.txt", "w")

fwrite.write(rot13(fread.read()))
fwrite.close()
