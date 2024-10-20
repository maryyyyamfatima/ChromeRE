package org.chromium.midi;

import android.media.midi.MidiDevice;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MidiDeviceAndroid {
    public final MidiDevice a;
    public final MidiInputPortAndroid[] b;
    public final MidiOutputPortAndroid[] c;
    public boolean d = true;

    public MidiDeviceAndroid(MidiDevice midiDevice) {
        this.a = midiDevice;
        this.c = new MidiOutputPortAndroid[midiDevice.getInfo().getInputPortCount()];
        int i = 0;
        int i2 = 0;
        while (true) {
            MidiOutputPortAndroid[] midiOutputPortAndroidArr = this.c;
            if (i2 >= midiOutputPortAndroidArr.length) {
                break;
            }
            midiOutputPortAndroidArr[i2] = new MidiOutputPortAndroid(midiDevice, i2);
            i2++;
        }
        this.b = new MidiInputPortAndroid[this.a.getInfo().getOutputPortCount()];
        while (true) {
            MidiInputPortAndroid[] midiInputPortAndroidArr = this.b;
            if (i >= midiInputPortAndroidArr.length) {
                return;
            }
            midiInputPortAndroidArr[i] = new MidiInputPortAndroid(midiDevice, i);
            i++;
        }
    }

    public String getManufacturer() {
        return a("manufacturer");
    }

    public String getProduct() {
        String a = a("product");
        return (a == null || a.isEmpty()) ? a("name") : a;
    }

    public String getVersion() {
        return a("version");
    }

    public MidiInputPortAndroid[] getInputPorts() {
        return this.b;
    }

    public MidiOutputPortAndroid[] getOutputPorts() {
        return this.c;
    }

    public final String a(String str) {
        return this.a.getInfo().getProperties().getString(str);
    }
}
