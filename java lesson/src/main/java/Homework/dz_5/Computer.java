package Homework.dz_5;

/* д/з 1. Создать класс Computer (int id, String cpu, int ram, String videoCard, int power), переопределить методы equlals(), toString(), hashCode(), реализуйте 3 версии класса (x,y,z);

 */

import java.util.Objects;
import java.util.UUID;


public class Computer {
    private UUID id;
    private String cpu;
    private int ram;
    private String videoCard;
    private int power;

    public Computer() {
    }

    ;

    public Computer(String cpu, int ram, String videoCard, int power) {
        this.id = UUID.randomUUID();
        this.cpu = cpu;
        this.ram = ram;
        this.videoCard = videoCard;
        this.power = power;
    }

    public UUID getId() {
        return id;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public int getPower() {
        return power;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", videoCard='" + videoCard + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && power == computer.power && Objects.equals(cpu, computer.cpu) && Objects.equals(videoCard, computer.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, videoCard, power);
    }
}

