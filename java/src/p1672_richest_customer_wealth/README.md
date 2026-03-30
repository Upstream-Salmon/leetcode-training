# LeetCode 1672. Richest Customer Wealth

### Date
2026-03-30

### Problem Description
2D配列 `accounts` が与えられ、`accounts[i][j]` は $i$ 番目の顧客が $j$ 番目の銀行に持っている資産を表す。各顧客の合計資産（Wealth）のうち、最大の値を返せ。

### Approach: Iterative Maximum Sum
各顧客の口座を走査し、その合計値を「暫定最大値」と比較して更新していく手法を採用。

1. 最大資産を保持する変数 `maxWealth` を `0` で初期化。
2. 各顧客（行）に対して以下の処理を行う：
    - その顧客の全口座（列）の合計 `currentSum` を計算。
    - `Math.max(maxWealth, currentSum)` を用いて `maxWealth` を更新。
3. 最終的な `maxWealth` を返す。

### Complexity Analysis
- **Time Complexity:** $O(m \times n)$
    - $m$ は顧客数、$n$ は各顧客の銀行口座数。全要素を1度ずつ確認する必要があるため、これが理論上の最速値。
- **Space Complexity:** $O(1)$
    - 合計値を保存するための追加配列を作成せず、変数のみで管理しているため、メモリ効率が極めて高い。

### Technical Interview Tips
- **Edge Cases:** 入力の `accounts` が空、または `null` の場合の挙動について面接官と事前に合意を取ること。
- **Optimization:** 配列を別途作成（$O(m)$）するのではなく、インプレースまたは変数管理（$O(1)$）にすることで、大規模データへの耐性を示す。
- **Java Best Practice:** `Math.max()` のような標準ライブラリを活用し、冗長な条件分岐（if-else）を排除して可読性を高める。