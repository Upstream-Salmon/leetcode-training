# leetcode-training
Algorithm and Data Structure practice
# LeetCode Training - Upstream-Salmon

アルゴリズム修行の記録。

## 学習戦略 (My Strategy)

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

## 計算量（Complexity）の意識
常に **Time Complexity** と **Space Complexity** を意識し、最良の解法を追求する。


# LeetCode 攻略 3箇条

ただ正解（Accepted）を出すだけでなく、トップ企業に評価される「エンジニアの思考」を磨くためのガイドライン。

---

### 1. Java 標準ライブラリの「なぜ」を追求する
Big Tech の面接では、言語の内部構造に関する質問が頻出する。
- [ ] **Data Structures:** `ArrayList`, `HashMap`, `HashSet` などの計算量と内部挙動を意識して使い分ける。
- [ ] **Why this?** 「なぜ LinkedList ではなく ArrayList を選んだのか？」を論理的に説明できる状態で実装する。

### 2. 「計算量（Big O）」を常に言語化する
「動く」は最低条件。「最速・最小」がプロの条件。
- [ ] **Time Complexity:** ループの回数を確認し、$O(n)$, $O(n \log n)$, $O(n^2)$ を特定する。
- [ ] **Space Complexity:** 配列やハッシュマップを新しく作った際、どれだけメモリを消費するかを意識する。
- [ ] **Optimization:** $O(n^2)$ で解けたら、「$O(n)$ に落とせないか？」を必ず 5 分考える。

### 3. 「読みやすさ（Clean Code）」を徹底する
コードは「機械」のためではなく「人間」のために書く。
- [ ] **Naming:** 変数名は `i`, `j` などの一時変数を除き、`currentSum`, `maxWealth` のように意味を持たせる。
- [ ] **Simplicity:** 無駄に複雑な条件分岐（if文）を避け、誰が読んでも一瞬で理解できるロジックを目指す。
- [ ] **GitHub Quality:** 自分の GitHub は「未来のチームメンバーへのポートフォリオ」であると意識する。

---

> **"Slow is smooth, and smooth is fast."**
> （ゆっくりは円滑、円滑は迅速である。—— 基礎を固めることが、結局一番の近道だ。）


## Java's Lessons (Gotchas)

### 1. Package Declaration
Javaでは、ファイルのディレクトリ構造と `package` 宣言を一致させる必要がある。
- 構造: `java/src/p001_two_sum/Solution.java`
- 宣言: `package p001_two_sum;`
- 理由: 巨大なプロジェクトでクラス名が衝突するのを防ぐため（完全修飾名）。

### 2. Execution from Root
パッケージ化されたクラスを実行する際は、`src` ディレクトリ（ルート）から「フルネーム」で指定する。
- Compile: `javac p001_two_sum/Solution.java`
- Run: `java p001_two_sum.Solution` (スラッシュではなくドットを使う)

### Tools Learned
- **curl**: Client URL. ターミナルからHTTPリクエストを送る道具。
  - `curl -I [URL]`: ヘッダー情報（ステータスコード）のみ確認。
  - `curl -o [file] [URL]`: 内容をファイルとして保存。