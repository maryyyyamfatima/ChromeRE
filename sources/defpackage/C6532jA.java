package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Stack;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jA */
/* loaded from: classes.dex */
public final class C6532jA extends AbstractC1684Mz {
    public final /* synthetic */ C8252oA a;

    @Override // defpackage.AbstractC1684Mz
    public final void g() {
        C5158fA c5158fA = this.a.x;
        if (c5158fA.k != null) {
            c5158fA.t();
        }
    }

    public C6532jA(C8252oA c8252oA) {
        this.a = c8252oA;
    }

    @Override // defpackage.AbstractC1684Mz
    public final void i(BookmarkBridge.BookmarkItem bookmarkItem, BookmarkBridge.BookmarkItem bookmarkItem2, boolean z) {
        C8252oA c8252oA = this.a;
        if (c8252oA.b() == 2 && bookmarkItem2.c.equals(((QA) c8252oA.q.peek()).c)) {
            C8938qA c8938qA = c8252oA.i;
            c8938qA.getClass();
            Object obj = ThreadUtils.a;
            ArrayList arrayList = new ArrayList();
            N.MOEaKJZM(c8938qA.c, c8938qA, true, true, arrayList);
            if (arrayList.contains(bookmarkItem2.c)) {
                c8252oA.g(c8252oA.i.t());
            } else {
                c8252oA.g(bookmarkItem.c);
            }
        }
        c8252oA.x.t();
    }

    @Override // defpackage.AbstractC1684Mz
    public final void f(BookmarkBridge.BookmarkItem bookmarkItem) {
        C8252oA c8252oA = this.a;
        if (c8252oA.b() == 2) {
            Stack stack = c8252oA.q;
            if (!stack.isEmpty() && bookmarkItem.c.equals(((QA) stack.peek()).c)) {
                c8252oA.d((QA) stack.peek());
                return;
            }
        }
        c();
    }

    @Override // defpackage.AbstractC1684Mz
    public final void c() {
        C8252oA c8252oA = this.a;
        if (c8252oA.b() == 2) {
            c8252oA.h((QA) c8252oA.q.peek());
        }
    }
}
