# leetcode-training
Algorithm and Data Structure practice
# LeetCode Training - Upstream-Salmon

アルゴリズム修行の記録。

## 🛠 学習戦略 (My Strategy)

### 1. 使用言語
- **Primary:** Java (Computer Scienceの基礎、型、データ構造の深い理解のため)
- **Secondary:** TypeScript (フロントエンド/Cypressとの親和性のため)

### 2. 問題の進め方
- **メインセット:** [Top Interview Questions (Easy)](https://leetcode.com/explore/interview/card/top-interview-questions-easy/) から開始。
- **神リスト:** 基礎が固まったら [Blind 75](https://leetcode.com/discuss/general-discussion/460599/blind-75-leetcode-questions) に挑戦。

### 3. 解法のルール (45-Minute Rule)
1. **自力思考 (15-30分):** - まずは日本語か図でロジックを組み立てる。
   - $O(n^2)$ でも良いのでまずは動くコードを書く。
2. **解法確認 (詰まったら即):** - 1時間以上悩まず、Discussionの `Most Votes` な解法を写経・理解する。
   - なぜそのデータ構造（HashMap, PriorityQueue等）が選ばれたのかを言語化する。
3. **復習:** - 翌日、答えを見ずに再挑戦し、血肉化する。

## 📊 計算量（Complexity）の意識
常に **Time Complexity** と **Space Complexity** を意識し、最良の解法を追求する。

## ☕ Java's Lessons (Gotchas)

### 1. Package Declaration
Javaでは、ファイルのディレクトリ構造と `package` 宣言を一致させる必要がある。
- 構造: `java/src/p001_two_sum/Solution.java`
- 宣言: `package p001_two_sum;`
- 理由: 巨大なプロジェクトでクラス名が衝突するのを防ぐため（完全修飾名）。

### 2. Execution from Root
パッケージ化されたクラスを実行する際は、`src` ディレクトリ（ルート）から「フルネーム」で指定する。
- Compile: `javac p001_two_sum/Solution.java`
- Run: `java p001_two_sum.Solution` (スラッシュではなくドットを使う)