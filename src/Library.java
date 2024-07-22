import Departments.*;

public class Library {
    private Artistic[] artistics;
    private Legal[] legals;
    private TechnicalLiterature[] technicalLiteratures;
    private int sizeA;
    private int sizeL;
    private int sizeT;
    private Artistic artistic;
    private Legal legal;
    private TechnicalLiterature technicalLiterature;
    private int countA;
    private int countL;
    private int countT;


    public void bookSearchInAuthor(Author author) {
        for(int i = 0; i < countA; i++){
            if(author == artistics[i].getBook().getAuthor()) {
                System.out.println("Эта книга есть в Художественном отделе под названием " + artistics[i].getBook().getName());

            }
        }
        for(int i = 0; i < countL; i++){
            if(author == legals[i].getBook().getAuthor()) {
                System.out.println("Эта книга есть в Юредическом отделе под названием " + legals[i].getBook().getName());

            }
        }
        for(int i = 0; i < countT; i++){
            if(author == technicalLiteratures[i].getBook().getAuthor()) {
                System.out.println("Эта книга есть в Техничестко летиратурном отделе под названием " + technicalLiteratures[i].getBook().getName());

            }
        }

    }


    public void addBookInArtistic(Book book) {
        if(sizeA < artistics.length) {
            artistic = new Artistic(book);
            artistics[sizeA] = artistic;
            System.out.println("В отдел Добавлена книга " + book.getName());
            countA++;
        }
    }
    public void addBookInLegal(Book book) {
        if(sizeL < legals.length) {
            legal = new Legal(book);
            legals[sizeL] = legal;
            System.out.println("В отдел Добавлена книга " + book.getName());
            countL++;
        }
    }
    public void addBookInTeh(Book book) {
        if(sizeT < technicalLiteratures.length) {
            technicalLiterature = new TechnicalLiterature(book);
            technicalLiteratures[sizeT] = technicalLiterature;
            System.out.println("В отдел Добавлена книга " + book.getName());
            countT++;
        }
    }

    public void printAllBookInDepartments() {
        System.out.println("художественный отдел: " + countA);
        System.out.println("юридический отдел: " + countL);
        System.out.println("технический литературный: " + countT);
    }


    public Library() {
        this.artistics = new Artistic[10];
        this.legals = new Legal[10];
        this.technicalLiteratures = new TechnicalLiterature[10];
        this.sizeA = 0;
        this.sizeL = 0;
        this.sizeT = 0;
        Artistic artistic = new Artistic();
        Legal legal = new Legal();
        TechnicalLiterature technicalLiterature = new TechnicalLiterature();
        this.countA = 0;
        this.countL = 0;
        this.countT = 0;
    }

    public Artistic[] getArtistics() {
        return artistics;
    }

    public void setArtistics(Artistic[] artistics) {
        this.artistics = artistics;
    }

    public Legal[] getLegals() {
        return legals;
    }

    public void setLegals(Legal[] legals) {
        this.legals = legals;
    }

    public TechnicalLiterature[] getTechnicalLiteratures() {
        return technicalLiteratures;
    }

    public void setTechnicalLiteratures(TechnicalLiterature[] technicalLiteratures) {
        this.technicalLiteratures = technicalLiteratures;
    }
}
