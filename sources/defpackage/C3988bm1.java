package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bm1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3988bm1 {
    public static final T82 j = new T82(new C3644am1(), "Input Pool");
    public int a;
    public int b;
    public int c;
    public double d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;

    public final String toString() {
        StringBuilder sb = new StringBuilder("<Input(");
        int i = this.a;
        if (i == 2) {
            sb.append("TYPE_TOUCH");
        } else if (i == 1) {
            sb.append("TYPE_MOUSE");
        } else if (i == 3) {
            sb.append("TYPE_PEN");
        } else if (i == 0) {
            sb.append("TYPE_NOINPUT");
        }
        sb.append(")>");
        return sb.toString();
    }
}
