package org.chromium.device.sensors;

import J.N;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.AbstractC4851eH1;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PlatformSensor implements SensorEventListener {
    public final Object a = new Object();
    public long b;
    public final Sensor c;
    public final int d;
    public final int e;
    public double f;
    public final PlatformSensorProvider g;

    public double getDefaultConfiguration() {
        return 5.0d;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public static PlatformSensor create(PlatformSensorProvider platformSensorProvider, int i, long j) {
        List<Sensor> sensorList;
        int i2;
        SensorManager sensorManager = platformSensorProvider.a;
        if (sensorManager == null) {
            return null;
        }
        if (i != 0) {
            if (i == 9) {
                sensorList = sensorManager.getSensorList(11);
            } else if (i != 11) {
                if (i == 2) {
                    sensorList = sensorManager.getSensorList(1);
                } else if (i == 3) {
                    sensorList = sensorManager.getSensorList(10);
                } else if (i == 4) {
                    sensorList = sensorManager.getSensorList(9);
                } else if (i == 5) {
                    sensorList = sensorManager.getSensorList(4);
                } else {
                    if (i != 6) {
                        return null;
                    }
                    sensorList = sensorManager.getSensorList(2);
                }
                i2 = 3;
            } else {
                sensorList = sensorManager.getSensorList(15);
            }
            i2 = 4;
        } else {
            sensorList = sensorManager.getSensorList(5);
            i2 = 1;
        }
        if (sensorList.isEmpty()) {
            return null;
        }
        return new PlatformSensor(sensorList.get(0), i2, platformSensorProvider, j);
    }

    public PlatformSensor(Sensor sensor, int i, PlatformSensorProvider platformSensorProvider, long j) {
        this.e = i;
        this.g = platformSensorProvider;
        this.c = sensor;
        this.b = j;
        this.d = sensor.getMinDelay();
    }

    public int getReportingMode() {
        return this.c.getReportingMode() == 0 ? 1 : 0;
    }

    public double getMaximumSupportedFrequency() {
        int i = this.d;
        return i == 0 ? getDefaultConfiguration() : 1.0d / (i * 1.0E-6d);
    }

    public boolean startSensor(double d) {
        boolean z;
        double d2 = this.f;
        if (d2 == d) {
            return true;
        }
        if (d2 != 0.0d) {
            this.g.a.unregisterListener(this, this.c);
        }
        PlatformSensorProvider platformSensorProvider = this.g;
        synchronized (platformSensorProvider.d) {
            if (platformSensorProvider.d.isEmpty() && platformSensorProvider.b == null) {
                HandlerThread handlerThread = new HandlerThread("SensorsHandlerThread");
                platformSensorProvider.b = handlerThread;
                handlerThread.start();
                platformSensorProvider.c = new Handler(platformSensorProvider.b.getLooper());
            }
            platformSensorProvider.d.add(this);
        }
        try {
            PlatformSensorProvider platformSensorProvider2 = this.g;
            z = platformSensorProvider2.a.registerListener(this, this.c, (int) ((1.0d / d) * 1000000.0d), platformSensorProvider2.c);
        } catch (RuntimeException e) {
            AbstractC4851eH1.f("PlatformSensor", "Failed to register sensor listener.", e);
            z = false;
        }
        if (!z) {
            stopSensor();
            return z;
        }
        this.f = d;
        return z;
    }

    public void stopSensor() {
        HandlerThread handlerThread;
        if (this.f != 0.0d) {
            this.g.a.unregisterListener(this, this.c);
        }
        PlatformSensorProvider platformSensorProvider = this.g;
        synchronized (platformSensorProvider.d) {
            platformSensorProvider.d.remove(this);
            if (platformSensorProvider.d.isEmpty() && (handlerThread = platformSensorProvider.b) != null) {
                handlerThread.quitSafely();
                platformSensorProvider.b = null;
                platformSensorProvider.c = null;
            }
        }
        this.f = 0.0d;
    }

    public boolean checkSensorConfiguration(double d) {
        return this.d <= ((int) ((1.0d / d) * 1000000.0d));
    }

    public void sensorDestroyed() {
        stopSensor();
        synchronized (this.a) {
            this.b = 0L;
        }
    }

    public final void a(double d, double d2, double d3, double d4, double d5) {
        N.Mb4JvlL7(this.b, this, d, d2, d3, d4, d5);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                AbstractC4851eH1.f("PlatformSensor", "Should not get sensor events after PlatformSensorAndroid is destroyed.", new Object[0]);
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr.length >= this.e) {
                double d = 1.0E-9d * sensorEvent.timestamp;
                int length = fArr.length;
                if (length == 1) {
                    a(d, fArr[0], 0.0d, 0.0d, 0.0d);
                } else if (length == 2) {
                    a(d, fArr[0], fArr[1], 0.0d, 0.0d);
                } else if (length == 3) {
                    a(d, fArr[0], fArr[1], fArr[2], 0.0d);
                } else {
                    a(d, fArr[0], fArr[1], fArr[2], fArr[3]);
                }
                return;
            }
            N.MrHXg7he(j, this);
            stopSensor();
        }
    }
}
