package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7388lg1 extends AbstractC8763pg1 {
    public final /* synthetic */ C9106qg1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7388lg1(C9106qg1 c9106qg1, T11 t11) {
        super(c9106qg1, t11);
        this.j = c9106qg1;
    }

    @Override // defpackage.B30
    public final void c(ZN zn) {
        if (((T11) zn).b()) {
            this.j.a.edit().putBoolean("com.google.android.apps.chrome.icing.IcingController.MIGRATED_TO_FIREBASE", true).apply();
        }
    }
}
