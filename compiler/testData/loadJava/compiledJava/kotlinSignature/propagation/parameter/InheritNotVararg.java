package test;

public interface InheritNotVararg {

    public interface Super {
        void foo(String[] p);

        void dummy(); // to avoid loading as SAM interface
    }

    public interface Sub extends Super {
        void foo(String... p);
    }
}
