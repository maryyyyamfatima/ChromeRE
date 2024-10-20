package defpackage;

import java.util.concurrent.Callable;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class OO0 implements InterfaceC0948Hh2 {
    public final Tab a;
    public final C2875Wd0 b;

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void a(WebContents webContents, long j, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void b(WebContents webContents, long j, int i, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void c(WebContents webContents, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void d(WebContents webContents, long j, long j2, long j3) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void e(WebContents webContents, long j, long j2) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void f(WebContents webContents, long j, boolean z) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void h(WebContents webContents, long j, float f, float f2) {
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final /* synthetic */ void i(WebContents webContents, long j, long j2, long j3, long j4) {
    }

    public OO0(C2875Wd0 c2875Wd0, Tab tab) {
        this.b = c2875Wd0;
        this.a = tab;
    }

    @Override // defpackage.InterfaceC0948Hh2
    public final void g(WebContents webContents) {
        Tab tab = this.a;
        if (webContents != tab.b()) {
            return;
        }
        final L12 l12 = this.b.i;
        l12.e = true;
        l12.a(tab, new Callable() { // from class: H12
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(L12.this.d);
            }
        }, 3000L);
    }
}
