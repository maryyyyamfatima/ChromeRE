package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5416fv1 {
    public final int a;
    public final C1142Iu1 b;

    public C5416fv1(int i, C1142Iu1 c1142Iu1) {
        this.a = i;
        this.b = c1142Iu1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BarItem(");
        int i = this.a;
        String a = AbstractC8207o22.a(sb, i, ")");
        if (i == 0) {
            a = "ACTION_BUTTON";
        } else if (i == 1) {
            a = "SUGGESTION";
        } else if (i == 2) {
            a = "TAB_LAYOUT";
        }
        StringBuilder a2 = M41.a(a, ": ");
        a2.append(this.b);
        return a2.toString();
    }
}
