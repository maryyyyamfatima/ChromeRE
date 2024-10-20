package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zn3 */
/* loaded from: classes.dex */
public final class C3318Zn3 extends AbstractC5239fQ0 {
    public C3318Zn3() {
        super("offsetX");
    }

    @Override // defpackage.AbstractC5239fQ0
    public final void b(Object obj, float f) {
        ((C5720go3) obj).p = f;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((C5720go3) obj).p);
    }
}
