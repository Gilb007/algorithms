# algorithms
Algorithms and Data Structure

## Arrays&Hashing

char charAt(int index), s.charAt(i) возвращает значение char по указанному индексу. Индекс колеблется от 0 до length()-1

public StringBuilder append(String str)

java.util.HashSet.contains() 

// create a HashMap and add some values
        HashMap<String, Integer> map
            = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
 
// print map details
System.out.println("HashMap:\n " + map.toString());
 
// provide value for new key which is absent
// using computeIfAbsent method
        map.computeIfAbsent("key5",k -> 2000 + 33000);
 
// print new mapping
        System.out.println("New HashMap:\n "+ map);
                           
HashMap: {key1=10000, key2=55000}
New HashMap: {key1=10000, key2=55000, key5=35000}
 
res.addAll(map.values()) - add all values in array from map values.
 
map.put("d", 400); 
// provide key whose value has to be obtained
// and default value for the key. Store the
// return value in k
int k = map.getOrDefault("b", 500);
return: 500.

Hash_table.containsKey(key_element) - return boolean.

String s, s.charAt(i) - 'a' :
'a' - 'a' = 0
'n' - 'a' = 13


## Two Pointers
Arrays.asList(nums[i], nums[l++], nums[r--])
ms[i], nums[l++], nums[r--]));
                    
Character.isAlphabetic(s.charAt(left))
Character.isLetterOrDigit(s.charAt(left))

![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.42.45.png)
![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.43.41.png)
![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.43.48.png)
![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.43.57.png)
![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.44.06.png)
![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.44.12.png)
![ezcv logo](https://github.com/Gilb007/algorithms/blob/main/pics/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202023-03-14%20%D0%B2%2006.44.33.png)





