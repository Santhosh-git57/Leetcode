# Last updated: 7/17/2026, 3:04:01 PM
class Solution:
    def constructRectangle(self, area: int) -> List[int]:
        l=0
        b=int(math.sqrt(area))
        while area % b !=0:
            b-=1
        l=area//b
        return [l,b]