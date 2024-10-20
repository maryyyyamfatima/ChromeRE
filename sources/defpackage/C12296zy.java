package defpackage;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12296zy implements JO2, InterfaceC2656Ul1 {
    public final Bitmap a;
    public final InterfaceC11610xy g;

    @Override // defpackage.JO2
    public final Object get() {
        return this.a;
    }

    public static C12296zy c(Bitmap bitmap, InterfaceC11610xy interfaceC11610xy) {
        if (bitmap == null) {
            return null;
        }
        return new C12296zy(bitmap, interfaceC11610xy);
    }

    public C12296zy(Bitmap bitmap, InterfaceC11610xy interfaceC11610xy) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.a = bitmap;
        if (interfaceC11610xy == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.g = interfaceC11610xy;
    }

    @Override // defpackage.JO2
    public final Class e() {
        return Bitmap.class;
    }

    @Override // defpackage.JO2
    public final int d() {
        return AbstractC10296u74.c(this.a);
    }

    @Override // defpackage.JO2
    public final void b() {
        this.g.b(this.a);
    }

    @Override // defpackage.InterfaceC2656Ul1
    public final void a() {
        this.a.prepareToDraw();
    }
}
