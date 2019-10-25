package analyse;

public class ExecutionResult {

    private double OneHundred;
    private double OneThousand;
    private double TenThousand;
    private double HundredThousand;
    private double OneMillion;

    public ExecutionResult(double oneHundred, double oneThousand, double tenThousand, double hundredThousand, double oneMillion) {
        OneHundred = oneHundred;
        OneThousand = oneThousand;
        TenThousand = tenThousand;
        HundredThousand = hundredThousand;
        OneMillion = oneMillion;
    }

    public String print(){
        return "";
    }
}
