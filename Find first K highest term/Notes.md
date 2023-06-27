<!DOCTYPE html>
<html>
<head>
<title>Algorithm Output</title>
</head>
<body>
<h1>Algorithm Output</h1>
<p>
The algorithm takes an array <i>a</i> of size <i>n</i> and an integer <i>k</i> as input. It searches for the first element in the array that occurs <i>k</i> times.
</p>

<h3>Example:</h3>
<p>
Input:<br>
Array <i>a</i>: [1, 2, 3, 4, 5]<br>
Size <i>n</i>: 5<br>
Value of <i>k</i>: 2<br>
</p>

<p>
Output:<br>
The first element that occurs 2 times in the array is 2.
</p>

<h3>Algorithm Steps:</h3>
<ol>
  <li>Create an empty HashMap <i>m</i>.</li>
  <li>Iterate through the array <i>a</i> from index 0 to <i>n-1</i>.</li>
  <li>&emsp; If the current element <i>a[i]</i> is not present in <i>m</i>, add it to <i>m</i> with a count of 1.</li>
  <li>&emsp; If the current element <i>a[i]</i> is already present in <i>m</i>, increment its count by 1.</li>
  <li>&emsp; If the count of <i>a[i]</i> in <i>m</i> is equal to <i>k</i>, return <i>a[i]</i>.</li>
  <li>If no element is found with a count equal to <i>k</i>, return -1.</li>
</ol>

</body>
</html>
