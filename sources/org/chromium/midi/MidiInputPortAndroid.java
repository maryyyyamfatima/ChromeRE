package org.chromium.midi;

import android.media.midi.MidiDevice;
import android.media.midi.MidiOutputPort;
import defpackage.C5619gX1;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MidiInputPortAndroid {
    public MidiOutputPort a;
    public long b;
    public final MidiDevice c;
    public final int d;

    public MidiInputPortAndroid(MidiDevice midiDevice, int i) {
        this.c = midiDevice;
        this.d = i;
    }

    public boolean open(long j) {
        if (this.a != null) {
            return true;
        }
        MidiOutputPort openOutputPort = this.c.openOutputPort(this.d);
        this.a = openOutputPort;
        if (openOutputPort == null) {
            return false;
        }
        this.b = j;
        openOutputPort.connect(new C5619gX1(this));
        return true;
    }

    public synchronized void close() {
        MidiOutputPort midiOutputPort = this.a;
        if (midiOutputPort == null) {
            return;
        }
        try {
            midiOutputPort.close();
        } catch (IOException unused) {
        }
        this.b = 0L;
        this.a = null;
    }
}
