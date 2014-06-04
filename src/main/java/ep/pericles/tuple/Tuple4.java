package ep.pericles.tuple;

public class Tuple4<T1, T2, T3, T4> extends Tuple {
  public final T1 _1;
  public final T2 _2;
  public final T3 _3;
  public final T4 _4;

  public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(T1 _1, T2 _2, T3 _3, T4 _4) {
    return new Tuple4<T1, T2, T3, T4>(_1, _2, _3, _4);
  }

  public Tuple4(T1 _1, T2 _2, T3 _3, T4 _4) {
    super();
    this._1 = _1;
    this._2 = _2;
    this._3 = _3;
    this._4 = _4;
  }

  @Override
  int size() {
    return 4;
  }

}
