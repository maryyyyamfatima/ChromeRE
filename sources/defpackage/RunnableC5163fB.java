package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fB */
/* loaded from: classes.dex */
public final class RunnableC5163fB implements Runnable {
    public final /* synthetic */ BookmarkId a;
    public final /* synthetic */ C6195iB g;

    @Override // java.lang.Runnable
    public final void run() {
        C6195iB c6195iB = this.g;
        c6195iB.getClass();
        C4819eB c4819eB = new C4819eB();
        c6195iB.b = c4819eB;
        BookmarkId bookmarkId = this.a;
        if (bookmarkId != null) {
            c4819eB.a = XA.a(c6195iB.c.f(bookmarkId));
        }
        if (c6195iB.b.a == null) {
            bookmarkId = c6195iB.c.i();
            c6195iB.b.a = XA.a(c6195iB.c.f(bookmarkId));
        }
        C4819eB c4819eB2 = c6195iB.b;
        c4819eB2.b = XA.a(c6195iB.c.f(c4819eB2.a.d));
        C8938qA c8938qA = c6195iB.c;
        c8938qA.getClass();
        Object obj = ThreadUtils.a;
        ArrayList arrayList = new ArrayList();
        N.M4_aKMtg(c8938qA.c, c8938qA, bookmarkId, null, arrayList);
        Collections.sort(arrayList, new C5507gB());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            XA a = XA.a((BookmarkBridge.BookmarkItem) it.next());
            if (!a.e) {
                c6195iB.h++;
                c6195iB.d.b(a.b, c6195iB.f, new C5851hB(c6195iB, a));
            }
            c6195iB.b.c.add(a);
        }
        int i = c6195iB.h - 1;
        c6195iB.h = i;
        if (i == 0) {
            c6195iB.a.a.add(c6195iB.b);
            c6195iB.c.c();
            c6195iB.d.a();
        }
    }

    public RunnableC5163fB(C6195iB c6195iB, BookmarkId bookmarkId) {
        this.g = c6195iB;
        this.a = bookmarkId;
    }
}
