package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9896sy0 {
    public abstract void d(EnumC11438xU enumC11438xU, String str, U80 u80, Throwable th);

    public final void a(EnumC11438xU enumC11438xU, String str) {
        d(enumC11438xU, str, U80.a, null);
    }

    public final void b(EnumC11438xU enumC11438xU, String str, Exception exc) {
        d(enumC11438xU, str, U80.a, exc);
    }

    public final void c(U80 u80, Throwable th) {
        d(EnumC11438xU.B, "Error materializing Component", u80, th);
    }
}
