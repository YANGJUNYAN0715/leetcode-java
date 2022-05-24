package leetcode;

public class leetcode211 {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("apl"));
        trie.insert("applecare");
        System.out.println(trie.search("applecare"));
        System.out.println(trie.startsWith("abc"));
    }
}
/*
插入字符串

我们从字典树的根开始，插入字符串。对于当前字符对应的子节点，有两种情况：

子节点存在。沿着指针移动到子节点，继续处理下一个字符。
子节点不存在。创建一个新的子节点，记录在 \textit{children}children 数组的对应位置上，然后沿着指针移动到子节点，继续搜索下一个字符。
重复以上步骤，直到处理字符串的最后一个字符，然后将当前节点标记为字符串的结尾。

查找前缀

我们从字典树的根开始，查找前缀。对于当前字符对应的子节点，有两种情况：

子节点存在。沿着指针移动到子节点，继续搜索下一个字符。
子节点不存在。说明字典树中不包含该前缀，返回空指针。
重复以上步骤，直到返回空指针或搜索完前缀的最后一个字符。

若搜索到了前缀的末尾，就说明字典树中存在该前缀。此外，若前缀末尾对应节点的 \textit{isEnd}isEnd 为真，则说明字典树中存在该字符串。
*/
class Trie {
    private Trie[] children;
    private boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {
        Trie node = this;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(node.children[index]==null){
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node!=null&&node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix)!=null;
    }

    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if(node.children[index]==null){
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}
