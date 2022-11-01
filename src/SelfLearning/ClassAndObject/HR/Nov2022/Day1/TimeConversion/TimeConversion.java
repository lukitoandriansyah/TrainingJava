package SelfLearning.ClassAndObject.HR.Nov2022.Day1.TimeConversion;

public class TimeConversion {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public String timeConversion(String s) {
        String[] timeStr = s.split("");
        String countTime = "";

        for(int i = 0; i<timeStr.length; i++){
            if(i==0){
                if(timeStr[0].equals("0")&&!(timeStr[timeStr.length-2].equals("A"))){
                    countTime = countTime + String.valueOf(Integer.parseInt(timeStr[1]) + 12) ;
                }
                if(timeStr[0].equals("1")&&!(timeStr[timeStr.length-2].equals("A"))){
                    if(timeStr[1].equals("2")){
                        countTime = countTime + timeStr[0]+timeStr[1];
                    }
                    countTime = countTime + String.valueOf(Integer.parseInt(timeStr[0]+timeStr[1]) + 12) ;
                }
                if(timeStr[0].equals("0")&&timeStr[timeStr.length-2].equals("A")){
                    countTime = countTime + timeStr[0]+ timeStr[1];
                }
                if(timeStr[0].equals("1")&&timeStr[timeStr.length-2].equals("A")){
                    if(timeStr[1].equals("2")){
                        countTime = countTime + String.valueOf(Integer.parseInt(timeStr[0]+timeStr[1]) + 12) ;
                    }else{
                        countTime = countTime + timeStr[0]+timeStr[1];
                    }
                }
            }
        }

        if(countTime.equals("24")){
            countTime = "00";
            String[] countTimeStr = countTime.split("");
            timeStr[0]=countTimeStr[0];
            timeStr[1]=countTimeStr[1];

            String timeS = "";
            for(int i = 0; i<timeStr.length-2;i++){
                timeS = timeS + timeStr[i];
            }

            return timeS;
        }

        String[] countTimeStr = countTime.split("");
        timeStr[0]=countTimeStr[0];
        timeStr[1]=countTimeStr[1];
        String timeS = "";
        for(int i = 0; i<timeStr.length-2;i++){
            timeS = timeS + timeStr[i];
        }

        return timeS;
    }

}
