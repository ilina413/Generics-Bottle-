public abstract class Wine extends Drink{
    private String region;

    Wine()
    {

    }

    Wine(String region){
      this.region=region;
    }
    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return ""+ region;
    }

}
