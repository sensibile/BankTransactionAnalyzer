package kr.tonton.java.bank;

import java.io.IOException;

public class BankTransactionAnalyzerSimple {

    public static void main(final String[] args) throws IOException {
        final String fileName = args[0];

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(fileName, bankStatementParser);
    }
}
