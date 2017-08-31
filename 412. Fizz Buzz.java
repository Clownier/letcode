class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i = 1;i<= n;i++){
            if(0 == i%15)
                res.add("FizzBuzz");
            else if(0 == i%5)
                res.add("Buzz");
            else if(0 == i%3)
                res.add("Fizz");
            else
                res.add(i+"");
        }
        return res;
    }
}