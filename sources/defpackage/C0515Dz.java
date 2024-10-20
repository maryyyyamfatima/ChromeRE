package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dz */
/* loaded from: classes.dex */
public final class C0515Dz implements InterfaceC9395rX {
    public final Context a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        return new C7345lZ(new Runnable() { // from class: Cz
            @Override // java.lang.Runnable
            public final void run() {
                ((InputMethodManager) C0515Dz.this.a.getSystemService("input_method")).hideSoftInputFromWindow(((C2924Wn) abstractC9053qX).a.getWindowToken(), 0);
            }
        }).e(AbstractC2209Ra.a());
    }

    public C0515Dz(Context context) {
        this.a = context;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C0645Ez.l;
    }
}
