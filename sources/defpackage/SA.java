package defpackage;

import J.N;
import android.content.Context;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SA extends AbstractC1684Mz implements InterfaceC0679Ff3, InterfaceC8595pA {
    public final C8938qA a;
    public final ViewOnClickListenerC1069If3 g;
    public final Context h;
    public final C0056Al0 i;
    public final boolean j;

    @Override // defpackage.AbstractC1684Mz
    public final void e() {
    }

    @Override // defpackage.AbstractC1684Mz
    public final void f(BookmarkBridge.BookmarkItem bookmarkItem) {
    }

    public SA(Context context, C8938qA c8938qA, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, boolean z) {
        this.a = c8938qA;
        c8938qA.i.a(this);
        this.g = viewOnClickListenerC1069If3;
        this.h = context;
        this.i = new C0056Al0();
        this.j = z;
    }

    public final void j() {
        C0056Al0 c0056Al0 = this.i;
        c0056Al0.getClass();
        c0056Al0.a = true;
        this.a.i.d(this);
        this.g.a(this);
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        this.i.getClass();
        C8938qA c8938qA = this.a;
        c8938qA.getClass();
        Object obj2 = ThreadUtils.a;
        N.Mv0zkYXw(c8938qA.c, c8938qA);
        this.g.a(this);
        if (this.j) {
            j();
        }
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        C0056Al0 c0056Al0 = this.i;
        c0056Al0.getClass();
        if (!this.j || c0056Al0.a) {
            return;
        }
        j();
    }

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        this.g.a(this);
    }
}
