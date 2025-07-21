# 🚀 Pepcoding Problems Collection

<div align="center">

![Java](https://img.shields.io/badge/Java-20-orange?style=for-the-badge&logo=java)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apache-maven)
![Problems](https://img.shields.io/badge/Problems-106+-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-purple?style=for-the-badge)

**A comprehensive collection of algorithmic practice problems from PepCoding platform** 🎯

*Master Data Structures & Algorithms with real-world problem-solving techniques!*

</div>

---

## 📊 Problem Statistics

| 🏷️ Category | 📈 Count | 🎯 Focus Area |
|-------------|----------|---------------|
| **🧠 Dynamic Programming** | 30 | Optimization & Memoization |
| **🌐 Graph Algorithms** | 27 | Traversal & Shortest Paths |
| **🔄 Recursion & Backtracking** | 48 | Exhaustive Search |
| **⚡ Bit Manipulation** | 1 | Bitwise Operations |
| **🎯 Total Problems** | **106** | **Complete Coverage** |

---

## 🛠️ Quick Setup

### Prerequisites
- ☕ Java 20+
- 📦 Maven 3.6+

### 🚀 Getting Started

```bash
# Clone the repository
git clone https://github.com/your-username/Pepcoding-Problems.git
cd Pepcoding-Problems

# Compile the project
mvn clean compile

# Run a specific problem
mvn exec:java -Dexec.mainClass="org.practice.Main"
```

### 🎯 Running Problems

1. **Edit** `Main.java` to call your desired problem method
2. **Prepare** `input.txt` with test cases
3. **Execute** and check results in `output.txt`

---

## 🧠 Dynamic Programming (30 Problems)

*Master the art of breaking down complex problems into simpler subproblems!*

### 📈 Stock Trading Problems
- 💹 [Buy And Sell Stocks One Transaction](src/main/java/org/practice/dynamicprogramming/BuyAndSellStocksOneTransactionAllowed.java)
- 💹 [Buy And Sell Stocks Two Transactions](src/main/java/org/practice/dynamicprogramming/BuyAndSellStocksTwoTransactionsAllowed.java)
- 💹 [Buy And Sell Stocks K Transactions](src/main/java/org/practice/dynamicprogramming/BuyAndSellStocksKTransactionsAllowed.java)
- 💹 [Buy And Sell Stocks Infinite Transactions](src/main/java/org/practice/dynamicprogramming/BuyAndSellStocksInfiniteTransactionsAllowed.java)
- 💹 [Buy And Sell Stocks With Cooldown](src/main/java/org/practice/dynamicprogramming/BuyAndSellStocksWithCooldownInfiniteTransactionAllowed.java)
- 💹 [Buy And Sell Stocks With Transaction Fee](src/main/java/org/practice/dynamicprogramming/BuyAndSellStocksWithTransactionFeeInfiniteTransactionsAllowed.java)

### 🪜 Climbing & Path Problems
- 🪜 [Climb Stairs](src/main/java/org/practice/dynamicprogramming/ClimbStairs.java)
- 🪜 [Climb Stairs With Minimum Moves](src/main/java/org/practice/dynamicprogramming/ClimbStairsWithMinimumMoves.java)
- 🪜 [Climb Stairs With Variable Jumps](src/main/java/org/practice/dynamicprogramming/ClimbStairsWithVariableJumps.java)
- 🗺️ [Min Cost In Maze Traversal](src/main/java/org/practice/dynamicprogramming/MinCostInMazeTraversal.java)

### 🎒 Knapsack Variations
- 🎒 [Zero One Knapsack](src/main/java/org/practice/dynamicprogramming/ZeroOneKnapsack.java)
- 🎒 [Unbounded Knapsack](src/main/java/org/practice/dynamicprogramming/UnboundedKnapsack.java)
- 🎒 [Fractional Knapsack](src/main/java/org/practice/dynamicprogramming/FractionalKnapsack.java)

### 💰 Coin & Counting Problems
- 🪙 [Coin Change Combination](src/main/java/org/practice/dynamicprogramming/CoinChangeCombination.java)
- 🪙 [Coin Change Permutations](src/main/java/org/practice/dynamicprogramming/CoinChangePermutations.java)
- 🔢 [Count ABC Subsequences](src/main/java/org/practice/dynamicprogramming/CountABCSubsequences.java)
- 🔢 [Count Binary Strings](src/main/java/org/practice/dynamicprogramming/CountBinaryStrings.java)
- 🔢 [Count Encodings](src/main/java/org/practice/dynamicprogramming/CountEncodings.java)

### 🏠 House & Building Problems
- 🏠 [Paint House](src/main/java/org/practice/dynamicprogramming/PaintHouse.java)
- 🏠 [Paint House Many Colors](src/main/java/org/practice/dynamicprogramming/PaintHouseManyColors.java)
- 🏗️ [Arrange Buildings](src/main/java/org/practice/dynamicprogramming/ArrangeBuildings.java)
- 🚧 [Paint Fence](src/main/java/org/practice/dynamicprogramming/PaintFence.java)

### 🧩 Classic DP Problems
- 🌟 [Fibonacci](src/main/java/org/practice/dynamicprogramming/Fabonacci.java)
- 🏆 [Goldmine](src/main/java/org/practice/dynamicprogramming/Goldmine.java)
- 👫 [Friends Pairing](src/main/java/org/practice/dynamicprogramming/FriendsPairing.java)
- 💎 [Maximum Sum Non Adjacent Elements](src/main/java/org/practice/dynamicprogramming/MaximumSumNonAdjacentElements.java)
- 🎯 [Target Sum Subsets](src/main/java/org/practice/dynamicprogramming/TargetSumSubsets.java)
- 📦 [Partition Into Subsets](src/main/java/org/practice/dynamicprogramming/PartitionIntoSubsets.java)
- 🧱 [Tiling With 2×1 Tiles](src/main/java/org/practice/dynamicprogramming/TilingWith21Tiles.java)
- 🧱 [Tiling With M×1 Tiles](src/main/java/org/practice/dynamicprogramming/TilingWithM1Tiles.java)

---

## 🌐 Graph Algorithms (27 Problems)

*Navigate through the interconnected world of nodes and edges!*

### 🔍 Traversal Algorithms
- 🔄 [Breadth First Traversal](src/main/java/org/practice/graph/BreadthFirstTraversal.java)
- 🔄 [Iterative Depth First Traversal](src/main/java/org/practice/graph/IterativeDepthFirstTraversal.java)
- 🛣️ [Has Path](src/main/java/org/practice/graph/HasPath.java)
- 🛣️ [Print All Paths](src/main/java/org/practice/graph/PrintAllPaths.java)

### 🏝️ Connectivity & Components
- 🔗 [Get Connected Components](src/main/java/org/practice/graph/GetConnectedComponentsOfAGraph.java)
- 🔗 [Is Graph Connected](src/main/java/org/practice/graph/IsGraphConnected.java)
- 🏝️ [Number Of Islands](src/main/java/org/practice/graph/NumberOfIslands.java)
- 👥 [Perfect Friends](src/main/java/org/practice/graph/PerfectFriends.java)

### 🔄 Cycle & Path Detection
- ♻️ [Is Graph Cyclic](src/main/java/org/practice/graph/IsGraphCyclic.java)
- 🎨 [Is Graph Bipartite](src/main/java/org/practice/graph/IsGraphBipartite.java)
- 🏰 [Hamiltonian Path And Cycle](src/main/java/org/practice/graph/HamiltonianPathAndCycle.java)

### 📏 Shortest Path Algorithms
- ⚡ [Shortest Path In Weights](src/main/java/org/practice/graph/ShortestPathInWeights.java)
- 🔍 [Bellman Ford](src/main/java/org/practice/graph/BellmanFord.java)
- ❌ [Negative Weight Cycle Detection](src/main/java/org/practice/graph/NegativeWeightCycleDetection.java)
- 🎯 [Multisolver Path Variants](src/main/java/org/practice/graph/MultisolverSmallestLongestCeilFloorKthlargestPath.java)

### 🌲 Minimum Spanning Tree
- 🌲 [Kruskal Algorithm](src/main/java/org/practice/graph/KruskalAlgorithm.java)
- 💰 [Minimum Cost To Connect Cities](src/main/java/org/practice/graph/MinimumCostToConnectAllCities.java)
- 🔌 [Minimum Wire Required](src/main/java/org/practice/graph/MinimumWireRequiredToConnectAllPcs.java)

### 🏰 Advanced Graph Problems
- ♞ [Knights Tour](src/main/java/org/practice/graph/KnightsTour.java)
- 🎖️ [Articulation Point](src/main/java/org/practice/graph/ArticulationPoint.java)
- 🔄 [Kosaraju Algorithm](src/main/java/org/practice/graph/KosarajuAlgorithm.java)
- 🦠 [Spread Of Infection](src/main/java/org/practice/graph/SpreadOfInfection.java)

### 🎓 Application Problems
- 📚 [Order Of Compilation](src/main/java/org/practice/graph/OrderOfCompilation.java)
- 📅 [Course Schedule](src/main/java/org/practice/graph/PepcodingCourseSchedule.java)
- 🔄 [Pepcoder And Reversing](src/main/java/org/practice/graph/PepcoderAndReversing.java)
- 👾 [Kill The Most Monsters](src/main/java/org/practice/graph/KillTheMostMonsters.java)
- 🏞️ [Park Regions](src/main/java/org/practice/graph/ParkRegions.java)

---

## 🔄 Recursion & Backtracking (48 Problems)

*Explore all possibilities with systematic backtracking!*

### 👑 N-Queens Variants
- 👑 [N Queens](src/main/java/org/practice/recursion_and_backtracking/NQueens.java)
- 👑 [N Queens Branch And Bound](src/main/java/org/practice/recursion_and_backtracking/N_Queens_BranchAndBound.java)
- 👑 [Queens Combinations 2D](src/main/java/org/practice/recursion_and_backtracking/QueensCombinations_2d_As_2d_QueenChooses.java)
- 👑 [Queens Permutations 2D](src/main/java/org/practice/recursion_and_backtracking/QueensPermutation_2DAs2DQueenChooses.java)

### ♞ Knights Problems
- ♞ [Knights Tour](src/main/java/org/practice/recursion_and_backtracking/KnightsTour.java)
- ♞ [Knights Combinations](src/main/java/org/practice/recursion_and_backtracking/NknightsCombinations2dAs1dKnightChooses.java)

### 🔤 Word & String Problems
- 📝 [Word Break I](src/main/java/org/practice/recursion_and_backtracking/WordBreakI.java)
- 🔤 [Words K Length - Variants 1-4](src/main/java/org/practice/recursion_and_backtracking/WordsKLengthWords1.java)
- 🔤 [Words K Selection - Variants 1-4](src/main/java/org/practice/recursion_and_backtracking/WordsKSelection1.java)
- 🔄 [Permutations Words 1-2](src/main/java/org/practice/recursion_and_backtracking/PermutationsWords1.java)
- 📋 [Abbreviation Using Backtracking](src/main/java/org/practice/recursion_and_backtracking/AbbreviationUsingBacktracking.java)

### 🧩 Combinations & Permutations
- 🔄 [Permutations 1-2](src/main/java/org/practice/recursion_and_backtracking/Permutations_1.java)
- 🤝 [Combinations 1-2](src/main/java/org/practice/recursion_and_backtracking/Combinations_2.java)
- 💰 [Coin Change Combinations 1-2](src/main/java/org/practice/recursion_and_backtracking/CoinChangeCombinations1.java)
- 💰 [Coin Change Permutations 1-2](src/main/java/org/practice/recursion_and_backtracking/CoinChangePermutations1.java)

### 🧮 Puzzle & Game Problems
- 🎲 [Solve Sudoku](src/main/java/org/practice/recursion_and_backtracking/SolveSudoku.java)
- 🔤 [Crossword Puzzle](src/main/java/org/practice/recursion_and_backtracking/CrosswordPuzzle.java)
- 🧮 [Cryptarithmetic](src/main/java/org/practice/recursion_and_backtracking/Cryptarithmetic.java)
- 🧲 [Magnets](src/main/java/org/practice/recursion_and_backtracking/Magnets.java)

### 🎯 Optimization Problems
- 🏆 [Max Score](src/main/java/org/practice/recursion_and_backtracking/MaxScore.java)
- 🔢 [Largest Number After K Swaps](src/main/java/org/practice/recursion_and_backtracking/LargestNumberPossibleAfterAtMostKSwaps.java)
- ⚖️ [Tug Of War](src/main/java/org/practice/recursion_and_backtracking/TugOfWar.java)
- 📊 [K Subsets With Equal Sum](src/main/java/org/practice/recursion_and_backtracking/KSubsetsWithEqualSum.java)

### 🌺 Palindrome & Pattern Problems
- 🌺 [All Palindromic Partitions](src/main/java/org/practice/recursion_and_backtracking/AllPalindromicPartitions.java)
- 🌺 [All Palindromic Permutations](src/main/java/org/practice/recursion_and_backtracking/AllPalindromicPermutations.java)
- 🔍 [Pattern Matching](src/main/java/org/practice/recursion_and_backtracking/PatternMatching.java)
- ❌ [Remove Invalid Parenthesis](src/main/java/org/practice/recursion_and_backtracking/RemoveInvalidParenthesis.java)

### 🎮 Classic Recursion Problems
- 👫 [Friends Pairing 2](src/main/java/org/practice/recursion_and_backtracking/FriendsPairing2.java)
- 🏆 [Gold Mine 2](src/main/java/org/practice/recursion_and_backtracking/GoldMine2.java)
- ⚔️ [Josephus Problem](src/main/java/org/practice/recursion_and_backtracking/JosephusProblem.java)
- 📚 [Lexicographical Numbers](src/main/java/org/practice/recursion_and_backtracking/LexicographicalNumbers.java)
- 🎁 [K Partitions](src/main/java/org/practice/recursion_and_backtracking/Kpartitions.java)

---

## ⚡ Bit Manipulation (1 Problem)

*Unlock the power of bitwise operations!*

- 🔧 [Basics Of Bit Manipulation](src/main/java/org/practice/bitmanipulation/BasicsOfBitManipulation.java)

---

## 🏗️ Project Structure

```
📂 Pepcoding-Problems/
├── 📁 src/main/java/org/practice/
│   ├── 📄 Main.java                    # 🎯 Entry point with validation
│   ├── 📁 dynamicprogramming/          # 🧠 DP Problems (30)
│   ├── 📁 graph/                       # 🌐 Graph Problems (27)  
│   ├── 📁 recursion_and_backtracking/  # 🔄 Backtracking (48)
│   └── 📁 bitmanipulation/             # ⚡ Bit Problems (1)
├── 📄 pom.xml                          # 📦 Maven configuration
├── 📄 README.md                        # 📚 This file
└── 📄 CLAUDE.md                        # 🤖 AI Assistant guide
```

---

## 🎯 How to Contribute

1. **🍴 Fork** the repository
2. **🌿 Create** a feature branch (`git checkout -b feature/amazing-problem`)
3. **💻 Add** your solution with proper documentation
4. **✅ Test** your solution thoroughly
5. **📝 Commit** your changes (`git commit -m 'Add Amazing Problem Solution'`)
6. **🚀 Push** to the branch (`git push origin feature/amazing-problem`)
7. **🎉 Open** a Pull Request

---

## 📈 Progress Tracking

Track your learning journey:

- [ ] **🧠 Dynamic Programming Mastery** (0/30)
- [ ] **🌐 Graph Algorithm Expert** (0/27)
- [ ] **🔄 Backtracking Ninja** (0/48)
- [ ] **⚡ Bit Manipulation Wizard** (0/1)

---

## 🎓 Learning Resources

- 🌐 [PepCoding Official Website](https://www.pepcoding.com/)
- 📚 [Data Structures & Algorithms Course](https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/)
- 🎥 [YouTube Channel](https://www.youtube.com/c/Pepcoding)

---

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

<div align="center">

### 🌟 Happy Coding! 🌟

*"The only way to learn a new programming language is by writing programs in it."* - Dennis Ritchie

**⭐ Star this repo if it helped you!** ⭐

</div>