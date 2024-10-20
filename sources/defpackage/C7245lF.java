package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7245lF extends AbstractC11278x0 {
    public final /* synthetic */ C7589mF l;

    public C7245lF(C7589mF c7589mF) {
        this.l = c7589mF;
    }

    @Override // defpackage.AbstractC11278x0
    public final String d() {
        C6215iF c6215iF = (C6215iF) this.l.a.get();
        if (c6215iF == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c6215iF.a + "]";
    }
}
