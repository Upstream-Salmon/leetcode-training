# 238. Product of Array Except Self / 自分自身を除く配列の積

##  Date / 実行日
2026-04-03

##  Discussion / 考察

The challenge of this problem is to achieve $O(n)$ time complexity without using the division operator.
この問題の挑戦的な点は、割り算を使わずに時間計算量 $O(n)$ を達成することにある。

### Prefix and Suffix Product Strategy / 前方積と後方積の戦略
Any element `answer[i]` is the product of all elements to its left multiplied by all elements to its right.
ある要素 `answer[i]` は、「その要素より左側にある全要素の積」と「右側にある全要素の積」を掛け合わせたものである。

1. **First Pass (Prefix)**: Calculate the product of all elements to the left of `i`.
   1回目のループ：`i` より左側にある全要素の積（Prefix）を計算し、配列に格納する。
2. **Second Pass (Suffix)**: Multiply the current value by the product of all elements to the right of `i`.
   2回目のループ：後ろから走査し、右側にある全要素の積（Suffix）を変数で保持しながら掛け合わせる。

##  Complexity Analysis / 計算量分析

| Approach / 手法 | Time Complexity / 時間計算量 | Space Complexity / 空間計算量 |
| :--- | :--- | :--- |
| **Brute Force (Nested Loop)** | $O(n^2)$ | $O(1)$ |
| **Prefix & Suffix Optimal** | **$O(n)$** | **$O(1)$** (excluding output array) |

##  Key Learnings / 学んだこと

- **Pre-calculation / 事前計算の活用**: 
  Instead of re-calculating the product for every index, we reuse the result from the previous index. This is a common pattern to optimize $O(n^2)$ to $O(n)$.
  各インデックスで毎回計算し直すのではなく、直前の計算結果を再利用する。これは $O(n^2)$ を $O(n)$ に落とすための王道パターン。
- **Space Optimization / 空間の最適化**: 
  By reusing the result array for the prefix product and using a single variable for the suffix product, we achieved $O(1)$ extra space.
  左積の結果配列を使い回し、右積を単一の変数で管理することで、追加のメモリ消費を最小限に抑えた。
- **Division-free Robustness / 割り算を使わない堅牢性**: 
  This approach works perfectly even when the array contains `0`, which would cause issues with a division-based approach.
  この手法は配列に `0` が含まれていても動作する（割り算によるゼロ除算エラーを回避できる）。