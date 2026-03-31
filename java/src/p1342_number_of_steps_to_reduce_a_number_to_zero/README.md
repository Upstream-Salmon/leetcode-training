# 1342. Number of Steps to Reduce a Number to Zero

## Date
2026-03-31

---

## Task Overview
与えられた整数が0になるまで、「偶数なら2で割る」「奇数なら1を引く」という操作を繰り返し、その合計ステップ数を求める。

## Technical Discussion
### Initial Approach
* 当初は for ループを用いた実装を検討した。
* ループ回数が事前に確定していない問題（終了条件が値の状態に依存する場合）においては、while ループを使用する方が制御構造として適切であることを確認した。

### Key Logic & Optimizations
* **Bitwise Operators**: 
    * 奇数・偶数の判定を剰余演算（% 2）ではなく、最下位ビットを確認する & 1 で行う手法を学習。
    * 2で割る操作を、右シフト演算 >>= 1 で代用。これによりコンピュータの内部処理に近い、より低レイヤーな最適化が可能となった。
* **Compound Assignment**: 
    * num = num / 2 を num /= 2 と記述する複合代入演算子の活用により、コードの簡潔性と可読性を向上させた。

## Complexity Analysis
* **Time Complexity**: $O(\log n)$
    * 数値 $n$ を 2 で割り続ける（またはビットを右にずらす）操作は、数値の桁数に比例するため、対数時間となる。
* **Space Complexity**: $O(1)$
    * 入力を直接操作し、ステップ数保持のための変数以外にメモリを消費しないため、一定の空間計算量となる。

## Big Tech Interview Insights
* **Edge Case**: num = 0 の場合に即座に 0 を返せるかどうかの考慮が必要。
* **Best Practice**: 現場のコードレビューでは「パフォーマンス（ビット演算）」と「可読性（算術演算）」のトレードオフを意識し、状況に応じて使い分ける姿勢が評価される。
* **Input Constraints**: 負の数が入力される可能性を面接官に確認し、前提条件を明確に定義することが推奨される。