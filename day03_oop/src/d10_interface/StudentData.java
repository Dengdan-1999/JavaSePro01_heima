package d10_interface;

public class StudentData implements Data<Student>{
    @Override
    public boolean add(Student student){
        return false;
    }

    @Override
    public boolean delete(Student student){
        return false;
    }

    @Override
    public Student get(int id){
        return null;
    }

    @Override
    public boolean update(Student student){
        return false;
    }
}
