package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mQ2 */
/* loaded from: classes.dex */
public final class C7647mQ2 extends AbstractC0185Bl {
    public final /* synthetic */ C7991nQ2 h;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return C7991nQ2.b(this.h.e, null, null, null);
    }

    public C7647mQ2(C7991nQ2 c7991nQ2) {
        this.h = c7991nQ2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String str = (String) obj;
        C7991nQ2 c7991nQ2 = this.h;
        c7991nQ2.e(str);
        if (!c7991nQ2.f) {
            O83.a.p("rlz_first_search_notified", true);
            c7991nQ2.f = true;
        }
        T60.a.edit().putString("com.google.android.apps.chrome.rlz.RLZ_STRING", str).apply();
    }
}
