package homework3.task4;

public class ProDocumentWorker extends DocumentWorker {

    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных " +
                "форматах доступно в версии Эксперт");
    }

    public void EditDocument() {
        System.out.println("Документ отредактирован");
    }
}
