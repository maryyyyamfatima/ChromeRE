package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bo3 */
/* loaded from: classes.dex */
public final class C4002bo3 extends AbstractC5239fQ0 {
    public C4002bo3() {
        super("width");
    }

    @Override // defpackage.AbstractC5239fQ0
    public final void b(Object obj, float f) {
        C5720go3 c5720go3 = (C5720go3) obj;
        c5720go3.u = f;
        c5720go3.j();
        c5720go3.w.right = c5720go3.s + c5720go3.u;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((C5720go3) obj).v);
    }
}
