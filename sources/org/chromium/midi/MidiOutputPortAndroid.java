package org.chromium.midi;

import android.media.midi.MidiDevice;
import android.media.midi.MidiInputPort;
import defpackage.AbstractC4851eH1;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class MidiOutputPortAndroid {
    public MidiInputPort a;
    public final MidiDevice b;
    public final int c;

    public MidiOutputPortAndroid(MidiDevice midiDevice, int i) {
        this.b = midiDevice;
        this.c = i;
    }

    public boolean open() {
        if (this.a != null) {
            return true;
        }
        MidiInputPort openInputPort = this.b.openInputPort(this.c);
        this.a = openInputPort;
        return openInputPort != null;
    }

    public void send(byte[] bArr) {
        MidiInputPort midiInputPort = this.a;
        if (midiInputPort == null) {
            return;
        }
        try {
            midiInputPort.send(bArr, 0, bArr.length);
        } catch (IOException e) {
            AbstractC4851eH1.a("midi", "MidiOutputPortAndroid.send: " + e, new Object[0]);
        }
    }

    public void close() {
        MidiInputPort midiInputPort = this.a;
        if (midiInputPort == null) {
            return;
        }
        try {
            midiInputPort.close();
        } catch (IOException unused) {
        }
        this.a = null;
    }
}
