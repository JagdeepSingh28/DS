package com.jagdeep.ds.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	private Pattern lowercase_pattern, digit_pattern,
			special_character_pattern, space_pattern, upper_case_pattern,identical_pattern ;
	private Matcher matcher;
	 

	private static final String PASSWORD_PATTERN_LOWER_CASE = ".*[a-z].*";

	private static final String PASSWORD_PATTERN_UPPER_CASE = ".*[A-Z].*";

	private static final String PASSWORD_PATTERN_DIGIT = ".*\\d.*";

	private static final String PASSWORD_PATTERN_SPECIAL_CHARACTER = ".*[^0-9A-Za-z].*";

	private static final String PASSWORD_PATTERN_SPACE = "(?=\\S+$)";
	
//	private static final String PASSWORD_PATTERN_3_IDENTICAL = ".*([a-zA-Z0-9])\\1\\1.*";
	//"([a-z\\d])\\1\\1"
	
	private static final String PASSWORD_PATTERN_3_IDENTICAL = ".*([a-zA-Z0-9\\s~`!@#$%^&*)(\\]\"\\[_+=|\\}{:;?/><,.])\\1\\1.*";

	
	

	public PasswordValidator() {
		lowercase_pattern = Pattern.compile(PASSWORD_PATTERN_LOWER_CASE);
		digit_pattern = Pattern.compile(PASSWORD_PATTERN_DIGIT);
		special_character_pattern = Pattern.compile(PASSWORD_PATTERN_SPECIAL_CHARACTER);
		space_pattern = Pattern.compile(PASSWORD_PATTERN_SPACE);
		upper_case_pattern = Pattern.compile(PASSWORD_PATTERN_UPPER_CASE);
		identical_pattern = Pattern.compile(PASSWORD_PATTERN_3_IDENTICAL);
	}

	/**
	 * Validate password with regular expression
	 * 
	 * @param password
	 *            password for validation
	 * @return true valid password, false invalid password
	 */
	public boolean validateLowerCase(final String password) {

		matcher = lowercase_pattern.matcher(password);
		return matcher.matches();

	}

	public boolean validateDigit(final String password) {

		matcher = digit_pattern.matcher(password);
		return matcher.matches();

	}

	public boolean validateSpecialCharacter(final String password) {

		matcher = special_character_pattern.matcher(password);
		return matcher.matches();

	}

	public boolean validateUpperCase(final String password) {

		matcher = upper_case_pattern.matcher(password);
		return matcher.matches();

	}

	public boolean validateSpace(final String password) {

		matcher = space_pattern.matcher(password);
		return matcher.matches();

	}
	
	public boolean validateIdentical(final String password) {

		matcher = identical_pattern.matcher(password);
		return matcher.matches();

	}

	public boolean validateConsecutiveSeq(String consecutivePassword) {
		char consecutivePasswordCharArray[] = consecutivePassword.toCharArray();
		int asciiCode = 0;
		boolean isConSeq = false;
		int previousAsciiCode = 0;
		int numSeqcount = 0;

		for (int i = 0; i < consecutivePasswordCharArray.length; i++) {
			asciiCode = consecutivePasswordCharArray[i];
			if ((previousAsciiCode + 1) == asciiCode) {
				numSeqcount++;
				if (numSeqcount >= 3) {
					isConSeq = true;
					break;
				}
			} else {
				numSeqcount = 0;
			}
			previousAsciiCode = asciiCode;
		}
		return isConSeq;
	}

	public boolean isValidPassword(final String password) {
		Pattern pattern;
		Matcher matcher;

		//        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$";
		final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=~`!_-])(?=\\S+$).{8,20}$";

		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher(password);

		boolean isConsecutive = validateConsecutiveSeq(password);
		return matcher.matches() && !isConsecutive;

	}


}