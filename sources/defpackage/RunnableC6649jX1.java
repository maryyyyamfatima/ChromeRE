package defpackage;

import J.N;
import org.chromium.midi.MidiDeviceAndroid;
import org.chromium.midi.MidiManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC6649jX1 implements Runnable {
    public final /* synthetic */ MidiManagerAndroid a;

    public RunnableC6649jX1(MidiManagerAndroid midiManagerAndroid) {
        this.a = midiManagerAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            MidiManagerAndroid midiManagerAndroid = this.a;
            if (midiManagerAndroid.g) {
                return;
            }
            if (midiManagerAndroid.c.isEmpty()) {
                MidiManagerAndroid midiManagerAndroid2 = this.a;
                if (!midiManagerAndroid2.a) {
                    N.M3znzcE9(midiManagerAndroid2.f, (MidiDeviceAndroid[]) midiManagerAndroid2.b.toArray(new MidiDeviceAndroid[0]));
                    this.a.a = true;
                }
            }
        }
    }
}
