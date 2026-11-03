package task1;

public class CsvFormatter implements ReportFormatter {
    private String quote(String value) {
        String safe = value == null ? "" : value;
        if (safe.contains(",") || safe.contains("\"") || safe.contains("\n") || safe.contains("\r")) {
            return "\"" + safe.replace("\"", "\"\"") + "\"";
        }
        return safe;
    }

    @Override
    public String format(String title, String[] headers, String[][] rows) {
        StringBuilder sb = new StringBuilder();
        sb.append("# TITLE: ").append(title).append("\n");
        for (int i = 0; i < headers.length; i++) {
            if (i > 0) sb.append(',');
            sb.append(quote(headers[i]));
        }
        sb.append('\n');
        for (String[] row : rows) {
            for (int i = 0; i < headers.length; i++) {
                if (i > 0) sb.append(',');
                sb.append(quote(i < row.length ? row[i] : ""));
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
