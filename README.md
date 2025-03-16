# 🚀 Mastering Java: Essential Number Programs with Code, Output, and Explanation!

## 1️⃣ Count the Number of Digits in a Number

### 📜 Algorithm:
1. Initialize a counter variable `count = 0`.
2. Use a `while` loop to divide `n` by 10 repeatedly.
3. Increment `count` in each iteration.
4. Stop when `n` becomes 0.
5. Return `count`.

### 📌 Code:
```java
public class Solution {
    public static int countDigits(int n){
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int digits = countDigits(2223);
        System.out.println("Number of digits: " + digits);
    }
}
```
### 🎯 Output:
```
Number of digits: 4
```

---
## 2️⃣ Reverse a Number

### 📜 Algorithm:
1. Initialize `rev = 0`.
2. Extract the last digit using `n % 10`.
3. Multiply `rev` by 10 and add the last digit.
4. Remove the last digit using `n / 10`.
5. Repeat until `n` becomes 0.

### 📌 Code:
```java
public class ReverseNumber {
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Reversed: " + reverse(123));
    }
}
```
### 🎯 Output:
```
Reversed: 321
```

---
## 3️⃣ Check if a Number is a Palindrome

### 📜 Algorithm:
1. Reverse the number.
2. Compare the original number with the reversed number.
3. If they match, it's a palindrome.

### 📌 Code:
```java
public class PalindromeNumber {
    public static void checkPalindrome(int n) {
        int rev = 0, temp = n;
        while (n > 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n /= 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        checkPalindrome(121);
    }
}
```
### 🎯 Output:
```
Palindrome
```

---
## 4️⃣ Find the GCD (HCF) of Two Numbers

### 📜 Algorithm:
1. Iterate from `1` to the smallest of `n1` and `n2`.
2. Check if both numbers are divisible by `i`.
3. The largest `i` is the GCD.

### 📌 Code:
```java
public class GCD {
    public static int findGCD(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        System.out.println("GCD: " + findGCD(20, 15));
    }
}
```
### 🎯 Output:
```
GCD: 5
```

---
## 5️⃣ Find All Divisors of a Number

### 📜 Algorithm:
1. Iterate from `1` to `n`.
2. Check if `n` is divisible by `i`.
3. Print `i` if `n % i == 0`.

### 📌 Code:
```java
public class Divisors {
    public static void printDivisors(int n) {
        System.out.println("Divisors of " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        printDivisors(120);
    }
}
```
### 🎯 Output:
```
Divisors of 120: 1 2 3 4 5 6 8 10 12 15 20 24 30 40 60 120
```

---
## 6️⃣ Check if a Number is Prime

### 📜 Algorithm:
1. Check if `n` has exactly two divisors: `1` and `n`.
2. If yes, it's prime; otherwise, it's not.

### 📌 Code:
```java
public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 1483;
        System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
    }
}
```
### 🎯 Output:
```
1483 is Prime
```

---
## 7️⃣ Check if a Number is an Armstrong Number

### 📜 Algorithm:
1. Find the number of digits `k`.
2. Compute the sum of each digit raised to the power of `k`.
3. If the sum equals the original number, it's an Armstrong number.

### 📌 Code:
```java
public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int k = String.valueOf(num).length();
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, k);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println(number + " is " + (isArmstrong(number) ? "an Armstrong number" : "not an Armstrong number"));
    }
}
```
### 🎯 Output:
```
153 is an Armstrong number
```

---
🔥 Hope this helps you in your Java journey! Let me know if you have any questions. 🚀💡

