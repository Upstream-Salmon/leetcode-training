# 347. Top K Frequent Elements / 上位 K 個の頻出要素

## 📅 Date / 実行日
2026-04-03

## 📝 Discussion / 考察

I implemented and compared two primary approaches to achieve the required time complexity.
要求された計算量を達成するため、主に2つのアプローチを実装し比較検討した。

### 1. PriorityQueue (Min-Heap) Approach / 優先度付きキュー（最小ヒープ）法
- **Complexity**: $O(n \log k)$
- **Logic**: Maintain a heap of size $k$. If the size exceeds $k$, the least frequent element is "polled" (removed).
- **考察**: ヒープサイズを $k$ に維持し、溢れたら「最も頻度が低い要素」を削除する。$k$ が小さい場合にメモリ効率と速度のバランスが良い。

### 2. Bucket Sort Approach / バケットソート法
- **Complexity**: $O(n)$
- **Logic**: Use the frequency itself as an array index ("Bucket"). Distribute elements into these buckets and collect them from the highest index.
- **考察**: 「出現頻度」を配列のインデックス（棚）として扱う。比較によるソートを一切行わず、頻度が高い棚から順に回収する。理論上の最速値 ($O(n)$) を達成。

## 📊 Complexity Analysis / 計算量分析

| Approach / 手法 | Time Complexity / 時間計算量 | Space Complexity / 空間計算量 |
| :--- | :--- | :--- |
| **PriorityQueue** | $O(n \log k)$ | $O(n)$ |
| **Bucket Sort** | **$O(n)$** | $O(n)$ |

## 💡 Key Learnings / 学んだこと

- **The Concept of "Buckets" / バケットの概念**: 
  Instead of comparing elements ($O(n \log n)$), we can achieve $O(n)$ by "distributing" elements into buckets based on their frequencies. It's like pivoting data from vertical to horizontal based on frequency.
  要素同士を比較するのではなく、頻度を「棚（バケツ）」として扱うことで、$O(n \log n)$ の壁を突破できる。データの持ち方を「頻度」軸に組み替える発想が重要。

- **Why `nums.length + 1`? / なぜサイズ+1か**: 
  The index represents the frequency. To accommodate the maximum possible frequency (when all elements are the same), the array needs to reach index `n`.
  インデックスが頻度を表すため、全要素が同じ数字の場合（頻度 `n`）を考慮して、インデックス `n` までアクセスできるサイズが必要。

- **PriorityQueue Mechanics / PQの仕組み**: 
  It is NOT a FIFO structure. It uses a Heap to ensure the highest (or lowest) priority element is always at the head.
  先入れ先出し（FIFO）ではなく、ヒープ構造によって常に「ルール上の最優先（または最劣後）」を先頭に配置する実力主義の構造であることを理解した。

## 💻 Implementation Highlights / 実装のポイント

- **Guard Clauses**: Added for null/empty inputs to ensure robustness. (エッジケース対策のガード句)
- **Early Return**: In Bucket Sort, the loop returns immediately once $k$ elements are found to optimize performance. (k個見つかった時点での早期リターンによる最適化)