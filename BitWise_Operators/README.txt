Bitwise operators operate on the binary (bit-level) representation of integers, manipulating individual bits directly. They are useful for performing fast calculations in low-level programming and can be combined to achieve complex logic. Here’s an overview of the main bitwise operators:

AND (&): Compares each bit of two numbers and returns a new number with bits set to 1 only where both bits of the operands are 1.

Example: 5 & 3 (binary 0101 & 0011) gives 0001, which is 1.
OR (|): Compares each bit and returns 1 where either of the bits is 1.

Example: 5 | 3 (binary 0101 | 0011) gives 0111, which is 7.
XOR (^): Returns 1 only where the bits differ (i.e., one bit is 1, and the other is 0).

Example: 5 ^ 3 (binary 0101 ^ 0011) gives 0110, which is 6.
NOT (~): Inverts all the bits of a number (flips 0s to 1s and vice versa).

Example: ~5 (binary 0101) becomes 1010 in 4-bit notation, equivalent to -6 in signed 2's complement representation.
Left Shift (<<): Shifts the bits of the number to the left by a specified number of positions, adding 0s to the right.

Example: 5 << 1 shifts 0101 to 1010, resulting in 10.
Right Shift (>>): Shifts the bits to the right, filling with 0s (logical shift) or the sign bit (arithmetic shift).

Example: 5 >> 1 shifts 0101 to 0010, resulting in 2.
