package defpackage;

import J.N;
import android.media.midi.MidiDevice;
import android.media.midi.MidiDeviceInfo;
import android.media.midi.MidiManager;
import org.chromium.midi.MidiDeviceAndroid;
import org.chromium.midi.MidiManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6993kX1 implements MidiManager.OnDeviceOpenedListener {
    public final /* synthetic */ MidiDeviceInfo a;
    public final /* synthetic */ MidiManagerAndroid b;

    public C6993kX1(MidiManagerAndroid midiManagerAndroid, MidiDeviceInfo midiDeviceInfo) {
        this.b = midiManagerAndroid;
        this.a = midiDeviceInfo;
    }

    @Override // android.media.midi.MidiManager.OnDeviceOpenedListener
    public final void onDeviceOpened(MidiDevice midiDevice) {
        MidiManagerAndroid midiManagerAndroid = this.b;
        MidiDeviceInfo midiDeviceInfo = this.a;
        synchronized (midiManagerAndroid) {
            if (midiManagerAndroid.g) {
                return;
            }
            midiManagerAndroid.c.remove(midiDeviceInfo);
            if (midiDevice != null) {
                MidiDeviceAndroid midiDeviceAndroid = new MidiDeviceAndroid(midiDevice);
                midiManagerAndroid.b.add(midiDeviceAndroid);
                if (midiManagerAndroid.a) {
                    N.MEOWUhL5(midiManagerAndroid.f, midiDeviceAndroid);
                }
            }
            if (!midiManagerAndroid.a && midiManagerAndroid.c.isEmpty()) {
                N.M3znzcE9(midiManagerAndroid.f, (MidiDeviceAndroid[]) midiManagerAndroid.b.toArray(new MidiDeviceAndroid[0]));
                midiManagerAndroid.a = true;
            }
        }
    }
}
