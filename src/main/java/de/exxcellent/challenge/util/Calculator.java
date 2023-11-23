package de.exxcellent.challenge.util;

import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;

import java.util.List;

public class Calculator {
    /**
     * @param list Getting data from list
     * @return Smallest temperature spread
     */
    public static int getSmallestTempSpread(List<Weather> list) {
        int result = -1;
        int tempDifference = Integer.MAX_VALUE;
        for (Weather temp : list) {
            if (tempDifference > Math.abs(temp.getMxT()-temp.getMnT())){
                tempDifference = Math.abs(temp.getMxT()-temp.getMnT());
                result = temp.getDay();
            }
        }
        return result;
    }

    /**
     * @param list Getting data from list
     * @return Smallest distance between Goals and Goals Allowed
     */
    public static String getSmallestDistanceBetweenGoals(List<Football> list) {
        String result = "";
        int goalDifference = Integer.MAX_VALUE;
        for (Football temp : list) {
            if (goalDifference > Math.abs(temp.getGoals()-temp.getGoalsAllowed())){
                goalDifference = Math.abs(temp.getGoals()-temp.getGoalsAllowed());
                result = temp.getTeam();
            }
        }
        return result;
    }

}
