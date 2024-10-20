package defpackage;

import J.N;
import android.media.midi.MidiDeviceInfo;
import android.media.midi.MidiManager;
import java.util.Iterator;
import org.chromium.midi.MidiDeviceAndroid;
import org.chromium.midi.MidiInputPortAndroid;
import org.chromium.midi.MidiManagerAndroid;
import org.chromium.midi.MidiOutputPortAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6307iX1 extends MidiManager.DeviceCallback {
    public final /* synthetic */ MidiManagerAndroid a;

    public C6307iX1(MidiManagerAndroid midiManagerAndroid) {
        this.a = midiManagerAndroid;
    }

    @Override // android.media.midi.MidiManager.DeviceCallback
    public final void onDeviceRemoved(MidiDeviceInfo midiDeviceInfo) {
        MidiManagerAndroid midiManagerAndroid = this.a;
        synchronized (midiManagerAndroid) {
            if (midiManagerAndroid.g) {
                return;
            }
            Iterator it = midiManagerAndroid.b.iterator();
            while (it.hasNext()) {
                MidiDeviceAndroid midiDeviceAndroid = (MidiDeviceAndroid) it.next();
                if (midiDeviceAndroid.d && midiDeviceAndroid.a.getInfo().getId() == midiDeviceInfo.getId()) {
                    midiDeviceAndroid.d = false;
                    for (MidiInputPortAndroid midiInputPortAndroid : midiDeviceAndroid.b) {
                        midiInputPortAndroid.close();
                    }
                    for (MidiOutputPortAndroid midiOutputPortAndroid : midiDeviceAndroid.c) {
                        midiOutputPortAndroid.close();
                    }
                    N.Md3XPFG5(midiManagerAndroid.f, midiDeviceAndroid);
                }
            }
        }
    }

    @Override // android.media.midi.MidiManager.DeviceCallback
    public final void onDeviceAdded(MidiDeviceInfo midiDeviceInfo) {
        MidiManagerAndroid midiManagerAndroid = this.a;
        if (!midiManagerAndroid.a) {
            midiManagerAndroid.c.add(midiDeviceInfo);
        }
        midiManagerAndroid.d.openDevice(midiDeviceInfo, new C6993kX1(midiManagerAndroid, midiDeviceInfo), midiManagerAndroid.e);
    }
}
