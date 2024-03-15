<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../style/style.css">
    <title>Usuwanie parzystych elementów z tablicy</title>
</head>
<body>
  <fieldset>
        <?php
            echo "Tablica przed <br><br>";
            $roj = array();

            for ($i = 0; $i < 30; $i++) {
                $roj[$i] = rand(50, 100);
            }

            foreach ($roj as $a) {
                echo $a . ", ";
            }

            echo "<br><br>";
            echo "Tablica po <br><br>";

            $roj2_p = array();
            $roj2_n = array();

            foreach ($roj as $a) {
                if ($a % 2 == 1) {
                    $roj2_n[] = $a;
                } else {
                    $roj2_p[] = $a;
                }
            }

            foreach ($roj2_n as $n) {
                echo $n . ", ";
            }

            echo "<br><br>";
            echo "Tablica z parzystymi elementami:<br><br>";

            foreach ($roj2_p as $p) {
                echo $p . ", ";
            }
        ?>
    </fieldset>
</body>
</html>
