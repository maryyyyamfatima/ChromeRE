package defpackage;

import android.graphics.Bitmap;
import com.google.research.ink.core.jni.NativeEngine;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a7 */
/* loaded from: classes5.dex */
public final class C3422a7 implements InterfaceC6882kB0 {
    public final Bitmap a;
    public final C10745vS2 b;

    @Override // defpackage.InterfaceC6882kB0
    public final /* synthetic */ void a() {
    }

    public final String toString() {
        return "<AddImageDataAction>";
    }

    public C3422a7(C10745vS2 c10745vS2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = c10745vS2;
    }

    @Override // defpackage.InterfaceC6882kB0
    public final void b(U02 u02) {
        int i;
        NativeEngine nativeEngine = (NativeEngine) u02;
        nativeEngine.getClass();
        C10745vS2 c10745vS2 = this.b;
        EnumC10059tS2 b = EnumC10059tS2.b(c10745vS2.l);
        EnumC10059tS2 enumC10059tS2 = EnumC10059tS2.g;
        if (b == null) {
            b = enumC10059tS2;
        }
        EnumC10059tS2 enumC10059tS22 = EnumC10059tS2.m;
        Bitmap bitmap = this.a;
        if (b != enumC10059tS22) {
            EnumC10059tS2 b2 = EnumC10059tS2.b(c10745vS2.l);
            if (b2 != null) {
                enumC10059tS2 = b2;
            }
            if (enumC10059tS2 != EnumC10059tS2.l) {
                long j = nativeEngine.c;
                byte[] byteArray = c10745vS2.toByteArray();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i2 = nativeEngine.a;
                if (width > i2 || height > i2) {
                    float f = width / height;
                    int i3 = nativeEngine.b;
                    if (width > height) {
                        i = Math.round(i3 / f);
                    } else {
                        i3 = Math.round(i3 * f);
                        i = i3;
                    }
                    AbstractC4508dH1.a("Given too large image (incorrect usage!). Scaling down to " + i3 + "x" + i);
                    bitmap = Bitmap.createScaledBitmap(bitmap, i3, i, false);
                }
                nativeEngine.nativeEngineAddImageData(j, byteArray, bitmap);
                return;
            }
        }
        nativeEngine.nativeEngineAddImageData(nativeEngine.c, c10745vS2.toByteArray(), bitmap);
    }
}
