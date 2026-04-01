# 58. Length of Last Word / 最後の単語の長さ

##  実行日
2026-04-01

##  考察 (Discussion)

### 日本語
この問題の肝は、文字列の末尾に含まれる可能性がある「余計な空白」の処理です。`trim()` や `split()` といった便利な標準メソッドを使うこともできますが、それらは内部で新しい文字列オブジェクトや配列を生成するため、**空間計算量（メモリ消費）が $O(n)$** に跳ね上がってしまいます。

今回は、最も効率的な **逆方向走査（Backward Scan）** を採用しました。
1つの一方向ループの中で、以下の2つのフェーズをスマートに処理しています。
1. **スキップ**: 末尾が空白 `' '` である間は無視してポインタを戻す。
2. **カウント**: 最初の文字を見つけたら、次の空白にぶつかるか先頭に達するまでカウントする。

「便利さ」よりも「マシンの効率」を優先した、プロフェッショナルな実装を選択しました。

### English
The core challenge is handling potential trailing spaces. While high-level APIs like `trim()` or `split()` are available, they incur **$O(n)$ space complexity** by creating new string/array objects.

I implemented a **Backward Scan** strategy to ensure maximum efficiency.
The logic processes two phases in a single reverse pass:
1. **Skip**: Ignore trailing spaces until the first non-space character is found.
2. **Count**: Increment the counter until the next space or the start of the string.

This approach prioritizes raw performance and memory safety over mere syntactic sugar.

---

##  計算量分析 (Complexity Analysis)
- **時間計算量 (Time Complexity)**: $O(n)$
  - 文字列の末尾から最大でも1回スキャンするだけなので、要素数 $n$ に対して線形時間で終了します。
- **空間計算量 (Space Complexity)**: $O(1)$
  - カウント用の `int` 変数1つ以外、追加のメモリを一切消費しません。`trim()` 等を使う $O(n)$ 解法より圧倒的に省メモリです。

---

##  学んだこと (Key Learnings)

### 1. Javaの型システムの深淵 (`char` vs `int`)
- `char` は内部的には16ビットの無符号整数。
- `s.charAt(i)` の戻り値は `char` だが、`indexOf(int ch)` 等の引数に渡すと自動で `int` にキャストされる。
- `char + char` は数値計算になるため、文字列結合をしたい場合は `"" + char` のように空文字を先頭に置くテクニックが必要。

### 2. サロゲートペア (Surrogate Pairs)
- 絵文字（😀など）は `char` 2つ分（32ビット）を占有する。
- `s.length()` は「文字数」ではなく「`char` の数」を返すため、絵文字混じりの文字列では注意が必要（`codePointCount` を使うのが正解）。

### 3. 不変性 (Immutability) の代償
- Javaの `String` は書き換え不可。`trim()` や `replace()` は常に「新しいコピー」を作る。
- 大規模データ（数GBの文字列など）を扱う場合、このコピーが致命的なメモリ不足（OOM）を招く可能性があるため、今回のような手動ポインタ操作が実務で光る。

---

##  実験メモ (jshell)
```java
// なぜ "" を足すのかの証明
jshell> (char)0xD83D + (char)0xDE00
$1 ==> 112189  // ただの数字の足し算になってしまう

jshell> "" + (char)0xD83D + (char)0xDE00
$2 ==> "