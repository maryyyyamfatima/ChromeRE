package defpackage;

import J.N;
import android.media.midi.MidiReceiver;
import org.chromium.midi.MidiInputPortAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5619gX1 extends MidiReceiver {
    public final /* synthetic */ MidiInputPortAndroid a;

    public C5619gX1(MidiInputPortAndroid midiInputPortAndroid) {
        this.a = midiInputPortAndroid;
    }

    @Override // android.media.midi.MidiReceiver
    public final void onSend(byte[] bArr, int i, int i2, long j) {
        synchronized (this.a) {
            MidiInputPortAndroid midiInputPortAndroid = this.a;
            if (midiInputPortAndroid.a == null) {
                return;
            }
            N.MzDIdqgH(midiInputPortAndroid.b, bArr, i, i2, j);
        }
    }
}
