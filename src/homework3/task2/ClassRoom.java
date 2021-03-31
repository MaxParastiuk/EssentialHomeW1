package homework3.task2;

public class ClassRoom {
    private Pupil[] classRoom;
    private int index = 0;

    public ClassRoom(int maxClassSize) {
        this.classRoom = new Pupil[maxClassSize];
    }

    public ClassRoom() {

    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(10);

        classRoom.addPupil(new BadPupil());
        classRoom.addPupil(new GoodPupil());
        classRoom.addPupil(new GoodPupil());
        classRoom.addPupil(new ExcelentPupil());

        classRoom.showPupilsActions();
    }

    public void addPupil(Pupil pupil) {
        if (index == classRoom.length) {
            System.out.println("This class if full");
            return;
        }
        classRoom[index++] = pupil;

    }
    public void showPupilsActions(){
        Pupil pupil;
        for (int i = 0; i < index ; i++) {
            pupil = classRoom[i];

            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();

            System.out.println();
        }
    }
}

