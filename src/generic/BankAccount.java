package generic;

public class BankAccount<Type> {
    private Type variable;

    public Type getVariable() {
        return variable;
    }

    public void setVariable(Type var) {
        this.variable = var;
    }
}
