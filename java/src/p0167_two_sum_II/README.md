# 167. Two Sum II - Input Array Is Sorted / 2つの数値の和 II（ソート済み配列）

## Date / 実行日
2026-04-02

## Discussion / 考察

### English
The key to this problem is that the input array is **sorted**. While a brute-force nested loop approach takes $O(n^2)$, we can optimize this to $O(n)$ using the **Two Pointers (Converging Pointers)** technique. 
By placing pointers at the beginning (`i`) and the end (`j`) of the array, we can adjust their positions based on the current sum:
- If `sum < target`, increment `i` to increase the sum.
- If `sum > target`, decrement `j` to decrease the sum.
This approach is both time-efficient and space-efficient ($O(1)$), as it doesn't require extra data structures.

### 日本語
この問題の最大のヒントは「配列が**ソート済み**である」という点です。二重ループによる全探索では $O(n^2)$ かかりますが、**2ポインタ（挟み撃ち）** 戦略を用いることで $O(n)$ まで最適化できます。
配列の先頭（最小値）と末尾（最大値）にポインタを置き、現在の合計値に応じて動かします。
- 合計が `target` より小さければ、左側のポインタ `i` を右へ動かして合計を増やす。
- 合計が `target` より大きければ、右側のポインタ `j` を左へ動かして合計を減らす。
この手法は、ハッシュマップなどの追加メモリを必要としないため、空間計算量も $O(1)$ と非常に効率的です。

## Complexity Analysis / 計算量分析
- **Time Complexity / 時間計算量**: $O(n)$
  - Each element is visited at most once as the pointers converge. / 左右のポインタが中央で出会うまで、各要素を最大1回確認するだけです。
- **Space Complexity / 空間計算量**: $O(1)$
  - Only two integer pointers are used, regardless of the input size. / 入力サイズに関わらず、2つのインデックス変数のみを使用します。

## Key Learnings / 学んだこと
- **Sorted Property**: Learned to recognize that sorted arrays are often a signal for Two Pointers or Binary Search.
- **Time-Space Efficiency**: Achieved the optimal $O(n)$ time without sacrificing $O(1)$ space, breaking the common trade-off.
- **Problem Constraints**: Noticed that LeetCode's 1-based indexing requirement (`i + 1`, `j + 1`) needs careful adjustment during the return.

- **ソート済みの特性**: 「ソート済み配列」という条件が、2ポインタや二分探索のサインであることを学んだ。
- **効率の追求**: 通常のトレードオフ（空間を増やして時間を短縮する）を回避し、時間 $O(n)$ かつ空間 $O(1)$ という理想的な解法に到達した。
- **問題の制約への適応**: 返り値が「1始まりのインデックス」を求めているため、`+1` する調整を忘れずに実装した。