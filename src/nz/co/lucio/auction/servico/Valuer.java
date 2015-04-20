package nz.co.lucio.auction.servico;

import nz.co.lucio.auction.dominio.Auction;
import nz.co.lucio.auction.dominio.Bid;

public class Valuer {

    private double biggerThanAll = Double.NEGATIVE_INFINITY;
    private double lesserThanAll = Double.POSITIVE_INFINITY;

    public void evaluates(Auction auction){
        for(Bid bid : auction.getBids()){
            if(bid.getValue() > biggerThanAll )
                biggerThanAll = bid.getValue();
            if (bid.getValue() < lesserThanAll)
                lesserThanAll = bid.getValue();
        }

    }

    public double getBiggerBid() {
        return biggerThanAll;
    }

    public double getLesserBid() {
        return lesserThanAll;
    }
}
