import java.util.Objects;

public class Location {
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    @Override
public boolean equals(Object obj){
if (this == obj) return true;

if (!(obj instanceof Location)) return false;
Location loc = (Location) obj;
return xCoord == loc.xCoord && yCoord == loc.yCoord;
}

@Override
public int hashCode()
{
return Objects.hash(xCoord, yCoord);
}

}
