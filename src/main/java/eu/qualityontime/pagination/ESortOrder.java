package eu.qualityontime.pagination;

public enum ESortOrder {
  ASC, DESC;

  public String sort_by(String col) {
    return " order by " + col;
  }
}
