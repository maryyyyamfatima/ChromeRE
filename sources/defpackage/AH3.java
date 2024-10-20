package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AH3 implements CH3 {
    public static final AH3 a = new AH3();

    @Override // defpackage.CH3
    public final int a(CharSequence charSequence, int i) {
        int i2 = i + 0;
        int i3 = 0;
        boolean z = false;
        while (true) {
            char c = 2;
            if (i3 >= i2) {
                return z ? 1 : 2;
            }
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            EH3 eh3 = GH3.a;
            if (directionality == 0) {
                c = 1;
            } else if (directionality == 1 || directionality == 2) {
                c = 0;
            }
            if (c == 0) {
                return 0;
            }
            if (c == 1) {
                z = true;
            }
            i3++;
        }
    }
}
