# Ceaser Cipher project
## By Liam(@theherooftimelegend), Elliott(@ElliottAndCoachGeorge), and Izzy(@Phantom-StormX)

#### Purpose
- This is a caesar cipher with a instant encryptor and decoder it makes it where you can instantly Encrypt a message with a code or enter a code and decode a message instantly 

#### Features
- Encode button to code message based on shift text box input 
- Decode button to code message based on shift text box input
- Input text box to place encoded/decoded message
- Output text box to show neww encoded/decoded message
- Sumbit button to run button
  
#### Class Structure
- CipherController
  - Connects the engine and fxml together
- CipherEngine
  - Logic behind the Caeser Cipher
- Launcher
  - Launches all connected classes
- Main
  - Combines both fxml and controller together into one "Stage"
- Cipher-View.fxml
  - Basically the "view" of the project. Uses fxml to create the gui
  
#### How it Works
1. The user interacts with the input textbox, interacts with the shift textbox then either presses the encode or decode button.
2. Button clicks get interpreted through the controller class, which then sends the information given by the user to the engine.
3. Information gets evaluated and "solved" in the engine
4. The fxml updates and shows the result of the users input.

#### Challenges
- learning how to code a cesear ciper in java
- Allowing the program to run all the classes at once. I had to use AI to help me with this part and it said to make a seperate class, using a parent to combine all of the information. It actually makes it more organized and easy to understand. 

#### Credentials 
- https://www.scaler.com/topics/caesar-cipher-program-in-java/
  - I(@Phantom-StormX) used this to help with the logic. I did not want to hardcode everything and i needed somewhere to start. In my defense i had to make the logic within two-ish days, so i do not think i would have enough time to research and completely learn how to code the logic for the Caeser Cipher.
- @ElliottAndCoachGeorge made the gui, thanks man :)
