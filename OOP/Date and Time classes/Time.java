public class Time
{
    private int hours;
    private int minutes;

    public Time()
    {   this.hours = 0;
        this.minutes = 0;
    }
    
    public Time(int m)
    {   this.hours = 0;
        this.setMinutes(m);
    }
    
    public Time(int h, int m)
    {   this.setHours(h);
        this.setMinutes(m);
    }
    
    public int getHours()
    {   return this.hours;
    }

    public void setHours(int h)
    {   if ( h < 0 )
        {   h = h * -1;
        }
        if(h > 23)
        {   h = h % 24;
        }
        this.hours = h;
    }

    public int getMinutes()
    {   return this.minutes;
    }

    public void setMinutes(int m)
    {   int h = this.hours;
        if ( m < 0 )
        {   m = m * -1;
        }
        if(m > 59)
        {   h = h + m/60;
            m = m % 60;
        }
        this.minutes = m;
        this.setHours(h);
    }
    
    public int toMinutes()
    {   return this.getHours()*60 + this.getMinutes();
    }

    public String toString()
    {   String output ="";
        if(this.getHours() < 10)
        {   output = output + "0";
        }
        output = output + this.getHours() + ":";
        if(this.getMinutes() < 10)
        {   output = output + "0";
        }
        output = output + this.getMinutes();
        return output;
    }
    
    public int diff(Time another)
    {   int t1 = this.toMinutes();
        int t2 = another.toMinutes();
        int difference = t2 - t1;
        if( t1 > t2 )
        {   difference = (t2+24*60) - t1;
        }
        return difference;
    }

    public Time add(Time another)
    {   int totalMinutes = this.toMinutes() + another.toMinutes();
        Time result = new Time(totalMinutes);
        return result;
    }
    
    public boolean equals(Time another)
    {   boolean result = false;
        if(this.toMinutes() == another.toMinutes())
        {   result = true;
        }
        return result;
    }
    
    public int compareTo(Time another)
    {   return this.toMinutes() - another.toMinutes();
    }    

   
}
