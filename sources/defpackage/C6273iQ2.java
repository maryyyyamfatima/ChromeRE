package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iQ2 */
/* loaded from: classes.dex */
public final class C6273iQ2 extends AbstractC0185Bl {
    public final /* synthetic */ C7991nQ2 h;

    public C6273iQ2(C7991nQ2 c7991nQ2) {
        this.h = c7991nQ2;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        String str = (String) obj;
        this.h.c(str);
        T60.a.edit().putString("com.google.android.apps.chrome.rlz.CHROME_CLIENT_ID", str).putLong("com.google.android.apps.chrome.rlz.CHROME_VERSION_CODE", AbstractC6547jD.a.d).apply();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return C7991nQ2.d();
    }
}
