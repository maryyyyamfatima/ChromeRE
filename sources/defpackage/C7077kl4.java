package defpackage;

import J.N;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import org.chromium.content.browser.accessibility.ViewStructureBuilder;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kl4 */
/* loaded from: classes2.dex */
public final class C7077kl4 implements M0 {
    public final WebContentsImpl a;
    public final C6733jl4 b = new C6733jl4(this);

    @Override // defpackage.M0
    public final /* synthetic */ boolean f(Rect rect) {
        return false;
    }

    @Override // defpackage.M0
    public final /* synthetic */ boolean g(Rect rect) {
        return false;
    }

    @Override // defpackage.M0
    public final /* synthetic */ long h() {
        return 0L;
    }

    @Override // defpackage.M0
    public final /* synthetic */ void i(RunnableC8109nl4 runnableC8109nl4) {
    }

    public C7077kl4(WebContents webContents) {
        this.a = (WebContentsImpl) webContents;
    }

    @Override // defpackage.M0
    public final View d() {
        return this.a.C().getContainerView();
    }

    @Override // defpackage.M0
    public final boolean isIncognito() {
        return this.a.isIncognito();
    }

    @Override // defpackage.M0
    public final WebContents b() {
        return this.a;
    }

    @Override // defpackage.M0
    public final L0 k() {
        return this.b;
    }

    @Override // defpackage.M0
    public final String e() {
        return this.a.o;
    }

    @Override // defpackage.M0
    public final void j(ViewStructure viewStructure, RunnableC9481rl4 runnableC9481rl4) {
        Object viewStructureBuilder;
        WebContentsImpl webContentsImpl = this.a;
        webContentsImpl.q();
        C6600jN2 c6600jN2 = webContentsImpl.m;
        if (Build.VERSION.SDK_INT >= 26) {
            viewStructureBuilder = new K82(c6600jN2);
        } else {
            viewStructureBuilder = new ViewStructureBuilder(c6600jN2);
        }
        N.M16eLpU9(webContentsImpl.g, viewStructure, viewStructureBuilder, runnableC9481rl4);
    }
}
