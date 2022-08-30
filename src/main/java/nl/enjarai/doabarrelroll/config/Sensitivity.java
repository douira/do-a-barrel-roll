package nl.enjarai.doabarrelroll.config;

public class Sensitivity {
    public double pitch;
    public double yaw;
    public double roll;
    public double pitchSmoothness;
    public double yawSmoothness;
    public double rollSmoothness;

    public Sensitivity(double pitch, double yaw, double roll,
            double pitchSmoothness, double yawSmoothness, double rollSmoothness) {
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
        this.pitchSmoothness = pitchSmoothness;
        this.yawSmoothness = yawSmoothness;
        this.rollSmoothness = rollSmoothness;
    }

    public Sensitivity(double pitch, double yaw, double roll) {
        this(pitch, yaw, roll, pitch, yaw, roll);
    }
}
