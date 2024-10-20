package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Om3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883Om3 implements InterfaceC8497ot0 {
    public final SI2 a;
    public final C3461aE0 b;

    public C1883Om3(SI2 si2, C3461aE0 c3461aE0) {
        this.a = si2;
        this.b = c3461aE0;
    }

    @Override // defpackage.InterfaceC8497ot0
    public final void a() {
        SI2 si2 = this.a;
        synchronized (si2) {
            si2.h = si2.a.length;
        }
    }

    @Override // defpackage.InterfaceC8497ot0
    public final void b(Bitmap bitmap, InterfaceC11610xy interfaceC11610xy) {
        IOException iOException = this.b.g;
        if (iOException != null) {
            if (bitmap != null) {
                interfaceC11610xy.b(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }
}
