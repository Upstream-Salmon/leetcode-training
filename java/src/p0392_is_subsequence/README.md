# 392. Is Subsequence / 部分列の判定

## Date / 実行日
2026-04-01

## Discussion / 考察

### English
The problem was solved using the **Two Pointers** technique. By maintaining two indices, `i` for the source string `s` and `j` for the target string `t`, we can verify the subsequence property in a single pass. The logic ensures that we only move the pointer `i` when a matching character is found in `t` at the current pointer `j`. This approach is optimal for a single query. For scenarios with a large number of incoming `s` strings against a fixed `t`, a more advanced approach using a **precomputed index map with binary search** would be more efficient ($O(m \log n)$ per query).

### 日本語
**Two Pointers（2ポインタ）** 手法を用いて解決しました。探索元 `s` のためのインデックス `i` と、探索先 `t` のためのインデックス `j` を管理することで、1回の走査（Single Pass）で部分列判定が可能です。ターゲット `t` の現在の文字が `s` の探している文字と一致したときのみ `i` を進めるというロジックにより、文字の順序を維持したまま判定を行えます。この解法は単発のクエリに対して最適です。もし `t` が固定で `s` が大量に与えられる場合は、**出現位置を記録したマップと二分探索**を組み合わせることで、クエリごとの計算量を $O(m \log n)$ まで最適化することが可能です。

## Complexity Analysis / 計算量分析
- **Time Complexity / 時間計算量**: $O(n)$
  - Where $n$ is the length of the target string `t`. Each character is visited at most once. / $n$ は文字列 `t` の長さ。各文字を最大1回走査。
- **Space Complexity / 空間計算量**: $O(1)$
  - Only two integer pointers are used, regardless of input size. / 入力サイズに関わらず、2つの整数ポインタのみを使用。

## Key Learnings / 学んだこと
- **Two Pointers Efficiency**: Understood how to compare two sequences with different progression speeds without using nested loops.
- **Early Exit Strategy**: Including `i < s.length()` in the `while` condition allows the algorithm to terminate as soon as a match is confirmed.
- **Scalability Discussion**: Learned that for multiple queries, pre-processing the data (Binary Search approach) is a common follow-up question in Big Tech interviews.

- **2ポインタの効率性**: 二重ループを使わず、異なる速度で進む2つのシーケンスを比較する手法を習得。
- **早期終了戦略**: `while` の条件に `i < s.length()` を含めることで、全ての文字が見つかった瞬間に処理を切り上げる設計。
- **拡張性の議論**: 大量クエリの場合の事前処理（二分探索アプローチ）は、Big Techの面接で頻出のフォローアップ質問であることを学習。