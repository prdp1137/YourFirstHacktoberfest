import codecs

# Function to decode using ROT13
def decode_rot13():
    # Take user input
    user_input = input("Enter text to decode (ROT13): ")
    
    # Decode the input using codecs library
    decoded_text = codecs.decode(user_input, 'rot_13')
    
    # Display the decoded text
    print("Decoded text:", decoded_text)

# Call the function
decode_rot13()
