class costOfRectPlot{
    int length;
    int breadth;
    int rate;
// pass all the required values;
    costOfRectPlot(int length, int breadth,int rate){
        this.length = length;
        this.breadth = breadth;
        this.rate = rate;
    }

// calculate the area of the plot;
    int areaOfRect(){
        int rectArea= length*breadth;
       // System.err.println(rectArea);
        return rectArea;
    }

// claculate the cost as 6$ per humdred m^2;
    int costOfPlot(){
        int cost = 6*(areaOfRect())/100;
        return cost;
    }
}

public class CostTilingRectPlot {
    public static void main(String[] args){
        costOfRectPlot ob = new costOfRectPlot(300, 150,6);
        double costOfPlot = ob.costOfPlot();
        System.out.println("cost of tiling rectangulaar plot is: "+ costOfPlot+" rs.");
    }    
}
