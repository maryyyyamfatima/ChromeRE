package defpackage;

import J.N;
import java.util.ArrayList;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.bookmarks.BookmarkBridge;
import org.chromium.components.bookmarks.BookmarkId;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class VH2 {
    public static void b(C8938qA c8938qA, ArrayList arrayList, ArrayList arrayList2, BookmarkId bookmarkId) {
        BookmarkId bookmarkId2;
        if (RH2.b()) {
            ArrayList arrayList3 = new ArrayList();
            while (!arrayList.isEmpty()) {
                BookmarkId bookmarkId3 = (BookmarkId) arrayList.remove(0);
                if (bookmarkId3.getType() == bookmarkId.getType()) {
                    arrayList3.add(bookmarkId3);
                } else {
                    BookmarkBridge.BookmarkItem f = c8938qA.f(bookmarkId3);
                    if (bookmarkId.getType() != 0) {
                        if (bookmarkId.getType() == 2) {
                            String str = f.a;
                            Object obj = ThreadUtils.a;
                            bookmarkId2 = (BookmarkId) N.MPWBoFyN(c8938qA.c, c8938qA, str, f.b);
                        } else {
                            bookmarkId2 = null;
                        }
                    } else {
                        bookmarkId2 = c8938qA.a(null, bookmarkId, c8938qA.g(bookmarkId), f.a, f.b);
                    }
                    if (bookmarkId2 == null) {
                        AbstractC4851eH1.a("ReadingListUtils", "Null bookmark after typeswapping.", new Object[0]);
                    } else {
                        Object obj2 = ThreadUtils.a;
                        N.MJ2llFWZ(c8938qA.c, c8938qA, bookmarkId3);
                        arrayList2.add(bookmarkId2);
                    }
                }
            }
            arrayList.addAll(arrayList3);
        }
    }

    public static void a(boolean z) {
        if (RH2.a()) {
            WA.f(null, new BookmarkId(2, 0L), z);
        }
    }
}
