package analyse;

public class ExecutionResult {

    private long OneHundred;
    private long OneThousand;
    private long TenThousand;
    private long HundredThousand;
    private long OneMillion;

    public ExecutionResult(long oneHundred, long oneThousand, long tenThousand, long hundredThousand, long oneMillion) {
        OneHundred = oneHundred;
        OneThousand = oneThousand;
        TenThousand = tenThousand;
        HundredThousand = hundredThousand;
        OneMillion = oneMillion;
    }

    public String print() {
        return "OneHundred: " + OneHundred + " ms\n" +
                "OneThousand: " + OneThousand + " ms\n" +
                "TenThousand: " + TenThousand + " ms\n" +
                "HundredThousand: " + HundredThousand + " ms\n" +
                "OneMillion: " + OneMillion + " ms\n";
    }

    public double getOneHundred() {
        return OneHundred;
    }

    public double getOneThousand() {
        return OneThousand;
    }

    public double getTenThousand() {
        return TenThousand;
    }

    public double getHundredThousand() {
        return HundredThousand;
    }

    public double getOneMillion() {
        return OneMillion;
    }
}
