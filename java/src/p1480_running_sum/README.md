# 1480. Running Sum of 1d Array

## 学んだこと
- Javaの配列は `new int[size]` で初期化する。後からサイズ変更はできない。
- `System.out.println(arr)` だと住所が出るので、中身を見るなら `Arrays.toString(arr)` を使う。
- JavaScript の `push` は Java にはない。`arr[i] = val` で代入する。

## 解法のポイント
- `sum` という変数に累積させていくことで、計算量を抑えた。
- ループの回し方は `for (int i = 0; i < nums.length; i++)`。

## Time Complexity
- O(n): 配列を1回スキャンするだけなので速い！