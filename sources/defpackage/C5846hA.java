package defpackage;

import org.chromium.chrome.browser.bookmarks.BookmarkBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hA */
/* loaded from: classes.dex */
public final class C5846hA {
    public final int a;
    public final BookmarkBridge.BookmarkItem b;
    public final C5502gA c;

    public C5846hA(int i, BookmarkBridge.BookmarkItem bookmarkItem, C5502gA c5502gA) {
        this.a = i;
        this.b = bookmarkItem;
        this.c = c5502gA;
    }

    public static C5846hA a(BookmarkBridge.BookmarkItem bookmarkItem, C0768Fx2 c0768Fx2) {
        int i = bookmarkItem.d ? 3 : 4;
        if (c0768Fx2 != null) {
            int a = AbstractC1418Kx2.a(c0768Fx2.n);
            if (a == 0) {
                a = 1;
            }
            if (a == 2) {
                i = 7;
            }
        }
        return new C5846hA(i, bookmarkItem, null);
    }
}
