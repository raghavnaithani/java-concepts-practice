// this to help me in revision if needed.
public class javaoperators {
    // operators and types and expressions
    public static void main(String[] args) {

        // arithematic operators - +,-,*,/,%,++,--
        int a = 4;
        int b = 6;
        int c = b + a; //addition
        int d = b - a; //subtraction
        int e = 7 * b; // multiplication
        int f = b % a; // modulo operator , returns the remainder
        int resultpre = ++b ;          // pre increment,  Here, ++b is part of the expression ++b, and result is assigned the value of b after it's incremented.
        int resultpost = b++ ;          // post increment,Here, b++ is part of the expression b++, and result is assigned the value of b before it's incremented.
        System.out.println(b);
        System.out.println(resultpost);


        
        // Relational Operators
        // Purpose: Compare values and return a boolean result.

        int x = 10;
        int y = 5;

        // Equal to (==)
        boolean isEqual = (x == y); // Equal to
        // Purpose: Checks if x is equal to y.
        // Explanation: Returns true if x is equal to y; false otherwise.

        // Not equal to (!=)
        boolean isNotEqual = (x != y); // Not equal to
        // Purpose: Checks if x is not equal to y.
        // Explanation: Returns true if x is not equal to y; false if they are equal.

        // Greater than (>)
        boolean greaterThan = (x > y); // Greater than
        // Purpose: Checks if x is greater than y.
        // Explanation: Returns true if x is greater than y; false otherwise.

        // Less than (<)
        boolean lessThan = (x < y); // Less than
        // Purpose: Checks if x is less than y.
        // Explanation: Returns true if x is less than y; false otherwise.

        // Greater than or equal to (>=)
        boolean greaterOrEqual = (x >= y); // Greater than or equal to
        // Purpose: Checks if x is greater than or equal to y.
        // Explanation: Returns true if x is greater than or equal to y; false otherwise.

        // Less than or equal to (<=)
        boolean lessOrEqual = (x <= y); // Less than or equal to
        // Purpose: Checks if x is less than or equal to y.
        // Explanation: Returns true if x is less than or equal to y; false otherwise.
        




        // Logical Operators
        // Purpose: Combine boolean expressions and return a boolean result.

        boolean p = true;
        boolean q = false;

        // Logical AND (&&)
        boolean logicalAnd = p && q; // Purpose: Combines p and q using AND logic.
        // Explanation: Returns true only if both p and q are true; false otherwise.
        // logicalAnd is false

        // Logical OR (||)
        boolean logicalOr = p || q; // Purpose: Combines p and q using OR logic.
        // Explanation: Returns true if either p or q is true; returns false only if both are false.
        // logicalOr is true

        // Logical NOT (!)
        boolean logicalNotP = !p; // Purpose: Negates the value of p.
        // Explanation: Returns true if p is false; returns false if p is true.
        // logicalNotP is false


        
        // Bitwise Operators
        // Purpose: Perform bit-level operations on integers.

        int m = 5;   // Binary: 101
        int n = 3;   // Binary: 011
        
        // Bitwise AND (&)
        int bitwiseAnd = m & n; // Performs a bitwise AND operation between m and n.
        // Each bit position in the result is set to 1 if both corresponding bits in m and n are 1.
        // Example:
        // m = 5, n = 3
        // bitwiseAnd is 1
        
        // Bitwise OR (|)
        int bitwiseOr = m | n; // Performs a bitwise OR operation between m and n.
        // Each bit position in the result is set to 1 if at least one of the corresponding bits in m or n is 1.
        // Example:
        // m = 5, n = 3
        // bitwiseOr is 7
        
        // Bitwise XOR (^)
        int bitwiseXor = m ^ n; // Performs a bitwise XOR operation between m and n.
        // Each bit position in the result is set to 1 if exactly one of the corresponding bits in m or n is 1.
        // Example:
        // m = 5, n = 3
        // bitwiseXor is 6
        
        // Bitwise Complement (~)
        int bitwiseComplementM = ~m; // Inverts all bits of m.
        // This operation is equivalent to -m - 1.
        // Example:
        // m = 5
        // bitwiseComplementM is -6
        
        // Left Shift (<<)
        int leftShiftedM = m << 1; // Shifts all bits of m to the left by the specified number of positions.
        // Equivalent to multiplying m by 2 for each position shifted left.
        // Example:
        // m = 5
        // leftShiftedM is 10
        
        // Right Shift (>>)
        int rightShiftedM = m >> 1; // Shifts all bits of m to the right by the specified number of positions.
        // For positive numbers, equivalent to dividing m by 2 for each position shifted right.
        // Example:
        // m = 5
        // rightShiftedM is 2
        
        // Zero-fill Right Shift (>>>)
        int zeroFillRightShiftM = m >>> 1; // Shifts all bits of m to the right by the specified number of positions, filling leftmost bits with 0.
        // Always fills the leftmost bits with 0, unlike >> which maintains the sign bit.
        // Example:
        // m = 5
        // zeroFillRightShiftM is 2


        // Assignment Operators
        // Purpose: Assign values to variables.

        int v = 10;

        // Compound Addition (+=)
        v += 5; // Adds the right operand to the left operand and assigns the result to the left operand (v in this case).
        // Equivalent to: v = v + 5;
        // Example:
        // v = 10
        // After v += 5, v is 15

        // Compound Subtraction (-=)
        v -= 3; // Subtracts the right operand from the left operand and assigns the result to the left operand (v in this case).
        // Equivalent to: v = v - 3;
        // Example:
        // v = 15
        // After v -= 3, v is 12

        // Compound Multiplication (*=)
        v *= 2; // Multiplies the right operand by the left operand and assigns the result to the left operand (v in this case).
        // Equivalent to: v = v * 2;
        // Example:
        // v = 12
        // After v *= 2, v is 24

        // Compound Division (/=)
        v /= 4; // Divides the left operand by the right operand and assigns the result to the left operand (v in this case).
        // Equivalent to: v = v / 4;
        // Example:
        // v = 24
        // After v /= 4, v is 6

        // Compound Modulus (%=)
        v %= 3; // Computes the modulus of the left operand with the right operand and assigns the result to the left operand (v in this case).
        // Equivalent to: v = v % 3;
        // Example:
        // v = 6
        // After v %= 3, v is 0

        // Unary Operators
        // Purpose: Operate on a single operand.
        int g = 10;

        g++; // Post-increment
        // Increases the value of 'g' by 1 after the current value is used in an expression.
        // Equivalent to: g = g + 1;
        // Example:
        // g = 10
        // After g++, g is 11

        ++g; // Pre-increment
        // Increases the value of 'g' by 1 before using it in an expression.
        // Equivalent to: g = g + 1;
        // Example:
        // g = 11
        // After ++g, g is 12

        g--; // Post-decrement
        // Decreases the value of 'g' by 1 after the current value is used in an expression.
        // Equivalent to: g = g - 1;
        // Example:
        // g = 12
        // After g--, g is 11

        --g; // Pre-decrement
        // Decreases the value of 'g' by 1 before using it in an expression.
        // Equivalent to: g = g - 1;
        // Example:
        // g = 11
        // After --g, g is 10

        boolean flag = !true; // Logical NOT (!)
        // Inverts the boolean value of the operand.
        // If the operand is true, then ! operand is false; if the operand is false, then ! operand is true.
        // Example:
        // flag = !true is false

        int h = ~5; // Bitwise complement (~)
        // Inverts all bits of the operand.
        // This operation is equivalent to -operand - 1.
        // Example:
        // Binary representation of 5 is 0000 0101
        // Bitwise complement of 5 (~5) is 1111 1010, which is -6 in decimal


                
        // Conditional (Ternary) Operator
        // Purpose: Provides a concise way to evaluate a condition and choose one of two values based on the result.

        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        // Evaluates the condition (age >= 18).
        // If true, assigns "Adult" to status.
        // If false, assigns "Minor" to status.
        // Example:
        // age = 18
        // Since age >= 18 is true, status is assigned "Adult".
        // Therefore, status = "Adult"

        // Instanceof Operator
        // Purpose: Checks whether an object is an instance of a specific class or interface.

        Object obj = new String("Hello");
        boolean isString = obj instanceof String;
        // Checks if the object 'obj' is an instance of the class String.
        // If 'obj' is an instance of String (or a subclass), isString will be true; otherwise, it will be false.
        // Example:
        // obj = new String("Hello")
        // Since 'obj' is an instance of String, isString is true.

            
    }
}
