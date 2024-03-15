<?php

$tablica = array();

for ($i = 0; $i < 50; $i++) {
    $tablica[$i] = rand(1, 100);
}


foreach ($tablica as $value) {
    echo "$value"." ";
}
echo "<br>";
echo "\n";

foreach ($tablica as $index => $wartosc) {
    if (sqrt($index + 1) == (int)sqrt($index + 1)) {
        echo "$wartosc ";
    }
}
?>
