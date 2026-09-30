class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> hm;
    Random rand;
    public RandomizedSet() {
        list=new ArrayList<>();
        hm=new HashMap<>();
        rand=new Random();
    }
    public boolean insert(int val) {
        if(hm.containsKey(val)) return false;
        hm.put(val,list.size());
        list.add(val);
        return true;
    }
    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;
        int index=hm.get(val);
        int lastelement=list.get(list.size()-1);
        list.set(index,lastelement);
        hm.put(lastelement,index);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
     return list.get(rand.nextInt(list.size()));   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 index = hm.get(20) $\rightarrow$ 1lastelement = list.get(3) $\rightarrow$ 40list.set(1, 40) $\rightarrow$ list becomes [10, 40, 30, 40]hm.put(40, 1) $\rightarrow$ hm becomes {10: 0, 20: 1, 30: 2, 40: 1}list.remove(3) $\rightarrow$ list becomes [10, 40, 30]hm.remove(20) $\rightarrow$ hm becomes {10: 0, 30: 2, 40: 1}*/