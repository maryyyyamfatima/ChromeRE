package defpackage;

import J.N;
import org.chromium.midi.MidiManagerAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hX1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5963hX1 implements Runnable {
    public final /* synthetic */ MidiManagerAndroid a;

    public RunnableC5963hX1(MidiManagerAndroid midiManagerAndroid) {
        this.a = midiManagerAndroid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            MidiManagerAndroid midiManagerAndroid = this.a;
            if (midiManagerAndroid.g) {
                return;
            }
            N.MfmZ2$zu(midiManagerAndroid.f);
        }
    }
}
