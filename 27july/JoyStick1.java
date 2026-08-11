class JoyStick1{
	public static void main(String[] args){
		
		JoyStick.connectJoyStick();
		JoyStick.moveCharacter();
		JoyStick.pressButton();
		JoyStick.disconnectJoyStick();
		JoyStick.joyStickDetails();
		
		JoyStick.connectJoyStick();
		
		JoyStick.moveCharacter();
		JoyStick.moveCharacter();
		
		JoyStick.pressButton();
		JoyStick.pressButton();
		JoyStick.pressButton();
		
		JoyStick.disconnectJoyStick();
		JoyStick.disconnectJoyStick();
		JoyStick.disconnectJoyStick();
		JoyStick.disconnectJoyStick();
		
		JoyStick.joyStickDetails();
		JoyStick.joyStickDetails();
		JoyStick.joyStickDetails();
		JoyStick.joyStickDetails();
		JoyStick.joyStickDetails();
	}
}

		
		
		
		
		
		