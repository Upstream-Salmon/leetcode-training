# 1. Two Sum / 1. 両数の和

## Date / 実行日
2026-03-31

## Discussion / 考察
### English
This optimized approach utilizes a HashMap to achieve linear time complexity. By iterating through the array once (1-pass), we store each encountered value and its index. For each new element, we calculate its complement (`target - nums[i]`) and check if it exists in the Map. This transforms a search problem from $O(n)$ in an array to $O(1)$ in a hash table. A key consideration in Java is the use of `Integer` wrapper objects within the Map, which involves autoboxing, yet remains significantly faster than the Brute Force approach for large inputs.

### 日本語
HashMap を活用することで、時間計算量を線形（Linear Time）に最適化したアプローチです。配列を 1 回だけ走査（1パス）し、通り過ぎた値をそのインデックスと共に Map に記録していきます。各要素において、補数（`target - nums[i]`）が Map 内に存在するかをチェックすることで、探索時間を $O(n)$ から $O(1)$ へ短縮しました。Java 特有の仕様として、Map 内での `Integer` オブジェクトへのオートボクシングが発生しますが、大規模な入力データに対しては力まかせ探索よりも圧倒的に高速に動作します。

## Complexity Analysis / 計算量分析
* **Time Complexity / 時間計算量**: $O(n)$
    * We traverse the list containing $n$ elements only once. Each look-up in the hash table costs only $O(1)$ time. / 要素数 $n$ の配列を 1 回だけ走査し、ハッシュテーブルの探索も $O(1)$ で行えるため、全体で $O(n)$ となります。
* **Space Complexity / 空間計算量**: $O(n)$
    * The extra space required depends on the number of items stored in the hash table, which stores at most $n$ elements. / ハッシュテーブルに最大で $n$ 個の要素を格納するため、入力サイズに比例した追加メモリを必要とします。

## Key Learnings / 学んだこと
* **Trade-off between Time and Space**: Sacrificing space complexity ($O(n)$) to achieve optimal time complexity ($O(n)$) is a fundamental pattern in interviews. / 空間計算量を犠牲にして最高速度の時間計算量を得るという、面接における最も基本的なトレードオフのパターンを学びました。
* **One-Pass Hash Table**: Learning that we can check for the complement and populate the map in a single loop, rather than two separate passes, further optimizes the constant factor of the algorithm. / 補数のチェックと Map への登録を一つのループ内で行う「1パス解法」により、アルゴリズムの定数倍の効率をさらに高められることを理解しました。