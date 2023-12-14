package prject;

public class Marks implements Comparable<Marks> {
    private Integer markTotal;
    private Integer points;
    private String date;
    private Integer markMidterm;
    private Integer markEndterm;
    private Integer markFinal;
    private Integer gpa;

    public int compareTo(Marks other) {
        return this.markTotal.compareTo(other.markTotal);
    }

    public String toString() {
        return "Marks{" +
                "markTotal=" + markTotal +
                ", points=" + points +
                ", date='" + date + '\'' +
                ", markMidterm=" + markMidterm +
                ", markEndterm=" + markEndterm +
                ", markFinal=" + markFinal +
                ", gpa=" + gpa +
                '}';
    }

    public String digitMarkToAlph() {
        if (markTotal >= 90) return "A";
        else if (markTotal >= 80) return "B";
        else if (markTotal >= 70) return "C";
        else if (markTotal >= 60) return "D";
        else return "F";
    }

    // Getters and setters
    public Integer getMarkTotal() {
        return markTotal;
    }

    public void setMarkTotal(Integer markTotal) {
        this.markTotal = markTotal;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getMarkMidterm() {
        return markMidterm;
    }

    public void setMarkMidterm(Integer markMidterm) {
        this.markMidterm = markMidterm;
    }

    public Integer getMarkEndterm() {
        return markEndterm;
    }

    public void setMarkEndterm(Integer markEndterm) {
        this.markEndterm = markEndterm;
    }

    public Integer getMarkFinal() {
        return markFinal;
    }

    public void setMarkFinal(Integer markFinal) {
        this.markFinal = markFinal;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }
}