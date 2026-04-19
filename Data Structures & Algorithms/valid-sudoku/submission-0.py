class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [set() for _ in range(9)]
        columns = [set() for _ in range(9)]
        boxes = [set() for _ in range(9)]

        for row in range(9):
            for column in range(9):
                num = board[row][column]
                if num == ".": continue
                box_index = (row//3)*3+column//3

                if num in rows[row] or num in columns[column] or num in boxes[box_index]:
                    return False
                rows[row].add(num)
                columns[column].add(num)
                boxes[box_index].add(num)
                

        return True