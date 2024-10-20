package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275Jv {
    public final C10000tG3 a;
    public int b = 0;
    public int c = -1;
    public final Object[] d;
    public final StringBuilder e;
    public int f;

    public C1275Jv(C10000tG3 c10000tG3, Object[] objArr, StringBuilder sb) {
        AbstractC5203fJ.a(c10000tG3, "context");
        this.a = c10000tG3;
        this.f = 0;
        AbstractC5203fJ.a(objArr, "arguments");
        this.d = objArr;
        this.e = sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r9, defpackage.EnumC7311lS0 r10, defpackage.C7655mS0 r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1275Jv.b(java.lang.Object, lS0, mS0):void");
    }

    public static void a(Object obj, String str, StringBuilder sb) {
        String simpleName;
        String c;
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        try {
            c = OV1.d(obj);
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e2) {
                simpleName = e2.getClass().getSimpleName();
            }
            c = OV1.c(obj, simpleName);
        }
        sb.append(c);
        sb.append("]");
    }
}
