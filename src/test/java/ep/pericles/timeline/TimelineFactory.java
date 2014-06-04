package ep.pericles.timeline;

import java.util.Date;

public class TimelineFactory implements ITimelineFactory {
  /* (non-Javadoc)
   * @see ep.pericles.timeline.ITimelineFactory#newTimeline()
   */
  @Override
  public Timeline newTimeline() {
    return new Timeline();
  }

  @Override
  public TimelineItem newTimelineItem(Long id, String code, Date start, Date end) {
    return TimelineItem.of(id, code, start, end);
  }
}
