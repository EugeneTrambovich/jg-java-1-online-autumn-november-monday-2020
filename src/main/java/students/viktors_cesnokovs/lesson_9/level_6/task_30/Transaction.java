package students.viktors_cesnokovs.lesson_9.level_6.task_30;

class Transaction {
    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() { return trader; }

    public int getAmount() { return amount; }

    public String toString() {
        return "Transaction(" +
                " /trader/) : " + trader +
                " (/amount/ : " + amount +
                ")";
    }
}
