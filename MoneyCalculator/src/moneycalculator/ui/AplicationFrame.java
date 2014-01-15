package moneycalculator.UI;

public interface AplicationFrame {
    
    public void execute();

    public MoneyDialog getMoneyDialog();

    public MoneyViewer getMoneyViewer();

    public CurrencyDialog getCurrencyDialog();
}