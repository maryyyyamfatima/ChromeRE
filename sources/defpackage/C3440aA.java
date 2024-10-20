package defpackage;

import android.text.TextUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aA */
/* loaded from: classes.dex */
public final class C3440aA extends AbstractC1684Mz {
    public final /* synthetic */ C5158fA a;

    public C3440aA(C5158fA c5158fA) {
        this.a = c5158fA;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        C5158fA c5158fA = this.a;
        c5158fA.A = null;
        ((C8252oA) c5158fA.v).c(c5158fA);
        if (((C8252oA) c5158fA.v).b() == 3) {
            if (TextUtils.equals(c5158fA.x, null)) {
                ((C8252oA) c5158fA.v).o.I();
                return;
            }
            String trim = c5158fA.x.trim();
            c5158fA.x = trim;
            c5158fA.W(((C8252oA) c5158fA.v).i.p(trim, 0, 500));
        }
    }

    @Override // defpackage.AbstractC1684Mz
    public final void f(BookmarkBridge.BookmarkItem bookmarkItem) {
        C5158fA c5158fA = this.a;
        c5158fA.A = null;
        int T = c5158fA.T(bookmarkItem.c);
        if (T >= 0) {
            c5158fA.v(T);
        }
    }

    @Override // defpackage.AbstractC1684Mz
    public final void i(BookmarkBridge.BookmarkItem bookmarkItem, BookmarkBridge.BookmarkItem bookmarkItem2, boolean z) {
        C5158fA c5158fA = this.a;
        c5158fA.A = null;
        if (((C8252oA) c5158fA.v).b() == 3 && TextUtils.equals(c5158fA.x, null)) {
            ((C8252oA) c5158fA.v).o.I();
        }
        if (bookmarkItem2.d) {
            ((C8252oA) c5158fA.v).c(c5158fA);
            return;
        }
        int T = c5158fA.T(bookmarkItem2.c);
        if (T >= 0) {
            c5158fA.k.remove(T);
            c5158fA.a.f(T, 1);
        }
    }
}
