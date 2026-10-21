class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}

        # Step 1: Count the frequency of each number
        for num in nums:
            freq[num] = freq.get(num, 0) + 1

        # Step 2: Create frequency buckets
        buckets = [[] for _ in range(len(nums) + 1)]

        for num, count in freq.items():
            buckets[count].append(num)

        # Step 3: Collect the k most frequent elements
        result = []

        for i in range(len(nums), 0, -1):
            for num in buckets[i]:
                result.append(num)

                if len(result) == k:
                    return result
