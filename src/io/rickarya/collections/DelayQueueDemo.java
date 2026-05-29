package io.rickarya.collections;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    static class DelayedItem implements Delayed {
        private String value;
        private long releaseTime;
        
        public DelayedItem(String value, long delay) {
            this.value = value;
            this.releaseTime = System.currentTimeMillis() + delay;
        }
        
        @Override
        public long getDelay(TimeUnit unit) {
            long diff = releaseTime - System.currentTimeMillis();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
        }
        
        @Override
        public int compareTo(Delayed o) {
            return Long.compare(this.releaseTime, ((DelayedItem) o).releaseTime);
        }
        
        @Override
        public String toString() {
            return value;
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedItem> queue = new DelayQueue<>();
        
        queue.add(new DelayedItem("Item 1", 1000));
        queue.add(new DelayedItem("Item 2", 500));
        
        System.out.println("Item ready: " + queue.take());
        System.out.println("Item ready: " + queue.take());
    }
}
