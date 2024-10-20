package defpackage;

import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.chromium.midi.UsbMidiDeviceAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: y44, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11650y44 extends Thread {
    public final /* synthetic */ Map a;
    public final /* synthetic */ UsbMidiDeviceAndroid g;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            UsbMidiDeviceAndroid usbMidiDeviceAndroid = this.g;
            UsbRequest requestWait = usbMidiDeviceAndroid.a.requestWait();
            if (requestWait == null) {
                return;
            }
            UsbEndpoint endpoint = requestWait.getEndpoint();
            if (endpoint.getDirection() == 128) {
                ByteBuffer byteBuffer = (ByteBuffer) this.a.get(endpoint);
                int position = byteBuffer.position();
                int i = 0;
                while (true) {
                    if (i >= position) {
                        break;
                    }
                    if (byteBuffer.get(i) == 0) {
                        position = i;
                        break;
                    }
                    i += 4;
                }
                if (position > 0) {
                    byteBuffer.rewind();
                    byte[] bArr = new byte[position];
                    byteBuffer.get(bArr, 0, position);
                    usbMidiDeviceAndroid.d.post(new RunnableC11993z44(usbMidiDeviceAndroid, endpoint.getEndpointNumber(), bArr));
                }
                byteBuffer.rewind();
                requestWait.queue(byteBuffer, byteBuffer.capacity());
            }
        }
    }

    public C11650y44(UsbMidiDeviceAndroid usbMidiDeviceAndroid, HashMap hashMap) {
        this.g = usbMidiDeviceAndroid;
        this.a = hashMap;
    }
}
