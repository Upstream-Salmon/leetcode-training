# 383. Ransom Note / 身代金の手紙

## Date / 実行日
2026-03-31

## Discussion / 議論

### English
The problem was solved using a frequency array (bucket sort concept) to manage character counts. While the initial idea struggled with character tracking, the optimized solution uses an `int[26]` array to store the availability of each letter from the `magazine`. By decrementing the count for each character in the `ransomNote`, we can efficiently determine if the note can be constructed. A critical edge case is when the `ransomNote` is longer than the `magazine`, which can be handled by an early return to improve performance.

### 日本語
本問題は、文字の出現頻度を管理する「頻度配列（バケットソートの概念）」を用いて解決しました。初期の考察では文字の追跡に課題がありましたが、最適化された解法では `int[26]` 配列を使用して `magazine` 内の各文字の在庫を保持します。`ransomNote` の各文字に対して在庫を減らしていくことで、構築可能かどうかを効率的に判定できます。重要なエッジケースとして、`ransomNote` が `magazine` より長い場合があり、冒頭でガード句（Early Return）を設けることでパフォーマンスを向上させています。

## Complexity Analysis / 計算量分析

### English
- **Time Complexity**: $O(m + n)$, where $m$ is the length of `magazine` and $n$ is the length of `ransomNote`. We traverse both strings once.
- **Space Complexity**: $O(1)$. We use a fixed-size array of 26 integers regardless of the input size.

### 日本語
- **時間計算量**: $O(m + n)$。$m$ は `magazine` の長さ、$n$ は `ransomNote` の長さです。両方の文字列を一度ずつ走査するためです。
- **空間計算量**: $O(1)$。入力サイズに関わらず、固定サイズ 26 の整数配列のみを使用するためです。

## Key Learnings / 主な学び

### English
- **Array as a Hash Map**: For fixed character sets (lowercase English), an array is more performant than a `HashMap` due to reduced overhead.
- **Timing of Validation**: Checking the count *before* or *immediately after* decrementing is crucial to avoid "off-by-one" errors in logic.
- **Defensive Programming**: Adding a length check at the beginning demonstrates an understanding of input constraints and optimization.

### 日本語
- **ハッシュマップとしての配列**: 固定された文字セット（英小文字）の場合、配列は `HashMap` よりもオーバーヘッドが少なく、パフォーマンスに優れています。
- **バリデーションのタイミング**: 在庫を減らす前、あるいは減らした直後の判定タイミングは、ロジックにおける「1のズレ（off-by-one error）」を防ぐために極めて重要です。
- **防御的プログラミング**: 冒頭で長さのチェックを行うことは、入力制約の理解と最適化への意識を示すことができます。