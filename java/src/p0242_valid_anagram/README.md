# 0242. Valid Anagram / 有効なアナグラム

## Date / 実行日
2026-04-01

## Discussion / 考察

### English
This implementation utilizes a `HashMap` to count character frequencies, ensuring robustness even when the input contains Unicode characters beyond the standard ASCII range. By using `countMap.getOrDefault()`, the logic remains concise while effectively tracking character counts. The algorithm performs a two-pass scan: first to build the frequency map from string `s`, and second to decrement counts using string `t`. If a count drops below zero or a character is missing, it immediately returns `false`, optimizing the execution time for non-anagram cases.

### 日本語
本実装では `HashMap` を使用して文字の出現頻度をカウントした。これにより、標準的なASCII範囲を超えたUnicode文字が含まれる場合でも柔軟に対応可能な、堅牢な設計となっている。`getOrDefault()` を活用することで、頻度カウントのロジックを簡潔に保ちつつ、バグを抑制している。アルゴリズムは2パス構成で、1パス目で `s` の頻度表を作成し、2パス目で `t` を用いてカウントを減算する。カウントが 0 未満になるか、存在しない文字が現れた瞬間に `false` を返すことで、アナグラムでない場合の処理を効率化している。

## Complexity Analysis / 計算量分析

* **Time Complexity / 時間計算量**: $O(n)$
    * Linear traversal of both strings with average $O(1)$ time for Map operations. / 両方の文字列を線形に走査し、Map操作の平均時間が $O(1)$ であるため。
* **Space Complexity / 空間計算量**: $O(k)$
    * $k$ represents the number of unique characters in the input strings. / 入力文字列に含まれるユニークな文字数 $k$ に比例するメモリを消費するため。

## Key Learnings / 学んだこと
* **Unicode Readiness**: Using a Map over a fixed-size array demonstrates a scalable design mindset suitable for global applications. / 固定長配列ではなくMapを選択することで、多言語対応を意識した拡張性の高い設計思想を提示できた。
* **Early Failure Detection**: Immediate validation during the second pass improves the average-case performance. / 2パス目の走査中に即座に不一致を検知する手法により、平均的な実行時間を短縮できる。
* **Java Collection API**: Mastering `getOrDefault()` simplifies frequency tracking logic and enhances code readability. / `getOrDefault()` を使いこなすことで、頻度追跡ロジックを簡素化し、可読性を向上させることができた。