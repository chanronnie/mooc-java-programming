/*
============== Java Programming I ==============
Part 5
Section 1 - Learning object-oriented programming
Ex 1 - One Minute


Implement a class called Timer that uses the ClockHand class.
=================================================
*/

public class Timer {
    private ClockHand hundredthSeconds;
    private ClockHand seconds;
    
    public Timer() {
        this.hundredthSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundredthSeconds.advance();
        
        if (this.hundredthSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return this.seconds + ":" + this.hundredthSeconds;   
    }
}
