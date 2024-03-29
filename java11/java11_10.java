package test.java11;

class BookInfo {
    static int counter = 0;
    String book_title;
    String writer_name;
    String publication_year;
    int id;
    public BookInfo(String b, String w, String p) {
        book_title = b;
        writer_name = w;
        publication_year = p;
        id = ++counter;
    }
    String getBook_Title() {
        return book_title;
    }
    String getWriter_Name() {
        return writer_name;
    }
    String getPublication_Year() {
        return publication_year;
    }
    int getId() {
        return id;
    }
}
class java11_10 {
    public static void main(String[] args) {
        // 三国志の書籍情報
        BookInfo book1 = new BookInfo("三国志", "吉川英治", "1989");
        
        // 楊令伝の書籍情報
        BookInfo book2 = new BookInfo("楊令伝","北方謙三","2011");
        
        // 竜馬がゆくの書籍情報
        BookInfo book3 = new BookInfo("竜馬がゆく","司馬遼太郎","1998");
        
        // 坊っちゃんの書籍情報
        BookInfo book4 = new BookInfo("坊っちゃん","夏目漱石","1906");
        
        // 吾輩は猫であるの書籍情報
        BookInfo book5 = new BookInfo("吾輩は猫である","夏目漱石","1905");
        
        // 三国志
        System.out.println("書　　名：" + book1.getBook_Title());
        System.out.println("著 者 名：" + book1.getWriter_Name());
        System.out.println("出 版 年：" + book1.getPublication_Year());
        System.out.println("書籍番号：" + book1.getId());

        // 楊令伝
        System.out.println("書　　名：" + book2.getBook_Title());
        System.out.println("著 者 名：" + book2.getWriter_Name());
        System.out.println("出 版 年：" + book2.getPublication_Year());
        System.out.println("書籍番号：" + book2.getId());

        // 竜馬がゆく
        System.out.println("書　　名：" + book3.getBook_Title());
        System.out.println("著 者 名：" + book3.getWriter_Name());
        System.out.println("出 版 年：" + book3.getPublication_Year());
        System.out.println("書籍番号：" + book3.getId());

        // 坊っちゃん
        System.out.println("書　　名：" + book4.getBook_Title());
        System.out.println("著 者 名：" + book4.getWriter_Name());
        System.out.println("出 版 年：" + book4.getPublication_Year());
        System.out.println("書籍番号：" + book4.getId());

        // 吾輩は猫である
        System.out.println("書　　名：" + book5.getBook_Title());
        System.out.println("著 者 名：" + book5.getWriter_Name());
        System.out.println("出 版 年：" + book5.getPublication_Year());
        System.out.println("書籍番号：" + book5.getId());
    }
}
// 1 
// 2 
// 3 
// 4 
//5
//--- 試してみました・12_2を参考しました ---//
class Person {
    static int counter = 0;
    int id;
    String book_title, writer_name, publication_year; //, z
    int getId() {
        return id;
    }    
    Person() {
        this.book_title = null;
        this.writer_name = null;
        this.publication_year = null;
        id = ++counter;
    }
    Person(String book_title, String writer_name, String publication_year) {
        this.book_title = book_title;
        this.writer_name = writer_name;
        this.publication_year = publication_year;
    }
    // Person(String z) {this.z = z; }
    void introduce() {
        System.out.println("書　　名：" + book_title);
        System.out.println("著 者 名：" + writer_name);
        System.out.println("出 版 年：" + publication_year);
    }
}
class Teacher extends Person { //, z
    Teacher(String book_title, String writer_name, String publication_year) {
        super(book_title, writer_name, publication_year);
    }
    void introduce() {
        super.introduce();
    }
}
class java11_10a {
    public static void main(String[] args) {
        Teacher a = new Teacher("三国志", "吉川英治", "1989");
        a.introduce();
        System.out.print("書籍番号：" + a.getId());
        System.out.println();
        Teacher b = new Teacher("楊令伝","北方謙三","2011");
        b.introduce();
        System.out.print("書籍番号：" + b.getId());
        System.out.println();
        Teacher c = new Teacher("竜馬がゆく","司馬遼太郎","1998");
        c.introduce();
        System.out.print("書籍番号：" + c.getId());
        System.out.println();
        Teacher d = new Teacher("竜馬がゆく","司馬遼太郎","1998");
        d.introduce();
        System.out.print("書籍番号：" + d.getId());
        System.out.println();
        Teacher e = new Teacher("吾輩は猫である","夏目漱石","1905");
        e.introduce();
        System.out.print("書籍番号：" + e.getId());
        System.out.println();
    }
}