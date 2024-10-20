package defpackage;

import android.text.TextUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mu3 */
/* loaded from: classes.dex */
public final class C1663Mu3 extends CD3 implements InterfaceC8775pi1 {
    public String g;

    @Override // defpackage.CD3
    public final void a(WebContents webContents) {
    }

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void o(boolean z, boolean z2) {
    }

    @Override // defpackage.CD3
    public final void c(WebContents webContents) {
        ImeAdapterImpl.b(webContents).n.add(this);
    }

    public C1663Mu3(Tab tab) {
        super(tab);
        tab.v(new C1533Lu3(this));
    }

    public static C1663Mu3 e(Tab tab) {
        C1663Mu3 c1663Mu3 = (C1663Mu3) tab.F().b(C1663Mu3.class);
        return c1663Mu3 == null ? (C1663Mu3) tab.F().d(C1663Mu3.class, new C1663Mu3(tab)) : c1663Mu3;
    }

    public static boolean g(Tab tab) {
        C1663Mu3 c1663Mu3 = (C1663Mu3) tab.F().b(C1663Mu3.class);
        if (c1663Mu3 == null) {
            return false;
        }
        return tab.getLaunchType() == 1 && !TextUtils.equals(c1663Mu3.g, V60.a.getPackageName());
    }

    @Override // defpackage.InterfaceC8775pi1
    public final void d() {
        this.g = null;
    }
}
