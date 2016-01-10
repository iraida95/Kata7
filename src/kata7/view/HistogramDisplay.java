package kata7.view;

import kata7.model.Histogram;

public interface HistogramDisplay {
    public Histogram histogram();
    public void show(Histogram histogram);
}
