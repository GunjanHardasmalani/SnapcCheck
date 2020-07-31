# SNAPCHECK - ENCRYPTION

## Problem Statement
An English text needs to be encrypted using the following encryption scheme. 
1. The spaces are removed from the text. Let  be the length of this text. 
2. Characters are written into a grid, whose rows and columns have the following constraints:

![Encryption Image!](encryption.png "Encryption")


**For example** 

1. **Example 1** -  *if man was meant to stay on the ground god would have given us roots*,

after removing spaces is  characters long, so it is written in the form of a grid with 7 rows and 8 columns.

> ifmanwas  
> meanttos          
> tayonthe  
> groundgo  
> dwouldha  
> vegivenu  
> sroots

* Ensure that rows x columns >= L
* If multiple grids satisfy the above conditions, choose the one with the minimum area

The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

> imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be characters. Print the encoded message.

2. **Example 2** 

* Sample Input:
 > haveaniceday

* Sample Output:
> hae and via ecy

3. **Example 3**

* Sample Input:
> feedthedog   

* Sample Output:
> fto ehg ee dd

4. **Example 4**
* Sample Input:
> chillout

* Sample Output:
> clu hlt io
