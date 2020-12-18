package com.lambda;


interface Accessible { // package-private: accessible to all classes in this package

    int SOME_CONSTANT = 100; // public, all interface vars are public, static, final

    public void methodA(); // public: all interface vars are public, static, final

    void methodB(); // public: all interface vars are public, static, final

    boolean methodC(); // public: all interface vars are public, static, final
}
