package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class U80 {
    public static final C3184Yn a = a().a();

    public final C7262lI1 b() {
        WeakReference weakReference = ((C3184Yn) this).o;
        if (weakReference == null) {
            return null;
        }
        return (C7262lI1) weakReference.get();
    }

    public static C3054Xn a() {
        C3054Xn c3054Xn = new C3054Xn();
        byte b = (byte) (c3054Xn.y | 16);
        c3054Xn.i = false;
        c3054Xn.v = true;
        c3054Xn.h = true;
        c3054Xn.y = (byte) (((byte) (((byte) (b | 4)) | 16)) | 2);
        c3054Xn.d = InterfaceC11372xG3.a;
        c3054Xn.k = new StringBuilder();
        c3054Xn.f = 0.0f;
        byte b2 = (byte) (c3054Xn.y | 1);
        c3054Xn.v = false;
        c3054Xn.t = false;
        c3054Xn.m = "";
        c3054Xn.w = 0;
        c3054Xn.y = (byte) (((byte) (((byte) (b2 | 16)) | 8)) | 32);
        c3054Xn.l = "";
        return c3054Xn;
    }
}
