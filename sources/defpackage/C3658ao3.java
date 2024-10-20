package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ao3 */
/* loaded from: classes.dex */
public final class C3658ao3 extends AbstractC5239fQ0 {
    public C3658ao3() {
        super("offsetY");
    }

    @Override // defpackage.AbstractC5239fQ0
    public final void b(Object obj, float f) {
        ((C5720go3) obj).q = f;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((C5720go3) obj).q);
    }
}
