import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1396 {

    Map<Integer, StationAndTime> idToStationAndTime;
    Map<List<String>, TimeSumAndCount> idToTimeSumAndCount;

    public LC1396() {
        idToStationAndTime = new HashMap<>();
        idToTimeSumAndCount = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        idToStationAndTime.put(id, new StationAndTime(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        StationAndTime startStationAndTime = idToStationAndTime.remove(id);

        List<String> startAndEnd = List.of(startStationAndTime.station, stationName);
        TimeSumAndCount timeSumAndCount = idToTimeSumAndCount.getOrDefault(startAndEnd, new TimeSumAndCount(0, 0));
        timeSumAndCount.timeSum += t - startStationAndTime.time;
        timeSumAndCount.count++;
        idToTimeSumAndCount.put(startAndEnd, timeSumAndCount);
    }

    public double getAverageTime(String startStation, String endStation) {
        List<String> startAndEnd = List.of(startStation, endStation);
        TimeSumAndCount timeSumAndCount = idToTimeSumAndCount.get(startAndEnd);
        return (double) timeSumAndCount.timeSum / timeSumAndCount.count;
    }

    class StationAndTime {
        String station;
        int time;

        public StationAndTime(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class TimeSumAndCount {
        int timeSum;
        int count;

        public TimeSumAndCount(int timeSum, int count) {
            this.timeSum = timeSum;
            this.count = count;
        }
    }
}
