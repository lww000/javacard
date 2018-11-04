
    public class CardGroup {
        private Card c1;
        private Card c2;
        private Card c3;

        /*在一个纸牌游戏中，有一个代表纸牌的类 Card，每张纸牌具有数字和花色两 种属性；另一个类 Deck，代表一副完整的牌（除去大小王）。请补全这两个类， 并实现如下功能：

+ 6,9]返回 1；补全所有的构造函数。 我们将 3 张牌分为一组 CardGroup，
+ 判断一个 CardGroup 中有几张牌的数字是一样大的，比如[5,5,3]，返 回 2；[4,
+ 判断一个 CardGroup 中是否所有牌的花色是一样的；
+ 请补全比较两个牌组大小的方法 compare(CardGroup c)，并在 main 函 数中比较几组随机牌组的大小。比较规则如下：(1) 3 张牌花色相同 > (2)3 张 数字相同 > (3)2 张数字相同 >(4)3 张不一样。同一级别的牌组则认为一样大， 无需进行进一步比较。
      */
        public CardGroup(Card c1, Card c2, Card c3) {
            // TODO 3.1
             this.c1=c1;
             this.c2=c2;
             this.c3=c3;
        }

        /*
         * Return the number of cards with the same number
         */
        public int numOfSameNumber() {
            // TODO 3.2
            int samenum=0;
            if (c1.getNumber() == c2.getNumber()&&c1.getNumber() == c3.getNumber()){
               samenum=3;}
            else if(c1.getNumber()!=c2.getNumber()&&c1.getNumber()!=c3.getNumber()&&c2.getNumber()!=c3.getNumber())
               {samenum=0;}
               else
            {samenum=2;}

            return samenum;

        }

        /*
         * Return the sum of all 3 numbers.
         */

    public int sumOfNumbers() {
        // TODO 3.3
        int flag;
        if(c1.getSuit()==c2.getSuit()&&c2.getSuit()==c3.getSuit())
        {flag=1;}
        else{flag=0;}

        return flag; // to be replaced
    }

    /*
     * Compare if it is bigger than CardGroup c
     * @param c another CardGroup
     * @return 1: bigger than c; 0: the same; -1: smaller than c.
     */
    public int compare(CardGroup c) {
        // TODO 3.4
      Card[] plist={c1,c2,c3};
      for(Card x:plist)
      { if


      }



        return 0; // to be replaced
    }

}
