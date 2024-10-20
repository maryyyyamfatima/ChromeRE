package defpackage;

import android.app.Activity;
import android.content.Context;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xo3 */
/* loaded from: classes.dex */
public final class C11556xo3 implements InterfaceC10534up4 {
    public final C10452uc0 a;
    public final I5 g;
    public final C10527uo3 h;

    public C11556xo3(Activity activity, I5 i5, C6166i6 c6166i6) {
        this.h = new C10527uo3(activity.getApplicationContext());
        i5.b(this);
        this.g = i5;
        this.a = new C10452uc0(c6166i6, new C11213wo3(this), new Callback() { // from class: vo3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Tab tab = (Tab) obj;
                C11556xo3 c11556xo3 = C11556xo3.this;
                c11556xo3.getClass();
                if (tab == null || tab.b() == null) {
                    return;
                }
                c11556xo3.h.b(tab.b());
            }
        });
    }

    @Override // defpackage.InterfaceC10534up4
    public final void onWindowFocusChanged(boolean z) {
        C10527uo3 c10527uo3 = this.h;
        InterfaceC10184to3 a = c10527uo3.a();
        Context context = c10527uo3.a;
        a.i(context, z);
        WebContents webContents = c10527uo3.b;
        if (webContents == null) {
            return;
        }
        a.g(context, webContents);
        if (c10527uo3.b.C() == null) {
            return;
        }
        c10527uo3.b.C().f = a.e();
    }
}
