package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MD implements RO2 {
    public static final KD f = new KD();
    public static final LD g = new LD();
    public final Context a;
    public final List b;
    public final LD c;
    public final KD d;
    public final C4253cZ0 e;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return !((Boolean) c0543Ee2.c(AbstractC9749sZ0.b)).booleanValue() && AbstractC1207Jh1.c((ByteBuffer) obj, this.b) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        C9406rZ0 c9406rZ0;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        LD ld = this.c;
        synchronized (ld) {
            C9406rZ0 c9406rZ02 = (C9406rZ0) ld.a.poll();
            if (c9406rZ02 == null) {
                c9406rZ02 = new C9406rZ0();
            }
            c9406rZ0 = c9406rZ02;
            c9406rZ0.b = null;
            Arrays.fill(c9406rZ0.a, (byte) 0);
            c9406rZ0.c = new C9064qZ0();
            c9406rZ0.d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            c9406rZ0.b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            c9406rZ0.b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            C6316iZ0 c = c(byteBuffer, i, i2, c9406rZ0, c0543Ee2);
            LD ld2 = this.c;
            synchronized (ld2) {
                c9406rZ0.b = null;
                c9406rZ0.c = null;
                ld2.a.offer(c9406rZ0);
            }
            return c;
        } catch (Throwable th) {
            LD ld3 = this.c;
            synchronized (ld3) {
                c9406rZ0.b = null;
                c9406rZ0.c = null;
                ld3.a.offer(c9406rZ0);
                throw th;
            }
        }
    }

    public MD(Context context, ArrayList arrayList, InterfaceC11610xy interfaceC11610xy, C3492aK1 c3492aK1) {
        KD kd = f;
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = kd;
        this.e = new C4253cZ0(interfaceC11610xy, c3492aK1);
        this.c = g;
    }

    public final C6316iZ0 c(ByteBuffer byteBuffer, int i, int i2, C9406rZ0 c9406rZ0, C0543Ee2 c0543Ee2) {
        int i3 = UH1.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C9064qZ0 b = c9406rZ0.b();
            if (b.c > 0 && b.b == 0) {
                Bitmap.Config config = c0543Ee2.c(AbstractC9749sZ0.a) == EnumC0041Ai0.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(b.g / i2, b.f / i);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                KD kd = this.d;
                C4253cZ0 c4253cZ0 = this.e;
                kd.getClass();
                C1993Pi3 c1993Pi3 = new C1993Pi3(c4253cZ0, b, byteBuffer, max);
                c1993Pi3.c(config);
                c1993Pi3.k = (c1993Pi3.k + 1) % c1993Pi3.l.c;
                Bitmap b2 = c1993Pi3.b();
                if (b2 == null) {
                    return null;
                }
                C6316iZ0 c6316iZ0 = new C6316iZ0(new C5284fZ0(new C4940eZ0(new C8378oZ0(a.b(this.a), c1993Pi3, i, i2, C11289x14.b, b2))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return c6316iZ0;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
