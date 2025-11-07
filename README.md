Dice Roller App: A simple Android app that simulates rolling a six-sided die was built using Kotlin and Android Studio. This project demonstrates core Android development concepts like UI design, event handling, and state updates. It displays a die face and a "ROLL" button. When the button is tapped, the die face updates to show a random number between 1 and 6. This project was developed as part of an Android development course and includes one enhancement beyond the baseline requirements.

Features: Roll a virtual die with a tap; Random number generation from 1 to 6; Dynamic image updates based on roll result; Clean UI with responsive layout. 

Enhancement is Textview enhancements to show Dice Value in Text by displaying the rolled dice value as text below the image. The simplest enhancement for visibility and demo verification is a small UX improvement. This adds clarity for users and is easy to verify in my demo video, especially for users who may have difficulty interpreting images alone.

1. Update activity_main.xml: add a TextView below the dice image to show the rolled number:
<TextView
    android:id="@+id/dice_value_text"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Rolled: 2"
    android:textSize="18sp"
    android:textStyle="bold"
    android:layout_marginTop="8dp"
    app:layout_constraintTop_toBottomOf="@id/dice_image"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent" />

2. Update MainActivity.kt: add a reference to the new TextView and update it in rollDice():
package com.kay.diceroller

import android.widget.TextView	//UI elements
class MainActivity : AppCompatActivity() {
    … private lateinit var diceValueText: TextView
      }
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = getString(
            when (randomInt) {
                1 -> R.string.dice_1
                2 -> R.string.dice_2
                3 -> R.string.dice_3
                4 -> R.string.dice_4
                5 -> R.string.dice_5
                else -> R.string.dice_6
            }
        )
        diceValueText.text = "Rolled: $randomInt"
    }
}

To avoid hardcoding the string android:text="Rolled: 2" in your activity_main.xml, you should define it in your strings.xml file using a format placeholder. 

1: Update res/values/strings.xml
Add this line: <string name="rolled_value">Rolled: %1$d</string>
This defines a string resource with a placeholder for an integer value.

2: Update activity_main.xml
Replace the hardcoded text with a reference to the string resource: android:text="@string/rolled_value"
This is just a placeholder for layout preview; the actual value will be set programmatically.

3: Update MainActivity.kt
Update the TextView content using the string resource: 
diceValueText.text = getString(R.string.rolled_value, randomInt)

Final Result in rollDice():
diceValueText.text = getString(R.string.rolled_value, randomInt)
This ensures your app is properly localized and avoids hardcoded UI strings. Let me know if you’d like to localize it for other languages too!

github link: kson115/diceRollerApp: An Android app that stimulates rolling dices
README.md: diceRollerApp/README.md at main · kson115/diceRollerApp

Screenshots:
original emulator:
<img width="1224" height="1470" alt="diceRoll1" src="https://github.com/user-attachments/assets/aa661843-a0f3-4e81-baff-7e5a72edc018" />
<img width="1209" height="1469" alt="diceRoll2" src="https://github.com/user-attachments/assets/1cc65016-1dd8-476c-b9e4-107e214e30e9" />
<img width="1223" height="1479" alt="diceRoll6" src="https://github.com/user-attachments/assets/63db8631-6bb6-4c91-a32e-a278eef27bbd" />
<img width="1210" height="1481" alt="diceRoll5" src="https://github.com/user-attachments/assets/23f18f4e-9661-4907-9772-efc477402b90" />
<img width="1214" height="1470" alt="diceRoll4" src="https://github.com/user-attachments/assets/79adea9b-ca30-4c8c-8986-fc203f54d0c3" />
<img width="1196" height="1462" alt="diceRoll3" src="https://github.com/user-attachments/assets/9d749875-3adf-4e8a-9fd9-6d6e3ed681a9" />

APK installed fresh emulator:
<img width="2344" height="1098" alt="APKinstallTest2" src="https://github.com/user-attachments/assets/42ff589c-a328-4b21-a4b0-bfc5f649e62b" />
<img width="2331" height="1046" alt="APKinstallTest1" src="https://github.com/user-attachments/assets/6dc88f22-6236-4e7d-9bc3-ac6c658943b5" />
<img width="1080" height="2424" alt="diceRollFreshEmulator2" src="https://github.com/user-attachments/assets/04e3c132-228f-4d22-b209-8c8be8cf02df" />
<img width="1214" height="1389" alt="diceRollFreshEmulator1" src="https://github.com/user-attachments/assets/98bea7c7-388b-4233-9816-eb6c6e23c300" />

Demo Video: 
Diceroll video link: https://drive.google.com/file/d/1--FySc5JbikbvKULjWxRJGvEo_SBqTPl/view?usp=sharing

APKs uploaded in Blackboard:
app-debug.apk
app-debug-androidTest.apk

Resources: 6 dice images taken from:
Dice, one icon - Free download on Iconfinder
Dice, two icon - Free download on Iconfinder
Dice, three icon - Free download on Iconfinder
Dice, four icon - Free download on Iconfinder
Dice, five icon - Free download on Iconfinder
Dice, six icon - Free download on Iconfinder

Quick Submission Checklist
[x] App compiles and runs without crashes
[x] Baseline features match the playlist app
[x] One enhancement implemented and visible in the demo
[x] Readme includes overview, features, setup, screenshots, and video link
[x] APK uploaded; repo access granted


