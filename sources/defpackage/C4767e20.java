package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4767e20 extends AbstractC5239fQ0 {
    public C4767e20() {
        super("opacity");
    }

    @Override // defpackage.AbstractC5239fQ0
    public final void b(Object obj, float f) {
        ((C5799h20) obj).h = f;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((C5799h20) obj).h);
    }
}
