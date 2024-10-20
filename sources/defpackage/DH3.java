package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DH3 {
    public final CH3 a;

    public abstract boolean a();

    public DH3(CH3 ch3) {
        this.a = ch3;
    }

    public final boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        CH3 ch3 = this.a;
        if (ch3 == null) {
            return a();
        }
        int a = ch3.a(charSequence, i);
        if (a == 0) {
            return true;
        }
        if (a != 1) {
            return a();
        }
        return false;
    }
}
