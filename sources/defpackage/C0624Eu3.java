package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Eu3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624Eu3 {
    public static C0624Eu3 c;
    public final C12157za2 a = new C12157za2();
    public boolean b;

    public static C0624Eu3 a() {
        if (c == null) {
            c = new C0624Eu3();
        }
        return c;
    }

    public C0624Eu3() {
        this.b = (V60.a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
