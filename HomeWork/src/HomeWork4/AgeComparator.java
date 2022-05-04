package HomeWork4;


    public class AgeComparator extends ComComparator<Humans> {

        public int compare(Humans o1, Humans o2) {
            return o2.getAge() - o1.getAge();
        }
    }

