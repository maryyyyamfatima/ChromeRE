package defpackage;

import J.N;
import org.chromium.midi.UsbMidiDeviceAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z44, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC11993z44 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] g;
    public final /* synthetic */ UsbMidiDeviceAndroid h;

    @Override // java.lang.Runnable
    public final void run() {
        UsbMidiDeviceAndroid usbMidiDeviceAndroid = this.h;
        if (usbMidiDeviceAndroid.e) {
            return;
        }
        N.MNGB4bj1(usbMidiDeviceAndroid.g, this.a, this.g);
    }

    public RunnableC11993z44(UsbMidiDeviceAndroid usbMidiDeviceAndroid, int i, byte[] bArr) {
        this.h = usbMidiDeviceAndroid;
        this.a = i;
        this.g = bArr;
    }
}
