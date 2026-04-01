# 1299. Replace Elements with Greatest Element on Right Side / 右側の最大の要素に置換

## Date / 実行日
2026-04-01

## Discussion / 考察

### English
The initial approach was a **Brute Force** method using nested loops, which resulted in a time complexity of $O(n^2)$. This is inefficient for large datasets as it repeatedly scans the right side of each element. 
To optimize, I implemented a **Single-Pass Backward Scan (Right-to-Left)**. By traversing the array from the end, we can maintain the "suffix maximum" in a single variable. This allows us to replace each element and update the maximum in one go, significantly improving performance. A key implementation detail in Java is using a temporary variable to store the current element's value before overwriting it, ensuring that the element itself is not included in its own "right-side maximum."

### 日本語
初期のアプローチでは、二重ループを用いた**ブルートフォース（力まかせ法）**を検討しました。この場合、時間計算量が $O(n^2)$ となり、各要素に対して右側を再走査するため、大規模なデータセットでは非効率です。
最適化のため、**1パスの逆方向走査（Right-to-Left Scan）**を実装しました。配列の末尾から走査することで、「接尾辞の最大値（Suffix Maximum）」を単一の変数で保持できます。これにより、各要素の置換と最大値の更新を一度に行うことができ、パフォーマンスが劇的に向上しました。Javaでの実装上のポイントは、現在の値を上書きする前に一時変数（`temp`）へ退避させることです。これにより、自分自身の値が「右側の最大値」に含まれてしまうバグを防いでいます。

## Complexity Analysis / 計算量分析
- **Time Complexity / 時間計算量**: $O(n)$
  - Single pass through the array. / 配列を1回スキャンするのみ。
- **Space Complexity / 空間計算量**: $O(1)$
  - In-place modification with only a few auxiliary variables. / わずかな補助変数のみを使用し、元の配列を直接操作。

## Key Learnings / 学んだこと
- **Backward Scanning Strategy**: Many "right-side" problems can be optimized from $O(n^2)$ to $O(n)$ by reversing the traversal direction.
- **Guard Clauses**: Handling `null` and `length == 1` cases at the beginning is crucial for production-grade code in Big Tech interviews.
- **Value Preservation**: The importance of using a `temp` variable to manage state changes during in-place updates.

- **逆方向走査の戦略**: 「右側」に関する多くの問題は、走査方向を逆にすることで $O(n^2)$ から $O(n)$ へ最適化できる。
- **ガード句の重要性**: `null` や配列の長さが 1 のケースを冒頭で処理することは、Big Techの面接における「プロダクションクオリティ」のコードとして不可欠。
- **状態管理**: インプレース更新中に状態（現在の値）を失わないよう、一時変数を用いる設計思想。