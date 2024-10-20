package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class WI implements InterfaceC6808jy2 {
    public abstract boolean b(char c);

    @Override // defpackage.InterfaceC6808jy2
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public int a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
